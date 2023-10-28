// RemoteObjectHost.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/remote_objects/remote_objects.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface RemoteObjectHost extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends RemoteObjectHost, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<RemoteObjectHost, RemoteObjectHost.Proxy> MANAGER = RemoteObjectHost_Internal.MANAGER;

    void getObject(
int objectId, org.chromium.mojo.bindings.InterfaceRequest<RemoteObject> receiver);


    void acquireObject(
int objectId);


    void releaseObject(
int objectId);


}
