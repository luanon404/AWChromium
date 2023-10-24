// ColorSpaceTransferId.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/gfx/mojom/color_space.mojom
//

package org.chromium.gfx.mojom;

import androidx.annotation.IntDef;

public final class ColorSpaceTransferId {
    private static final boolean IS_EXTENSIBLE = false;

    @IntDef({ColorSpaceTransferId.INVALID, ColorSpaceTransferId.BT709, ColorSpaceTransferId.BT709_APPLE, ColorSpaceTransferId.GAMMA18, ColorSpaceTransferId.GAMMA22, ColorSpaceTransferId.GAMMA24, ColorSpaceTransferId.GAMMA28, ColorSpaceTransferId.SMPTE170M, ColorSpaceTransferId.SMPTE240M, ColorSpaceTransferId.LINEAR, ColorSpaceTransferId.LOG, ColorSpaceTransferId.LOG_SQRT, ColorSpaceTransferId.IEC61966_2_4, ColorSpaceTransferId.BT1361_ECG, ColorSpaceTransferId.SRGB, ColorSpaceTransferId.BT2020_10, ColorSpaceTransferId.BT2020_12, ColorSpaceTransferId.PQ, ColorSpaceTransferId.SMPTEST428_1, ColorSpaceTransferId.HLG, ColorSpaceTransferId.SRGB_HDR, ColorSpaceTransferId.LINEAR_HDR, ColorSpaceTransferId.CUSTOM, ColorSpaceTransferId.CUSTOM_HDR, ColorSpaceTransferId.PIECEWISE_HDR, ColorSpaceTransferId.SCRGB_LINEAR_80_NITS})
    public @interface EnumType {
    }

    public static final int INVALID = 0;
    public static final int BT709 = 1;
    public static final int BT709_APPLE = 2;
    public static final int GAMMA18 = 3;
    public static final int GAMMA22 = 4;
    public static final int GAMMA24 = 5;
    public static final int GAMMA28 = 6;
    public static final int SMPTE170M = 7;
    public static final int SMPTE240M = 8;
    public static final int LINEAR = 9;
    public static final int LOG = 10;
    public static final int LOG_SQRT = 11;
    public static final int IEC61966_2_4 = 12;
    public static final int BT1361_ECG = 13;
    public static final int SRGB = 14;
    public static final int BT2020_10 = 15;
    public static final int BT2020_12 = 16;
    public static final int PQ = 17;
    public static final int SMPTEST428_1 = 18;
    public static final int HLG = 19;
    public static final int SRGB_HDR = 20;
    public static final int LINEAR_HDR = 21;
    public static final int CUSTOM = 22;
    public static final int CUSTOM_HDR = 23;
    public static final int PIECEWISE_HDR = 24;
    public static final int SCRGB_LINEAR_80_NITS = 25;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 25;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 25;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private ColorSpaceTransferId() {
    }
}