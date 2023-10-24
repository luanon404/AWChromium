// InterfaceFactory.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/interface_factory.mojom
//

package org.chromium.media.mojom;

public interface InterfaceFactory extends org.chromium.mojo.bindings.Interface {


    interface Proxy extends InterfaceFactory, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<InterfaceFactory, InterfaceFactory.Proxy> MANAGER = InterfaceFactory_Internal.MANAGER;

    void createAudioDecoder(org.chromium.mojo.bindings.InterfaceRequest<AudioDecoder> audioDecoder);


    void createVideoDecoder(org.chromium.mojo.bindings.InterfaceRequest<VideoDecoder> videoDecoder, org.chromium.media.stable.mojom.StableVideoDecoder dstVideoDecoder);


    void createAudioEncoder(org.chromium.mojo.bindings.InterfaceRequest<AudioEncoder> audioEncoder);


    void createDefaultRenderer(String audioDeviceId, org.chromium.mojo.bindings.InterfaceRequest<Renderer> renderer);


    void createMediaPlayerRenderer(MediaPlayerRendererClientExtension clientExtension, org.chromium.mojo.bindings.InterfaceRequest<Renderer> renderer, org.chromium.mojo.bindings.InterfaceRequest<MediaPlayerRendererExtension> rendererExtension);


    void createFlingingRenderer(String presentationId, FlingingRendererClientExtension clientExtension, org.chromium.mojo.bindings.InterfaceRequest<Renderer> renderer);


    void createCdm(CdmConfig cdmConfig, CreateCdm_Response callback);

    interface CreateCdm_Response extends org.chromium.mojo.bindings.Callbacks.Callback3<ContentDecryptionModule, CdmContext, String> {
    }


}
