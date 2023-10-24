// FileEnumerator.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/http_cache_backend_file_operations.mojom
//

package org.chromium.network.mojom;

public interface FileEnumerator extends org.chromium.mojo.bindings.Interface {


    interface Proxy extends FileEnumerator, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<FileEnumerator, FileEnumerator.Proxy> MANAGER = FileEnumerator_Internal.MANAGER;

    void getNext(int numEntries, GetNext_Response callback);

    interface GetNext_Response extends org.chromium.mojo.bindings.Callbacks.Callback3<FileEnumerationEntry[], Boolean, Boolean> {
    }


}
