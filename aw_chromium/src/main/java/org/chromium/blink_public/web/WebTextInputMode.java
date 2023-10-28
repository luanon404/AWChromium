
// Copyright 2023 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../third_party/blink/public/platform/web_text_input_mode.h

package org.chromium.blink_public.web;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    WebTextInputMode.DEFAULT, WebTextInputMode.NONE, WebTextInputMode.TEXT, WebTextInputMode.TEL,
    WebTextInputMode.URL, WebTextInputMode.EMAIL, WebTextInputMode.NUMERIC,
    WebTextInputMode.DECIMAL, WebTextInputMode.SEARCH, WebTextInputMode.MAX
})
@Retention(RetentionPolicy.SOURCE)
public @interface WebTextInputMode {
  int DEFAULT = 0;
  int NONE = 1;
  int TEXT = 2;
  int TEL = 3;
  int URL = 4;
  int EMAIL = 5;
  int NUMERIC = 6;
  int DECIMAL = 7;
  int SEARCH = 8;
  int MAX = 8;
}
