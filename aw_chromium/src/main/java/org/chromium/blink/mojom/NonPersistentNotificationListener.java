// NonPersistentNotificationListener.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/notifications/notification_service.mojom
//

package org.chromium.blink.mojom;


public interface NonPersistentNotificationListener extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends NonPersistentNotificationListener, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<NonPersistentNotificationListener, NonPersistentNotificationListener.Proxy> MANAGER = NonPersistentNotificationListener_Internal.MANAGER;

    void onShow(
);


    void onClick(

OnClick_Response callback);

    interface OnClick_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


    void onClose(

OnClose_Response callback);

    interface OnClose_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


}
