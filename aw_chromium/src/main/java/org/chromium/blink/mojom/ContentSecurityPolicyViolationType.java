// ContentSecurityPolicyViolationType.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/devtools/inspector_issue.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;

public final class ContentSecurityPolicyViolationType {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        ContentSecurityPolicyViolationType.INLINE_VIOLATION,
        ContentSecurityPolicyViolationType.EVAL_VIOLATION,
        ContentSecurityPolicyViolationType.URL_VIOLATION,
        ContentSecurityPolicyViolationType.TRUSTED_TYPES_SINK_VIOLATION,
        ContentSecurityPolicyViolationType.TRUSTED_TYPES_POLICY_VIOLATION,
        ContentSecurityPolicyViolationType.WASM_EVAL_VIOLATION})
    public @interface EnumType {}

    public static final int INLINE_VIOLATION = 0;
    public static final int EVAL_VIOLATION = 1;
    public static final int URL_VIOLATION = 2;
    public static final int TRUSTED_TYPES_SINK_VIOLATION = 3;
    public static final int TRUSTED_TYPES_POLICY_VIOLATION = 4;
    public static final int WASM_EVAL_VIOLATION = 5;
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

    private ContentSecurityPolicyViolationType() {}
}