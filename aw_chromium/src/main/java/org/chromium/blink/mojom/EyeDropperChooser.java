// EyeDropperChooser.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/choosers/color_chooser.mojom
//

package org.chromium.blink.mojom;


public interface EyeDropperChooser extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends EyeDropperChooser, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<EyeDropperChooser, EyeDropperChooser.Proxy> MANAGER = EyeDropperChooser_Internal.MANAGER;

    void choose(

Choose_Response callback);

    interface Choose_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Boolean, Integer> { }


}
