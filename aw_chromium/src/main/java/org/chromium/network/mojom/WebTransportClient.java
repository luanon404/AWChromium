// WebTransportClient.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/web_transport.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;


public interface WebTransportClient extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends WebTransportClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<WebTransportClient, WebTransportClient.Proxy> MANAGER = WebTransportClient_Internal.MANAGER;

    void onDatagramReceived(
org.chromium.mojo_base.mojom.ReadOnlyBuffer data);


    void onIncomingStreamClosed(
int streamId, boolean finReceived);


    void onOutgoingStreamClosed(
int streamId);


    void onReceivedStopSending(
int streamId, int streamErrorCode);


    void onReceivedResetStream(
int streamId, int streamErrorCode);


    void onClosed(
WebTransportCloseInfo closeInfo);


}
