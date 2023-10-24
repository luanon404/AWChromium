// Copyright 2023 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../android_webview/browser/lifecycle/webview_app_state_observer.h

package org.chromium.android_webview;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({AppState.UNKNOWN, AppState.FOREGROUND, AppState.BACKGROUND, AppState.DESTROYED})
@Retention(RetentionPolicy.SOURCE)
public @interface AppState {
    /**
     * All WebViews are detached from window.
     */
    int UNKNOWN = 0;
    /**
     * At least one WebView is foreground.
     */
    int FOREGROUND = 1;
    /**
     * No WebView is foreground and at least one WebView is background.
     */
    int BACKGROUND = 2;
    /**
     * All WebViews are destroyed or no WebView has been created. Observers shall use
     * AwContentsLifecycleNotifier::has_aw_contents_ever_created() to find if A WebView has ever been
     * created.
     */
    int DESTROYED = 3;
}
