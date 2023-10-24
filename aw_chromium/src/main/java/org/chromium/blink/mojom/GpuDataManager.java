// GpuDataManager.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/gpu/gpu.mojom
//

package org.chromium.blink.mojom;


public interface GpuDataManager extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends GpuDataManager, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<GpuDataManager, GpuDataManager.Proxy> MANAGER = GpuDataManager_Internal.MANAGER;

    void are3DapIsBlockedForUrl(
org.chromium.url.mojom.Url url, 
Are3DapIsBlockedForUrl_Response callback);

    interface Are3DapIsBlockedForUrl_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }


}
