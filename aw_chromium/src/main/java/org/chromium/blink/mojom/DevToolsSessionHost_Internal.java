// DevToolsSessionHost_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/devtools/devtools_agent.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


class DevToolsSessionHost_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<DevToolsSessionHost, DevToolsSessionHost.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<DevToolsSessionHost, DevToolsSessionHost.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.DevToolsSessionHost";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, DevToolsSessionHost impl) {
            return new Stub(core, impl);
        }

        @Override
        public DevToolsSessionHost[] buildArray(int size) {
          return new DevToolsSessionHost[size];
        }
    };


    private static final int DISPATCH_PROTOCOL_RESPONSE_ORDINAL = 0;

    private static final int DISPATCH_PROTOCOL_NOTIFICATION_ORDINAL = 1;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements DevToolsSessionHost.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void dispatchProtocolResponse(
DevToolsMessage message, int callId, DevToolsSessionState updates) {

            DevToolsSessionHostDispatchProtocolResponseParams _message = new DevToolsSessionHostDispatchProtocolResponseParams();

            _message.message = message;

            _message.callId = callId;

            _message.updates = updates;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(DISPATCH_PROTOCOL_RESPONSE_ORDINAL)));

        }


        @Override
        public void dispatchProtocolNotification(
DevToolsMessage message, DevToolsSessionState updates) {

            DevToolsSessionHostDispatchProtocolNotificationParams _message = new DevToolsSessionHostDispatchProtocolNotificationParams();

            _message.message = message;

            _message.updates = updates;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(DISPATCH_PROTOCOL_NOTIFICATION_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<DevToolsSessionHost> {

        Stub(org.chromium.mojo.system.Core core, DevToolsSessionHost impl) {
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
                                DevToolsSessionHost_Internal.MANAGER, messageWithHeader);





                    case DISPATCH_PROTOCOL_RESPONSE_ORDINAL: {

                        DevToolsSessionHostDispatchProtocolResponseParams data =
                                DevToolsSessionHostDispatchProtocolResponseParams.deserialize(messageWithHeader.getPayload());

                        getImpl().dispatchProtocolResponse(data.message, data.callId, data.updates);
                        return true;
                    }





                    case DISPATCH_PROTOCOL_NOTIFICATION_ORDINAL: {

                        DevToolsSessionHostDispatchProtocolNotificationParams data =
                                DevToolsSessionHostDispatchProtocolNotificationParams.deserialize(messageWithHeader.getPayload());

                        getImpl().dispatchProtocolNotification(data.message, data.updates);
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
                                getCore(), DevToolsSessionHost_Internal.MANAGER, messageWithHeader, receiver);






                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class DevToolsSessionHostDispatchProtocolResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public DevToolsMessage message;
        public int callId;
        public DevToolsSessionState updates;

        private DevToolsSessionHostDispatchProtocolResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public DevToolsSessionHostDispatchProtocolResponseParams() {
            this(0);
        }

        public static DevToolsSessionHostDispatchProtocolResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static DevToolsSessionHostDispatchProtocolResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static DevToolsSessionHostDispatchProtocolResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            DevToolsSessionHostDispatchProtocolResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new DevToolsSessionHostDispatchProtocolResponseParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.message = DevToolsMessage.decode(decoder1);
                    }
                    {
                        
                    result.callId = decoder0.readInt(16);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, true);
                    result.updates = DevToolsSessionState.decode(decoder1);
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
            
            encoder0.encode(this.message, 8, false);
            
            encoder0.encode(this.callId, 16);
            
            encoder0.encode(this.updates, 24, true);
        }
    }



    
    static final class DevToolsSessionHostDispatchProtocolNotificationParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public DevToolsMessage message;
        public DevToolsSessionState updates;

        private DevToolsSessionHostDispatchProtocolNotificationParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public DevToolsSessionHostDispatchProtocolNotificationParams() {
            this(0);
        }

        public static DevToolsSessionHostDispatchProtocolNotificationParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static DevToolsSessionHostDispatchProtocolNotificationParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static DevToolsSessionHostDispatchProtocolNotificationParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            DevToolsSessionHostDispatchProtocolNotificationParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new DevToolsSessionHostDispatchProtocolNotificationParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.message = DevToolsMessage.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, true);
                    result.updates = DevToolsSessionState.decode(decoder1);
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
            
            encoder0.encode(this.message, 8, false);
            
            encoder0.encode(this.updates, 16, true);
        }
    }



}
