// VideoFacingMode.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/capture/mojom/video_capture_types.mojom
//

package org.chromium.media.mojom;

import androidx.annotation.IntDef;

public final class VideoFacingMode {
    private static final boolean IS_EXTENSIBLE = true;

    @IntDef({VideoFacingMode.NONE, VideoFacingMode.USER, VideoFacingMode.ENVIRONMENT})
    public @interface EnumType {
    }

    public static final int NONE = 0;
    public static final int USER = 1;
    public static final int ENVIRONMENT = 2;
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

    private VideoFacingMode() {
    }
}