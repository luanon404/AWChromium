// RendererType.java is auto generated by mojom_bindings_generator.py, do not edit


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

public final class RendererType {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        RendererType.RENDERER_IMPL,
        RendererType.MOJO,
        RendererType.MEDIA_PLAYER,
        RendererType.COURIER,
        RendererType.FLINGING,
        RendererType.CAST,
        RendererType.MEDIA_FOUNDATION,
        RendererType.REMOTING,
        RendererType.CAST_STREAMING,
        RendererType.CONTENT_EMBEDDER_DEFINED,
        RendererType.TEST})
    public @interface EnumType {}

    public static final int RENDERER_IMPL = 0;
    public static final int MOJO = 1;
    public static final int MEDIA_PLAYER = 2;
    public static final int COURIER = 3;
    public static final int FLINGING = 4;
    public static final int CAST = 5;
    public static final int MEDIA_FOUNDATION = 6;
    public static final int REMOTING = 8;
    public static final int CAST_STREAMING = 9;
    public static final int CONTENT_EMBEDDER_DEFINED = 10;
    public static final int TEST = 11;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 11;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private RendererType() {}
}