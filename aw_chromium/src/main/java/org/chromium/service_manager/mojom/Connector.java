// Connector.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/service_manager/public/mojom/connector.mojom
//

package org.chromium.service_manager.mojom;

import androidx.annotation.IntDef;


public interface Connector extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends Connector, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<Connector, Connector.Proxy> MANAGER = Connector_Internal.MANAGER;


    void bindInterface(
ServiceFilter filter, String interfaceName, org.chromium.mojo.system.MessagePipeHandle interfacePipe, int priority, 
BindInterfaceResponse callback);

    interface BindInterfaceResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, Identity> { }



    void queryService(
String serviceName, 
QueryServiceResponse callback);

    interface QueryServiceResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<ServiceInfo> { }



    void warmService(
ServiceFilter filter, 
WarmServiceResponse callback);

    interface WarmServiceResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, Identity> { }



    void registerServiceInstance(
Identity identity, org.chromium.mojo.system.MessagePipeHandle service, org.chromium.mojo.bindings.InterfaceRequest<ProcessMetadata> metadataReceiver, 
RegisterServiceInstanceResponse callback);

    interface RegisterServiceInstanceResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void clone(
org.chromium.mojo.bindings.InterfaceRequest<Connector> receiver);


}
