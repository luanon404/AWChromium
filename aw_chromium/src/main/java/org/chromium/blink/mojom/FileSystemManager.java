// FileSystemManager.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/filesystem/file_system.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface FileSystemManager extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends FileSystemManager, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<FileSystemManager, FileSystemManager.Proxy> MANAGER = FileSystemManager_Internal.MANAGER;

    void open(
org.chromium.url.internal.mojom.Origin origin, int fileSystemType, 
Open_Response callback);

    interface Open_Response extends org.chromium.mojo.bindings.Callbacks.Callback3<String, org.chromium.url.mojom.Url, Integer> { }


    void resolveUrl(
org.chromium.url.mojom.Url filesystemUrl, 
ResolveUrl_Response callback);

    interface ResolveUrl_Response extends org.chromium.mojo.bindings.Callbacks.Callback4<FileSystemInfo, org.chromium.mojo_base.mojom.FilePath, Boolean, Integer> { }


    void move(
org.chromium.url.mojom.Url srcPath, org.chromium.url.mojom.Url destPath, 
Move_Response callback);

    interface Move_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void copy(
org.chromium.url.mojom.Url srcPath, org.chromium.url.mojom.Url destPath, 
Copy_Response callback);

    interface Copy_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void remove(
org.chromium.url.mojom.Url path, boolean recursive, 
Remove_Response callback);

    interface Remove_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void readMetadata(
org.chromium.url.mojom.Url path, 
ReadMetadata_Response callback);

    interface ReadMetadata_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<org.chromium.mojo_base.mojom.FileInfo, Integer> { }


    void create(
org.chromium.url.mojom.Url path, boolean exclusive, boolean isDirectory, boolean recursive, 
Create_Response callback);

    interface Create_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void exists(
org.chromium.url.mojom.Url path, boolean isDirectory, 
Exists_Response callback);

    interface Exists_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void readDirectory(
org.chromium.url.mojom.Url path, FileSystemOperationListener listener);


    void readDirectorySync(
org.chromium.url.mojom.Url path, 
ReadDirectorySync_Response callback);

    interface ReadDirectorySync_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<org.chromium.filesystem.mojom.DirectoryEntry[], Integer> { }


    void write(
org.chromium.url.mojom.Url filePath, Blob blob, long position, org.chromium.mojo.bindings.InterfaceRequest<FileSystemCancellableOperation> opReceiver, FileSystemOperationListener listener);


    void writeSync(
org.chromium.url.mojom.Url filePath, Blob blob, long position, 
WriteSync_Response callback);

    interface WriteSync_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Long, Integer> { }


    void truncate(
org.chromium.url.mojom.Url filePath, long length, org.chromium.mojo.bindings.InterfaceRequest<FileSystemCancellableOperation> opReceiver, 
Truncate_Response callback);

    interface Truncate_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void truncateSync(
org.chromium.url.mojom.Url filePath, long length, 
TruncateSync_Response callback);

    interface TruncateSync_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void createSnapshotFile(
org.chromium.url.mojom.Url filePath, 
CreateSnapshotFile_Response callback);

    interface CreateSnapshotFile_Response extends org.chromium.mojo.bindings.Callbacks.Callback4<org.chromium.mojo_base.mojom.FileInfo, org.chromium.mojo_base.mojom.FilePath, Integer, ReceivedSnapshotListener> { }


    void getPlatformPath(
org.chromium.url.mojom.Url filePath, 
GetPlatformPath_Response callback);

    interface GetPlatformPath_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.FilePath> { }


    void registerBlob(
String contentType, org.chromium.url.mojom.Url url, long length, org.chromium.mojo_base.mojom.Time expectedModificationTime, 
RegisterBlob_Response callback);

    interface RegisterBlob_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<SerializedBlob> { }


}
