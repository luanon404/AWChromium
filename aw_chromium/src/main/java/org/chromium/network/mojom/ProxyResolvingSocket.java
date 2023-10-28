// ProxyResolvingSocket.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/proxy_resolving_socket.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;


public interface ProxyResolvingSocket extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends ProxyResolvingSocket, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<ProxyResolvingSocket, ProxyResolvingSocket.Proxy> MANAGER = ProxyResolvingSocket_Internal.MANAGER;

    void upgradeToTls(
HostPortPair hostPortPair, MutableNetworkTrafficAnnotationTag trafficAnnotation, org.chromium.mojo.bindings.InterfaceRequest<TlsClientSocket> receiver, SocketObserver observer, 
UpgradeToTls_Response callback);

    interface UpgradeToTls_Response extends org.chromium.mojo.bindings.Callbacks.Callback3<Integer, org.chromium.mojo.system.DataPipe.ConsumerHandle, org.chromium.mojo.system.DataPipe.ProducerHandle> { }


}
