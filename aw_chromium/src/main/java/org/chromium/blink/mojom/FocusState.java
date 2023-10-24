// FocusState.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/input/input_handler.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;

public final class FocusState {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        FocusState.FOCUSED,
        FocusState.NOT_FOCUSED_AND_ACTIVE,
        FocusState.NOT_FOCUSED_AND_NOT_ACTIVE})
    public @interface EnumType {}

    public static final int FOCUSED = 0;
    public static final int NOT_FOCUSED_AND_ACTIVE = 1;
    public static final int NOT_FOCUSED_AND_NOT_ACTIVE = 2;
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

    private FocusState() {}
}