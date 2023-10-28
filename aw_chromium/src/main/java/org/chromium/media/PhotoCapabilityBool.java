
// Copyright 2023 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../media/capture/video/android/photo_capabilities.h

package org.chromium.media;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    PhotoCapabilityBool.SUPPORTS_TORCH, PhotoCapabilityBool.TORCH,
    PhotoCapabilityBool.RED_EYE_REDUCTION
})
@Retention(RetentionPolicy.SOURCE)
public @interface PhotoCapabilityBool {
  int SUPPORTS_TORCH = 0;
  int TORCH = 1;
  int RED_EYE_REDUCTION = 2;
  int NUM_ENTRIES = 3;
}
