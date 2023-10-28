// CookieSameSiteContextMetadata.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/cookie_manager.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;


public final class CookieSameSiteContextMetadata extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 24;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int crossSiteRedirectDowngrade;
    public int redirectTypeBug1221316;
    public int httpMethodBug1221316;

    private CookieSameSiteContextMetadata(int version) {
        super(STRUCT_SIZE, version);
        this.crossSiteRedirectDowngrade = (int) CookieSameSiteContextMetadataDowngradeType.NO_DOWNGRADE;
        this.redirectTypeBug1221316 = (int) ContextRedirectTypeBug1221316.UNSET;
        this.httpMethodBug1221316 = (int) HttpMethod.UNSET;
    }

    public CookieSameSiteContextMetadata() {
        this(0);
    }

    public static CookieSameSiteContextMetadata deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static CookieSameSiteContextMetadata deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static CookieSameSiteContextMetadata decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        CookieSameSiteContextMetadata result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new CookieSameSiteContextMetadata(elementsOrVersion);
                {
                    
                result.crossSiteRedirectDowngrade = decoder0.readInt(8);
                    CookieSameSiteContextMetadataDowngradeType.validate(result.crossSiteRedirectDowngrade);
                    result.crossSiteRedirectDowngrade = CookieSameSiteContextMetadataDowngradeType.toKnownValue(result.crossSiteRedirectDowngrade);
                }
                {
                    
                result.redirectTypeBug1221316 = decoder0.readInt(12);
                    ContextRedirectTypeBug1221316.validate(result.redirectTypeBug1221316);
                    result.redirectTypeBug1221316 = ContextRedirectTypeBug1221316.toKnownValue(result.redirectTypeBug1221316);
                }
                {
                    
                result.httpMethodBug1221316 = decoder0.readInt(16);
                    HttpMethod.validate(result.httpMethodBug1221316);
                    result.httpMethodBug1221316 = HttpMethod.toKnownValue(result.httpMethodBug1221316);
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
        
        encoder0.encode(this.crossSiteRedirectDowngrade, 8);
        
        encoder0.encode(this.redirectTypeBug1221316, 12);
        
        encoder0.encode(this.httpMethodBug1221316, 16);
    }
}