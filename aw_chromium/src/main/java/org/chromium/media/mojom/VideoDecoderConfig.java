// VideoDecoderConfig.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/media_types.mojom
//

package org.chromium.media.mojom;

import androidx.annotation.IntDef;


public final class VideoDecoderConfig extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 88;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(88, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int codec;
    public int profile;
    public int level;
    public boolean hasAlpha;
    public VideoTransformation transformation;
    public org.chromium.gfx.mojom.Size codedSize;
    public org.chromium.gfx.mojom.Rect visibleRect;
    public org.chromium.gfx.mojom.Size naturalSize;
    public byte[] extraData;
    public int encryptionScheme;
    public VideoColorSpace colorSpaceInfo;
    public org.chromium.gfx.mojom.HdrMetadata hdrMetadata;

    private VideoDecoderConfig(int version) {
        super(STRUCT_SIZE, version);
    }

    public VideoDecoderConfig() {
        this(0);
    }

    public static VideoDecoderConfig deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static VideoDecoderConfig deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static VideoDecoderConfig decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        VideoDecoderConfig result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new VideoDecoderConfig(elementsOrVersion);
                {
                    
                result.codec = decoder0.readInt(8);
                    VideoCodec.validate(result.codec);
                    result.codec = VideoCodec.toKnownValue(result.codec);
                }
                {
                    
                result.profile = decoder0.readInt(12);
                    VideoCodecProfile.validate(result.profile);
                    result.profile = VideoCodecProfile.toKnownValue(result.profile);
                }
                {
                    
                result.level = decoder0.readInt(16);
                }
                {
                    
                result.hasAlpha = decoder0.readBoolean(20, 0);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.transformation = VideoTransformation.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.codedSize = org.chromium.gfx.mojom.Size.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.visibleRect = org.chromium.gfx.mojom.Rect.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, false);
                result.naturalSize = org.chromium.gfx.mojom.Size.decode(decoder1);
                }
                {
                    
                result.extraData = decoder0.readBytes(56, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                }
                {
                    
                result.encryptionScheme = decoder0.readInt(64);
                    EncryptionScheme.validate(result.encryptionScheme);
                    result.encryptionScheme = EncryptionScheme.toKnownValue(result.encryptionScheme);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(72, false);
                result.colorSpaceInfo = VideoColorSpace.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(80, true);
                result.hdrMetadata = org.chromium.gfx.mojom.HdrMetadata.decode(decoder1);
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
        
        encoder0.encode(this.codec, 8);
        
        encoder0.encode(this.profile, 12);
        
        encoder0.encode(this.level, 16);
        
        encoder0.encode(this.hasAlpha, 20, 0);
        
        encoder0.encode(this.transformation, 24, false);
        
        encoder0.encode(this.codedSize, 32, false);
        
        encoder0.encode(this.visibleRect, 40, false);
        
        encoder0.encode(this.naturalSize, 48, false);
        
        encoder0.encode(this.extraData, 56, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
        
        encoder0.encode(this.encryptionScheme, 64);
        
        encoder0.encode(this.colorSpaceInfo, 72, false);
        
        encoder0.encode(this.hdrMetadata, 80, true);
    }
}