// SimpleCacheEntryEnumerator.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_service_test.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;


public interface SimpleCacheEntryEnumerator extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends SimpleCacheEntryEnumerator, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<SimpleCacheEntryEnumerator, SimpleCacheEntryEnumerator.Proxy> MANAGER = SimpleCacheEntryEnumerator_Internal.MANAGER;

    void getNext(

GetNext_Response callback);

    interface GetNext_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<SimpleCacheOpenEntryResult> { }


}
