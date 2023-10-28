// ParsedPermissionsPolicyDeclaration.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/permissions_policy/permissions_policy.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public final class ParsedPermissionsPolicyDeclaration extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int feature;
    public OriginWithPossibleWildcards[] allowedOrigins;
    public org.chromium.url.internal.mojom.Origin selfIfMatches;
    public boolean matchesAllOrigins;
    public boolean matchesOpaqueSrc;
    public String reportingEndpoint;

    private ParsedPermissionsPolicyDeclaration(int version) {
        super(STRUCT_SIZE, version);
    }

    public ParsedPermissionsPolicyDeclaration() {
        this(0);
    }

    public static ParsedPermissionsPolicyDeclaration deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static ParsedPermissionsPolicyDeclaration deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static ParsedPermissionsPolicyDeclaration decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        ParsedPermissionsPolicyDeclaration result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new ParsedPermissionsPolicyDeclaration(elementsOrVersion);
                {
                    
                result.feature = decoder0.readInt(8);
                    PermissionsPolicyFeature.validate(result.feature);
                    result.feature = PermissionsPolicyFeature.toKnownValue(result.feature);
                }
                {
                    
                result.matchesAllOrigins = decoder0.readBoolean(12, 0);
                }
                {
                    
                result.matchesOpaqueSrc = decoder0.readBoolean(12, 1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.allowedOrigins = new OriginWithPossibleWildcards[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.allowedOrigins[i1] = OriginWithPossibleWildcards.decode(decoder2);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, true);
                result.selfIfMatches = org.chromium.url.internal.mojom.Origin.decode(decoder1);
                }
                {
                    
                result.reportingEndpoint = decoder0.readString(32, true);
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
        
        encoder0.encode(this.feature, 8);
        
        encoder0.encode(this.matchesAllOrigins, 12, 0);
        
        encoder0.encode(this.matchesOpaqueSrc, 12, 1);
        
        if (this.allowedOrigins == null) {
            encoder0.encodeNullPointer(16, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.allowedOrigins.length, 16, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.allowedOrigins.length; ++i0) {
                
                encoder1.encode(this.allowedOrigins[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.selfIfMatches, 24, true);
        
        encoder0.encode(this.reportingEndpoint, 32, true);
    }
}