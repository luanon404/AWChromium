// ChunkedDataPipeGetter.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/chunked_data_pipe_getter.mojom
//

package org.chromium.network.mojom;

public interface ChunkedDataPipeGetter extends org.chromium.mojo.bindings.Interface {


    interface Proxy extends ChunkedDataPipeGetter, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<ChunkedDataPipeGetter, ChunkedDataPipeGetter.Proxy> MANAGER = ChunkedDataPipeGetter_Internal.MANAGER;

    void getSize(

            GetSize_Response callback);

    interface GetSize_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, Long> {
    }


    void startReading(org.chromium.mojo.system.DataPipe.ProducerHandle pipe);


}
