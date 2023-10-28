// WebBundleErrorType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/web_bundle_handle.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;

public final class WebBundleErrorType {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        WebBundleErrorType.METADATA_PARSE_ERROR,
        WebBundleErrorType.RESPONSE_PARSE_ERROR,
        WebBundleErrorType.RESOURCE_NOT_FOUND,
        WebBundleErrorType.MEMORY_QUOTA_EXCEEDED,
        WebBundleErrorType.SERVING_CONSTRAINTS_NOT_MET,
        WebBundleErrorType.WEB_BUNDLE_FETCH_FAILED,
        WebBundleErrorType.WEB_BUNDLE_REDIRECTED,
        WebBundleErrorType.DEPRECATION_WARNING})
    public @interface EnumType {}

    public static final int METADATA_PARSE_ERROR = 0;
    public static final int RESPONSE_PARSE_ERROR = 1;
    public static final int RESOURCE_NOT_FOUND = 2;
    public static final int MEMORY_QUOTA_EXCEEDED = 3;
    public static final int SERVING_CONSTRAINTS_NOT_MET = 4;
    public static final int WEB_BUNDLE_FETCH_FAILED = 5;
    public static final int WEB_BUNDLE_REDIRECTED = 6;
    public static final int DEPRECATION_WARNING = 7;
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

    private WebBundleErrorType() {}
}