// SmartCardReaderStateIn.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/smart_card.mojom
//

package org.chromium.device.mojom;

public final class SmartCardReaderStateIn extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String reader;
    public SmartCardReaderStateFlags currentState;
    public short currentCount;

    private SmartCardReaderStateIn(int version) {
        super(STRUCT_SIZE, version);
    }

    public SmartCardReaderStateIn() {
        this(0);
    }

    public static SmartCardReaderStateIn deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static SmartCardReaderStateIn deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static SmartCardReaderStateIn decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        SmartCardReaderStateIn result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new SmartCardReaderStateIn(elementsOrVersion);
            {

                result.reader = decoder0.readString(8, false);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.currentState = SmartCardReaderStateFlags.decode(decoder1);
            }
            {

                result.currentCount = decoder0.readShort(24);
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

        encoder0.encode(this.reader, 8, false);

        encoder0.encode(this.currentState, 16, false);

        encoder0.encode(this.currentCount, 24);
    }
}