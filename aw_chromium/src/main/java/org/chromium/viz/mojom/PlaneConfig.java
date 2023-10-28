// PlaneConfig.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/viz/public/mojom/compositing/shared_image_format.mojom
//

package org.chromium.viz.mojom;

import androidx.annotation.IntDef;

public final class PlaneConfig {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        PlaneConfig.Y_U_V,
        PlaneConfig.Y_V_U,
        PlaneConfig.Y_UV,
        PlaneConfig.Y_UV_A})
    public @interface EnumType {}

    public static final int Y_U_V = 0;
    public static final int Y_V_U = 1;
    public static final int Y_UV = 2;
    public static final int Y_UV_A = 3;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 3;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 3;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private PlaneConfig() {}
}