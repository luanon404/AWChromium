// DelegatedInkMetadata.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/gfx/mojom/delegated_ink_metadata.mojom
//

package org.chromium.gfx.mojom;

public final class DelegatedInkMetadata extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 64;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(64, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public PointF point;
    public double diameter;
    public org.chromium.skia.mojom.SkColor color;
    public org.chromium.mojo_base.mojom.TimeTicks timestamp;
    public RectF presentationArea;
    public org.chromium.mojo_base.mojom.TimeTicks frameTime;
    public boolean isHovering;

    private DelegatedInkMetadata(int version) {
        super(STRUCT_SIZE, version);
    }

    public DelegatedInkMetadata() {
        this(0);
    }

    public static DelegatedInkMetadata deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static DelegatedInkMetadata deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static DelegatedInkMetadata decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        DelegatedInkMetadata result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new DelegatedInkMetadata(elementsOrVersion);
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.point = PointF.decode(decoder1);
            }
            {

                result.diameter = decoder0.readDouble(16);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.color = org.chromium.skia.mojom.SkColor.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.timestamp = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.presentationArea = RectF.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, false);
                result.frameTime = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
            }
            {

                result.isHovering = decoder0.readBoolean(56, 0);
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

        encoder0.encode(this.point, 8, false);

        encoder0.encode(this.diameter, 16);

        encoder0.encode(this.color, 24, false);

        encoder0.encode(this.timestamp, 32, false);

        encoder0.encode(this.presentationArea, 40, false);

        encoder0.encode(this.frameTime, 48, false);

        encoder0.encode(this.isHovering, 56, 0);
    }
}