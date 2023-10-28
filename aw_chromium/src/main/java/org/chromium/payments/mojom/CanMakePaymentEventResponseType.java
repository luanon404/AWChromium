// CanMakePaymentEventResponseType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/payments/payment_app.mojom
//

package org.chromium.payments.mojom;

import androidx.annotation.IntDef;

public final class CanMakePaymentEventResponseType {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        CanMakePaymentEventResponseType.INCOGNITO,
        CanMakePaymentEventResponseType.NO_EXPLICITLY_VERIFIED_METHODS,
        CanMakePaymentEventResponseType.NOT_INSTALLED,
        CanMakePaymentEventResponseType.NO_URL_BASED_PAYMENT_METHODS,
        CanMakePaymentEventResponseType.BOOLEAN_CONVERSION_ERROR,
        CanMakePaymentEventResponseType.BROWSER_ERROR,
        CanMakePaymentEventResponseType.INTERNAL_ERROR,
        CanMakePaymentEventResponseType.NO_RESPONSE,
        CanMakePaymentEventResponseType.REJECT,
        CanMakePaymentEventResponseType.SUCCESS,
        CanMakePaymentEventResponseType.TIMEOUT})
    public @interface EnumType {}

    public static final int INCOGNITO = 0;
    public static final int NO_EXPLICITLY_VERIFIED_METHODS = 1;
    public static final int NOT_INSTALLED = 2;
    public static final int NO_URL_BASED_PAYMENT_METHODS = 3;
    public static final int BOOLEAN_CONVERSION_ERROR = 4;
    public static final int BROWSER_ERROR = 5;
    public static final int INTERNAL_ERROR = 6;
    public static final int NO_RESPONSE = 7;
    public static final int REJECT = 8;
    public static final int SUCCESS = 9;
    public static final int TIMEOUT = 10;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 10;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 10;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private CanMakePaymentEventResponseType() {}
}