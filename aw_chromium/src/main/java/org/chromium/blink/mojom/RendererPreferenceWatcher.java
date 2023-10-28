// RendererPreferenceWatcher.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/renderer_preference_watcher.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface RendererPreferenceWatcher extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends RendererPreferenceWatcher, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<RendererPreferenceWatcher, RendererPreferenceWatcher.Proxy> MANAGER = RendererPreferenceWatcher_Internal.MANAGER;

    void notifyUpdate(
RendererPreferences newPrefs);


}
