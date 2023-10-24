// Copyright 2023 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../base/trace_event/trace_config.h

package org.chromium.base;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({TraceRecordMode.RECORD_UNTIL_FULL, TraceRecordMode.RECORD_CONTINUOUSLY, TraceRecordMode.RECORD_AS_MUCH_AS_POSSIBLE, TraceRecordMode.ECHO_TO_CONSOLE})
@Retention(RetentionPolicy.SOURCE)
public @interface TraceRecordMode {
    /**
     * Record until the trace buffer is full.
     */
    int RECORD_UNTIL_FULL = 0;
    /**
     * Record until the user ends the trace. The trace buffer is a fixed size and we use it as a ring
     * buffer during recording.
     */
    int RECORD_CONTINUOUSLY = 1;
    /**
     * Record until the trace buffer is full, but with a huge buffer size.
     */
    int RECORD_AS_MUCH_AS_POSSIBLE = 2;
    /**
     * Echo to console. Events are discarded.
     */
    int ECHO_TO_CONSOLE = 3;
}
