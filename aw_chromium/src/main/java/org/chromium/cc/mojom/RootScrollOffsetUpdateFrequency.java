// RootScrollOffsetUpdateFrequency.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     cc/mojom/render_frame_metadata.mojom
//

package org.chromium.cc.mojom;

import androidx.annotation.IntDef;

public final class RootScrollOffsetUpdateFrequency {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        RootScrollOffsetUpdateFrequency.NONE,
        RootScrollOffsetUpdateFrequency.ON_SCROLL_END,
        RootScrollOffsetUpdateFrequency.ALL_UPDATES})
    public @interface EnumType {}

    public static final int NONE = 0;
    public static final int ON_SCROLL_END = 1;
    public static final int ALL_UPDATES = 2;
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

    private RootScrollOffsetUpdateFrequency() {}
}