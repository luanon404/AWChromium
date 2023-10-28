// VideoEncoderMetricsProvider.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/video_encoder_metrics_provider.mojom
//

package org.chromium.media.mojom;

import androidx.annotation.IntDef;


public interface VideoEncoderMetricsProvider extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends VideoEncoderMetricsProvider, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<VideoEncoderMetricsProvider, VideoEncoderMetricsProvider.Proxy> MANAGER = VideoEncoderMetricsProvider_Internal.MANAGER;

    void initialize(
long encoderId, int encoderUseCase, int profile, org.chromium.gfx.mojom.Size encodeSize, boolean isHardwareEncoder, int svcMode);


    void setEncodedFrameCount(
long encoderId, long numEncodedFrames);


    void setError(
long encoderId, EncoderStatus status);


    void complete(
long encoderId);


}
