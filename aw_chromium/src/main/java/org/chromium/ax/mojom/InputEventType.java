// InputEventType.java is auto generated by mojom_bindings_generator.py, do not edit


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

public final class InputEventType {
    private static final boolean IS_EXTENSIBLE = true;
    @IntDef({

        InputEventType.NONE,
        InputEventType.INSERT_TEXT,
        InputEventType.INSERT_LINE_BREAK,
        InputEventType.INSERT_PARAGRAPH,
        InputEventType.INSERT_ORDERED_LIST,
        InputEventType.INSERT_UNORDERED_LIST,
        InputEventType.INSERT_HORIZONTAL_RULE,
        InputEventType.INSERT_FROM_PASTE,
        InputEventType.INSERT_FROM_DROP,
        InputEventType.INSERT_FROM_YANK,
        InputEventType.INSERT_TRANSPOSE,
        InputEventType.INSERT_REPLACEMENT_TEXT,
        InputEventType.INSERT_COMPOSITION_TEXT,
        InputEventType.DELETE_WORD_BACKWARD,
        InputEventType.DELETE_WORD_FORWARD,
        InputEventType.DELETE_SOFT_LINE_BACKWARD,
        InputEventType.DELETE_SOFT_LINE_FORWARD,
        InputEventType.DELETE_HARD_LINE_BACKWARD,
        InputEventType.DELETE_HARD_LINE_FORWARD,
        InputEventType.DELETE_CONTENT_BACKWARD,
        InputEventType.DELETE_CONTENT_FORWARD,
        InputEventType.DELETE_BY_CUT,
        InputEventType.DELETE_BY_DRAG,
        InputEventType.HISTORY_UNDO,
        InputEventType.HISTORY_REDO,
        InputEventType.FORMAT_BOLD,
        InputEventType.FORMAT_ITALIC,
        InputEventType.FORMAT_UNDERLINE,
        InputEventType.FORMAT_STRIKE_THROUGH,
        InputEventType.FORMAT_SUPERSCRIPT,
        InputEventType.FORMAT_SUBSCRIPT,
        InputEventType.FORMAT_JUSTIFY_CENTER,
        InputEventType.FORMAT_JUSTIFY_FULL,
        InputEventType.FORMAT_JUSTIFY_RIGHT,
        InputEventType.FORMAT_JUSTIFY_LEFT,
        InputEventType.FORMAT_INDENT,
        InputEventType.FORMAT_OUTDENT,
        InputEventType.FORMAT_REMOVE,
        InputEventType.FORMAT_SET_BLOCK_TEXT_DIRECTION})
    public @interface EnumType {}

    public static final int NONE = 0;
    public static final int INSERT_TEXT = 1;
    public static final int INSERT_LINE_BREAK = 2;
    public static final int INSERT_PARAGRAPH = 3;
    public static final int INSERT_ORDERED_LIST = 4;
    public static final int INSERT_UNORDERED_LIST = 5;
    public static final int INSERT_HORIZONTAL_RULE = 6;
    public static final int INSERT_FROM_PASTE = 7;
    public static final int INSERT_FROM_DROP = 8;
    public static final int INSERT_FROM_YANK = 9;
    public static final int INSERT_TRANSPOSE = 10;
    public static final int INSERT_REPLACEMENT_TEXT = 11;
    public static final int INSERT_COMPOSITION_TEXT = 12;
    public static final int DELETE_WORD_BACKWARD = 13;
    public static final int DELETE_WORD_FORWARD = 14;
    public static final int DELETE_SOFT_LINE_BACKWARD = 15;
    public static final int DELETE_SOFT_LINE_FORWARD = 16;
    public static final int DELETE_HARD_LINE_BACKWARD = 17;
    public static final int DELETE_HARD_LINE_FORWARD = 18;
    public static final int DELETE_CONTENT_BACKWARD = 19;
    public static final int DELETE_CONTENT_FORWARD = 20;
    public static final int DELETE_BY_CUT = 21;
    public static final int DELETE_BY_DRAG = 22;
    public static final int HISTORY_UNDO = 23;
    public static final int HISTORY_REDO = 24;
    public static final int FORMAT_BOLD = 25;
    public static final int FORMAT_ITALIC = 26;
    public static final int FORMAT_UNDERLINE = 27;
    public static final int FORMAT_STRIKE_THROUGH = 28;
    public static final int FORMAT_SUPERSCRIPT = 29;
    public static final int FORMAT_SUBSCRIPT = 30;
    public static final int FORMAT_JUSTIFY_CENTER = 31;
    public static final int FORMAT_JUSTIFY_FULL = 32;
    public static final int FORMAT_JUSTIFY_RIGHT = 33;
    public static final int FORMAT_JUSTIFY_LEFT = 34;
    public static final int FORMAT_INDENT = 35;
    public static final int FORMAT_OUTDENT = 36;
    public static final int FORMAT_REMOVE = 37;
    public static final int FORMAT_SET_BLOCK_TEXT_DIRECTION = 38;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 38;
    public static final int DEFAULT_VALUE = 0;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 38;
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

    private InputEventType() {}
}