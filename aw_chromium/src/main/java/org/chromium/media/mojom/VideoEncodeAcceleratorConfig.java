// VideoEncodeAcceleratorConfig.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/video_encode_accelerator.mojom
//

package org.chromium.media.mojom;

import androidx.annotation.IntDef;


public final class VideoEncodeAcceleratorConfig extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 80;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(80, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

    public static final class ContentType {
        private static final boolean IS_EXTENSIBLE = false;
        @IntDef({

            ContentType.CAMERA,
            ContentType.DISPLAY})
        public @interface EnumType {}

        public static final int CAMERA = 0;
        public static final int DISPLAY = 1;
        public static final int MIN_VALUE = 0;
        public static final int MAX_VALUE = 1;

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 1;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        public static int toKnownValue(int value) {
          return value;
        }

        private ContentType() {}
    }

    public static final class StorageType {
        private static final boolean IS_EXTENSIBLE = false;
        @IntDef({

            StorageType.SHMEM,
            StorageType.GPU_MEMORY_BUFFER})
        public @interface EnumType {}

        public static final int SHMEM = 0;
        public static final int GPU_MEMORY_BUFFER = 1;
        public static final int MIN_VALUE = 0;
        public static final int MAX_VALUE = 1;

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 1;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        public static int toKnownValue(int value) {
          return value;
        }

        private StorageType() {}
    }

    public static final class EncoderType {
        private static final boolean IS_EXTENSIBLE = false;
        @IntDef({

            EncoderType.HARDWARE,
            EncoderType.SOFTWARE,
            EncoderType.NO_PREFERENCE})
        public @interface EnumType {}

        public static final int HARDWARE = 0;
        public static final int SOFTWARE = 1;
        public static final int NO_PREFERENCE = 2;
        public static final int MIN_VALUE = 0;
        public static final int MAX_VALUE = 2;

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 2;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        public static int toKnownValue(int value) {
          return value;
        }

        private EncoderType() {}
    }
    public int inputFormat;
    public org.chromium.gfx.mojom.Size inputVisibleSize;
    public int outputProfile;
    public Bitrate bitrate;
    public int initialFramerate;
    public boolean hasInitialFramerate;
    public int gopLength;
    public boolean hasGopLength;
    public byte h264OutputLevel;
    public boolean hasH264OutputLevel;
    public boolean isConstrainedH264;
    public int storageType;
    public boolean hasStorageType;
    public int contentType;
    public SpatialLayer[] spatialLayers;
    public int interLayerPred;
    public boolean requireLowDelay;
    public int requiredEncoderType;

    private VideoEncodeAcceleratorConfig(int version) {
        super(STRUCT_SIZE, version);
    }

    public VideoEncodeAcceleratorConfig() {
        this(0);
    }

    public static VideoEncodeAcceleratorConfig deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static VideoEncodeAcceleratorConfig deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static VideoEncodeAcceleratorConfig decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        VideoEncodeAcceleratorConfig result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new VideoEncodeAcceleratorConfig(elementsOrVersion);
                {
                    
                result.inputFormat = decoder0.readInt(8);
                    VideoPixelFormat.validate(result.inputFormat);
                    result.inputFormat = VideoPixelFormat.toKnownValue(result.inputFormat);
                }
                {
                    
                result.outputProfile = decoder0.readInt(12);
                    VideoCodecProfile.validate(result.outputProfile);
                    result.outputProfile = VideoCodecProfile.toKnownValue(result.outputProfile);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.inputVisibleSize = org.chromium.gfx.mojom.Size.decode(decoder1);
                }
                {
                    
                result.bitrate = Bitrate.decode(decoder0, 24);
                }
                {
                    
                result.initialFramerate = decoder0.readInt(40);
                }
                {
                    
                result.hasInitialFramerate = decoder0.readBoolean(44, 0);
                }
                {
                    
                result.hasGopLength = decoder0.readBoolean(44, 1);
                }
                {
                    
                result.hasH264OutputLevel = decoder0.readBoolean(44, 2);
                }
                {
                    
                result.isConstrainedH264 = decoder0.readBoolean(44, 3);
                }
                {
                    
                result.hasStorageType = decoder0.readBoolean(44, 4);
                }
                {
                    
                result.requireLowDelay = decoder0.readBoolean(44, 5);
                }
                {
                    
                result.h264OutputLevel = decoder0.readByte(45);
                }
                {
                    
                result.gopLength = decoder0.readInt(48);
                }
                {
                    
                result.storageType = decoder0.readInt(52);
                    VideoEncodeAcceleratorConfig.StorageType.validate(result.storageType);
                    result.storageType = VideoEncodeAcceleratorConfig.StorageType.toKnownValue(result.storageType);
                }
                {
                    
                result.contentType = decoder0.readInt(56);
                    VideoEncodeAcceleratorConfig.ContentType.validate(result.contentType);
                    result.contentType = VideoEncodeAcceleratorConfig.ContentType.toKnownValue(result.contentType);
                }
                {
                    
                result.interLayerPred = decoder0.readInt(60);
                    SvcInterLayerPredMode.validate(result.interLayerPred);
                    result.interLayerPred = SvcInterLayerPredMode.toKnownValue(result.interLayerPred);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(64, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.spatialLayers = new SpatialLayer[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.spatialLayers[i1] = SpatialLayer.decode(decoder2);
                    }
                }
                }
                {
                    
                result.requiredEncoderType = decoder0.readInt(72);
                    VideoEncodeAcceleratorConfig.EncoderType.validate(result.requiredEncoderType);
                    result.requiredEncoderType = VideoEncodeAcceleratorConfig.EncoderType.toKnownValue(result.requiredEncoderType);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.inputFormat, 8);
        
        encoder0.encode(this.outputProfile, 12);
        
        encoder0.encode(this.inputVisibleSize, 16, false);
        
        encoder0.encode(this.bitrate, 24, false);
        
        encoder0.encode(this.initialFramerate, 40);
        
        encoder0.encode(this.hasInitialFramerate, 44, 0);
        
        encoder0.encode(this.hasGopLength, 44, 1);
        
        encoder0.encode(this.hasH264OutputLevel, 44, 2);
        
        encoder0.encode(this.isConstrainedH264, 44, 3);
        
        encoder0.encode(this.hasStorageType, 44, 4);
        
        encoder0.encode(this.requireLowDelay, 44, 5);
        
        encoder0.encode(this.h264OutputLevel, 45);
        
        encoder0.encode(this.gopLength, 48);
        
        encoder0.encode(this.storageType, 52);
        
        encoder0.encode(this.contentType, 56);
        
        encoder0.encode(this.interLayerPred, 60);
        
        if (this.spatialLayers == null) {
            encoder0.encodeNullPointer(64, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.spatialLayers.length, 64, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.spatialLayers.length; ++i0) {
                
                encoder1.encode(this.spatialLayers[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.requiredEncoderType, 72);
    }
}