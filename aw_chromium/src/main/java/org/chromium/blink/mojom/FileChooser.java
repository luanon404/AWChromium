// FileChooser.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/choosers/file_chooser.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface FileChooser extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends FileChooser, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<FileChooser, FileChooser.Proxy> MANAGER = FileChooser_Internal.MANAGER;

    void openFileChooser(
FileChooserParams params, 
OpenFileChooser_Response callback);

    interface OpenFileChooser_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<FileChooserResult> { }


    void enumerateChosenDirectory(
org.chromium.mojo_base.mojom.FilePath directoryPath, 
EnumerateChosenDirectory_Response callback);

    interface EnumerateChosenDirectory_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<FileChooserResult> { }


}
