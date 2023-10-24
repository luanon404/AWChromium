// ManagedConfigurationService.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/device/device.mojom
//

package org.chromium.blink.mojom;


public interface ManagedConfigurationService extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends ManagedConfigurationService, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<ManagedConfigurationService, ManagedConfigurationService.Proxy> MANAGER = ManagedConfigurationService_Internal.MANAGER;

    void getManagedConfiguration(
String[] keys, 
GetManagedConfiguration_Response callback);

    interface GetManagedConfiguration_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<java.util.Map<String, String>> { }


    void subscribeToManagedConfiguration(
ManagedConfigurationObserver observer);


}
