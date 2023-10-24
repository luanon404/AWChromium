// SharedWorkerConnector_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/worker/shared_worker_connector.mojom
//

package org.chromium.blink.mojom;


class SharedWorkerConnector_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<SharedWorkerConnector, SharedWorkerConnector.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<SharedWorkerConnector, SharedWorkerConnector.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.SharedWorkerConnector";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, SharedWorkerConnector impl) {
            return new Stub(core, impl);
        }

        @Override
        public SharedWorkerConnector[] buildArray(int size) {
          return new SharedWorkerConnector[size];
        }
    };


    private static final int CONNECT_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements SharedWorkerConnector.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void connect(
SharedWorkerInfo info, SharedWorkerClient client, int creationContextType, MessagePortDescriptor messagePort, BlobUrlToken blobUrlToken, long clientUkmSourceId) {

            SharedWorkerConnectorConnectParams _message = new SharedWorkerConnectorConnectParams();

            _message.info = info;

            _message.client = client;

            _message.creationContextType = creationContextType;

            _message.messagePort = messagePort;

            _message.blobUrlToken = blobUrlToken;

            _message.clientUkmSourceId = clientUkmSourceId;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(CONNECT_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<SharedWorkerConnector> {

        Stub(org.chromium.mojo.system.Core core, SharedWorkerConnector impl) {
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
                                SharedWorkerConnector_Internal.MANAGER, messageWithHeader);





                    case CONNECT_ORDINAL: {

                        SharedWorkerConnectorConnectParams data =
                                SharedWorkerConnectorConnectParams.deserialize(messageWithHeader.getPayload());

                        getImpl().connect(data.info, data.client, data.creationContextType, data.messagePort, data.blobUrlToken, data.clientUkmSourceId);
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
                                getCore(), SharedWorkerConnector_Internal.MANAGER, messageWithHeader, receiver);




                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e);
                return false;
            }
        }
    }


    
    static final class SharedWorkerConnectorConnectParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 56;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(56, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public SharedWorkerInfo info;
        public SharedWorkerClient client;
        public int creationContextType;
        public MessagePortDescriptor messagePort;
        public BlobUrlToken blobUrlToken;
        public long clientUkmSourceId;

        private SharedWorkerConnectorConnectParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public SharedWorkerConnectorConnectParams() {
            this(0);
        }

        public static SharedWorkerConnectorConnectParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SharedWorkerConnectorConnectParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static SharedWorkerConnectorConnectParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SharedWorkerConnectorConnectParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new SharedWorkerConnectorConnectParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.info = SharedWorkerInfo.decode(decoder1);
                    }
                    {
                        
                    result.client = decoder0.readServiceInterface(16, false, SharedWorkerClient.MANAGER);
                    }
                    {
                        
                    result.creationContextType = decoder0.readInt(24);
                        SharedWorkerCreationContextType.validate(result.creationContextType);
                        result.creationContextType = SharedWorkerCreationContextType.toKnownValue(result.creationContextType);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                    result.messagePort = MessagePortDescriptor.decode(decoder1);
                    }
                    {
                        
                    result.blobUrlToken = decoder0.readServiceInterface(40, true, BlobUrlToken.MANAGER);
                    }
                    {
                        
                    result.clientUkmSourceId = decoder0.readLong(48);
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
            
            encoder0.encode(this.info, 8, false);
            
            encoder0.encode(this.client, 16, false, SharedWorkerClient.MANAGER);
            
            encoder0.encode(this.creationContextType, 24);
            
            encoder0.encode(this.messagePort, 32, false);
            
            encoder0.encode(this.blobUrlToken, 40, true, BlobUrlToken.MANAGER);
            
            encoder0.encode(this.clientUkmSourceId, 48);
        }
    }



}
