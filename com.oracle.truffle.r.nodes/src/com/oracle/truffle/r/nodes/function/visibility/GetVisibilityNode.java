/*
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
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
package com.oracle.truffle.r.nodes.function.visibility;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.frame.Frame;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotKind;
import com.oracle.truffle.api.frame.FrameSlotTypeException;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeCost;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.r.runtime.RInternalError;
import com.oracle.truffle.r.runtime.env.frame.FrameSlotChangeMonitor;
import com.oracle.truffle.r.runtime.env.frame.RFrameSlot;

/**
 * See {@link RFrameSlot#Visibility}.
 */
@NodeInfo(cost = NodeCost.NONE)
public final class GetVisibilityNode extends Node {

    @CompilationFinal private FrameSlot frameSlot;

    private GetVisibilityNode() {
    }

    public static GetVisibilityNode create() {
        return new GetVisibilityNode();
    }

    public boolean execute(Frame frame) {
        if (frameSlot == null) {
            CompilerDirectives.transferToInterpreterAndInvalidate();
            frameSlot = FrameSlotChangeMonitor.findOrAddFrameSlot(frame.getFrameDescriptor(), RFrameSlot.Visibility, FrameSlotKind.Boolean);
        }
        try {
            return frame.getBoolean(frameSlot);
        } catch (FrameSlotTypeException e) {
            throw RInternalError.shouldNotReachHere(e);
        }
    }
}
