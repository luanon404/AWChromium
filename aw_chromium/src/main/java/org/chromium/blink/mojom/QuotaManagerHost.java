// QuotaManagerHost.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/quota/quota_manager_host.mojom
//

package org.chromium.blink.mojom;


public interface QuotaManagerHost extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends QuotaManagerHost, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<QuotaManagerHost, QuotaManagerHost.Proxy> MANAGER = QuotaManagerHost_Internal.MANAGER;

    void addChangeListener(
QuotaChangeListener listener, 
AddChangeListener_Response callback);

    interface AddChangeListener_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


    void queryStorageUsageAndQuota(

QueryStorageUsageAndQuota_Response callback);

    interface QueryStorageUsageAndQuota_Response extends org.chromium.mojo.bindings.Callbacks.Callback4<Integer, Long, Long, UsageBreakdown> { }


}
