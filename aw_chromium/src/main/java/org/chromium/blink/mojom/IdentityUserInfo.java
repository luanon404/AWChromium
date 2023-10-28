// IdentityUserInfo.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/webid/federated_auth_request.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public final class IdentityUserInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String email;
    public String givenName;
    public String name;
    public String picture;

    private IdentityUserInfo(int version) {
        super(STRUCT_SIZE, version);
    }

    public IdentityUserInfo() {
        this(0);
    }

    public static IdentityUserInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static IdentityUserInfo deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static IdentityUserInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        IdentityUserInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new IdentityUserInfo(elementsOrVersion);
                {
                    
                result.email = decoder0.readString(8, false);
                }
                {
                    
                result.givenName = decoder0.readString(16, false);
                }
                {
                    
                result.name = decoder0.readString(24, false);
                }
                {
                    
                result.picture = decoder0.readString(32, false);
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
        
        encoder0.encode(this.email, 8, false);
        
        encoder0.encode(this.givenName, 16, false);
        
        encoder0.encode(this.name, 24, false);
        
        encoder0.encode(this.picture, 32, false);
    }
}