// ProvisionFetcher.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/provision_fetcher.mojom
//

package org.chromium.media.mojom;

public interface ProvisionFetcher extends org.chromium.mojo.bindings.Interface {


    interface Proxy extends ProvisionFetcher, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<ProvisionFetcher, ProvisionFetcher.Proxy> MANAGER = ProvisionFetcher_Internal.MANAGER;

    void retrieve(org.chromium.url.mojom.Url defaultUrl, String requestData, Retrieve_Response callback);

    interface Retrieve_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Boolean, String> {
    }


}
