// MutablePartialNetworkTrafficAnnotationTag.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/mutable_partial_network_traffic_annotation_tag.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;


public final class MutablePartialNetworkTrafficAnnotationTag extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 16;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int uniqueIdHashCode;
    public int completingIdHashCode;

    private MutablePartialNetworkTrafficAnnotationTag(int version) {
        super(STRUCT_SIZE, version);
    }

    public MutablePartialNetworkTrafficAnnotationTag() {
        this(0);
    }

    public static MutablePartialNetworkTrafficAnnotationTag deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static MutablePartialNetworkTrafficAnnotationTag deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static MutablePartialNetworkTrafficAnnotationTag decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        MutablePartialNetworkTrafficAnnotationTag result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new MutablePartialNetworkTrafficAnnotationTag(elementsOrVersion);
                {
                    
                result.uniqueIdHashCode = decoder0.readInt(8);
                }
                {
                    
                result.completingIdHashCode = decoder0.readInt(12);
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
        
        encoder0.encode(this.uniqueIdHashCode, 8);
        
        encoder0.encode(this.completingIdHashCode, 12);
    }
}