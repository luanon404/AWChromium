// StableVideoDecoder.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/stable/stable_video_decoder.mojom
//

package org.chromium.media.stable.mojom;

public interface StableVideoDecoder extends org.chromium.mojo.bindings.Interface {


    interface Proxy extends StableVideoDecoder, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<StableVideoDecoder, StableVideoDecoder.Proxy> MANAGER = StableVideoDecoder_Internal.MANAGER;

    void getSupportedConfigs(

            GetSupportedConfigs_Response callback);

    interface GetSupportedConfigs_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<SupportedVideoDecoderConfig[], Integer> {
    }


    void construct(org.chromium.mojo.bindings.AssociatedInterfaceNotSupported client, MediaLog mediaLog, org.chromium.mojo.bindings.InterfaceRequest<VideoFrameHandleReleaser> videoFrameHandleReleaser, org.chromium.mojo.system.DataPipe.ConsumerHandle decoderBufferPipe, ColorSpace targetColorSpace);


    void initialize(VideoDecoderConfig config, boolean lowDelay, StableCdmContext cdmContext, Initialize_Response callback);

    interface Initialize_Response extends org.chromium.mojo.bindings.Callbacks.Callback5<Status, Boolean, Integer, Integer, Boolean> {
    }


    void decode(DecoderBuffer buffer, Decode_Response callback);

    interface Decode_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Status> {
    }


    void reset(

            Reset_Response callback);

    interface Reset_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 {
    }


}
