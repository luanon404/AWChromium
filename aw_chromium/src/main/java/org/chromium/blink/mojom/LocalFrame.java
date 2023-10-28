// LocalFrame.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/frame.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface LocalFrame extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends LocalFrame, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<LocalFrame, LocalFrame.Proxy> MANAGER = LocalFrame_Internal.MANAGER;

    void getTextSurroundingSelection(
int maxLength, 
GetTextSurroundingSelection_Response callback);

    interface GetTextSurroundingSelection_Response extends org.chromium.mojo.bindings.Callbacks.Callback3<org.chromium.mojo_base.mojom.String16, Integer, Integer> { }


    void sendInterventionReport(
String id, String message);


    void setFrameOwnerProperties(
FrameOwnerProperties properties);


    void notifyUserActivation(
int notificationType);


    void notifyVirtualKeyboardOverlayRect(
org.chromium.gfx.mojom.Rect keyboardRect);


    void addMessageToConsole(
int level, String message, boolean discardDuplicates);


    void addInspectorIssue(
InspectorIssueInfo info);


    void swapInImmediately(
);


    void checkCompleted(
);


    void stopLoading(
);


    void collapse(
boolean collapsed);


    void enableViewSourceMode(
);


    void focus(
);


    void clearFocusedElement(
);


    void copyImageAt(
org.chromium.gfx.mojom.Point windowPoint);


    void saveImageAt(
org.chromium.gfx.mojom.Point windowPoint);


    void reportBlinkFeatureUsage(
int[] features);


    void renderFallbackContent(
);


    void beforeUnload(
boolean isReload, 
BeforeUnload_Response callback);

    interface BeforeUnload_Response extends org.chromium.mojo.bindings.Callbacks.Callback3<Boolean, org.chromium.mojo_base.mojom.TimeTicks, org.chromium.mojo_base.mojom.TimeTicks> { }


    void mediaPlayerActionAt(
org.chromium.gfx.mojom.Point location, MediaPlayerAction action);


    void pluginActionAt(
org.chromium.gfx.mojom.Point location, int action);


    void advanceFocusInFrame(
int focusType, RemoteFrameToken sourceFrameToken);


    void advanceFocusForIme(
int focusType);


    void reportContentSecurityPolicyViolation(
org.chromium.network.mojom.CspViolation violation);


    void didUpdateFramePolicy(
FramePolicy framePolicy);


    void postMessageEvent(
RemoteFrameToken sourceFrameToken, org.chromium.mojo_base.mojom.String16 sourceOrigin, org.chromium.mojo_base.mojom.String16 targetOrigin, TransferableMessage message);


    void javaScriptMethodExecuteRequest(
org.chromium.mojo_base.mojom.String16 objectName, org.chromium.mojo_base.mojom.String16 methodName, org.chromium.mojo_base.mojom.ListValue arguments, boolean wantsResult, 
JavaScriptMethodExecuteRequest_Response callback);

    interface JavaScriptMethodExecuteRequest_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.Value> { }


    void javaScriptExecuteRequest(
org.chromium.mojo_base.mojom.BigString16 javascript, boolean wantsResult, 
JavaScriptExecuteRequest_Response callback);

    interface JavaScriptExecuteRequest_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.Value> { }


    void javaScriptExecuteRequestForTests(
org.chromium.mojo_base.mojom.BigString16 javascript, boolean hasUserGesture, boolean resolvePromises, int worldId, 
JavaScriptExecuteRequestForTests_Response callback);

    interface JavaScriptExecuteRequestForTests_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, org.chromium.mojo_base.mojom.Value> { }


    void javaScriptExecuteRequestInIsolatedWorld(
org.chromium.mojo_base.mojom.BigString16 javascript, boolean wantsResult, int worldId, 
JavaScriptExecuteRequestInIsolatedWorld_Response callback);

    interface JavaScriptExecuteRequestInIsolatedWorld_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.Value> { }


    void bindReportingObserver(
org.chromium.mojo.bindings.InterfaceRequest<ReportingObserver> receiver);


    void updateOpener(
FrameToken openerFrameToken);


    void getSavableResourceLinks(

GetSavableResourceLinks_Response callback);

    interface GetSavableResourceLinks_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<GetSavableResourceLinksReply> { }


    void mixedContentFound(
org.chromium.url.mojom.Url mainResourceUrl, org.chromium.url.mojom.Url mixedContentUrl, int requestContext, boolean wasAllowed, org.chromium.url.mojom.Url urlBeforeRedirects, boolean hadRedirect, org.chromium.network.mojom.SourceLocation sourceLocation);


    void bindDevToolsAgent(
org.chromium.mojo.bindings.AssociatedInterfaceNotSupported agentHost, org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported agent);


    void extractSmartClipData(
org.chromium.gfx.mojom.Rect rect, 
ExtractSmartClipData_Response callback);

    interface ExtractSmartClipData_Response extends org.chromium.mojo.bindings.Callbacks.Callback3<org.chromium.mojo_base.mojom.String16, org.chromium.mojo_base.mojom.String16, org.chromium.gfx.mojom.Rect> { }


    void handleRendererDebugUrl(
org.chromium.url.mojom.Url url);


    void getCanonicalUrlForSharing(

GetCanonicalUrlForSharing_Response callback);

    interface GetCanonicalUrlForSharing_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.url.mojom.Url> { }


    void getOpenGraphMetadata(

GetOpenGraphMetadata_Response callback);

    interface GetOpenGraphMetadata_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<OpenGraphMetadata> { }


    void setNavigationApiHistoryEntriesForRestore(
NavigationApiHistoryEntryArrays entryArrays);


    void notifyNavigationApiOfDisposedEntries(
String[] keys);


    void traverseCancelled(
String navigationApiKey, int reason);


    void snapshotDocumentForViewTransition(

SnapshotDocumentForViewTransition_Response callback);

    interface SnapshotDocumentForViewTransition_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<ViewTransitionState> { }


    void addResourceTimingEntryForFailedSubframeNavigation(
FrameToken subframeToken, org.chromium.url.mojom.Url initialUrl, org.chromium.mojo_base.mojom.TimeTicks startTime, org.chromium.mojo_base.mojom.TimeTicks redirectTime, org.chromium.mojo_base.mojom.TimeTicks requestStart, org.chromium.mojo_base.mojom.TimeTicks responseStart, int responseCode, String mimeType, org.chromium.network.mojom.LoadTimingInfo loadTimingInfo, int connectionInfo, String alpnNegotiatedProtocol, boolean isSecureTransport, boolean isValidated, String normalizedServerTiming, org.chromium.network.mojom.UrlLoaderCompletionStatus completionStatus);


    void requestFullscreenDocumentElement(
);


}
