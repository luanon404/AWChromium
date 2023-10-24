// FloatAttribute.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/accessibility/ax_enums.mojom
//

package org.chromium.ax.mojom;

import androidx.annotation.IntDef;

public final class FloatAttribute {
    private static final boolean IS_EXTENSIBLE = true;

    @IntDef({FloatAttribute.NONE, FloatAttribute.VALUE_FOR_RANGE, FloatAttribute.MIN_VALUE_FOR_RANGE, FloatAttribute.MAX_VALUE_FOR_RANGE, FloatAttribute.STEP_VALUE_FOR_RANGE, FloatAttribute.FONT_SIZE, FloatAttribute.FONT_WEIGHT, FloatAttribute.TEXT_INDENT, FloatAttribute.CHILD_TREE_SCALE})
    public @interface EnumType {
    }

    public static final int NONE = 0;
    public static final int VALUE_FOR_RANGE = 1;
    public static final int MIN_VALUE_FOR_RANGE = 2;
    public static final int MAX_VALUE_FOR_RANGE = 3;
    public static final int STEP_VALUE_FOR_RANGE = 4;
    public static final int FONT_SIZE = 5;
    public static final int FONT_WEIGHT = 6;
    public static final int TEXT_INDENT = 7;
    public static final int CHILD_TREE_SCALE = 8;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 8;
    public static final int DEFAULT_VALUE = 0;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 8;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
        if (isKnownValue(value)) {
            return value;
        }
        return DEFAULT_VALUE;
    }

    private FloatAttribute() {
    }
}