// LocalMainFrameHost.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/frame.mojom
//

package org.chromium.blink.mojom;


public interface LocalMainFrameHost extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends LocalMainFrameHost, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<LocalMainFrameHost, LocalMainFrameHost.Proxy> MANAGER = LocalMainFrameHost_Internal.MANAGER;

    void scaleFactorChanged(
float scale);


    void contentsPreferredSizeChanged(
org.chromium.gfx.mojom.Size prefSize);


    void textAutosizerPageInfoChanged(
TextAutosizerPageInfo pageInfo);


    void focusPage(
);


    void takeFocus(
boolean reverse);


    void updateTargetUrl(
org.chromium.url.mojom.Url url, 
UpdateTargetUrl_Response callback);

    interface UpdateTargetUrl_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


    void requestClose(
);


    void showCreatedWindow(
LocalFrameToken openerFrameToken, int disposition, WindowFeatures windowFeatures, boolean openedByUserGesture, 
ShowCreatedWindow_Response callback);

    interface ShowCreatedWindow_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


    void setWindowRect(
org.chromium.gfx.mojom.Rect bounds, 
SetWindowRect_Response callback);

    interface SetWindowRect_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


    void didFirstVisuallyNonEmptyPaint(
);


    void didAccessInitialMainDocument(
);


    void setResizable(
boolean resizable);


}
