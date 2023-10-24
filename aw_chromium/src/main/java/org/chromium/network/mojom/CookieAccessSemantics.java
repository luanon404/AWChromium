// CookieAccessSemantics.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/cookie_manager.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;

public final class CookieAccessSemantics {
    private static final boolean IS_EXTENSIBLE = false;

    @IntDef({CookieAccessSemantics.UNKNOWN, CookieAccessSemantics.NONLEGACY, CookieAccessSemantics.LEGACY})
    public @interface EnumType {
    }

    public static final int UNKNOWN = -1;
    public static final int NONLEGACY = 0;
    public static final int LEGACY = 1;
    public static final int MIN_VALUE = -1;
    public static final int MAX_VALUE = 1;

    public static boolean isKnownValue(int value) {
        return value >= -1 && value <= 1;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private CookieAccessSemantics() {
    }
}