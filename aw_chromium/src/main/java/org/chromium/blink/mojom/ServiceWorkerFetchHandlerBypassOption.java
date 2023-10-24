// ServiceWorkerFetchHandlerBypassOption.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/service_worker/service_worker_fetch_handler_bypass_option.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;

public final class ServiceWorkerFetchHandlerBypassOption {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        ServiceWorkerFetchHandlerBypassOption.DEFAULT,
        ServiceWorkerFetchHandlerBypassOption.BYPASS_ONLY_IF_SERVICE_WORKER_NOT_STARTED,
        ServiceWorkerFetchHandlerBypassOption.RACE_NETWORK_REQUEST,
        ServiceWorkerFetchHandlerBypassOption.RACE_NETWORK_REQUEST_HOLDBACK,
        ServiceWorkerFetchHandlerBypassOption.AUTO_PRELOAD})
    public @interface EnumType {}

    public static final int DEFAULT = 0;
    public static final int BYPASS_ONLY_IF_SERVICE_WORKER_NOT_STARTED = 1;
    public static final int RACE_NETWORK_REQUEST = 2;
    public static final int RACE_NETWORK_REQUEST_HOLDBACK = 3;
    public static final int AUTO_PRELOAD = 4;
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

    private ServiceWorkerFetchHandlerBypassOption() {}
}