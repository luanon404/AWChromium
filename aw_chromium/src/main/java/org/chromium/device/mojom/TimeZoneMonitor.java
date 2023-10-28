// TimeZoneMonitor.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/time_zone_monitor.mojom
//

package org.chromium.device.mojom;

import androidx.annotation.IntDef;


public interface TimeZoneMonitor extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends TimeZoneMonitor, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<TimeZoneMonitor, TimeZoneMonitor.Proxy> MANAGER = TimeZoneMonitor_Internal.MANAGER;

    void addClient(
TimeZoneMonitorClient client);


}
