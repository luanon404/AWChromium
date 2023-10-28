// InputDeviceSubsystem.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/input_service.mojom
//

package org.chromium.device.mojom;

import androidx.annotation.IntDef;

public final class InputDeviceSubsystem {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        InputDeviceSubsystem.SUBSYSTEM_HID,
        InputDeviceSubsystem.SUBSYSTEM_INPUT,
        InputDeviceSubsystem.SUBSYSTEM_UNKNOWN})
    public @interface EnumType {}

    public static final int SUBSYSTEM_HID = 0;
    public static final int SUBSYSTEM_INPUT = 1;
    public static final int SUBSYSTEM_UNKNOWN = 2;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 2;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 2;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private InputDeviceSubsystem() {}
}