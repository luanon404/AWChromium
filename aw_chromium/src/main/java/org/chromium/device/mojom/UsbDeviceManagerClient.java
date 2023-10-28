// UsbDeviceManagerClient.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/usb_manager_client.mojom
//

package org.chromium.device.mojom;

import androidx.annotation.IntDef;


public interface UsbDeviceManagerClient extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends UsbDeviceManagerClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<UsbDeviceManagerClient, UsbDeviceManagerClient.Proxy> MANAGER = UsbDeviceManagerClient_Internal.MANAGER;

    void onDeviceAdded(
UsbDeviceInfo deviceInfo);


    void onDeviceRemoved(
UsbDeviceInfo deviceInfo);


}
