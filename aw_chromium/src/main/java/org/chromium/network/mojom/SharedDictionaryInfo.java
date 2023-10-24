// SharedDictionaryInfo.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_context.mojom
//

package org.chromium.network.mojom;

public final class SharedDictionaryInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 64;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(64, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String match;
    public org.chromium.url.mojom.Url dictionaryUrl;
    public org.chromium.mojo_base.mojom.Time responseTime;
    public org.chromium.mojo_base.mojom.TimeDelta expiration;
    public org.chromium.mojo_base.mojom.Time lastUsedTime;
    public long size;
    public Sha256HashValue hash;

    private SharedDictionaryInfo(int version) {
        super(STRUCT_SIZE, version);
    }

    public SharedDictionaryInfo() {
        this(0);
    }

    public static SharedDictionaryInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static SharedDictionaryInfo deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static SharedDictionaryInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        SharedDictionaryInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new SharedDictionaryInfo(elementsOrVersion);
            {

                result.match = decoder0.readString(8, false);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.dictionaryUrl = org.chromium.url.mojom.Url.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.responseTime = org.chromium.mojo_base.mojom.Time.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.expiration = org.chromium.mojo_base.mojom.TimeDelta.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.lastUsedTime = org.chromium.mojo_base.mojom.Time.decode(decoder1);
            }
            {

                result.size = decoder0.readLong(48);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, false);
                result.hash = Sha256HashValue.decode(decoder1);
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

        encoder0.encode(this.match, 8, false);

        encoder0.encode(this.dictionaryUrl, 16, false);

        encoder0.encode(this.responseTime, 24, false);

        encoder0.encode(this.expiration, 32, false);

        encoder0.encode(this.lastUsedTime, 40, false);

        encoder0.encode(this.size, 48);

        encoder0.encode(this.hash, 56, false);
    }
}