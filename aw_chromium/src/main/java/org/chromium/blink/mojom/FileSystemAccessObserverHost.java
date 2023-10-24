// FileSystemAccessObserverHost.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/file_system_access/file_system_access_observer_host.mojom
//

package org.chromium.blink.mojom;


public interface FileSystemAccessObserverHost extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends FileSystemAccessObserverHost, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<FileSystemAccessObserverHost, FileSystemAccessObserverHost.Proxy> MANAGER = FileSystemAccessObserverHost_Internal.MANAGER;

    void observe(
FileSystemAccessTransferToken token, boolean isRecursive, 
Observe_Response callback);

    interface Observe_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<FileSystemAccessError, org.chromium.mojo.bindings.InterfaceRequest<FileSystemAccessObserver>> { }


    void unobserve(
FileSystemAccessTransferToken token);


}
