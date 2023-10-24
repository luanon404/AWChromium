// WakeLockService.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/wake_lock/wake_lock.mojom
//

package org.chromium.blink.mojom;


public interface WakeLockService extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends WakeLockService, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<WakeLockService, WakeLockService.Proxy> MANAGER = WakeLockService_Internal.MANAGER;

    void getWakeLock(
int type, int reason, String description, org.chromium.mojo.bindings.InterfaceRequest<org.chromium.device.mojom.WakeLock> wakeLock);


}
