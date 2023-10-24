// ProxyResolverFactory_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/proxy_resolver/public/mojom/proxy_resolver.mojom
//

package org.chromium.proxy_resolver.mojom;

class ProxyResolverFactory_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<ProxyResolverFactory, ProxyResolverFactory.Proxy> MANAGER = new org.chromium.mojo.bindings.Interface.Manager<ProxyResolverFactory, ProxyResolverFactory.Proxy>() {

        @Override
        public String getName() {
            return "proxy_resolver.mojom.ProxyResolverFactory";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, ProxyResolverFactory impl) {
            return new Stub(core, impl);
        }

        @Override
        public ProxyResolverFactory[] buildArray(int size) {
            return new ProxyResolverFactory[size];
        }
    };


    private static final int CREATE_RESOLVER_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements ProxyResolverFactory.Proxy {

        Proxy(org.chromium.mojo.system.Core core, org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void createResolver(String pacScript, org.chromium.mojo.bindings.InterfaceRequest<ProxyResolver> receiver, ProxyResolverFactoryRequestClient client) {

            ProxyResolverFactoryCreateResolverParams _message = new ProxyResolverFactoryCreateResolverParams();

            _message.pacScript = pacScript;

            _message.receiver = receiver;

            _message.client = client;


            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(CREATE_RESOLVER_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<ProxyResolverFactory> {

        Stub(org.chromium.mojo.system.Core core, ProxyResolverFactory impl) {
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
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(ProxyResolverFactory_Internal.MANAGER, messageWithHeader);


                    case CREATE_RESOLVER_ORDINAL: {

                        ProxyResolverFactoryCreateResolverParams data = ProxyResolverFactoryCreateResolverParams.deserialize(messageWithHeader.getPayload());

                        getImpl().createResolver(data.pacScript, data.receiver, data.client);
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
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(getCore(), ProxyResolverFactory_Internal.MANAGER, messageWithHeader, receiver);


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e);
                return false;
            }
        }
    }


    static final class ProxyResolverFactoryCreateResolverParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public String pacScript;
        public org.chromium.mojo.bindings.InterfaceRequest<ProxyResolver> receiver;
        public ProxyResolverFactoryRequestClient client;

        private ProxyResolverFactoryCreateResolverParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ProxyResolverFactoryCreateResolverParams() {
            this(0);
        }

        public static ProxyResolverFactoryCreateResolverParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ProxyResolverFactoryCreateResolverParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ProxyResolverFactoryCreateResolverParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ProxyResolverFactoryCreateResolverParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ProxyResolverFactoryCreateResolverParams(elementsOrVersion);
                {

                    result.pacScript = decoder0.readString(8, false);
                }
                {

                    result.receiver = decoder0.readInterfaceRequest(16, false);
                }
                {

                    result.client = decoder0.readServiceInterface(20, false, ProxyResolverFactoryRequestClient.MANAGER);
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

            encoder0.encode(this.pacScript, 8, false);

            encoder0.encode(this.receiver, 16, false);

            encoder0.encode(this.client, 20, false, ProxyResolverFactoryRequestClient.MANAGER);
        }
    }


}
