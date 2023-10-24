// TextBoundary.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/accessibility/ax_enums.mojom
//

package org.chromium.ax.mojom;

import androidx.annotation.IntDef;

public final class TextBoundary {
    private static final boolean IS_EXTENSIBLE = true;

    @IntDef({TextBoundary.NONE, TextBoundary.CHARACTER, TextBoundary.FORMAT_END, TextBoundary.FORMAT_START, TextBoundary.FORMAT_START_OR_END, TextBoundary.LINE_END, TextBoundary.LINE_START, TextBoundary.LINE_START_OR_END, TextBoundary.OBJECT, TextBoundary.PAGE_END, TextBoundary.PAGE_START, TextBoundary.PAGE_START_OR_END, TextBoundary.PARAGRAPH_END, TextBoundary.PARAGRAPH_START, TextBoundary.PARAGRAPH_START_SKIPPING_EMPTY_PARAGRAPHS, TextBoundary.PARAGRAPH_START_OR_END, TextBoundary.SENTENCE_END, TextBoundary.SENTENCE_START, TextBoundary.SENTENCE_START_OR_END, TextBoundary.WEB_PAGE, TextBoundary.WORD_END, TextBoundary.WORD_START, TextBoundary.WORD_START_OR_END})
    public @interface EnumType {
    }

    public static final int NONE = 0;
    public static final int CHARACTER = 1;
    public static final int FORMAT_END = 2;
    public static final int FORMAT_START = 21;
    public static final int FORMAT_START_OR_END = 22;
    public static final int LINE_END = 3;
    public static final int LINE_START = 4;
    public static final int LINE_START_OR_END = 5;
    public static final int OBJECT = 6;
    public static final int PAGE_END = 7;
    public static final int PAGE_START = 8;
    public static final int PAGE_START_OR_END = 9;
    public static final int PARAGRAPH_END = 10;
    public static final int PARAGRAPH_START = 11;
    public static final int PARAGRAPH_START_SKIPPING_EMPTY_PARAGRAPHS = 20;
    public static final int PARAGRAPH_START_OR_END = 12;
    public static final int SENTENCE_END = 13;
    public static final int SENTENCE_START = 14;
    public static final int SENTENCE_START_OR_END = 15;
    public static final int WEB_PAGE = 16;
    public static final int WORD_END = 17;
    public static final int WORD_START = 18;
    public static final int WORD_START_OR_END = 19;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 22;
    public static final int DEFAULT_VALUE = 0;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 22;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
        if (isKnownValue(value)) {
            return value;
        }
        return DEFAULT_VALUE;
    }

    private TextBoundary() {
    }
}