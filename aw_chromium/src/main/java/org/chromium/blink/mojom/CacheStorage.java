// CacheStorage.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/cache_storage/cache_storage.mojom
//

package org.chromium.blink.mojom;


public interface CacheStorage extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends CacheStorage, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<CacheStorage, CacheStorage.Proxy> MANAGER = CacheStorage_Internal.MANAGER;

    void has(
org.chromium.mojo_base.mojom.String16 cacheName, long traceId, 
Has_Response callback);

    interface Has_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void delete(
org.chromium.mojo_base.mojom.String16 cacheName, long traceId, 
Delete_Response callback);

    interface Delete_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void keys(
long traceId, 
Keys_Response callback);

    interface Keys_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.String16[]> { }


    void match(
FetchApiRequest request, MultiCacheQueryOptions matchOptions, boolean inRelatedFetchEvent, boolean inRangeFetchEvent, long traceId, 
Match_Response callback);

    interface Match_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<MatchResult> { }


    void open(
org.chromium.mojo_base.mojom.String16 cacheName, long traceId, 
Open_Response callback);

    interface Open_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<OpenResult> { }


}
