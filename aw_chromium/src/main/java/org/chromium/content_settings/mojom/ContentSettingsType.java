// ContentSettingsType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     components/content_settings/core/common/content_settings.mojom
//

package org.chromium.content_settings.mojom;

import androidx.annotation.IntDef;

public final class ContentSettingsType {
    private static final boolean IS_EXTENSIBLE = false;

    @IntDef({})
    public @interface EnumType {
    }


    public static boolean isKnownValue(int value) {
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private ContentSettingsType() {
    }
}