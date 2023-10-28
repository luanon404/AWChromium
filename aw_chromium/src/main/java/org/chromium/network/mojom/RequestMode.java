// RequestMode.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/fetch_api.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;

public final class RequestMode {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        RequestMode.SAME_ORIGIN,
        RequestMode.NO_CORS,
        RequestMode.CORS,
        RequestMode.CORS_WITH_FORCED_PREFLIGHT,
        RequestMode.NAVIGATE})
    public @interface EnumType {}

    public static final int SAME_ORIGIN = 0;
    public static final int NO_CORS = 1;
    public static final int CORS = 2;
    public static final int CORS_WITH_FORCED_PREFLIGHT = 3;
    public static final int NAVIGATE = 4;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 4;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 4;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private RequestMode() {}
}