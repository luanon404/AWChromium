// PictureInPictureSession.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/picture_in_picture/picture_in_picture.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface PictureInPictureSession extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends PictureInPictureSession, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<PictureInPictureSession, PictureInPictureSession.Proxy> MANAGER = PictureInPictureSession_Internal.MANAGER;

    void update(
int playerId, org.chromium.mojo.bindings.AssociatedInterfaceNotSupported playerRemote, org.chromium.viz.mojom.SurfaceId surfaceId, org.chromium.gfx.mojom.Size naturalSize, boolean showPlayPauseButton);


    void stop(

Stop_Response callback);

    interface Stop_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


}
