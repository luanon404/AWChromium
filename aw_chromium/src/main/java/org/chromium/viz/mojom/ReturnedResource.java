// ReturnedResource.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/viz/public/mojom/compositing/returned_resource.mojom
//

package org.chromium.viz.mojom;

public final class ReturnedResource extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public ResourceId id;
    public org.chromium.gpu.mojom.SyncToken syncToken;
    public org.chromium.gfx.mojom.GpuFenceHandle releaseFence;
    public int count;
    public boolean lost;

    private ReturnedResource(int version) {
        super(STRUCT_SIZE, version);
    }

    public static ReturnedResource deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static ReturnedResource deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<>()));
    }

    public static ReturnedResource decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        ReturnedResource result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new ReturnedResource(elementsOrVersion);
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.id = ResourceId.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.syncToken = org.chromium.gpu.mojom.SyncToken.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, true);
                result.releaseFence = org.chromium.gfx.mojom.GpuFenceHandle.decode(decoder1);
            }
            {

                result.count = decoder0.readInt(32);
            }
            {

                result.lost = decoder0.readBoolean(36, 0);
            }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @Override
    protected void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);

        encoder0.encode(this.id, 8, false);

        encoder0.encode(this.syncToken, 16, false);

        encoder0.encode(this.releaseFence, 24, true);

        encoder0.encode(this.count, 32);

        encoder0.encode(this.lost, 36, 0);
    }
}