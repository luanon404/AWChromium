// DataPipeGetter.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/data_pipe_getter.mojom
//

package org.chromium.network.mojom;

public interface DataPipeGetter extends org.chromium.mojo.bindings.Interface {


    interface Proxy extends DataPipeGetter, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<DataPipeGetter, DataPipeGetter.Proxy> MANAGER = DataPipeGetter_Internal.MANAGER;

    void read(org.chromium.mojo.system.DataPipe.ProducerHandle pipe, Read_Response callback);

    interface Read_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, Long> {
    }


    void clone(org.chromium.mojo.bindings.InterfaceRequest<DataPipeGetter> receiver);


}
