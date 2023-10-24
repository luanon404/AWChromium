// PluginRegistry.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/plugins/plugin_registry.mojom
//

package org.chromium.blink.mojom;


public interface PluginRegistry extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends PluginRegistry, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<PluginRegistry, PluginRegistry.Proxy> MANAGER = PluginRegistry_Internal.MANAGER;

    void getPlugins(
boolean refresh, 
GetPlugins_Response callback);

    interface GetPlugins_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<PluginInfo[]> { }


}
