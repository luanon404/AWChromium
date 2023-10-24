// VideoFrame.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/media_types.mojom
//

package org.chromium.media.mojom;

public final class VideoFrame extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 88;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(88, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int format;
    public org.chromium.gfx.mojom.Size codedSize;
    public org.chromium.gfx.mojom.Rect visibleRect;
    public org.chromium.gfx.mojom.Size naturalSize;
    public org.chromium.mojo_base.mojom.TimeDelta timestamp;
    public VideoFrameData data;
    public VideoFrameMetadata metadata;
    public org.chromium.gfx.mojom.ColorSpace colorSpace;
    public org.chromium.gfx.mojom.HdrMetadata hdrMetadata;
    public int sharedImageFormatType;

    private VideoFrame(int version) {
        super(STRUCT_SIZE, version);
    }

    public VideoFrame() {
        this(0);
    }

    public static VideoFrame deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static VideoFrame deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static VideoFrame decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        VideoFrame result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new VideoFrame(elementsOrVersion);
            {

                result.format = decoder0.readInt(8);
                VideoPixelFormat.validate(result.format);
                result.format = VideoPixelFormat.toKnownValue(result.format);
            }
            {

                result.sharedImageFormatType = decoder0.readInt(12);
                SharedImageFormatType.validate(result.sharedImageFormatType);
                result.sharedImageFormatType = SharedImageFormatType.toKnownValue(result.sharedImageFormatType);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.codedSize = org.chromium.gfx.mojom.Size.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.visibleRect = org.chromium.gfx.mojom.Rect.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.naturalSize = org.chromium.gfx.mojom.Size.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.timestamp = org.chromium.mojo_base.mojom.TimeDelta.decode(decoder1);
            }
            {

                result.data = VideoFrameData.decode(decoder0, 48);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(64, false);
                result.metadata = VideoFrameMetadata.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(72, false);
                result.colorSpace = org.chromium.gfx.mojom.ColorSpace.decode(decoder1);
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

        encoder0.encode(this.format, 8);

        encoder0.encode(this.sharedImageFormatType, 12);

        encoder0.encode(this.codedSize, 16, false);

        encoder0.encode(this.visibleRect, 24, false);

        encoder0.encode(this.naturalSize, 32, false);

        encoder0.encode(this.timestamp, 40, false);

        encoder0.encode(this.data, 48, false);

        encoder0.encode(this.metadata, 64, false);

        encoder0.encode(this.colorSpace, 72, false);

        encoder0.encode(this.hdrMetadata, 80, true);
    }
}