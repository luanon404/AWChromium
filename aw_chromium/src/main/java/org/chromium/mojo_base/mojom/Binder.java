// Binder.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     mojo/public/mojom/base/binder.mojom
//

package org.chromium.mojo_base.mojom;

public interface Binder extends org.chromium.mojo.bindings.Interface {


    interface Proxy extends Binder, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<Binder, Binder.Proxy> MANAGER = Binder_Internal.MANAGER;

    void bind(GenericPendingReceiver receiver);


}
