// SimpleCache.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_service_test.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;


public interface SimpleCache extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends SimpleCache, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<SimpleCache, SimpleCache.Proxy> MANAGER = SimpleCache_Internal.MANAGER;

    void createEntry(
String key, 
CreateEntry_Response callback);

    interface CreateEntry_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<SimpleCacheEntry, Integer> { }


    void openEntry(
String key, 
OpenEntry_Response callback);

    interface OpenEntry_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<SimpleCacheEntry, Integer> { }


    void doomEntry(
String key, 
DoomEntry_Response callback);

    interface DoomEntry_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void doomAllEntries(

DoomAllEntries_Response callback);

    interface DoomAllEntries_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }


    void enumerateEntries(
org.chromium.mojo.bindings.InterfaceRequest<SimpleCacheEntryEnumerator> receiver);


    void detach(

Detach_Response callback);

    interface Detach_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


}
