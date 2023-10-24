// UseCounterFeatureType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/use_counter/use_counter_feature.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;

public final class UseCounterFeatureType {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        UseCounterFeatureType.WEB_FEATURE,
        UseCounterFeatureType.CSS_PROPERTY,
        UseCounterFeatureType.ANIMATED_CSS_PROPERTY,
        UseCounterFeatureType.PERMISSIONS_POLICY_VIOLATION_ENFORCE,
        UseCounterFeatureType.PERMISSIONS_POLICY_IFRAME_ATTRIBUTE,
        UseCounterFeatureType.PERMISSIONS_POLICY_HEADER})
    public @interface EnumType {}

    public static final int WEB_FEATURE = 0;
    public static final int CSS_PROPERTY = 1;
    public static final int ANIMATED_CSS_PROPERTY = 2;
    public static final int PERMISSIONS_POLICY_VIOLATION_ENFORCE = 3;
    public static final int PERMISSIONS_POLICY_IFRAME_ATTRIBUTE = 4;
    public static final int PERMISSIONS_POLICY_HEADER = 5;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 5;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 5;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private UseCounterFeatureType() {}
}