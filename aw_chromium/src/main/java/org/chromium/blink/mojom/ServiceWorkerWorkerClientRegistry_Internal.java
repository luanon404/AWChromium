// ServiceWorkerWorkerClientRegistry_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/service_worker/service_worker_worker_client_registry.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


class ServiceWorkerWorkerClientRegistry_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<ServiceWorkerWorkerClientRegistry, ServiceWorkerWorkerClientRegistry.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<ServiceWorkerWorkerClientRegistry, ServiceWorkerWorkerClientRegistry.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.ServiceWorkerWorkerClientRegistry";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, ServiceWorkerWorkerClientRegistry impl) {
            return new Stub(core, impl);
        }

        @Override
        public ServiceWorkerWorkerClientRegistry[] buildArray(int size) {
          return new ServiceWorkerWorkerClientRegistry[size];
        }
    };


    private static final int REGISTER_WORKER_CLIENT_ORDINAL = 0;

    private static final int CLONE_WORKER_CLIENT_REGISTRY_ORDINAL = 1;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements ServiceWorkerWorkerClientRegistry.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void registerWorkerClient(
ServiceWorkerWorkerClient client) {

            ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams _message = new ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams();

            _message.client = client;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(REGISTER_WORKER_CLIENT_ORDINAL)));

        }


        @Override
        public void cloneWorkerClientRegistry(
org.chromium.mojo.bindings.InterfaceRequest<ServiceWorkerWorkerClientRegistry> host) {

            ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams _message = new ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams();

            _message.host = host;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(CLONE_WORKER_CLIENT_REGISTRY_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<ServiceWorkerWorkerClientRegistry> {

        Stub(org.chromium.mojo.system.Core core, ServiceWorkerWorkerClientRegistry impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.NO_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                ServiceWorkerWorkerClientRegistry_Internal.MANAGER, messageWithHeader);





                    case REGISTER_WORKER_CLIENT_ORDINAL: {

                        ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams data =
                                ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams.deserialize(messageWithHeader.getPayload());

                        getImpl().registerWorkerClient(data.client);
                        return true;
                    }





                    case CLONE_WORKER_CLIENT_REGISTRY_ORDINAL: {

                        ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams data =
                                ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams.deserialize(messageWithHeader.getPayload());

                        getImpl().cloneWorkerClientRegistry(data.host);
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), ServiceWorkerWorkerClientRegistry_Internal.MANAGER, messageWithHeader, receiver);






                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public ServiceWorkerWorkerClient client;

        private ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams() {
            this(0);
        }

        public static ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams(elementsOrVersion);
                    {
                        
                    result.client = decoder0.readServiceInterface(8, false, ServiceWorkerWorkerClient.MANAGER);
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
            
            encoder0.encode(this.client, 8, false, ServiceWorkerWorkerClient.MANAGER);
        }
    }



    
    static final class ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.mojo.bindings.InterfaceRequest<ServiceWorkerWorkerClientRegistry> host;

        private ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams() {
            this(0);
        }

        public static ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams(elementsOrVersion);
                    {
                        
                    result.host = decoder0.readInterfaceRequest(8, false);
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
            
            encoder0.encode(this.host, 8, false);
        }
    }



}
