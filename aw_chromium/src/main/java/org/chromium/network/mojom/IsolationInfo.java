// IsolationInfo.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/isolation_info.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;


public final class IsolationInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 48;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(48, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int requestType;
    public org.chromium.url.internal.mojom.Origin topFrameOrigin;
    public org.chromium.url.internal.mojom.Origin frameOrigin;
    public org.chromium.mojo_base.mojom.UnguessableToken nonce;
    public SiteForCookies siteForCookies;

    private IsolationInfo(int version) {
        super(STRUCT_SIZE, version);
    }

    public IsolationInfo() {
        this(0);
    }

    public static IsolationInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static IsolationInfo deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static IsolationInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        IsolationInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new IsolationInfo(elementsOrVersion);
                {
                    
                result.requestType = decoder0.readInt(8);
                    IsolationInfoRequestType.validate(result.requestType);
                    result.requestType = IsolationInfoRequestType.toKnownValue(result.requestType);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, true);
                result.topFrameOrigin = org.chromium.url.internal.mojom.Origin.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, true);
                result.frameOrigin = org.chromium.url.internal.mojom.Origin.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, true);
                result.nonce = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.siteForCookies = SiteForCookies.decode(decoder1);
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
        
        encoder0.encode(this.requestType, 8);
        
        encoder0.encode(this.topFrameOrigin, 16, true);
        
        encoder0.encode(this.frameOrigin, 24, true);
        
        encoder0.encode(this.nonce, 32, true);
        
        encoder0.encode(this.siteForCookies, 40, false);
    }
}