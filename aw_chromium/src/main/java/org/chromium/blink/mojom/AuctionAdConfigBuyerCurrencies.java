// AuctionAdConfigBuyerCurrencies.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/interest_group/interest_group_types.mojom
//

package org.chromium.blink.mojom;


public final class AuctionAdConfigBuyerCurrencies extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 24;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public AdCurrency allBuyersCurrency;
    public java.util.Map<org.chromium.url.internal.mojom.Origin, AdCurrency> perBuyerCurrencies;

    private AuctionAdConfigBuyerCurrencies(int version) {
        super(STRUCT_SIZE, version);
    }

    public AuctionAdConfigBuyerCurrencies() {
        this(0);
    }

    public static AuctionAdConfigBuyerCurrencies deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static AuctionAdConfigBuyerCurrencies deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static AuctionAdConfigBuyerCurrencies decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        AuctionAdConfigBuyerCurrencies result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new AuctionAdConfigBuyerCurrencies(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, true);
                result.allBuyersCurrency = AdCurrency.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, true);
                if (decoder1 == null) {
                    result.perBuyerCurrencies = null;
                } else {
                    decoder1.readDataHeaderForMap();
                    org.chromium.url.internal.mojom.Origin[] keys0;
                    AdCurrency[] values0;
                    {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                        {
                            org.chromium.mojo.bindings.DataHeader si2 = decoder2.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                            keys0 = new org.chromium.url.internal.mojom.Origin[si2.elementsOrVersion];
                            for (int i2 = 0; i2 < si2.elementsOrVersion; ++i2) {
                                
                                org.chromium.mojo.bindings.Decoder decoder3 = decoder2.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i2, false);
                                keys0[i2] = org.chromium.url.internal.mojom.Origin.decode(decoder3);
                            }
                        }
                    }
                    {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, false);
                        {
                            org.chromium.mojo.bindings.DataHeader si2 = decoder2.readDataHeaderForPointerArray(keys0.length);
                            values0 = new AdCurrency[si2.elementsOrVersion];
                            for (int i2 = 0; i2 < si2.elementsOrVersion; ++i2) {
                                
                                org.chromium.mojo.bindings.Decoder decoder3 = decoder2.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i2, false);
                                values0[i2] = AdCurrency.decode(decoder3);
                            }
                        }
                    }
                    result.perBuyerCurrencies = new java.util.HashMap<org.chromium.url.internal.mojom.Origin, AdCurrency>();
                    for (int index0 = 0; index0 < keys0.length; ++index0) {
                        result.perBuyerCurrencies.put(keys0[index0],  values0[index0]);
                    }
                }
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
        
        encoder0.encode(this.allBuyersCurrency, 8, true);
        
        if (this.perBuyerCurrencies == null) {
            encoder0.encodeNullPointer(16, true);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encoderForMap(16);
            int size0 = this.perBuyerCurrencies.size();
            org.chromium.url.internal.mojom.Origin[] keys0 = new org.chromium.url.internal.mojom.Origin[size0];
            AdCurrency[] values0 = new AdCurrency[size0];
            int index0 = 0;
            for (java.util.Map.Entry<org.chromium.url.internal.mojom.Origin, AdCurrency> entry0 : this.perBuyerCurrencies.entrySet()) {
                keys0[index0] = entry0.getKey();
                values0[index0] = entry0.getValue();
                ++index0;
            }
            
            {
                org.chromium.mojo.bindings.Encoder encoder2 = encoder1.encodePointerArray(keys0.length, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i1 = 0; i1 < keys0.length; ++i1) {
                    
                    encoder2.encode(keys0[i1], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                }
            }
            
            {
                org.chromium.mojo.bindings.Encoder encoder2 = encoder1.encodePointerArray(values0.length, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i1 = 0; i1 < values0.length; ++i1) {
                    
                    encoder2.encode(values0[i1], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                }
            }
        }
    }
}