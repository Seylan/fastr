/*
 * Copyright (c) 2013, 2014, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.oracle.truffle.r.runtime.data;

import java.util.*;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.r.runtime.*;
import com.oracle.truffle.r.runtime.data.model.*;
import com.oracle.truffle.r.runtime.ops.na.*;

public final class RDoubleVector extends RVector implements RAbstractDoubleVector {

    private double[] data;

    private static final String[] implicitClassHr = RRuntime.CLASS_DOUBLE;
    private static final String[] implicitClassHrDyn;

    static {
        implicitClassHrDyn = new String[implicitClassHr.length + 1];
        System.arraycopy(implicitClassHr, 0, implicitClassHrDyn, 1, implicitClassHr.length);
    }

    RDoubleVector(double[] data, boolean complete, int[] dims, Object names) {
        super(complete, data.length, dims, names);
        this.data = data;
    }

    private RDoubleVector(double[] data, boolean complete, int[] dims) {
        this(data, complete, dims, null);
    }

    @Override
    protected RDoubleVector internalCopy() {
        return new RDoubleVector(Arrays.copyOf(data, data.length), this.isComplete(), null);
    }

    public RDoubleVector copyResetData(double[] newData) {
        boolean isComplete = true;
        for (int i = 0; i < newData.length; ++i) {
            if (RRuntime.isNA(newData[i])) {
                isComplete = false;
                break;
            }
        }
        RDoubleVector result = new RDoubleVector(newData, isComplete, null);
        setAttributes(result);
        return result;
    }

    @Override
    protected int internalGetLength() {
        return data.length;
    }

    @Override
    @TruffleBoundary
    public String toString() {
        return Arrays.toString(data);
    }

    public RIntVector trimToIntVector() {
        // TODO: Correct trim
        double[] doubleData = this.data;
        int[] intData = new int[doubleData.length];
        for (int i = 0; i < doubleData.length; ++i) {
            intData[i] = (int) doubleData[i];
        }
        return RDataFactory.createIntVector(intData, RDataFactory.INCOMPLETE_VECTOR, this.dimensions);
    }

    @Override
    protected boolean internalVerify() {
        if (isComplete()) {
            for (double d : data) {
                if (d == RRuntime.DOUBLE_NA) {
                    return false;
                }
            }
        }
        return true;
    }

    public double getDataAt(int i) {
        return data[i];
    }

    public double[] getDataCopy() {
        double[] copy = new double[data.length];
        System.arraycopy(data, 0, copy, 0, data.length);
        return copy;
    }

    /**
     * Intended for external calls where a copy is not needed. WARNING: think carefully before using
     * this method rather than {@link #getDataCopy()}.
     */
    public double[] getDataWithoutCopying() {
        return data;
    }

    /**
     * Return vector data (copying if necessary) that's guaranteed not to be shared with any other
     * vector instance (but maybe non-temporary in terms of vector's sharing mode).
     *
     * @return vector data
     */
    public double[] getDataNonShared() {
        return isShared() ? getDataCopy() : getDataWithoutCopying();

    }

    /**
     * Return vector data (copying if necessary) that's guaranteed to be "fresh" (temporary in terms
     * of vector sharing mode).
     *
     * @return vector data
     */
    public double[] getDataTemp() {
        return isTemporary() ? getDataWithoutCopying() : getDataCopy();
    }

    public RDoubleVector copyWithNewDimensions(int[] newDimensions) {
        return RDataFactory.createDoubleVector(data, isComplete(), newDimensions);
    }

    public RDoubleVector removeLast() {
        assert getLength() > 0;
        return RDataFactory.createDoubleVector(Arrays.copyOf(data, getLength() - 1), isComplete());
    }

    public RDoubleVector removeFirst() {
        assert getLength() > 0;
        return RDataFactory.createDoubleVector(Arrays.copyOfRange(data, 1, getLength()), isComplete());
    }

    @Override
    protected String getDataAtAsString(int index) {
        return RRuntime.doubleToString(data[index]);
    }

    public RDoubleVector updateDataAt(int i, double right, NACheck valueNACheck) {
        assert !this.isShared();
        data[i] = right;
        if (valueNACheck.check(right)) {
            complete = false;
        }
        return this;
    }

    @Override
    public RDoubleVector updateDataAtAsObject(int i, Object o, NACheck naCheck) {
        return updateDataAt(i, (Double) o, naCheck);

    }

    public static double[] resizeData(double[] newData, double[] oldData, int oldDataLength, boolean fillNA) {
        if (newData.length > oldDataLength) {
            if (fillNA) {
                for (int i = oldDataLength; i < newData.length; ++i) {
                    newData[i] = RRuntime.DOUBLE_NA;
                }
            } else {
                for (int i = oldData.length, j = 0; i < newData.length; ++i, j = Utils.incMod(j, oldData.length)) {
                    newData[i] = oldData[j];
                }
            }
        }
        return newData;
    }

    private double[] copyResizedData(int size, boolean fillNA) {
        double[] newData = Arrays.copyOf(data, size);
        return resizeData(newData, this.data, this.getLength(), fillNA);
    }

    private double[] createResizedData(int size, boolean fillNA) {
        assert !this.isShared();
        return copyResizedData(size, fillNA);
    }

    @Override
    public RDoubleVector copyResized(int size, boolean fillNA) {
        boolean isComplete = isComplete() && ((data.length <= size) || !fillNA);
        return RDataFactory.createDoubleVector(copyResizedData(size, fillNA), isComplete);
    }

    @Override
    protected void resizeInternal(int size) {
        this.data = createResizedData(size, true);
    }

    public RDoubleVector materialize() {
        return this;
    }

    @Override
    public RDoubleVector createEmptySameType(int newLength, boolean newIsComplete) {
        return RDataFactory.createDoubleVector(new double[newLength], newIsComplete);
    }

    @Override
    public void transferElementSameType(int toIndex, RAbstractVector fromVector, int fromIndex) {
        RDoubleVector other = (RDoubleVector) fromVector;
        data[toIndex] = other.data[fromIndex];
    }

    public Class<?> getElementClass() {
        return RDouble.class;
    }

    @Override
    public Object getDataAtAsObject(int index) {
        return getDataAt(index);
    }

    @Override
    protected RStringVector getImplicitClassHr() {
        return getClassHierarchyHelper(implicitClassHr, implicitClassHrDyn);
    }
}
