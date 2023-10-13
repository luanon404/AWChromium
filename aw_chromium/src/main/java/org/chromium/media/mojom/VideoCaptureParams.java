// VideoCaptureParams.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/capture/mojom/video_capture_types.mojom
//

package org.chromium.media.mojom;

import androidx.annotation.IntDef;


public final class VideoCaptureParams extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public VideoCaptureFormat requestedFormat;
    public int bufferType;
    public int resolutionChangePolicy;
    public int powerLineFrequency;
    public boolean enableFaceDetection;

    private VideoCaptureParams(int version) {
        super(STRUCT_SIZE, version);
    }

    public VideoCaptureParams() {
        this(0);
    }

    public static VideoCaptureParams deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static VideoCaptureParams deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static VideoCaptureParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        VideoCaptureParams result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new VideoCaptureParams(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.requestedFormat = VideoCaptureFormat.decode(decoder1);
                }
                {
                    
                result.bufferType = decoder0.readInt(16);
                    VideoCaptureBufferType.validate(result.bufferType);
                    result.bufferType = VideoCaptureBufferType.toKnownValue(result.bufferType);
                }
                {
                    
                result.resolutionChangePolicy = decoder0.readInt(20);
                    ResolutionChangePolicy.validate(result.resolutionChangePolicy);
                    result.resolutionChangePolicy = ResolutionChangePolicy.toKnownValue(result.resolutionChangePolicy);
                }
                {
                    
                result.powerLineFrequency = decoder0.readInt(24);
                    PowerLineFrequency.validate(result.powerLineFrequency);
                    result.powerLineFrequency = PowerLineFrequency.toKnownValue(result.powerLineFrequency);
                }
                {
                    
                result.enableFaceDetection = decoder0.readBoolean(28, 0);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.requestedFormat, 8, false);
        
        encoder0.encode(this.bufferType, 16);
        
        encoder0.encode(this.resolutionChangePolicy, 20);
        
        encoder0.encode(this.powerLineFrequency, 24);
        
        encoder0.encode(this.enableFaceDetection, 28, 0);
    }
}