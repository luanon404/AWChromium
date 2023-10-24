// TrustTokenQueryAnswerer_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/trust_tokens.mojom
//

package org.chromium.network.mojom;

class TrustTokenQueryAnswerer_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<TrustTokenQueryAnswerer, TrustTokenQueryAnswerer.Proxy> MANAGER = new org.chromium.mojo.bindings.Interface.Manager<TrustTokenQueryAnswerer, TrustTokenQueryAnswerer.Proxy>() {

        @Override
        public String getName() {
            return "network.mojom.TrustTokenQueryAnswerer";
        }

        @Override
        public int getVersion() {
            return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core, org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, TrustTokenQueryAnswerer impl) {
            return new Stub(core, impl);
        }

        @Override
        public TrustTokenQueryAnswerer[] buildArray(int size) {
            return new TrustTokenQueryAnswerer[size];
        }
    };


    private static final int HAS_TRUST_TOKENS_ORDINAL = 0;

    private static final int HAS_REDEMPTION_RECORD_ORDINAL = 1;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements TrustTokenQueryAnswerer.Proxy {

        Proxy(org.chromium.mojo.system.Core core, org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void hasTrustTokens(org.chromium.url.internal.mojom.Origin issuer, HasTrustTokens_Response callback) {

            TrustTokenQueryAnswererHasTrustTokensParams _message = new TrustTokenQueryAnswererHasTrustTokensParams();

            _message.issuer = issuer;


            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(HAS_TRUST_TOKENS_ORDINAL, org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG, 0)), new TrustTokenQueryAnswererHasTrustTokensResponseParamsForwardToCallback(callback));

        }


        @Override
        public void hasRedemptionRecord(org.chromium.url.internal.mojom.Origin issuer, HasRedemptionRecord_Response callback) {

            TrustTokenQueryAnswererHasRedemptionRecordParams _message = new TrustTokenQueryAnswererHasRedemptionRecordParams();

            _message.issuer = issuer;


            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(HAS_REDEMPTION_RECORD_ORDINAL, org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG, 0)), new TrustTokenQueryAnswererHasRedemptionRecordResponseParamsForwardToCallback(callback));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<TrustTokenQueryAnswerer> {

        Stub(org.chromium.mojo.system.Core core, TrustTokenQueryAnswerer impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader = message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.NO_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch (header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(TrustTokenQueryAnswerer_Internal.MANAGER, messageWithHeader);


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e);
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader = message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch (header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(getCore(), TrustTokenQueryAnswerer_Internal.MANAGER, messageWithHeader, receiver);


                    case HAS_TRUST_TOKENS_ORDINAL: {

                        TrustTokenQueryAnswererHasTrustTokensParams data = TrustTokenQueryAnswererHasTrustTokensParams.deserialize(messageWithHeader.getPayload());

                        getImpl().hasTrustTokens(data.issuer, new TrustTokenQueryAnswererHasTrustTokensResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }


                    case HAS_REDEMPTION_RECORD_ORDINAL: {

                        TrustTokenQueryAnswererHasRedemptionRecordParams data = TrustTokenQueryAnswererHasRedemptionRecordParams.deserialize(messageWithHeader.getPayload());

                        getImpl().hasRedemptionRecord(data.issuer, new TrustTokenQueryAnswererHasRedemptionRecordResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e);
                return false;
            }
        }
    }


    static final class TrustTokenQueryAnswererHasTrustTokensParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.url.internal.mojom.Origin issuer;

        private TrustTokenQueryAnswererHasTrustTokensParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public TrustTokenQueryAnswererHasTrustTokensParams() {
            this(0);
        }

        public static TrustTokenQueryAnswererHasTrustTokensParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static TrustTokenQueryAnswererHasTrustTokensParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static TrustTokenQueryAnswererHasTrustTokensParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            TrustTokenQueryAnswererHasTrustTokensParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new TrustTokenQueryAnswererHasTrustTokensParams(elementsOrVersion);
                {

                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.issuer = org.chromium.url.internal.mojom.Origin.decode(decoder1);
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

            encoder0.encode(this.issuer, 8, false);
        }
    }


    static final class TrustTokenQueryAnswererHasTrustTokensResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public HasTrustTokensResult result;

        private TrustTokenQueryAnswererHasTrustTokensResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public TrustTokenQueryAnswererHasTrustTokensResponseParams() {
            this(0);
        }

        public static TrustTokenQueryAnswererHasTrustTokensResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static TrustTokenQueryAnswererHasTrustTokensResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static TrustTokenQueryAnswererHasTrustTokensResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            TrustTokenQueryAnswererHasTrustTokensResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new TrustTokenQueryAnswererHasTrustTokensResponseParams(elementsOrVersion);
                {

                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.result = HasTrustTokensResult.decode(decoder1);
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

            encoder0.encode(this.result, 8, false);
        }
    }

    static class TrustTokenQueryAnswererHasTrustTokensResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable implements org.chromium.mojo.bindings.MessageReceiver {
        private final TrustTokenQueryAnswerer.HasTrustTokens_Response mCallback;

        TrustTokenQueryAnswererHasTrustTokensResponseParamsForwardToCallback(TrustTokenQueryAnswerer.HasTrustTokens_Response callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader = message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(HAS_TRUST_TOKENS_ORDINAL, org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                TrustTokenQueryAnswererHasTrustTokensResponseParams response = TrustTokenQueryAnswererHasTrustTokensResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.result);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class TrustTokenQueryAnswererHasTrustTokensResponseParamsProxyToResponder implements TrustTokenQueryAnswerer.HasTrustTokens_Response {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        TrustTokenQueryAnswererHasTrustTokensResponseParamsProxyToResponder(org.chromium.mojo.system.Core core, org.chromium.mojo.bindings.MessageReceiver messageReceiver, long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(HasTrustTokensResult result) {
            TrustTokenQueryAnswererHasTrustTokensResponseParams _response = new TrustTokenQueryAnswererHasTrustTokensResponseParams();

            _response.result = result;

            org.chromium.mojo.bindings.ServiceMessage _message = _response.serializeWithHeader(mCore, new org.chromium.mojo.bindings.MessageHeader(HAS_TRUST_TOKENS_ORDINAL, org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG, mRequestId));
            mMessageReceiver.accept(_message);
        }
    }


    static final class TrustTokenQueryAnswererHasRedemptionRecordParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.url.internal.mojom.Origin issuer;

        private TrustTokenQueryAnswererHasRedemptionRecordParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public TrustTokenQueryAnswererHasRedemptionRecordParams() {
            this(0);
        }

        public static TrustTokenQueryAnswererHasRedemptionRecordParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static TrustTokenQueryAnswererHasRedemptionRecordParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static TrustTokenQueryAnswererHasRedemptionRecordParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            TrustTokenQueryAnswererHasRedemptionRecordParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new TrustTokenQueryAnswererHasRedemptionRecordParams(elementsOrVersion);
                {

                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.issuer = org.chromium.url.internal.mojom.Origin.decode(decoder1);
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

            encoder0.encode(this.issuer, 8, false);
        }
    }


    static final class TrustTokenQueryAnswererHasRedemptionRecordResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public HasRedemptionRecordResult result;

        private TrustTokenQueryAnswererHasRedemptionRecordResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public TrustTokenQueryAnswererHasRedemptionRecordResponseParams() {
            this(0);
        }

        public static TrustTokenQueryAnswererHasRedemptionRecordResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static TrustTokenQueryAnswererHasRedemptionRecordResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static TrustTokenQueryAnswererHasRedemptionRecordResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            TrustTokenQueryAnswererHasRedemptionRecordResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new TrustTokenQueryAnswererHasRedemptionRecordResponseParams(elementsOrVersion);
                {

                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.result = HasRedemptionRecordResult.decode(decoder1);
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

            encoder0.encode(this.result, 8, false);
        }
    }

    static class TrustTokenQueryAnswererHasRedemptionRecordResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable implements org.chromium.mojo.bindings.MessageReceiver {
        private final TrustTokenQueryAnswerer.HasRedemptionRecord_Response mCallback;

        TrustTokenQueryAnswererHasRedemptionRecordResponseParamsForwardToCallback(TrustTokenQueryAnswerer.HasRedemptionRecord_Response callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader = message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(HAS_REDEMPTION_RECORD_ORDINAL, org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                TrustTokenQueryAnswererHasRedemptionRecordResponseParams response = TrustTokenQueryAnswererHasRedemptionRecordResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.result);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class TrustTokenQueryAnswererHasRedemptionRecordResponseParamsProxyToResponder implements TrustTokenQueryAnswerer.HasRedemptionRecord_Response {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        TrustTokenQueryAnswererHasRedemptionRecordResponseParamsProxyToResponder(org.chromium.mojo.system.Core core, org.chromium.mojo.bindings.MessageReceiver messageReceiver, long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(HasRedemptionRecordResult result) {
            TrustTokenQueryAnswererHasRedemptionRecordResponseParams _response = new TrustTokenQueryAnswererHasRedemptionRecordResponseParams();

            _response.result = result;

            org.chromium.mojo.bindings.ServiceMessage _message = _response.serializeWithHeader(mCore, new org.chromium.mojo.bindings.MessageHeader(HAS_REDEMPTION_RECORD_ORDINAL, org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG, mRequestId));
            mMessageReceiver.accept(_message);
        }
    }


}
