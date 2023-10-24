// CameraState.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/media_session/public/mojom/media_session.mojom
//

package org.chromium.media_session.mojom;

import androidx.annotation.IntDef;

public final class CameraState {
    private static final boolean IS_EXTENSIBLE = true;

    @IntDef({CameraState.UNKNOWN, CameraState.TURNED_ON, CameraState.TURNED_OFF})
    public @interface EnumType {
    }

    public static final int UNKNOWN = 0;
    public static final int TURNED_ON = 1;
    public static final int TURNED_OFF = 2;
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

    private CameraState() {
    }
}