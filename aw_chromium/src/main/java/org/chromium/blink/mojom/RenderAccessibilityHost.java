// RenderAccessibilityHost.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/render_accessibility.mojom
//

package org.chromium.blink.mojom;


public interface RenderAccessibilityHost extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends RenderAccessibilityHost, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<RenderAccessibilityHost, RenderAccessibilityHost.Proxy> MANAGER = RenderAccessibilityHost_Internal.MANAGER;

    void handleAxEvents(
AxUpdatesAndEvents eventsAndUpdates, int resetToken, 
HandleAxEvents_Response callback);

    interface HandleAxEvents_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


    void handleAxLocationChanges(
LocationChanges[] changes, int resetToken);


}
