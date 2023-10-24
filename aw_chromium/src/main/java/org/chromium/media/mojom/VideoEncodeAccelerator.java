// VideoEncodeAccelerator.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/video_encode_accelerator.mojom
//

package org.chromium.media.mojom;

public interface VideoEncodeAccelerator extends org.chromium.mojo.bindings.Interface {


    interface Proxy extends VideoEncodeAccelerator, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<VideoEncodeAccelerator, VideoEncodeAccelerator.Proxy> MANAGER = VideoEncodeAccelerator_Internal.MANAGER;

    void initialize(VideoEncodeAcceleratorConfig config, org.chromium.mojo.bindings.AssociatedInterfaceNotSupported client, MediaLog mediaLog, Initialize_Response callback);

    interface Initialize_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> {
    }


    void encode(VideoFrame frame, VideoEncodeOptions options, Encode_Response callback);

    interface Encode_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 {
    }


    void useOutputBitstreamBuffer(int bitstreamBufferId, org.chromium.mojo_base.mojom.UnsafeSharedMemoryRegion region);


    void requestEncodingParametersChangeWithLayers(VideoBitrateAllocation bitrateAllocation, int framerate);


    void requestEncodingParametersChangeWithBitrate(Bitrate bitrate, int framerate);


    void isFlushSupported(

            IsFlushSupported_Response callback);

    interface IsFlushSupported_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> {
    }


    void flush(

            Flush_Response callback);

    interface Flush_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> {
    }


}
