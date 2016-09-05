/*
 * Copyright (c) 2013, 2016, Oracle and/or its affiliates. All rights reserved.
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
package com.oracle.truffle.r.nodes.builtin.casts;

import com.oracle.truffle.r.nodes.builtin.casts.CastStep.MapStep;

/**
 * Represents mapping used in {@link MapStep}.
 */
public abstract class Mapper {

    public abstract <T> T accept(MapperVisitor<T> visitor);

    public interface MapperVisitor<T> {
        T visit(MapToValue mapper);

        T visit(MapByteToBoolean mapper);

        T visit(MapDoubleToInt mapper);

        T visit(MapToCharAt mapper);
    }

    public static final class MapToValue extends Mapper {
        private final Object value;

        public MapToValue(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }

        @Override
        public <T> T accept(MapperVisitor<T> visitor) {
            return visitor.visit(this);
        }
    }

    public static final class MapByteToBoolean extends Mapper {
        @Override
        public <T> T accept(MapperVisitor<T> visitor) {
            return visitor.visit(this);
        }
    }

    public static final class MapDoubleToInt extends Mapper {
        @Override
        public <T> T accept(MapperVisitor<T> visitor) {
            return visitor.visit(this);
        }
    }

    public static final class MapToCharAt extends Mapper {
        private final int index;

        public MapToCharAt(int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }

        @Override
        public <T> T accept(MapperVisitor<T> visitor) {
            return visitor.visit(this);
        }
    }
}
