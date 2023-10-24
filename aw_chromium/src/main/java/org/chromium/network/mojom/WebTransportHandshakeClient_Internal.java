// WebTransportHandshakeClient_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/web_transport.mojom
//

package org.chromium.network.mojom;

class WebTransportHandshakeClient_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<WebTransportHandshakeClient, WebTransportHandshakeClient.Proxy> MANAGER = new org.chromium.mojo.bindings.Interface.Manager<WebTransportHandshakeClient, WebTransportHandshakeClient.Proxy>() {

        @Override
        public String getName() {
            return "network.mojom.WebTransportHandshakeClient";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, WebTransportHandshakeClient impl) {
            return new Stub(core, impl);
        }

        @Override
        public WebTransportHandshakeClient[] buildArray(int size) {
            return new WebTransportHandshakeClient[size];
        }
    };


    private static final int ON_CONNECTION_ESTABLISHED_ORDINAL = 0;

    private static final int ON_HANDSHAKE_FAILED_ORDINAL = 1;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements WebTransportHandshakeClient.Proxy {

        Proxy(org.chromium.mojo.system.Core core, org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void onConnectionEstablished(WebTransport transport, org.chromium.mojo.bindings.InterfaceRequest<WebTransportClient> client, HttpResponseHeaders responseHeaders) {

            WebTransportHandshakeClientOnConnectionEstablishedParams _message = new WebTransportHandshakeClientOnConnectionEstablishedParams();

            _message.transport = transport;

            _message.client = client;

            _message.responseHeaders = responseHeaders;


            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(ON_CONNECTION_ESTABLISHED_ORDINAL)));

        }


        @Override
        public void onHandshakeFailed(WebTransportError error) {

            WebTransportHandshakeClientOnHandshakeFailedParams _message = new WebTransportHandshakeClientOnHandshakeFailedParams();

            _message.error = error;


            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(ON_HANDSHAKE_FAILED_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<WebTransportHandshakeClient> {

        Stub(org.chromium.mojo.system.Core core, WebTransportHandshakeClient impl) {
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
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(WebTransportHandshakeClient_Internal.MANAGER, messageWithHeader);


                    case ON_CONNECTION_ESTABLISHED_ORDINAL: {

                        WebTransportHandshakeClientOnConnectionEstablishedParams data = WebTransportHandshakeClientOnConnectionEstablishedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onConnectionEstablished(data.transport, data.client, data.responseHeaders);
                        return true;
                    }


                    case ON_HANDSHAKE_FAILED_ORDINAL: {

                        WebTransportHandshakeClientOnHandshakeFailedParams data = WebTransportHandshakeClientOnHandshakeFailedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onHandshakeFailed(data.error);
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
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(getCore(), WebTransportHandshakeClient_Internal.MANAGER, messageWithHeader, receiver);


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e);
                return false;
            }
        }
    }


    static final class WebTransportHandshakeClientOnConnectionEstablishedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public WebTransport transport;
        public org.chromium.mojo.bindings.InterfaceRequest<WebTransportClient> client;
        public HttpResponseHeaders responseHeaders;

        private WebTransportHandshakeClientOnConnectionEstablishedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public WebTransportHandshakeClientOnConnectionEstablishedParams() {
            this(0);
        }

        public static WebTransportHandshakeClientOnConnectionEstablishedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static WebTransportHandshakeClientOnConnectionEstablishedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static WebTransportHandshakeClientOnConnectionEstablishedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            WebTransportHandshakeClientOnConnectionEstablishedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new WebTransportHandshakeClientOnConnectionEstablishedParams(elementsOrVersion);
                {

                    result.transport = decoder0.readServiceInterface(8, false, WebTransport.MANAGER);
                }
                {

                    result.client = decoder0.readInterfaceRequest(16, false);
                }
                {

                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                    result.responseHeaders = HttpResponseHeaders.decode(decoder1);
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

            encoder0.encode(this.transport, 8, false, WebTransport.MANAGER);

            encoder0.encode(this.client, 16, false);

            encoder0.encode(this.responseHeaders, 24, false);
        }
    }


    static final class WebTransportHandshakeClientOnHandshakeFailedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public WebTransportError error;

        private WebTransportHandshakeClientOnHandshakeFailedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public WebTransportHandshakeClientOnHandshakeFailedParams() {
            this(0);
        }

        public static WebTransportHandshakeClientOnHandshakeFailedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static WebTransportHandshakeClientOnHandshakeFailedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static WebTransportHandshakeClientOnHandshakeFailedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            WebTransportHandshakeClientOnHandshakeFailedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new WebTransportHandshakeClientOnHandshakeFailedParams(elementsOrVersion);
                {

                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, true);
                    result.error = WebTransportError.decode(decoder1);
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

            encoder0.encode(this.error, 8, true);
        }
    }


}
