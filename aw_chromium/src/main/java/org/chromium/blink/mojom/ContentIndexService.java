// ContentIndexService.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/content_index/content_index.mojom
//

package org.chromium.blink.mojom;


public interface ContentIndexService extends org.chromium.mojo.bindings.Interface {


    
    int MAX_ICON_RESOLUTION = (int) 65536;




    interface Proxy extends ContentIndexService, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<ContentIndexService, ContentIndexService.Proxy> MANAGER = ContentIndexService_Internal.MANAGER;

    void getIconSizes(
int category, 
GetIconSizes_Response callback);

    interface GetIconSizes_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.gfx.mojom.Size[]> { }


    void checkOfflineCapability(
long serviceWorkerRegistrationId, org.chromium.url.mojom.Url launchUrl, 
CheckOfflineCapability_Response callback);

    interface CheckOfflineCapability_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }


    void add(
long serviceWorkerRegistrationId, ContentDescription description, org.chromium.skia.mojom.BitmapN32[] icon, org.chromium.url.mojom.Url launchUrl, 
Add_Response callback);

    interface Add_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void delete(
long serviceWorkerRegistrationId, String id, 
Delete_Response callback);

    interface Delete_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void getDescriptions(
long serviceWorkerRegistrationId, 
GetDescriptions_Response callback);

    interface GetDescriptions_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, ContentDescription[]> { }


}
