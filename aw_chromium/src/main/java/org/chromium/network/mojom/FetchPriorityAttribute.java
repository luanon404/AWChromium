// FetchPriorityAttribute.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/request_priority.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;

public final class FetchPriorityAttribute {
    private static final boolean IS_EXTENSIBLE = false;

    @IntDef({FetchPriorityAttribute.LOW, FetchPriorityAttribute.AUTO, FetchPriorityAttribute.HIGH})
    public @interface EnumType {
    }

    public static final int LOW = 0;
    public static final int AUTO = 1;
    public static final int HIGH = 2;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 2;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 2;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private FetchPriorityAttribute() {
    }
}