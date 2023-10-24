// Copyright 2023 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../android_webview/browser/aw_apk_type.h

package org.chromium.android_webview;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({ApkType.STANDALONE, ApkType.MONOCHROME, ApkType.TRICHROME})
@Retention(RetentionPolicy.SOURCE)
public @interface ApkType {
    int STANDALONE = 0;
    int MONOCHROME = 1;
    int TRICHROME = 2;
}
