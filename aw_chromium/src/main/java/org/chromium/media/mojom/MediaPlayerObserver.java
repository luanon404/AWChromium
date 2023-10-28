// MediaPlayerObserver.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/media_player.mojom
//

package org.chromium.media.mojom;

import androidx.annotation.IntDef;


public interface MediaPlayerObserver extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends MediaPlayerObserver, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<MediaPlayerObserver, MediaPlayerObserver.Proxy> MANAGER = MediaPlayerObserver_Internal.MANAGER;

    void onMediaPlaying(
);


    void onMediaPaused(
boolean streamEnded);


    void onMutedStatusChanged(
boolean muted);


    void onMediaMetadataChanged(
boolean hasAudio, boolean hasVideo, int contentType);


    void onMediaPositionStateChanged(
org.chromium.media_session.mojom.MediaPosition mediaPosition);


    void onMediaEffectivelyFullscreenChanged(
int status);


    void onMediaSizeChanged(
org.chromium.gfx.mojom.Size size);


    void onPictureInPictureAvailabilityChanged(
boolean available);


    void onAudioOutputSinkChanged(
String hashedDeviceId);


    void onUseAudioServiceChanged(
boolean usesAudioService);


    void onAudioOutputSinkChangingDisabled(
);


    void onRemotePlaybackMetadataChange(
org.chromium.media_session.mojom.RemotePlaybackMetadata remotePlaybackMetadata);


}
