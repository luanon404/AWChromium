// PeerConnectionTrackerHost.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/peerconnection/peer_connection_tracker.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface PeerConnectionTrackerHost extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends PeerConnectionTrackerHost, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<PeerConnectionTrackerHost, PeerConnectionTrackerHost.Proxy> MANAGER = PeerConnectionTrackerHost_Internal.MANAGER;

    void addPeerConnection(
PeerConnectionInfo info);


    void removePeerConnection(
int lid);


    void updatePeerConnection(
int lid, String type, String value);


    void onPeerConnectionSessionIdSet(
int lid, String sessionId);


    void getUserMedia(
int requestId, boolean audio, boolean video, String audioConstraints, String videoConstraints);


    void getUserMediaSuccess(
int requestId, String streamId, String audioTrackInfo, String videoTrackInfo);


    void getUserMediaFailure(
int requestId, String error, String errorMessage);


    void getDisplayMedia(
int requestId, boolean audio, boolean video, String audioConstraints, String videoConstraints);


    void getDisplayMediaSuccess(
int requestId, String streamId, String audioTrackInfo, String videoTrackInfo);


    void getDisplayMediaFailure(
int requestId, String error, String errorMessage);


    void webRtcEventLogWrite(
int lid, byte[] output);


    void addStandardStats(
int lid, org.chromium.mojo_base.mojom.ListValue value);


    void addLegacyStats(
int lid, org.chromium.mojo_base.mojom.ListValue value);


}
