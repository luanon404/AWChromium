// IpProtectionConfigGetter.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_context.mojom
//

package org.chromium.network.mojom;

public interface IpProtectionConfigGetter extends org.chromium.mojo.bindings.Interface {


    interface Proxy extends IpProtectionConfigGetter, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<IpProtectionConfigGetter, IpProtectionConfigGetter.Proxy> MANAGER = IpProtectionConfigGetter_Internal.MANAGER;

    void tryGetAuthTokens(int batchSize, int proxyLayer, TryGetAuthTokens_Response callback);

    interface TryGetAuthTokens_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<BlindSignedAuthToken[], org.chromium.mojo_base.mojom.Time> {
    }


    void getProxyList(

            GetProxyList_Response callback);

    interface GetProxyList_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<String[]> {
    }


}
