// ObliviousHttpClient.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/oblivious_http_request.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;


public interface ObliviousHttpClient extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends ObliviousHttpClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<ObliviousHttpClient, ObliviousHttpClient.Proxy> MANAGER = ObliviousHttpClient_Internal.MANAGER;

    void onCompleted(
ObliviousHttpCompletionResult response);


}
