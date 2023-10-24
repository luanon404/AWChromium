// LocalMainFrame.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/frame.mojom
//

package org.chromium.blink.mojom;


public interface LocalMainFrame extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends LocalMainFrame, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<LocalMainFrame, LocalMainFrame.Proxy> MANAGER = LocalMainFrame_Internal.MANAGER;

    void animateDoubleTapZoom(
org.chromium.gfx.mojom.Point point, org.chromium.gfx.mojom.Rect rect);


    void setScaleFactor(
float scale);


    void closePage(

ClosePage_Response callback);

    interface ClosePage_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


    void getFullPageSize(

GetFullPageSize_Response callback);

    interface GetFullPageSize_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.gfx.mojom.Size> { }


    void setInitialFocus(
boolean reverse);


    void enablePreferredSizeChangedMode(
);


    void zoomToFindInPageRect(
org.chromium.gfx.mojom.Rect rectInRootFrame);


    void installCoopAccessMonitor(
FrameToken accessedWindow, org.chromium.network.mojom.CrossOriginOpenerPolicyReporterParams coopReporterInfo, boolean isInSameVirtualCoopRelatedGroup);


    void onPortalActivated(
PortalToken portalToken, org.chromium.mojo.bindings.AssociatedInterfaceNotSupported portal, org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported portalClient, TransferableMessage data, long traceId, 
OnPortalActivated_Response callback);

    interface OnPortalActivated_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void forwardMessageFromHost(
TransferableMessage message, org.chromium.url.internal.mojom.Origin sourceOrigin);


    void updateBrowserControlsState(
int constraints, int current, boolean animate);


    void setV8CompileHints(
org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion data);


}
