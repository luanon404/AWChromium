// ProvisionFetcher_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/provision_fetcher.mojom
//

package org.chromium.media.mojom;

class ProvisionFetcher_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<ProvisionFetcher, ProvisionFetcher.Proxy> MANAGER = new org.chromium.mojo.bindings.Interface.Manager<ProvisionFetcher, ProvisionFetcher.Proxy>() {

        @Override
        public String getName() {
            return "media.mojom.ProvisionFetcher";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, ProvisionFetcher impl) {
            return new Stub(core, impl);
        }

        @Override
        public ProvisionFetcher[] buildArray(int size) {
            return new ProvisionFetcher[size];
        }
    };


    private static final int RETRIEVE_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements ProvisionFetcher.Proxy {

        Proxy(org.chromium.mojo.system.Core core, org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void retrieve(org.chromium.url.mojom.Url defaultUrl, String requestData, Retrieve_Response callback) {

            ProvisionFetcherRetrieveParams _message = new ProvisionFetcherRetrieveParams();

            _message.defaultUrl = defaultUrl;

            _message.requestData = requestData;


            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(RETRIEVE_ORDINAL, org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG, 0)), new ProvisionFetcherRetrieveResponseParamsForwardToCallback(callback));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<ProvisionFetcher> {

        Stub(org.chromium.mojo.system.Core core, ProvisionFetcher impl) {
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
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(ProvisionFetcher_Internal.MANAGER, messageWithHeader);


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
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(getCore(), ProvisionFetcher_Internal.MANAGER, messageWithHeader, receiver);


                    case RETRIEVE_ORDINAL: {

                        ProvisionFetcherRetrieveParams data = ProvisionFetcherRetrieveParams.deserialize(messageWithHeader.getPayload());

                        getImpl().retrieve(data.defaultUrl, data.requestData, new ProvisionFetcherRetrieveResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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


    static final class ProvisionFetcherRetrieveParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.url.mojom.Url defaultUrl;
        public String requestData;

        private ProvisionFetcherRetrieveParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ProvisionFetcherRetrieveParams() {
            this(0);
        }

        public static ProvisionFetcherRetrieveParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ProvisionFetcherRetrieveParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ProvisionFetcherRetrieveParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ProvisionFetcherRetrieveParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ProvisionFetcherRetrieveParams(elementsOrVersion);
                {

                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.defaultUrl = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {

                    result.requestData = decoder0.readString(16, false);
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

            encoder0.encode(this.defaultUrl, 8, false);

            encoder0.encode(this.requestData, 16, false);
        }
    }


    static final class ProvisionFetcherRetrieveResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public boolean result;
        public String response;

        private ProvisionFetcherRetrieveResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ProvisionFetcherRetrieveResponseParams() {
            this(0);
        }

        public static ProvisionFetcherRetrieveResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ProvisionFetcherRetrieveResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ProvisionFetcherRetrieveResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ProvisionFetcherRetrieveResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ProvisionFetcherRetrieveResponseParams(elementsOrVersion);
                {

                    result.result = decoder0.readBoolean(8, 0);
                }
                {

                    result.response = decoder0.readString(16, false);
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

            encoder0.encode(this.result, 8, 0);

            encoder0.encode(this.response, 16, false);
        }
    }

    static class ProvisionFetcherRetrieveResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable implements org.chromium.mojo.bindings.MessageReceiver {
        private final ProvisionFetcher.Retrieve_Response mCallback;

        ProvisionFetcherRetrieveResponseParamsForwardToCallback(ProvisionFetcher.Retrieve_Response callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader = message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(RETRIEVE_ORDINAL, org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                ProvisionFetcherRetrieveResponseParams response = ProvisionFetcherRetrieveResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.result, response.response);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class ProvisionFetcherRetrieveResponseParamsProxyToResponder implements ProvisionFetcher.Retrieve_Response {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ProvisionFetcherRetrieveResponseParamsProxyToResponder(org.chromium.mojo.system.Core core, org.chromium.mojo.bindings.MessageReceiver messageReceiver, long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(Boolean result, String response) {
            ProvisionFetcherRetrieveResponseParams _response = new ProvisionFetcherRetrieveResponseParams();

            _response.result = result;

            _response.response = response;

            org.chromium.mojo.bindings.ServiceMessage _message = _response.serializeWithHeader(mCore, new org.chromium.mojo.bindings.MessageHeader(RETRIEVE_ORDINAL, org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG, mRequestId));
            mMessageReceiver.accept(_message);
        }
    }


}
