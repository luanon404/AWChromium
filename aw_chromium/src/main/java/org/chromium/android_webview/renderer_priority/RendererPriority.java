// Copyright 2023 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../android_webview/browser/aw_renderer_priority.h

package org.chromium.android_webview.renderer_priority;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({RendererPriority.INITIAL, RendererPriority.WAIVED, RendererPriority.LOW, RendererPriority.HIGH})
@Retention(RetentionPolicy.SOURCE)
public @interface RendererPriority {
    int INITIAL = -1;
    int WAIVED = 0;
    int LOW = 1;
    int HIGH = 2;
}
