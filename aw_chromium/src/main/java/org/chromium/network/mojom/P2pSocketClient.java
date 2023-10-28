// P2pSocketClient.java is auto generated by mojom_bindings_generator.py, do not edit


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


public interface P2pSocketClient extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends P2pSocketClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<P2pSocketClient, P2pSocketClient.Proxy> MANAGER = P2pSocketClient_Internal.MANAGER;

    void socketCreated(
IpEndPoint localAddress, IpEndPoint remoteAddress);


    void sendComplete(
P2pSendPacketMetrics sendMetrics);


    void sendBatchComplete(
P2pSendPacketMetrics[] sendMetricsBatch);


    void dataReceived(
P2pReceivedPacket[] packets);


}
