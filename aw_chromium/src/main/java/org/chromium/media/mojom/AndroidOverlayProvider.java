// AndroidOverlayProvider.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/android_overlay.mojom
//

package org.chromium.media.mojom;

import androidx.annotation.IntDef;


public interface AndroidOverlayProvider extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends AndroidOverlayProvider, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<AndroidOverlayProvider, AndroidOverlayProvider.Proxy> MANAGER = AndroidOverlayProvider_Internal.MANAGER;

    void createOverlay(
org.chromium.mojo.bindings.InterfaceRequest<AndroidOverlay> overlay, AndroidOverlayClient client, AndroidOverlayConfig config);


}
