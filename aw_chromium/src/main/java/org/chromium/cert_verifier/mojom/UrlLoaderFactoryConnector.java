// UrlLoaderFactoryConnector.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/cert_verifier_service.mojom
//

package org.chromium.cert_verifier.mojom;

import androidx.annotation.IntDef;


public interface UrlLoaderFactoryConnector extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends UrlLoaderFactoryConnector, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<UrlLoaderFactoryConnector, UrlLoaderFactoryConnector.Proxy> MANAGER = UrlLoaderFactoryConnector_Internal.MANAGER;

    void createUrlLoaderFactory(
org.chromium.mojo.bindings.InterfaceRequest<org.chromium.network.mojom.UrlLoaderFactory> urlLoaderFactory);


}
