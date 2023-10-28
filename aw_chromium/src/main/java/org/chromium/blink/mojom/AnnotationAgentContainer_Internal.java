// AnnotationAgentContainer_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/annotation/annotation.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


class AnnotationAgentContainer_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<AnnotationAgentContainer, AnnotationAgentContainer.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<AnnotationAgentContainer, AnnotationAgentContainer.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.AnnotationAgentContainer";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, AnnotationAgentContainer impl) {
            return new Stub(core, impl);
        }

        @Override
        public AnnotationAgentContainer[] buildArray(int size) {
          return new AnnotationAgentContainer[size];
        }
    };


    private static final int CREATE_AGENT_ORDINAL = 0;

    private static final int CREATE_AGENT_FROM_SELECTION_ORDINAL = 1;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements AnnotationAgentContainer.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void createAgent(
AnnotationAgentHost hostRemote, org.chromium.mojo.bindings.InterfaceRequest<AnnotationAgent> agentReceiver, int type, String serializedSelector) {

            AnnotationAgentContainerCreateAgentParams _message = new AnnotationAgentContainerCreateAgentParams();

            _message.hostRemote = hostRemote;

            _message.agentReceiver = agentReceiver;

            _message.type = type;

            _message.serializedSelector = serializedSelector;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(CREATE_AGENT_ORDINAL)));

        }


        @Override
        public void createAgentFromSelection(
int type, 
CreateAgentFromSelection_Response callback) {

            AnnotationAgentContainerCreateAgentFromSelectionParams _message = new AnnotationAgentContainerCreateAgentFromSelectionParams();

            _message.type = type;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    CREATE_AGENT_FROM_SELECTION_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new AnnotationAgentContainerCreateAgentFromSelectionResponseParamsForwardToCallback(callback));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<AnnotationAgentContainer> {

        Stub(org.chromium.mojo.system.Core core, AnnotationAgentContainer impl) {
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
                                AnnotationAgentContainer_Internal.MANAGER, messageWithHeader);





                    case CREATE_AGENT_ORDINAL: {

                        AnnotationAgentContainerCreateAgentParams data =
                                AnnotationAgentContainerCreateAgentParams.deserialize(messageWithHeader.getPayload());

                        getImpl().createAgent(data.hostRemote, data.agentReceiver, data.type, data.serializedSelector);
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
                                getCore(), AnnotationAgentContainer_Internal.MANAGER, messageWithHeader, receiver);









                    case CREATE_AGENT_FROM_SELECTION_ORDINAL: {

                        AnnotationAgentContainerCreateAgentFromSelectionParams data =
                                AnnotationAgentContainerCreateAgentFromSelectionParams.deserialize(messageWithHeader.getPayload());

                        getImpl().createAgentFromSelection(data.type, new AnnotationAgentContainerCreateAgentFromSelectionResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    }


    
    static final class AnnotationAgentContainerCreateAgentParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public AnnotationAgentHost hostRemote;
        public org.chromium.mojo.bindings.InterfaceRequest<AnnotationAgent> agentReceiver;
        public int type;
        public String serializedSelector;

        private AnnotationAgentContainerCreateAgentParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public AnnotationAgentContainerCreateAgentParams() {
            this(0);
        }

        public static AnnotationAgentContainerCreateAgentParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AnnotationAgentContainerCreateAgentParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static AnnotationAgentContainerCreateAgentParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AnnotationAgentContainerCreateAgentParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new AnnotationAgentContainerCreateAgentParams(elementsOrVersion);
                    {
                        
                    result.hostRemote = decoder0.readServiceInterface(8, false, AnnotationAgentHost.MANAGER);
                    }
                    {
                        
                    result.agentReceiver = decoder0.readInterfaceRequest(16, false);
                    }
                    {
                        
                    result.type = decoder0.readInt(20);
                        AnnotationType.validate(result.type);
                        result.type = AnnotationType.toKnownValue(result.type);
                    }
                    {
                        
                    result.serializedSelector = decoder0.readString(24, false);
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
            
            encoder0.encode(this.hostRemote, 8, false, AnnotationAgentHost.MANAGER);
            
            encoder0.encode(this.agentReceiver, 16, false);
            
            encoder0.encode(this.type, 20);
            
            encoder0.encode(this.serializedSelector, 24, false);
        }
    }



    
    static final class AnnotationAgentContainerCreateAgentFromSelectionParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int type;

        private AnnotationAgentContainerCreateAgentFromSelectionParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public AnnotationAgentContainerCreateAgentFromSelectionParams() {
            this(0);
        }

        public static AnnotationAgentContainerCreateAgentFromSelectionParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AnnotationAgentContainerCreateAgentFromSelectionParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static AnnotationAgentContainerCreateAgentFromSelectionParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AnnotationAgentContainerCreateAgentFromSelectionParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new AnnotationAgentContainerCreateAgentFromSelectionParams(elementsOrVersion);
                    {
                        
                    result.type = decoder0.readInt(8);
                        AnnotationType.validate(result.type);
                        result.type = AnnotationType.toKnownValue(result.type);
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
            
            encoder0.encode(this.type, 8);
        }
    }



    
    static final class AnnotationAgentContainerCreateAgentFromSelectionResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public SelectorCreationResult result;
        public int error;
        public int readyStatus;

        private AnnotationAgentContainerCreateAgentFromSelectionResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public AnnotationAgentContainerCreateAgentFromSelectionResponseParams() {
            this(0);
        }

        public static AnnotationAgentContainerCreateAgentFromSelectionResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AnnotationAgentContainerCreateAgentFromSelectionResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static AnnotationAgentContainerCreateAgentFromSelectionResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AnnotationAgentContainerCreateAgentFromSelectionResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new AnnotationAgentContainerCreateAgentFromSelectionResponseParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, true);
                    result.result = SelectorCreationResult.decode(decoder1);
                    }
                    {
                        
                    result.error = decoder0.readInt(16);
                        LinkGenerationError.validate(result.error);
                        result.error = LinkGenerationError.toKnownValue(result.error);
                    }
                    {
                        
                    result.readyStatus = decoder0.readInt(20);
                        LinkGenerationReadyStatus.validate(result.readyStatus);
                        result.readyStatus = LinkGenerationReadyStatus.toKnownValue(result.readyStatus);
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
            
            encoder0.encode(this.result, 8, true);
            
            encoder0.encode(this.error, 16);
            
            encoder0.encode(this.readyStatus, 20);
        }
    }

    static class AnnotationAgentContainerCreateAgentFromSelectionResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final AnnotationAgentContainer.CreateAgentFromSelection_Response mCallback;

        AnnotationAgentContainerCreateAgentFromSelectionResponseParamsForwardToCallback(AnnotationAgentContainer.CreateAgentFromSelection_Response callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(CREATE_AGENT_FROM_SELECTION_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                AnnotationAgentContainerCreateAgentFromSelectionResponseParams response = AnnotationAgentContainerCreateAgentFromSelectionResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.result, response.error, response.readyStatus);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class AnnotationAgentContainerCreateAgentFromSelectionResponseParamsProxyToResponder implements AnnotationAgentContainer.CreateAgentFromSelection_Response {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        AnnotationAgentContainerCreateAgentFromSelectionResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(SelectorCreationResult result, Integer error, Integer readyStatus) {
            AnnotationAgentContainerCreateAgentFromSelectionResponseParams _response = new AnnotationAgentContainerCreateAgentFromSelectionResponseParams();

            _response.result = result;

            _response.error = error;

            _response.readyStatus = readyStatus;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    CREATE_AGENT_FROM_SELECTION_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



}
