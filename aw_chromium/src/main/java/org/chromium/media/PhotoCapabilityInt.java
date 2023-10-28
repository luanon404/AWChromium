
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
    PhotoCapabilityInt.MIN_ISO, PhotoCapabilityInt.MAX_ISO, PhotoCapabilityInt.CURRENT_ISO,
    PhotoCapabilityInt.STEP_ISO, PhotoCapabilityInt.MIN_HEIGHT, PhotoCapabilityInt.MAX_HEIGHT,
    PhotoCapabilityInt.CURRENT_HEIGHT, PhotoCapabilityInt.STEP_HEIGHT, PhotoCapabilityInt.MIN_WIDTH,
    PhotoCapabilityInt.MAX_WIDTH, PhotoCapabilityInt.CURRENT_WIDTH, PhotoCapabilityInt.STEP_WIDTH,
    PhotoCapabilityInt.MIN_COLOR_TEMPERATURE, PhotoCapabilityInt.MAX_COLOR_TEMPERATURE,
    PhotoCapabilityInt.CURRENT_COLOR_TEMPERATURE, PhotoCapabilityInt.STEP_COLOR_TEMPERATURE
})
@Retention(RetentionPolicy.SOURCE)
public @interface PhotoCapabilityInt {
  int MIN_ISO = 0;
  int MAX_ISO = 1;
  int CURRENT_ISO = 2;
  int STEP_ISO = 3;
  int MIN_HEIGHT = 4;
  int MAX_HEIGHT = 5;
  int CURRENT_HEIGHT = 6;
  int STEP_HEIGHT = 7;
  int MIN_WIDTH = 8;
  int MAX_WIDTH = 9;
  int CURRENT_WIDTH = 10;
  int STEP_WIDTH = 11;
  int MIN_COLOR_TEMPERATURE = 12;
  int MAX_COLOR_TEMPERATURE = 13;
  int CURRENT_COLOR_TEMPERATURE = 14;
  int STEP_COLOR_TEMPERATURE = 15;
  int NUM_ENTRIES = 16;
}
