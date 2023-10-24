// Copyright 2023 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../media/capture/video/android/video_capture_device_android.h

package org.chromium.media;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({AndroidVideoCaptureFrameDropReason.ANDROID_API_1_UNEXPECTED_DATA_LENGTH, AndroidVideoCaptureFrameDropReason.ANDROID_API_2_ACQUIRED_IMAGE_IS_NULL})
@Retention(RetentionPolicy.SOURCE)
public @interface AndroidVideoCaptureFrameDropReason {
    int ANDROID_API_1_UNEXPECTED_DATA_LENGTH = 8;
    int ANDROID_API_2_ACQUIRED_IMAGE_IS_NULL = 9;
}
