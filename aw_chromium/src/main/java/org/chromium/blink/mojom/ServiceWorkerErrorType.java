// ServiceWorkerErrorType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/service_worker/service_worker_error_type.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;

public final class ServiceWorkerErrorType {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        ServiceWorkerErrorType.NONE,
        ServiceWorkerErrorType.ABORT,
        ServiceWorkerErrorType.ACTIVATE,
        ServiceWorkerErrorType.DISABLED,
        ServiceWorkerErrorType.INSTALL,
        ServiceWorkerErrorType.NAVIGATION,
        ServiceWorkerErrorType.NETWORK,
        ServiceWorkerErrorType.NOT_FOUND,
        ServiceWorkerErrorType.SCRIPT_EVALUATE_FAILED,
        ServiceWorkerErrorType.SECURITY,
        ServiceWorkerErrorType.STATE,
        ServiceWorkerErrorType.TIMEOUT,
        ServiceWorkerErrorType.TYPE,
        ServiceWorkerErrorType.UNKNOWN})
    public @interface EnumType {}

    public static final int NONE = 0;
    public static final int ABORT = 1;
    public static final int ACTIVATE = 2;
    public static final int DISABLED = 3;
    public static final int INSTALL = 4;
    public static final int NAVIGATION = 5;
    public static final int NETWORK = 6;
    public static final int NOT_FOUND = 7;
    public static final int SCRIPT_EVALUATE_FAILED = 8;
    public static final int SECURITY = 9;
    public static final int STATE = 10;
    public static final int TIMEOUT = 11;
    public static final int TYPE = 12;
    public static final int UNKNOWN = 13;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 13;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 13;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private ServiceWorkerErrorType() {}
}