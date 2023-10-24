// SocketBroker.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/socket_broker.mojom
//

package org.chromium.network.mojom;

public interface SocketBroker extends org.chromium.mojo.bindings.Interface {


    interface Proxy extends SocketBroker, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<SocketBroker, SocketBroker.Proxy> MANAGER = SocketBroker_Internal.MANAGER;

    void createTcpSocket(int addressFamily, CreateTcpSocket_Response callback);

    interface CreateTcpSocket_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<TransferableSocket, Integer> {
    }


    void createUdpSocket(int addressFamily, CreateUdpSocket_Response callback);

    interface CreateUdpSocket_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<TransferableSocket, Integer> {
    }


}
