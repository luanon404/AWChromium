// CdmFactory.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/content_decryption_module.mojom
//

package org.chromium.media.mojom;

import androidx.annotation.IntDef;


public interface CdmFactory extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends CdmFactory, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<CdmFactory, CdmFactory.Proxy> MANAGER = CdmFactory_Internal.MANAGER;

    void createCdm(
CdmConfig cdmConfig, 
CreateCdm_Response callback);

    interface CreateCdm_Response extends org.chromium.mojo.bindings.Callbacks.Callback3<ContentDecryptionModule, CdmContext, String> { }


}
