// FingerprintError.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/fingerprint.mojom
//

package org.chromium.device.mojom;

import androidx.annotation.IntDef;

public final class FingerprintError {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        FingerprintError.UNKNOWN,
        FingerprintError.HW_UNAVAILABLE,
        FingerprintError.UNABLE_TO_PROCESS,
        FingerprintError.TIMEOUT,
        FingerprintError.NO_SPACE,
        FingerprintError.CANCELED,
        FingerprintError.UNABLE_TO_REMOVE,
        FingerprintError.LOCKOUT,
        FingerprintError.NO_TEMPLATES})
    public @interface EnumType {}

    public static final int UNKNOWN = 0;
    public static final int HW_UNAVAILABLE = 1;
    public static final int UNABLE_TO_PROCESS = 2;
    public static final int TIMEOUT = 3;
    public static final int NO_SPACE = 4;
    public static final int CANCELED = 5;
    public static final int UNABLE_TO_REMOVE = 6;
    public static final int LOCKOUT = 7;
    public static final int NO_TEMPLATES = 8;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 8;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 8;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private FingerprintError() {}
}