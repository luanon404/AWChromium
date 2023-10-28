// CorsOriginPattern.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/cors_origin_pattern.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;


public final class CorsOriginPattern extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String protocol;
    public String domain;
    public short port;
    public int domainMatchMode;
    public int portMatchMode;
    public int priority;

    private CorsOriginPattern(int version) {
        super(STRUCT_SIZE, version);
    }

    public CorsOriginPattern() {
        this(0);
    }

    public static CorsOriginPattern deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static CorsOriginPattern deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static CorsOriginPattern decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        CorsOriginPattern result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new CorsOriginPattern(elementsOrVersion);
                {
                    
                result.protocol = decoder0.readString(8, false);
                }
                {
                    
                result.domain = decoder0.readString(16, false);
                }
                {
                    
                result.port = decoder0.readShort(24);
                }
                {
                    
                result.domainMatchMode = decoder0.readInt(28);
                    CorsDomainMatchMode.validate(result.domainMatchMode);
                    result.domainMatchMode = CorsDomainMatchMode.toKnownValue(result.domainMatchMode);
                }
                {
                    
                result.portMatchMode = decoder0.readInt(32);
                    CorsPortMatchMode.validate(result.portMatchMode);
                    result.portMatchMode = CorsPortMatchMode.toKnownValue(result.portMatchMode);
                }
                {
                    
                result.priority = decoder0.readInt(36);
                    CorsOriginAccessMatchPriority.validate(result.priority);
                    result.priority = CorsOriginAccessMatchPriority.toKnownValue(result.priority);
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
        
        encoder0.encode(this.protocol, 8, false);
        
        encoder0.encode(this.domain, 16, false);
        
        encoder0.encode(this.port, 24);
        
        encoder0.encode(this.domainMatchMode, 28);
        
        encoder0.encode(this.portMatchMode, 32);
        
        encoder0.encode(this.priority, 36);
    }
}