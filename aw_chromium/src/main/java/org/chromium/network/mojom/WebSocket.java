// WebSocket.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/websocket.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;


public interface WebSocket extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends WebSocket, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<WebSocket, WebSocket.Proxy> MANAGER = WebSocket_Internal.MANAGER;

    void sendMessage(
int type, long dataLength);


    void startReceiving(
);


    void startClosingHandshake(
short code, String reason);


}
