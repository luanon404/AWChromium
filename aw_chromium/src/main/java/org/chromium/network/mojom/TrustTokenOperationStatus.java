// TrustTokenOperationStatus.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/trust_tokens.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;

public final class TrustTokenOperationStatus {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        TrustTokenOperationStatus.OK,
        TrustTokenOperationStatus.INVALID_ARGUMENT,
        TrustTokenOperationStatus.MISSING_ISSUER_KEYS,
        TrustTokenOperationStatus.FAILED_PRECONDITION,
        TrustTokenOperationStatus.RESOURCE_EXHAUSTED,
        TrustTokenOperationStatus.ALREADY_EXISTS,
        TrustTokenOperationStatus.UNAVAILABLE,
        TrustTokenOperationStatus.UNAUTHORIZED,
        TrustTokenOperationStatus.BAD_RESPONSE,
        TrustTokenOperationStatus.INTERNAL_ERROR,
        TrustTokenOperationStatus.UNKNOWN_ERROR,
        TrustTokenOperationStatus.OPERATION_SUCCESSFULLY_FULFILLED_LOCALLY})
    public @interface EnumType {}

    public static final int OK = 0;
    public static final int INVALID_ARGUMENT = 1;
    public static final int MISSING_ISSUER_KEYS = 2;
    public static final int FAILED_PRECONDITION = 3;
    public static final int RESOURCE_EXHAUSTED = 4;
    public static final int ALREADY_EXISTS = 5;
    public static final int UNAVAILABLE = 6;
    public static final int UNAUTHORIZED = 7;
    public static final int BAD_RESPONSE = 8;
    public static final int INTERNAL_ERROR = 9;
    public static final int UNKNOWN_ERROR = 10;
    public static final int OPERATION_SUCCESSFULLY_FULFILLED_LOCALLY = 11;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 11;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 11;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private TrustTokenOperationStatus() {}
}