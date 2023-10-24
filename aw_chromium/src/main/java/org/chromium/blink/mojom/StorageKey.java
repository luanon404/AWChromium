// StorageKey.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/storage_key/storage_key.mojom
//

package org.chromium.blink.mojom;


public final class StorageKey extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 48;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(48, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.url.internal.mojom.Origin origin;
    public org.chromium.network.mojom.SchemefulSite topLevelSite;
    public org.chromium.mojo_base.mojom.UnguessableToken nonce;
    public int ancestorChainBit;
    public org.chromium.network.mojom.SchemefulSite topLevelSiteIfThirdPartyEnabled;
    public int ancestorChainBitIfThirdPartyEnabled;

    private StorageKey(int version) {
        super(STRUCT_SIZE, version);
    }

    public StorageKey() {
        this(0);
    }

    public static StorageKey deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static StorageKey deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static StorageKey decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        StorageKey result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new StorageKey(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.origin = org.chromium.url.internal.mojom.Origin.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.topLevelSite = org.chromium.network.mojom.SchemefulSite.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, true);
                result.nonce = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
                }
                {
                    
                result.ancestorChainBit = decoder0.readInt(32);
                    AncestorChainBit.validate(result.ancestorChainBit);
                    result.ancestorChainBit = AncestorChainBit.toKnownValue(result.ancestorChainBit);
                }
                {
                    
                result.ancestorChainBitIfThirdPartyEnabled = decoder0.readInt(36);
                    AncestorChainBit.validate(result.ancestorChainBitIfThirdPartyEnabled);
                    result.ancestorChainBitIfThirdPartyEnabled = AncestorChainBit.toKnownValue(result.ancestorChainBitIfThirdPartyEnabled);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.topLevelSiteIfThirdPartyEnabled = org.chromium.network.mojom.SchemefulSite.decode(decoder1);
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
        
        encoder0.encode(this.origin, 8, false);
        
        encoder0.encode(this.topLevelSite, 16, false);
        
        encoder0.encode(this.nonce, 24, true);
        
        encoder0.encode(this.ancestorChainBit, 32);
        
        encoder0.encode(this.ancestorChainBitIfThirdPartyEnabled, 36);
        
        encoder0.encode(this.topLevelSiteIfThirdPartyEnabled, 40, false);
    }
}