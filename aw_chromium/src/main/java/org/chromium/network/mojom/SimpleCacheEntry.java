// SimpleCacheEntry.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_service_test.mojom
//

package org.chromium.network.mojom;

public interface SimpleCacheEntry extends org.chromium.mojo.bindings.Interface {


    interface Proxy extends SimpleCacheEntry, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<SimpleCacheEntry, SimpleCacheEntry.Proxy> MANAGER = SimpleCacheEntry_Internal.MANAGER;

    void writeData(int index, int offset, byte[] data, boolean truncate, WriteData_Response callback);

    interface WriteData_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> {
    }


    void readData(int index, int offset, int length, ReadData_Response callback);

    interface ReadData_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<byte[], Integer> {
    }


    void writeSparseData(int offset, byte[] data, WriteSparseData_Response callback);

    interface WriteSparseData_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> {
    }


    void readSparseData(int offset, int length, ReadSparseData_Response callback);

    interface ReadSparseData_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<byte[], Integer> {
    }


    void close(

            Close_Response callback);

    interface Close_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 {
    }


}
