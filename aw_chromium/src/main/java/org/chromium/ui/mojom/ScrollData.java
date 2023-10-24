// ScrollData.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/events/mojom/event.mojom
//

package org.chromium.ui.mojom;

public final class ScrollData extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 48;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(48, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public LocationData location;
    public float xOffset;
    public float yOffset;
    public float xOffsetOrdinal;
    public float yOffsetOrdinal;
    public int fingerCount;
    public int momentumPhase;
    public int scrollEventPhase;

    private ScrollData(int version) {
        super(STRUCT_SIZE, version);
    }

    public ScrollData() {
        this(0);
    }

    public static ScrollData deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static ScrollData deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static ScrollData decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        ScrollData result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new ScrollData(elementsOrVersion);
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.location = LocationData.decode(decoder1);
            }
            {

                result.xOffset = decoder0.readFloat(16);
            }
            {

                result.yOffset = decoder0.readFloat(20);
            }
            {

                result.xOffsetOrdinal = decoder0.readFloat(24);
            }
            {

                result.yOffsetOrdinal = decoder0.readFloat(28);
            }
            {

                result.fingerCount = decoder0.readInt(32);
            }
            {

                result.momentumPhase = decoder0.readInt(36);
                EventMomentumPhase.validate(result.momentumPhase);
                result.momentumPhase = EventMomentumPhase.toKnownValue(result.momentumPhase);
            }
            {

                result.scrollEventPhase = decoder0.readInt(40);
                ScrollEventPhase.validate(result.scrollEventPhase);
                result.scrollEventPhase = ScrollEventPhase.toKnownValue(result.scrollEventPhase);
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

        encoder0.encode(this.location, 8, false);

        encoder0.encode(this.xOffset, 16);

        encoder0.encode(this.yOffset, 20);

        encoder0.encode(this.xOffsetOrdinal, 24);

        encoder0.encode(this.yOffsetOrdinal, 28);

        encoder0.encode(this.fingerCount, 32);

        encoder0.encode(this.momentumPhase, 36);

        encoder0.encode(this.scrollEventPhase, 40);
    }
}