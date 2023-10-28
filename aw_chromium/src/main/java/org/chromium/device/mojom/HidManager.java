// HidManager.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/hid.mojom
//

package org.chromium.device.mojom;

import androidx.annotation.IntDef;


public interface HidManager extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends HidManager, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<HidManager, HidManager.Proxy> MANAGER = HidManager_Internal.MANAGER;

    void getDevicesAndSetClient(
org.chromium.mojo.bindings.AssociatedInterfaceNotSupported client, 
GetDevicesAndSetClient_Response callback);

    interface GetDevicesAndSetClient_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<HidDeviceInfo[]> { }


    void getDevices(

GetDevices_Response callback);

    interface GetDevices_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<HidDeviceInfo[]> { }


    void connect(
String deviceGuid, HidConnectionClient connectionClient, HidConnectionWatcher watcher, boolean allowProtectedReports, boolean allowFidoReports, 
Connect_Response callback);

    interface Connect_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<HidConnection> { }


    void addReceiver(
org.chromium.mojo.bindings.InterfaceRequest<HidManager> receiver);


}
