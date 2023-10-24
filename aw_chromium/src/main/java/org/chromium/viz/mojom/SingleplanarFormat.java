// SingleplanarFormat.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/viz/public/mojom/compositing/internal/singleplanar_format.mojom
//

package org.chromium.viz.mojom;

import androidx.annotation.IntDef;

public final class SingleplanarFormat {
    private static final boolean IS_EXTENSIBLE = false;

    @IntDef({SingleplanarFormat.RGBA_8888, SingleplanarFormat.RGBA_4444, SingleplanarFormat.BGRA_8888, SingleplanarFormat.ALPHA_8, SingleplanarFormat.LUMINANCE_8, SingleplanarFormat.RGB_565, SingleplanarFormat.BGR_565, SingleplanarFormat.ETC1, SingleplanarFormat.RED_8, SingleplanarFormat.RG_88, SingleplanarFormat.LUMINANCE_F16, SingleplanarFormat.RGBA_F16, SingleplanarFormat.R16_EXT, SingleplanarFormat.RG16_EXT, SingleplanarFormat.RGBX_8888, SingleplanarFormat.BGRX_8888, SingleplanarFormat.RGBX_1010102, SingleplanarFormat.BGRX_1010102, SingleplanarFormat.YV12_LEGACY, SingleplanarFormat.NV12_LEGACY, SingleplanarFormat.NV12A_LEGACY, SingleplanarFormat.P010_LEGACY})
    public @interface EnumType {
    }

    public static final int RGBA_8888 = 0;
    public static final int RGBA_4444 = 1;
    public static final int BGRA_8888 = 2;
    public static final int ALPHA_8 = 3;
    public static final int LUMINANCE_8 = 4;
    public static final int RGB_565 = 5;
    public static final int BGR_565 = 6;
    public static final int ETC1 = 7;
    public static final int RED_8 = 8;
    public static final int RG_88 = 9;
    public static final int LUMINANCE_F16 = 10;
    public static final int RGBA_F16 = 11;
    public static final int R16_EXT = 12;
    public static final int RG16_EXT = 13;
    public static final int RGBX_8888 = 14;
    public static final int BGRX_8888 = 15;
    public static final int RGBX_1010102 = 16;
    public static final int BGRX_1010102 = 17;
    public static final int YV12_LEGACY = 18;
    public static final int NV12_LEGACY = 19;
    public static final int NV12A_LEGACY = 20;
    public static final int P010_LEGACY = 21;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 21;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 21;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private SingleplanarFormat() {
    }
}