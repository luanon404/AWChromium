// AggregationKeys.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     components/attribution_reporting/registration.mojom
//

package org.chromium.attribution_reporting.mojom;

import androidx.annotation.IntDef;


public final class AggregationKeys extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 16;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public java.util.Map<String, org.chromium.mojo_base.mojom.Uint128> keys;

    private AggregationKeys(int version) {
        super(STRUCT_SIZE, version);
    }

    public AggregationKeys() {
        this(0);
    }

    public static AggregationKeys deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static AggregationKeys deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static AggregationKeys decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        AggregationKeys result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new AggregationKeys(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                {
                    decoder1.readDataHeaderForMap();
                    String[] keys0;
                    org.chromium.mojo_base.mojom.Uint128[] values0;
                    {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                        {
                            org.chromium.mojo.bindings.DataHeader si2 = decoder2.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                            keys0 = new String[si2.elementsOrVersion];
                            for (int i2 = 0; i2 < si2.elementsOrVersion; ++i2) {
                                
                                keys0[i2] = decoder2.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i2, false);
                            }
                        }
                    }
                    {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE, false);
                        {
                            org.chromium.mojo.bindings.DataHeader si2 = decoder2.readDataHeaderForPointerArray(keys0.length);
                            values0 = new org.chromium.mojo_base.mojom.Uint128[si2.elementsOrVersion];
                            for (int i2 = 0; i2 < si2.elementsOrVersion; ++i2) {
                                
                                org.chromium.mojo.bindings.Decoder decoder3 = decoder2.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i2, false);
                                values0[i2] = org.chromium.mojo_base.mojom.Uint128.decode(decoder3);
                            }
                        }
                    }
                    result.keys = new java.util.HashMap<String, org.chromium.mojo_base.mojom.Uint128>();
                    for (int index0 = 0; index0 < keys0.length; ++index0) {
                        result.keys.put(keys0[index0],  values0[index0]);
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
        
        if (this.keys == null) {
            encoder0.encodeNullPointer(8, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encoderForMap(8);
            int size0 = this.keys.size();
            String[] keys0 = new String[size0];
            org.chromium.mojo_base.mojom.Uint128[] values0 = new org.chromium.mojo_base.mojom.Uint128[size0];
            int index0 = 0;
            for (java.util.Map.Entry<String, org.chromium.mojo_base.mojom.Uint128> entry0 : this.keys.entrySet()) {
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