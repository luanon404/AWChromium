// FileSystemAccessStatus.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/file_system_access/file_system_access_error.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;

public final class FileSystemAccessStatus {
    private static final boolean IS_EXTENSIBLE = false;
    @IntDef({

        FileSystemAccessStatus.OK,
        FileSystemAccessStatus.PERMISSION_DENIED,
        FileSystemAccessStatus.SECURITY_ERROR,
        FileSystemAccessStatus.NO_MODIFICATION_ALLOWED_ERROR,
        FileSystemAccessStatus.INVALID_MODIFICATION_ERROR,
        FileSystemAccessStatus.NOT_SUPPORTED_ERROR,
        FileSystemAccessStatus.INVALID_STATE,
        FileSystemAccessStatus.INVALID_ARGUMENT,
        FileSystemAccessStatus.OPERATION_FAILED,
        FileSystemAccessStatus.OPERATION_ABORTED,
        FileSystemAccessStatus.FILE_ERROR})
    public @interface EnumType {}

    public static final int OK = 0;
    public static final int PERMISSION_DENIED = 1;
    public static final int SECURITY_ERROR = 2;
    public static final int NO_MODIFICATION_ALLOWED_ERROR = 3;
    public static final int INVALID_MODIFICATION_ERROR = 4;
    public static final int NOT_SUPPORTED_ERROR = 5;
    public static final int INVALID_STATE = 6;
    public static final int INVALID_ARGUMENT = 7;
    public static final int OPERATION_FAILED = 8;
    public static final int OPERATION_ABORTED = 9;
    public static final int FILE_ERROR = 10;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 10;

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 10;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value)) return;
        throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
    }

    public static int toKnownValue(int value) {
      return value;
    }

    private FileSystemAccessStatus() {}
}