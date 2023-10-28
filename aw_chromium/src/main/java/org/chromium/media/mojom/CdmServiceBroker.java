// CdmServiceBroker.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/cdm_service.mojom
//

package org.chromium.media.mojom;

import androidx.annotation.IntDef;


public interface CdmServiceBroker extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends CdmServiceBroker, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<CdmServiceBroker, CdmServiceBroker.Proxy> MANAGER = CdmServiceBroker_Internal.MANAGER;

    void getService(
org.chromium.mojo_base.mojom.FilePath cdmPath, org.chromium.mojo.bindings.InterfaceRequest<CdmService> receiver);


}
