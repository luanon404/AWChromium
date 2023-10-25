// MultiplanarFormat.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/viz/public/mojom/compositing/shared_image_format.mojom
//

package org.chromium.viz.mojom;

public final class MultiplanarFormat extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 24;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(24, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int planeConfig;
    public int subsampling;
    public int channelFormat;

    private MultiplanarFormat(int version) {
        super(STRUCT_SIZE, version);
    }

    public static MultiplanarFormat deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static MultiplanarFormat deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<>()));
    }

    public static MultiplanarFormat decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        MultiplanarFormat result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new MultiplanarFormat(elementsOrVersion);
            {

                result.planeConfig = decoder0.readInt(8);
                PlaneConfig.validate(result.planeConfig);
            }
            {

                result.subsampling = decoder0.readInt(12);
                Subsampling.validate(result.subsampling);
            }
            {

                result.channelFormat = decoder0.readInt(16);
                ChannelFormat.validate(result.channelFormat);
            }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @Override
    protected void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);

        encoder0.encode(this.planeConfig, 8);

        encoder0.encode(this.subsampling, 12);

        encoder0.encode(this.channelFormat, 16);
    }
}