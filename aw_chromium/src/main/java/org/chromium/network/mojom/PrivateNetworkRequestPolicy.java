// PrivateNetworkRequestPolicy.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/client_security_state.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;

public final class PrivateNetworkRequestPolicy {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        PrivateNetworkRequestPolicy.ALLOW,
        PrivateNetworkRequestPolicy.WARN,
        PrivateNetworkRequestPolicy.BLOCK,
        PrivateNetworkRequestPolicy.PREFLIGHT_WARN,
        PrivateNetworkRequestPolicy.PREFLIGHT_BLOCK})
    public @interface EnumType {}

    public static final int ALLOW = 0;
    public static final int WARN = 1;
    public static final int BLOCK = 2;
    public static final int PREFLIGHT_WARN = 3;
    public static final int PREFLIGHT_BLOCK = 4;
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

    private PrivateNetworkRequestPolicy() {}
}