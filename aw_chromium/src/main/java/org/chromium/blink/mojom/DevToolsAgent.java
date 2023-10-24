// DevToolsAgent.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/devtools/devtools_agent.mojom
//

package org.chromium.blink.mojom;


public interface DevToolsAgent extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends DevToolsAgent, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<DevToolsAgent, DevToolsAgent.Proxy> MANAGER = DevToolsAgent_Internal.MANAGER;

    void attachDevToolsSession(
org.chromium.mojo.bindings.AssociatedInterfaceNotSupported host, org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported session, org.chromium.mojo.bindings.InterfaceRequest<DevToolsSession> ioSession, DevToolsSessionState reattachSessionState, boolean clientExpectsBinaryResponses, boolean clientIsTrusted, String sessionId, boolean sessionWaitsForDebugger);


    void inspectElement(
org.chromium.gfx.mojom.Point point);


    void reportChildTargets(
boolean report, boolean waitForDebugger, 
ReportChildTargets_Response callback);

    interface ReportChildTargets_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


    void getUniqueFormControlId(
int nodeId, 
GetUniqueFormControlId_Response callback);

    interface GetUniqueFormControlId_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Long> { }


}
