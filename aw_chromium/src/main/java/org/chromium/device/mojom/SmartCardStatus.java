// SmartCardStatus.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/smart_card.mojom
//

package org.chromium.device.mojom;

import androidx.annotation.IntDef;


public final class SmartCardStatus extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String readerName;
    public int state;
    public int protocol;
    public byte[] answerToReset;

    private SmartCardStatus(int version) {
        super(STRUCT_SIZE, version);
    }

    public SmartCardStatus() {
        this(0);
    }

    public static SmartCardStatus deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static SmartCardStatus deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static SmartCardStatus decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        SmartCardStatus result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new SmartCardStatus(elementsOrVersion);
                {
                    
                result.readerName = decoder0.readString(8, false);
                }
                {
                    
                result.state = decoder0.readInt(16);
                    SmartCardConnectionState.validate(result.state);
                    result.state = SmartCardConnectionState.toKnownValue(result.state);
                }
                {
                    
                result.protocol = decoder0.readInt(20);
                    SmartCardProtocol.validate(result.protocol);
                    result.protocol = SmartCardProtocol.toKnownValue(result.protocol);
                }
                {
                    
                result.answerToReset = decoder0.readBytes(24, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
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
        
        encoder0.encode(this.readerName, 8, false);
        
        encoder0.encode(this.state, 16);
        
        encoder0.encode(this.protocol, 20);
        
        encoder0.encode(this.answerToReset, 24, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
    }
}