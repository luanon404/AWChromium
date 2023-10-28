// P2pSocketManager.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/p2p.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;


public interface P2pSocketManager extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends P2pSocketManager, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<P2pSocketManager, P2pSocketManager.Proxy> MANAGER = P2pSocketManager_Internal.MANAGER;

    void startNetworkNotifications(
P2pNetworkNotificationClient client);


    void getHostAddress(
String hostName, boolean enableMdns, 
GetHostAddress_Response callback);

    interface GetHostAddress_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<IpAddress[]> { }


    void getHostAddressWithFamily(
String hostName, int addressFamily, boolean enableMdns, 
GetHostAddressWithFamily_Response callback);

    interface GetHostAddressWithFamily_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<IpAddress[]> { }


    void createSocket(
int type, IpEndPoint localAddress, P2pPortRange portRange, P2pHostAndIpEndPoint remoteAddress, MutableNetworkTrafficAnnotationTag trafficAnnotation, P2pSocketClient client, org.chromium.mojo.bindings.InterfaceRequest<P2pSocket> socket);


}
