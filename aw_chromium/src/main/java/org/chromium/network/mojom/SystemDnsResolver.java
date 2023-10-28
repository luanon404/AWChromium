// SystemDnsResolver.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/system_dns_resolution.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;


public interface SystemDnsResolver extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends SystemDnsResolver, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<SystemDnsResolver, SystemDnsResolver.Proxy> MANAGER = SystemDnsResolver_Internal.MANAGER;

    void resolve(
String hostname, int addrFamily, int flags, long network, 
Resolve_Response callback);

    interface Resolve_Response extends org.chromium.mojo.bindings.Callbacks.Callback3<AddressList, Integer, Integer> { }


}
