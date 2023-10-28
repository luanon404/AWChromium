// MediaSessionObserver.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/media_session/public/mojom/media_session.mojom
//

package org.chromium.media_session.mojom;

import androidx.annotation.IntDef;


public interface MediaSessionObserver extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends MediaSessionObserver, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<MediaSessionObserver, MediaSessionObserver.Proxy> MANAGER = MediaSessionObserver_Internal.MANAGER;

    void mediaSessionInfoChanged(
MediaSessionInfo info);


    void mediaSessionMetadataChanged(
MediaMetadata metadata);


    void mediaSessionActionsChanged(
int[] action);


    void mediaSessionImagesChanged(
java.util.Map<Integer, MediaImage[]> images);


    void mediaSessionPositionChanged(
MediaPosition position);


}
