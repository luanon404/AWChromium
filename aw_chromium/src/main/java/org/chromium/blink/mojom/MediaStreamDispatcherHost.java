// MediaStreamDispatcherHost.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/mediastream/media_stream.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface MediaStreamDispatcherHost extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends MediaStreamDispatcherHost, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<MediaStreamDispatcherHost, MediaStreamDispatcherHost.Proxy> MANAGER = MediaStreamDispatcherHost_Internal.MANAGER;

    void generateStreams(
int requestId, StreamControls controls, boolean userGesture, StreamSelectionInfo audioStreamSelectionInfo, 
GenerateStreams_Response callback);

    interface GenerateStreams_Response extends org.chromium.mojo.bindings.Callbacks.Callback4<Integer, String, StreamDevicesSet, Boolean> { }


    void cancelRequest(
int requestId);


    void stopStreamDevice(
String deviceId, org.chromium.mojo_base.mojom.UnguessableToken sessionId);


    void openDevice(
int requestId, String deviceId, int type, 
OpenDevice_Response callback);

    interface OpenDevice_Response extends org.chromium.mojo.bindings.Callbacks.Callback3<Boolean, String, MediaStreamDevice> { }


    void closeDevice(
String label);


    void setCapturingLinkSecured(
org.chromium.mojo_base.mojom.UnguessableToken sessionId, int type, boolean isSecure);


    void onStreamStarted(
String label);


    void getOpenDevice(
int requestId, org.chromium.mojo_base.mojom.UnguessableToken sessionId, org.chromium.mojo_base.mojom.UnguessableToken transferId, 
GetOpenDevice_Response callback);

    interface GetOpenDevice_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, GetOpenDeviceResponse> { }


    void keepDeviceAliveForTransfer(
org.chromium.mojo_base.mojom.UnguessableToken sessionId, org.chromium.mojo_base.mojom.UnguessableToken transferId, 
KeepDeviceAliveForTransfer_Response callback);

    interface KeepDeviceAliveForTransfer_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }


}
