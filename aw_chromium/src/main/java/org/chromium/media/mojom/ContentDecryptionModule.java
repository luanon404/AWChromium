// ContentDecryptionModule.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/content_decryption_module.mojom
//

package org.chromium.media.mojom;

import androidx.annotation.IntDef;


public interface ContentDecryptionModule extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends ContentDecryptionModule, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<ContentDecryptionModule, ContentDecryptionModule.Proxy> MANAGER = ContentDecryptionModule_Internal.MANAGER;

    void setClient(
org.chromium.mojo.bindings.AssociatedInterfaceNotSupported client);


    void setServerCertificate(
byte[] certificateData, 
SetServerCertificate_Response callback);

    interface SetServerCertificate_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<CdmPromiseResult> { }


    void getStatusForPolicy(
int minHdcpVersion, 
GetStatusForPolicy_Response callback);

    interface GetStatusForPolicy_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<CdmPromiseResult, Integer> { }


    void createSessionAndGenerateRequest(
int sessionType, int initDataType, byte[] initData, 
CreateSessionAndGenerateRequest_Response callback);

    interface CreateSessionAndGenerateRequest_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<CdmPromiseResult, String> { }


    void loadSession(
int sessionType, String sessionId, 
LoadSession_Response callback);

    interface LoadSession_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<CdmPromiseResult, String> { }


    void updateSession(
String sessionId, byte[] response, 
UpdateSession_Response callback);

    interface UpdateSession_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<CdmPromiseResult> { }


    void closeSession(
String sessionId, 
CloseSession_Response callback);

    interface CloseSession_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<CdmPromiseResult> { }


    void removeSession(
String sessionId, 
RemoveSession_Response callback);

    interface RemoveSession_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<CdmPromiseResult> { }


}
