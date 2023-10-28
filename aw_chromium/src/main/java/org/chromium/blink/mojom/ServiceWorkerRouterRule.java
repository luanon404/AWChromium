// ServiceWorkerRouterRule.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/service_worker/service_worker_router_rule.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public final class ServiceWorkerRouterRule extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 24;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public ServiceWorkerRouterCondition[] conditions;
    public ServiceWorkerRouterSource[] sources;

    private ServiceWorkerRouterRule(int version) {
        super(STRUCT_SIZE, version);
    }

    public ServiceWorkerRouterRule() {
        this(0);
    }

    public static ServiceWorkerRouterRule deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static ServiceWorkerRouterRule deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static ServiceWorkerRouterRule decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        ServiceWorkerRouterRule result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new ServiceWorkerRouterRule(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.conditions = new ServiceWorkerRouterCondition[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        result.conditions[i1] = ServiceWorkerRouterCondition.decode(decoder1, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + 
                        org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE * i1);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.sources = new ServiceWorkerRouterSource[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        result.sources[i1] = ServiceWorkerRouterSource.decode(decoder1, org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + 
                        org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE * i1);
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
        
        if (this.conditions == null) {
            encoder0.encodeNullPointer(8, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodeUnionArray(this.conditions.length, 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.conditions.length; ++i0) {
                
                encoder1.encode(this.conditions[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + 
                org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE * i0, false);
            }
        }
        
        if (this.sources == null) {
            encoder0.encodeNullPointer(16, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodeUnionArray(this.sources.length, 16, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.sources.length; ++i0) {
                
                encoder1.encode(this.sources[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + 
                org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE * i0, false);
            }
        }
    }
}