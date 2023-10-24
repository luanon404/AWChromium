// MediaPlayerActionType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/media_player_action.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;

public final class MediaPlayerActionType {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        MediaPlayerActionType.LOOP,
        MediaPlayerActionType.CONTROLS,
        MediaPlayerActionType.COPY_VIDEO_FRAME,
        MediaPlayerActionType.PICTURE_IN_PICTURE,
        MediaPlayerActionType.DEFAULT_ACTION_TYPE})
    public @interface EnumType {}

    public static final int LOOP = 0;
    public static final int CONTROLS = 1;
    public static final int COPY_VIDEO_FRAME = 2;
    public static final int PICTURE_IN_PICTURE = 3;
    public static final int DEFAULT_ACTION_TYPE = 3;
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

    private MediaPlayerActionType() {}
}