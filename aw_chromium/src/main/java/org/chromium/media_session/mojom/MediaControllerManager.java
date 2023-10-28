// MediaControllerManager.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/media_session/public/mojom/media_controller.mojom
//

package org.chromium.media_session.mojom;

import androidx.annotation.IntDef;


public interface MediaControllerManager extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends MediaControllerManager, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<MediaControllerManager, MediaControllerManager.Proxy> MANAGER = MediaControllerManager_Internal.MANAGER;

    void createMediaControllerForSession(
org.chromium.mojo.bindings.InterfaceRequest<MediaController> receiver, org.chromium.mojo_base.mojom.UnguessableToken requestId);


    void createActiveMediaController(
org.chromium.mojo.bindings.InterfaceRequest<MediaController> receiver);


    void suspendAllSessions(
);


}
