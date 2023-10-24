// Copyright 2023 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../ui/events/android/gesture_event_type.h

package org.chromium.ui.base;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({GestureEventType.SHOW_PRESS, GestureEventType.DOUBLE_TAP, GestureEventType.SINGLE_TAP_UP, GestureEventType.SINGLE_TAP_CONFIRMED, GestureEventType.SINGLE_TAP_UNCONFIRMED, GestureEventType.LONG_PRESS, GestureEventType.SCROLL_START, GestureEventType.SCROLL_BY, GestureEventType.SCROLL_END, GestureEventType.FLING_START, GestureEventType.FLING_CANCEL, GestureEventType.FLING_END, GestureEventType.PINCH_BEGIN, GestureEventType.PINCH_BY, GestureEventType.PINCH_END, GestureEventType.TAP_CANCEL, GestureEventType.LONG_TAP, GestureEventType.TAP_DOWN})
@Retention(RetentionPolicy.SOURCE)
public @interface GestureEventType {
    int SHOW_PRESS = 0;
    int DOUBLE_TAP = 1;
    int SINGLE_TAP_UP = 2;
    int SINGLE_TAP_CONFIRMED = 3;
    int SINGLE_TAP_UNCONFIRMED = 4;
    int LONG_PRESS = 5;
    int SCROLL_START = 6;
    int SCROLL_BY = 7;
    int SCROLL_END = 8;
    int FLING_START = 9;
    int FLING_CANCEL = 10;
    int FLING_END = 11;
    int PINCH_BEGIN = 12;
    int PINCH_BY = 13;
    int PINCH_END = 14;
    int TAP_CANCEL = 15;
    int LONG_TAP = 16;
    int TAP_DOWN = 17;
}
