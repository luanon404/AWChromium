// AlternateProtocolUsage.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/alternate_protocol_usage.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;

public final class AlternateProtocolUsage {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        AlternateProtocolUsage.NO_RACE,
        AlternateProtocolUsage.WON_RACE,
        AlternateProtocolUsage.MAIN_JOB_WON_RACE,
        AlternateProtocolUsage.MAPPING_MISSING,
        AlternateProtocolUsage.BROKEN,
        AlternateProtocolUsage.DNS_ALPN_H3_JOB_WON_WITHOUT_RACE,
        AlternateProtocolUsage.DNS_ALPN_H3_JOB_WON_RACE,
        AlternateProtocolUsage.UNSPECIFIED_REASON})
    public @interface EnumType {}

    public static final int NO_RACE = 0;
    public static final int WON_RACE = 1;
    public static final int MAIN_JOB_WON_RACE = 2;
    public static final int MAPPING_MISSING = 3;
    public static final int BROKEN = 4;
    public static final int DNS_ALPN_H3_JOB_WON_WITHOUT_RACE = 5;
    public static final int DNS_ALPN_H3_JOB_WON_RACE = 6;
    public static final int UNSPECIFIED_REASON = 7;
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

    private AlternateProtocolUsage() {}
}