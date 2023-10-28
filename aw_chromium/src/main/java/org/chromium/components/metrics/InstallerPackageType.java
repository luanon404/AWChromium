
// Copyright 2023 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/embedder_support/android/metrics/android_metrics_service_client.h

package org.chromium.components.metrics;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    InstallerPackageType.SYSTEM_APP, InstallerPackageType.GOOGLE_PLAY_STORE,
    InstallerPackageType.OTHER
})
@Retention(RetentionPolicy.SOURCE)
public @interface InstallerPackageType {
  /**
   * App has been initially preinstalled in the system image.
   */
  int SYSTEM_APP = 0;
  /**
   * App has been installed/updated by Google Play Store. Doesn't apply for apps whose most recent
   * updates are sideloaded, even if the app was installed via Google Play Store.
   */
  int GOOGLE_PLAY_STORE = 1;
  /**
   * App has been Sideloaded or installed/updated through a 3rd party app store.
   */
  int OTHER = 2;
}
