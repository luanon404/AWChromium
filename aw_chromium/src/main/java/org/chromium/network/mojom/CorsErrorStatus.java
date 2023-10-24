// CorsErrorStatus.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/cors.mojom
//

package org.chromium.network.mojom;

public final class CorsErrorStatus extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int corsError;
    public String failedParameter;
    public int targetAddressSpace;
    public int resourceAddressSpace;
    public boolean hasAuthorizationCoveredByWildcardOnPreflight;
    public org.chromium.mojo_base.mojom.UnguessableToken issueId;

    private CorsErrorStatus(int version) {
        super(STRUCT_SIZE, version);
        this.targetAddressSpace = (int) IpAddressSpace.UNKNOWN;
        this.resourceAddressSpace = (int) IpAddressSpace.UNKNOWN;
        this.hasAuthorizationCoveredByWildcardOnPreflight = (boolean) false;
    }

    public CorsErrorStatus() {
        this(0);
    }

    public static CorsErrorStatus deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static CorsErrorStatus deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static CorsErrorStatus decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        CorsErrorStatus result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new CorsErrorStatus(elementsOrVersion);
            {

                result.corsError = decoder0.readInt(8);
                CorsError.validate(result.corsError);
                result.corsError = CorsError.toKnownValue(result.corsError);
            }
            {

                result.targetAddressSpace = decoder0.readInt(12);
                IpAddressSpace.validate(result.targetAddressSpace);
                result.targetAddressSpace = IpAddressSpace.toKnownValue(result.targetAddressSpace);
            }
            {

                result.failedParameter = decoder0.readString(16, false);
            }
            {

                result.resourceAddressSpace = decoder0.readInt(24);
                IpAddressSpace.validate(result.resourceAddressSpace);
                result.resourceAddressSpace = IpAddressSpace.toKnownValue(result.resourceAddressSpace);
            }
            {

                result.hasAuthorizationCoveredByWildcardOnPreflight = decoder0.readBoolean(28, 0);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.issueId = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
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

        encoder0.encode(this.corsError, 8);

        encoder0.encode(this.targetAddressSpace, 12);

        encoder0.encode(this.failedParameter, 16, false);

        encoder0.encode(this.resourceAddressSpace, 24);

        encoder0.encode(this.hasAuthorizationCoveredByWildcardOnPreflight, 28, 0);

        encoder0.encode(this.issueId, 32, false);
    }
}