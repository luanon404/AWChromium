// SerializedBlob.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/blob/serialized_blob.mojom
//

package org.chromium.blink.mojom;


public final class SerializedBlob extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String uuid;
    public String contentType;
    public long size;
    public Blob blob;

    private SerializedBlob(int version) {
        super(STRUCT_SIZE, version);
    }

    public SerializedBlob() {
        this(0);
    }

    public static SerializedBlob deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static SerializedBlob deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static SerializedBlob decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        SerializedBlob result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new SerializedBlob(elementsOrVersion);
                {
                    
                result.uuid = decoder0.readString(8, false);
                }
                {
                    
                result.contentType = decoder0.readString(16, false);
                }
                {
                    
                result.size = decoder0.readLong(24);
                }
                {
                    
                result.blob = decoder0.readServiceInterface(32, false, Blob.MANAGER);
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
        
        encoder0.encode(this.uuid, 8, false);
        
        encoder0.encode(this.contentType, 16, false);
        
        encoder0.encode(this.size, 24);
        
        encoder0.encode(this.blob, 32, false, Blob.MANAGER);
    }
}