
// Copyright 2023 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../base/android/linker/linker_jni.h

package org.chromium.base.library_loader;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    RelroSharingStatus.NOT_ATTEMPTED, RelroSharingStatus.SHARED, RelroSharingStatus.NOT_IDENTICAL,
    RelroSharingStatus.EXTERNAL_RELRO_FD_NOT_PROVIDED, RelroSharingStatus.EXTERNAL_RELRO_NOT_FOUND,
    RelroSharingStatus.NO_SHMEM_FUNCTIONS, RelroSharingStatus.REMAP_FAILED,
    RelroSharingStatus.CORRUPTED_IN_JAVA, RelroSharingStatus.EXTERNAL_LOAD_ADDRESS_RESET,
    RelroSharingStatus.COUNT
})
@Retention(RetentionPolicy.SOURCE)
public @interface RelroSharingStatus {
  int NOT_ATTEMPTED = 0;
  int SHARED = 1;
  int NOT_IDENTICAL = 2;
  int EXTERNAL_RELRO_FD_NOT_PROVIDED = 3;
  int EXTERNAL_RELRO_NOT_FOUND = 4;
  int NO_SHMEM_FUNCTIONS = 5;
  int REMAP_FAILED = 6;
  int CORRUPTED_IN_JAVA = 7;
  int EXTERNAL_LOAD_ADDRESS_RESET = 8;
  int COUNT = 9;
}
