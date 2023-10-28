// FileSystemAccessFileHandle.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/file_system_access/file_system_access_file_handle.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface FileSystemAccessFileHandle extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends FileSystemAccessFileHandle, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<FileSystemAccessFileHandle, FileSystemAccessFileHandle.Proxy> MANAGER = FileSystemAccessFileHandle_Internal.MANAGER;

    void getPermissionStatus(
boolean writable, 
GetPermissionStatus_Response callback);

    interface GetPermissionStatus_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void requestPermission(
boolean writable, 
RequestPermission_Response callback);

    interface RequestPermission_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<FileSystemAccessError, Integer> { }


    void asBlob(

AsBlob_Response callback);

    interface AsBlob_Response extends org.chromium.mojo.bindings.Callbacks.Callback3<FileSystemAccessError, org.chromium.mojo_base.mojom.FileInfo, SerializedBlob> { }


    void createFileWriter(
boolean keepExistingData, boolean autoClose, int mode, 
CreateFileWriter_Response callback);

    interface CreateFileWriter_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<FileSystemAccessError, FileSystemAccessFileWriter> { }


    void rename(
String newEntryName, 
Rename_Response callback);

    interface Rename_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<FileSystemAccessError> { }


    void move(
FileSystemAccessTransferToken destinationDirectory, String newEntryName, 
Move_Response callback);

    interface Move_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<FileSystemAccessError> { }


    void remove(

Remove_Response callback);

    interface Remove_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<FileSystemAccessError> { }


    void openAccessHandle(
int mode, 
OpenAccessHandle_Response callback);

    interface OpenAccessHandle_Response extends org.chromium.mojo.bindings.Callbacks.Callback3<FileSystemAccessError, FileSystemAccessAccessHandleFile, FileSystemAccessAccessHandleHost> { }


    void isSameEntry(
FileSystemAccessTransferToken other, 
IsSameEntry_Response callback);

    interface IsSameEntry_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<FileSystemAccessError, Boolean> { }


    void transfer(
org.chromium.mojo.bindings.InterfaceRequest<FileSystemAccessTransferToken> token);


    void getUniqueId(

GetUniqueId_Response callback);

    interface GetUniqueId_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<FileSystemAccessError, String> { }


    void getCloudIdentifiers(

GetCloudIdentifiers_Response callback);

    interface GetCloudIdentifiers_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<FileSystemAccessError, FileSystemAccessCloudIdentifier[]> { }


}
