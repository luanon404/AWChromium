// ViewportFit.java is auto generated by mojom_bindings_generator.py, do not edit
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.
// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/page/display_cutout.mojom
//
package org.chromium.blink.mojom

import androidx.annotation.IntDef
import org.chromium.mojo.bindings.DeserializationException

object ViewportFit {
    private const val IS_EXTENSIBLE = false
    const val AUTO = 0
    const val CONTAIN = 1
    const val COVER = 2
    const val COVER_FORCED_BY_USER_AGENT = 3
    const val MIN_VALUE = 0
    const val MAX_VALUE = 3
    fun isKnownValue(value: Int): Boolean {
        return value >= 0 && value <= 3
    }

    fun validate(value: Int) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return
        throw DeserializationException("Invalid enum value.")
    }

    fun toKnownValue(value: Int): Int {
        return value
    }

    @IntDef(AUTO, CONTAIN, COVER, COVER_FORCED_BY_USER_AGENT)
    annotation class EnumType
}