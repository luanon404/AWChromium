// UrlLoaderCompletionStatus.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/url_loader_completion_status.mojom
//

package org.chromium.network.mojom;

public final class UrlLoaderCompletionStatus extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 104;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(104, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int errorCode;
    public int extendedErrorCode;
    public boolean existsInCache;
    public boolean existsInMemoryCache;
    public org.chromium.mojo_base.mojom.TimeTicks completionTime;
    public long encodedDataLength;
    public long encodedBodyLength;
    public long decodedBodyLength;
    public CorsErrorStatus corsErrorStatus;
    public int privateNetworkAccessPreflightResult;
    public int trustTokenOperationStatus;
    public SslInfo sslInfo;
    public BlockedByResponseReasonWrapper blockedByResponseReason;
    public boolean shouldReportCorbBlocking;
    public ProxyServer proxyServer;
    public ResolveErrorInfo resolveErrorInfo;
    public boolean shouldCollapseInitiator;

    private UrlLoaderCompletionStatus(int version) {
        super(STRUCT_SIZE, version);
        this.errorCode = (int) 0;
        this.extendedErrorCode = (int) 0;
        this.existsInCache = (boolean) false;
        this.existsInMemoryCache = (boolean) false;
        this.encodedDataLength = (long) 0;
        this.encodedBodyLength = (long) 0;
        this.decodedBodyLength = (long) 0;
        this.privateNetworkAccessPreflightResult = (int) PrivateNetworkAccessPreflightResult.NONE;
        this.trustTokenOperationStatus = (int) TrustTokenOperationStatus.OK;
        this.shouldReportCorbBlocking = (boolean) false;
        this.shouldCollapseInitiator = (boolean) false;
    }

    public UrlLoaderCompletionStatus() {
        this(0);
    }

    public static UrlLoaderCompletionStatus deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static UrlLoaderCompletionStatus deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static UrlLoaderCompletionStatus decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        UrlLoaderCompletionStatus result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new UrlLoaderCompletionStatus(elementsOrVersion);
            {

                result.errorCode = decoder0.readInt(8);
            }
            {

                result.extendedErrorCode = decoder0.readInt(12);
            }
            {

                result.existsInCache = decoder0.readBoolean(16, 0);
            }
            {

                result.existsInMemoryCache = decoder0.readBoolean(16, 1);
            }
            {

                result.shouldReportCorbBlocking = decoder0.readBoolean(16, 2);
            }
            {

                result.shouldCollapseInitiator = decoder0.readBoolean(16, 3);
            }
            {

                result.privateNetworkAccessPreflightResult = decoder0.readInt(20);
                PrivateNetworkAccessPreflightResult.validate(result.privateNetworkAccessPreflightResult);
                result.privateNetworkAccessPreflightResult = PrivateNetworkAccessPreflightResult.toKnownValue(result.privateNetworkAccessPreflightResult);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.completionTime = org.chromium.mojo_base.mojom.TimeTicks.decode(decoder1);
            }
            {

                result.encodedDataLength = decoder0.readLong(32);
            }
            {

                result.encodedBodyLength = decoder0.readLong(40);
            }
            {

                result.decodedBodyLength = decoder0.readLong(48);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, true);
                result.corsErrorStatus = CorsErrorStatus.decode(decoder1);
            }
            {

                result.trustTokenOperationStatus = decoder0.readInt(64);
                TrustTokenOperationStatus.validate(result.trustTokenOperationStatus);
                result.trustTokenOperationStatus = TrustTokenOperationStatus.toKnownValue(result.trustTokenOperationStatus);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(72, true);
                result.sslInfo = SslInfo.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(80, true);
                result.blockedByResponseReason = BlockedByResponseReasonWrapper.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(88, false);
                result.proxyServer = ProxyServer.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(96, false);
                result.resolveErrorInfo = ResolveErrorInfo.decode(decoder1);
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

        encoder0.encode(this.errorCode, 8);

        encoder0.encode(this.extendedErrorCode, 12);

        encoder0.encode(this.existsInCache, 16, 0);

        encoder0.encode(this.existsInMemoryCache, 16, 1);

        encoder0.encode(this.shouldReportCorbBlocking, 16, 2);

        encoder0.encode(this.shouldCollapseInitiator, 16, 3);

        encoder0.encode(this.privateNetworkAccessPreflightResult, 20);

        encoder0.encode(this.completionTime, 24, false);

        encoder0.encode(this.encodedDataLength, 32);

        encoder0.encode(this.encodedBodyLength, 40);

        encoder0.encode(this.decodedBodyLength, 48);

        encoder0.encode(this.corsErrorStatus, 56, true);

        encoder0.encode(this.trustTokenOperationStatus, 64);

        encoder0.encode(this.sslInfo, 72, true);

        encoder0.encode(this.blockedByResponseReason, 80, true);

        encoder0.encode(this.proxyServer, 88, false);

        encoder0.encode(this.resolveErrorInfo, 96, false);
    }
}