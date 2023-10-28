// SensorType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/sensor.mojom
//

package org.chromium.device.mojom;

import androidx.annotation.IntDef;

public final class SensorType {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        SensorType.AMBIENT_LIGHT,
        SensorType.PROXIMITY,
        SensorType.ACCELEROMETER,
        SensorType.LINEAR_ACCELERATION,
        SensorType.GRAVITY,
        SensorType.GYROSCOPE,
        SensorType.MAGNETOMETER,
        SensorType.PRESSURE,
        SensorType.ABSOLUTE_ORIENTATION_EULER_ANGLES,
        SensorType.ABSOLUTE_ORIENTATION_QUATERNION,
        SensorType.RELATIVE_ORIENTATION_EULER_ANGLES,
        SensorType.RELATIVE_ORIENTATION_QUATERNION})
    public @interface EnumType {}

    public static final int AMBIENT_LIGHT = 0;
    public static final int PROXIMITY = 1;
    public static final int ACCELEROMETER = 2;
    public static final int LINEAR_ACCELERATION = 3;
    public static final int GRAVITY = 4;
    public static final int GYROSCOPE = 5;
    public static final int MAGNETOMETER = 6;
    public static final int PRESSURE = 7;
    public static final int ABSOLUTE_ORIENTATION_EULER_ANGLES = 8;
    public static final int ABSOLUTE_ORIENTATION_QUATERNION = 9;
    public static final int RELATIVE_ORIENTATION_EULER_ANGLES = 10;
    public static final int RELATIVE_ORIENTATION_QUATERNION = 11;
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

    private SensorType() {}
}