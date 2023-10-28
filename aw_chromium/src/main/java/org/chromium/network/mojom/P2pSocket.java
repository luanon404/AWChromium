// P2pSocket.java is auto generated by mojom_bindings_generator.py, do not edit


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


public interface P2pSocket extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends P2pSocket, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<P2pSocket, P2pSocket.Proxy> MANAGER = P2pSocket_Internal.MANAGER;

    void send(
org.chromium.mojo_base.mojom.ReadOnlyBuffer data, P2pPacketInfo packetInfo);


    void sendBatch(
P2pSendPacket[] packetBatch);


    void setOption(
int option, int value);


}
