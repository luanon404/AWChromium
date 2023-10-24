// Copyright 2023 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../ui/touch_selection/touch_handle_orientation.h

package org.chromium.ui.touch_selection;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({TouchHandleOrientation.LEFT, TouchHandleOrientation.CENTER, TouchHandleOrientation.RIGHT, TouchHandleOrientation.UNDEFINED})
@Retention(RetentionPolicy.SOURCE)
public @interface TouchHandleOrientation {
    int LEFT = 0;
    int CENTER = 1;
    int RIGHT = 2;
    int UNDEFINED = 3;
}
