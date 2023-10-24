// PortalActivateResult.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/portal/portal.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;

public final class PortalActivateResult {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        PortalActivateResult.PREDECESSOR_WILL_UNLOAD,
        PortalActivateResult.PREDECESSOR_WAS_ADOPTED,
        PortalActivateResult.REJECTED_DUE_TO_PORTAL_NOT_READY,
        PortalActivateResult.REJECTED_DUE_TO_ERROR_IN_PORTAL,
        PortalActivateResult.REJECTED_DUE_TO_PREDECESSOR_NAVIGATION,
        PortalActivateResult.DISCONNECTED,
        PortalActivateResult.NOT_IMPLEMENTED,
        PortalActivateResult.ABORTED_DUE_TO_BUG})
    public @interface EnumType {}

    public static final int PREDECESSOR_WILL_UNLOAD = 0;
    public static final int PREDECESSOR_WAS_ADOPTED = 1;
    public static final int REJECTED_DUE_TO_PORTAL_NOT_READY = 2;
    public static final int REJECTED_DUE_TO_ERROR_IN_PORTAL = 3;
    public static final int REJECTED_DUE_TO_PREDECESSOR_NAVIGATION = 4;
    public static final int DISCONNECTED = 5;
    public static final int NOT_IMPLEMENTED = 6;
    public static final int ABORTED_DUE_TO_BUG = 7;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 7;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 7;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private PortalActivateResult() {}
}