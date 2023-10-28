// ResolveHostClient.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/host_resolver.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;


public interface ResolveHostClient extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends ResolveHostClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<ResolveHostClient, ResolveHostClient.Proxy> MANAGER = ResolveHostClient_Internal.MANAGER;

    void onComplete(
int result, ResolveErrorInfo resolveErrorInfo, AddressList resolvedAddresses, HostResolverEndpointResult[] endpointResultsWithMetadata);


    void onTextResults(
String[] textResults);


    void onHostnameResults(
HostPortPair[] hosts);


}
