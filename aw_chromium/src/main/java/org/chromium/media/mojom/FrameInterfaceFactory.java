// FrameInterfaceFactory.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/frame_interface_factory.mojom
//

package org.chromium.media.mojom;

import androidx.annotation.IntDef;


public interface FrameInterfaceFactory extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends FrameInterfaceFactory, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<FrameInterfaceFactory, FrameInterfaceFactory.Proxy> MANAGER = FrameInterfaceFactory_Internal.MANAGER;

    void createProvisionFetcher(
org.chromium.mojo.bindings.InterfaceRequest<ProvisionFetcher> provisionFetcher);


    void createCdmStorage(
org.chromium.mojo.bindings.InterfaceRequest<CdmStorage> cdmStorage);


    void getCdmOrigin(

GetCdmOrigin_Response callback);

    interface GetCdmOrigin_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.url.internal.mojom.Origin> { }


    void bindEmbedderReceiver(
org.chromium.mojo_base.mojom.GenericPendingReceiver receiver);


}
