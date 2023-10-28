// WorkerContentSettingsProxy.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/worker/worker_content_settings_proxy.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface WorkerContentSettingsProxy extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends WorkerContentSettingsProxy, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<WorkerContentSettingsProxy, WorkerContentSettingsProxy.Proxy> MANAGER = WorkerContentSettingsProxy_Internal.MANAGER;

    void allowIndexedDb(

AllowIndexedDb_Response callback);

    interface AllowIndexedDb_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }


    void allowCacheStorage(

AllowCacheStorage_Response callback);

    interface AllowCacheStorage_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }


    void allowWebLocks(

AllowWebLocks_Response callback);

    interface AllowWebLocks_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }


    void requestFileSystemAccessSync(

RequestFileSystemAccessSync_Response callback);

    interface RequestFileSystemAccessSync_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }


}
