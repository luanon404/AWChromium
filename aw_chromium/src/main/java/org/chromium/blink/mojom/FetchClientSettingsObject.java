// FetchClientSettingsObject.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/loader/fetch_client_settings_object.mojom
//

package org.chromium.blink.mojom;


public final class FetchClientSettingsObject extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 24;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int referrerPolicy;
    public org.chromium.url.mojom.Url outgoingReferrer;
    public int insecureRequestsPolicy;

    private FetchClientSettingsObject(int version) {
        super(STRUCT_SIZE, version);
    }

    public FetchClientSettingsObject() {
        this(0);
    }

    public static FetchClientSettingsObject deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static FetchClientSettingsObject deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static FetchClientSettingsObject decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        FetchClientSettingsObject result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new FetchClientSettingsObject(elementsOrVersion);
                {
                    
                result.referrerPolicy = decoder0.readInt(8);
                    org.chromium.network.mojom.ReferrerPolicy.validate(result.referrerPolicy);
                    result.referrerPolicy = org.chromium.network.mojom.ReferrerPolicy.toKnownValue(result.referrerPolicy);
                }
                {
                    
                result.insecureRequestsPolicy = decoder0.readInt(12);
                    InsecureRequestsPolicy.validate(result.insecureRequestsPolicy);
                    result.insecureRequestsPolicy = InsecureRequestsPolicy.toKnownValue(result.insecureRequestsPolicy);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.outgoingReferrer = org.chromium.url.mojom.Url.decode(decoder1);
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
        
        encoder0.encode(this.referrerPolicy, 8);
        
        encoder0.encode(this.insecureRequestsPolicy, 12);
        
        encoder0.encode(this.outgoingReferrer, 16, false);
    }
}