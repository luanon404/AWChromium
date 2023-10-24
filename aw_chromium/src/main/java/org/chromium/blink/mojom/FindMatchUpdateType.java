// FindMatchUpdateType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/find_in_page.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;

public final class FindMatchUpdateType {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        FindMatchUpdateType.FINAL_UPDATE,
        FindMatchUpdateType.MORE_UPDATES_COMING})
    public @interface EnumType {}

    public static final int FINAL_UPDATE = 0;
    public static final int MORE_UPDATES_COMING = 1;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 1;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 1;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private FindMatchUpdateType() {}
}