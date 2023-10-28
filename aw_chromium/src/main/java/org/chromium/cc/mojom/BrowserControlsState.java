// BrowserControlsState.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     cc/mojom/browser_controls_state.mojom
//

package org.chromium.cc.mojom;

import androidx.annotation.IntDef;

public final class BrowserControlsState {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({
})
    public @interface EnumType {}


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

    private BrowserControlsState() {}
}