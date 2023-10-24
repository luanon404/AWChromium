// SourceRegistrationTimeConfig.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     components/attribution_reporting/source_registration_time_config.mojom
//

package org.chromium.attribution_reporting.mojom;

import androidx.annotation.IntDef;

public final class SourceRegistrationTimeConfig {
    private static final boolean IS_EXTENSIBLE = false;

    @IntDef({SourceRegistrationTimeConfig.INCLUDE, SourceRegistrationTimeConfig.EXCLUDE})
    public @interface EnumType {
    }

    public static final int INCLUDE = 0;
    public static final int EXCLUDE = 1;
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

    private SourceRegistrationTimeConfig() {
    }
}