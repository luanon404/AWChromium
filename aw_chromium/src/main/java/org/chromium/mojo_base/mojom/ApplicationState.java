// ApplicationState.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     mojo/public/mojom/base/application_state.mojom
//

package org.chromium.mojo_base.mojom;

import androidx.annotation.IntDef;

public final class ApplicationState {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        ApplicationState.UNKNOWN,
        ApplicationState.HAS_RUNNING_ACTIVITIES,
        ApplicationState.HAS_PAUSED_ACTIVITIES,
        ApplicationState.HAS_STOPPED_ACTIVITIES,
        ApplicationState.HAS_DESTROYED_ACTIVITIES})
    public @interface EnumType {}

    public static final int UNKNOWN = 0;
    public static final int HAS_RUNNING_ACTIVITIES = 1;
    public static final int HAS_PAUSED_ACTIVITIES = 2;
    public static final int HAS_STOPPED_ACTIVITIES = 3;
    public static final int HAS_DESTROYED_ACTIVITIES = 4;
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

    private ApplicationState() {}
}