// ReportingApiEndpoint.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/reporting_service.mojom
//

package org.chromium.network.mojom;

public final class ReportingApiEndpoint extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 80;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(80, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.url.mojom.Url url;
    public int attemptedUploads;
    public int successfulUploads;
    public int attemptedReports;
    public int successfulReports;
    public int priority;
    public int weight;
    public org.chromium.url.internal.mojom.Origin origin;
    public String groupName;
    public NetworkAnonymizationKey networkAnonymizationKey;
    public org.chromium.mojo_base.mojom.UnguessableToken reportingSource;

    private ReportingApiEndpoint(int version) {
        super(STRUCT_SIZE, version);
    }

    public ReportingApiEndpoint() {
        this(0);
    }

    public static ReportingApiEndpoint deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static ReportingApiEndpoint deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static ReportingApiEndpoint decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        ReportingApiEndpoint result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new ReportingApiEndpoint(elementsOrVersion);
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = org.chromium.url.mojom.Url.decode(decoder1);
            }
            {

                result.attemptedUploads = decoder0.readInt(16);
            }
            {

                result.successfulUploads = decoder0.readInt(20);
            }
            {

                result.attemptedReports = decoder0.readInt(24);
            }
            {

                result.successfulReports = decoder0.readInt(28);
            }
            {

                result.priority = decoder0.readInt(32);
            }
            {

                result.weight = decoder0.readInt(36);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.origin = org.chromium.url.internal.mojom.Origin.decode(decoder1);
            }
            {

                result.groupName = decoder0.readString(48, false);
            }
            {

                result.networkAnonymizationKey = NetworkAnonymizationKey.decode(decoder0, 56);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(72, true);
                result.reportingSource = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
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

        encoder0.encode(this.url, 8, false);

        encoder0.encode(this.attemptedUploads, 16);

        encoder0.encode(this.successfulUploads, 20);

        encoder0.encode(this.attemptedReports, 24);

        encoder0.encode(this.successfulReports, 28);

        encoder0.encode(this.priority, 32);

        encoder0.encode(this.weight, 36);

        encoder0.encode(this.origin, 40, false);

        encoder0.encode(this.groupName, 48, false);

        encoder0.encode(this.networkAnonymizationKey, 56, false);

        encoder0.encode(this.reportingSource, 72, true);
    }
}