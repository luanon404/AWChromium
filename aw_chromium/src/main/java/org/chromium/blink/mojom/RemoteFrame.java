// RemoteFrame.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/remote_frame.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface RemoteFrame extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends RemoteFrame, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<RemoteFrame, RemoteFrame.Proxy> MANAGER = RemoteFrame_Internal.MANAGER;

    void willEnterFullscreen(
FullscreenOptions options);


    void enforceInsecureNavigationsSet(
int[] set);


    void setFrameOwnerProperties(
FrameOwnerProperties properties);


    void enforceInsecureRequestPolicy(
int policy);


    void setReplicatedOrigin(
org.chromium.url.internal.mojom.Origin origin, boolean isPotentiallyTrustworthyUniqueOrigin);


    void setReplicatedIsAdFrame(
boolean isAdFrame);


    void setReplicatedName(
String name, String uniqueName);


    void dispatchLoadEventForFrameOwner(
);


    void setNeedsOcclusionTracking(
boolean needsTracking);


    void collapse(
boolean collapsed);


    void focus(
);


    void setHadStickyUserActivationBeforeNavigation(
boolean hasGesture);


    void bubbleLogicalScroll(
int direction, int granularity);


    void updateUserActivationState(
int stateUpdateType, int notificationType);


    void setEmbeddingToken(
org.chromium.mojo_base.mojom.UnguessableToken embeddingToken);


    void setPageFocus(
boolean isFocused);


    void renderFallbackContent(
);


    void addResourceTimingFromChild(
ResourceTimingInfo timing);


    void scrollRectToVisible(
org.chromium.gfx.mojom.RectF rect, ScrollIntoViewParams params);


    void didStartLoading(
);


    void didStopLoading(
);


    void intrinsicSizingInfoOfChildChanged(
IntrinsicSizingInfo sizingInfo);


    void didSetFramePolicyHeaders(
int sandboxFlags, ParsedPermissionsPolicyDeclaration[] parsedPermissionsPolicy);


    void didUpdateFramePolicy(
FramePolicy framePolicy);


    void updateOpener(
FrameToken openerFrameToken);


    void detachAndDispose(
);


    void enableAutoResize(
org.chromium.gfx.mojom.Size minSize, org.chromium.gfx.mojom.Size maxSize);


    void disableAutoResize(
);


    void didUpdateVisualProperties(
org.chromium.cc.mojom.RenderFrameMetadata metadata);


    void setFrameSinkId(
org.chromium.viz.mojom.FrameSinkId frameSinkId);


    void childProcessGone(
);


    void createRemoteChild(
RemoteFrameToken token, FrameToken openerFrameToken, int treeScopeType, FrameReplicationState replicationState, FrameOwnerProperties ownerProperties, boolean isLoading, org.chromium.mojo_base.mojom.UnguessableToken devtoolsFrameToken, RemoteFrameInterfacesFromBrowser remoteFrameInterfaces);


    void createRemoteChildren(
CreateRemoteChildParams[] params);


}
