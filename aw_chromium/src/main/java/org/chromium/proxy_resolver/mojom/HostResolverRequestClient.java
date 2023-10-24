// HostResolverRequestClient.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/proxy_resolver/public/mojom/proxy_resolver.mojom
//

package org.chromium.proxy_resolver.mojom;

public interface HostResolverRequestClient extends org.chromium.mojo.bindings.Interface {


    interface Proxy extends HostResolverRequestClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<HostResolverRequestClient, HostResolverRequestClient.Proxy> MANAGER = HostResolverRequestClient_Internal.MANAGER;

    void reportResult(int error, org.chromium.network.mojom.IpAddress[] result);


}
