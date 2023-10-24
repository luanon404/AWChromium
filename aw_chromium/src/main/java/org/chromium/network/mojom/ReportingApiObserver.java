// ReportingApiObserver.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/reporting_service.mojom
//

package org.chromium.network.mojom;

public interface ReportingApiObserver extends org.chromium.mojo.bindings.Interface {


    interface Proxy extends ReportingApiObserver, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<ReportingApiObserver, ReportingApiObserver.Proxy> MANAGER = ReportingApiObserver_Internal.MANAGER;

    void onReportAdded(ReportingApiReport report);


    void onReportUpdated(ReportingApiReport report);


    void onEndpointsUpdatedForOrigin(ReportingApiEndpoint[] endpoints);


}
