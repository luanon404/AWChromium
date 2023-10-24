// GeolocationService.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/geolocation/geolocation_service.mojom
//

package org.chromium.blink.mojom;


public interface GeolocationService extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends GeolocationService, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<GeolocationService, GeolocationService.Proxy> MANAGER = GeolocationService_Internal.MANAGER;

    void createGeolocation(
org.chromium.mojo.bindings.InterfaceRequest<org.chromium.device.mojom.Geolocation> receiver, boolean userGesture, 
CreateGeolocation_Response callback);

    interface CreateGeolocation_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


}
