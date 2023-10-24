// NetworkContextClient.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_context.mojom
//

package org.chromium.network.mojom;

public interface NetworkContextClient extends org.chromium.mojo.bindings.Interface {


    interface Proxy extends NetworkContextClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<NetworkContextClient, NetworkContextClient.Proxy> MANAGER = NetworkContextClient_Internal.MANAGER;

    void onFileUploadRequested(int processId, boolean async, org.chromium.mojo_base.mojom.FilePath[] filePaths, org.chromium.url.mojom.Url destinationUrl, OnFileUploadRequested_Response callback);

    interface OnFileUploadRequested_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, org.chromium.mojo_base.mojom.ReadOnlyFile[]> {
    }


    void onCanSendReportingReports(org.chromium.url.internal.mojom.Origin[] origins, OnCanSendReportingReports_Response callback);

    interface OnCanSendReportingReports_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.url.internal.mojom.Origin[]> {
    }


    void onCanSendDomainReliabilityUpload(org.chromium.url.internal.mojom.Origin origin, OnCanSendDomainReliabilityUpload_Response callback);

    interface OnCanSendDomainReliabilityUpload_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> {
    }


    void onGenerateHttpNegotiateAuthToken(String serverAuthToken, boolean canDelegate, String authNegotiateAndroidAccountType, String spn, OnGenerateHttpNegotiateAuthToken_Response callback);

    interface OnGenerateHttpNegotiateAuthToken_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, String> {
    }


    void onCanSendSctAuditingReport(

            OnCanSendSctAuditingReport_Response callback);

    interface OnCanSendSctAuditingReport_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> {
    }


    void onNewSctAuditingReportSent();


}
