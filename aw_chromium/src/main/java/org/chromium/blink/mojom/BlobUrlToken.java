// BlobUrlToken.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/blob/blob_url_store.mojom
//

package org.chromium.blink.mojom;


public interface BlobUrlToken extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends BlobUrlToken, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<BlobUrlToken, BlobUrlToken.Proxy> MANAGER = BlobUrlToken_Internal.MANAGER;

    void clone(
org.chromium.mojo.bindings.InterfaceRequest<BlobUrlToken> token);


    void getToken(

GetToken_Response callback);

    interface GetToken_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.UnguessableToken> { }


}
