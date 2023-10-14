// Blob.java is auto generated by mojom_bindings_generator.py, do not edit
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.
// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/blob/blob.mojom
//
package org.chromium.blink.mojom

import org.chromium.mojo.bindings.Callbacks
import org.chromium.mojo.bindings.Callbacks.Callback1
import org.chromium.mojo.bindings.Interface
import org.chromium.mojo.bindings.InterfaceRequest
import org.chromium.mojo.system.DataPipe.ProducerHandle
import org.chromium.mojo_base.mojom.BigBuffer
import org.chromium.mojo_base.mojom.Time
import org.chromium.network.mojom.DataPipeGetter
import org.chromium.network.mojom.HttpRequestHeaders
import org.chromium.network.mojom.UrlLoader
import org.chromium.network.mojom.UrlLoaderClient

interface Blob : Interface {
    interface Proxy : Blob, Interface.Proxy

    fun clone(
        blob: InterfaceRequest<Blob>?
    )

    fun asDataPipeGetter(
        dataPipeGetter: InterfaceRequest<DataPipeGetter>?
    )

    fun readAll(
        pipe: ProducerHandle, client: BlobReaderClient?
    )

    fun readRange(
        offset: Long, length: Long, pipe: ProducerHandle, client: BlobReaderClient?
    )

    fun load(
        loader: InterfaceRequest<UrlLoader>?,
        requestMethod: String?,
        headers: HttpRequestHeaders?,
        client: UrlLoaderClient?
    )

    fun readSideData(
        callback: ReadSideDataResponse
    )

    interface ReadSideDataResponse : Callback1<BigBuffer?>

    fun captureSnapshot(
        callback: CaptureSnapshotResponse
    )

    interface CaptureSnapshotResponse : Callbacks.Callback2<Long?, Time?>

    fun getInternalUuid(
        callback: GetInternalUuidResponse
    )

    interface GetInternalUuidResponse : Callback1<String?>
    companion object {
        val MANAGER = Blob_Internal.MANAGER
    }
}