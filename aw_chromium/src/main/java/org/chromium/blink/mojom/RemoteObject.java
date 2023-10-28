// RemoteObject.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/remote_objects/remote_objects.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface RemoteObject extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends RemoteObject, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<RemoteObject, RemoteObject.Proxy> MANAGER = RemoteObject_Internal.MANAGER;

    void hasMethod(
String name, 
HasMethod_Response callback);

    interface HasMethod_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }


    void getMethods(

GetMethods_Response callback);

    interface GetMethods_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<String[]> { }


    void invokeMethod(
String name, RemoteInvocationArgument[] arguments, 
InvokeMethod_Response callback);

    interface InvokeMethod_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<RemoteInvocationResult> { }


    void notifyReleasedObject(
);


}
