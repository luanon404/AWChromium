// MediaStreamType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/media_types.mojom
//

package org.chromium.media.mojom;

import androidx.annotation.IntDef;

public final class MediaStreamType {
    private static final boolean IS_EXTENSIBLE = false;

    @IntDef({MediaStreamType.LOCAL_ELEMENT_CAPTURE, MediaStreamType.LOCAL_DEVICE_CAPTURE, MediaStreamType.LOCAL_TAB_CAPTURE, MediaStreamType.LOCAL_DESKTOP_CAPTURE, MediaStreamType.LOCAL_DISPLAY_CAPTURE, MediaStreamType.REMOTE, MediaStreamType.NONE})
    public @interface EnumType {
    }

    public static final int LOCAL_ELEMENT_CAPTURE = 0;
    public static final int LOCAL_DEVICE_CAPTURE = 1;
    public static final int LOCAL_TAB_CAPTURE = 2;
    public static final int LOCAL_DESKTOP_CAPTURE = 3;
    public static final int LOCAL_DISPLAY_CAPTURE = 4;
    public static final int REMOTE = 5;
    public static final int NONE = 6;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 6;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 6;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private MediaStreamType() {
    }
}