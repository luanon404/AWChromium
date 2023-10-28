// DedicatedWorkerHostFactoryClient.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/worker/dedicated_worker_host_factory.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface DedicatedWorkerHostFactoryClient extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends DedicatedWorkerHostFactoryClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<DedicatedWorkerHostFactoryClient, DedicatedWorkerHostFactoryClient.Proxy> MANAGER = DedicatedWorkerHostFactoryClient_Internal.MANAGER;

    void onWorkerHostCreated(
BrowserInterfaceBroker browserInterfaceBroker, DedicatedWorkerHost host);


    void onScriptLoadStarted(
ServiceWorkerContainerInfoForClient serviceWorkerContainerInfo, WorkerMainScriptLoadParams mainScriptLoadParams, UrlLoaderFactoryBundle subresourceLoaderFactories, org.chromium.mojo.bindings.InterfaceRequest<SubresourceLoaderUpdater> subresourceLoaderUpdater, ControllerServiceWorkerInfo controllerInfo, BackForwardCacheControllerHost backForwardCacheControllerHost);


    void onScriptLoadStartFailed(
);


}
