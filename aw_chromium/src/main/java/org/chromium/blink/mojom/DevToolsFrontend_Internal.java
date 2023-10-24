// DevToolsFrontend_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/devtools/devtools_frontend.mojom
//

package org.chromium.blink.mojom;


class DevToolsFrontend_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<DevToolsFrontend, DevToolsFrontend.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<DevToolsFrontend, DevToolsFrontend.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.DevToolsFrontend";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, DevToolsFrontend impl) {
            return new Stub(core, impl);
        }

        @Override
        public DevToolsFrontend[] buildArray(int size) {
          return new DevToolsFrontend[size];
        }
    };


    private static final int SETUP_DEV_TOOLS_FRONTEND_ORDINAL = 0;

    private static final int SETUP_DEV_TOOLS_EXTENSION_API_ORDINAL = 1;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements DevToolsFrontend.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void setupDevToolsFrontend(
String apiScript, org.chromium.mojo.bindings.AssociatedInterfaceNotSupported host) {

            DevToolsFrontendSetupDevToolsFrontendParams _message = new DevToolsFrontendSetupDevToolsFrontendParams();

            _message.apiScript = apiScript;

            _message.host = host;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(SETUP_DEV_TOOLS_FRONTEND_ORDINAL)));

        }


        @Override
        public void setupDevToolsExtensionApi(
String extensionApi) {

            DevToolsFrontendSetupDevToolsExtensionApiParams _message = new DevToolsFrontendSetupDevToolsExtensionApiParams();

            _message.extensionApi = extensionApi;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(SETUP_DEV_TOOLS_EXTENSION_API_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<DevToolsFrontend> {

        Stub(org.chromium.mojo.system.Core core, DevToolsFrontend impl) {
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
                                DevToolsFrontend_Internal.MANAGER, messageWithHeader);





                    case SETUP_DEV_TOOLS_FRONTEND_ORDINAL: {

                        DevToolsFrontendSetupDevToolsFrontendParams data =
                                DevToolsFrontendSetupDevToolsFrontendParams.deserialize(messageWithHeader.getPayload());

                        getImpl().setupDevToolsFrontend(data.apiScript, data.host);
                        return true;
                    }





                    case SETUP_DEV_TOOLS_EXTENSION_API_ORDINAL: {

                        DevToolsFrontendSetupDevToolsExtensionApiParams data =
                                DevToolsFrontendSetupDevToolsExtensionApiParams.deserialize(messageWithHeader.getPayload());

                        getImpl().setupDevToolsExtensionApi(data.extensionApi);
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
                                getCore(), DevToolsFrontend_Internal.MANAGER, messageWithHeader, receiver);






                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e);
                return false;
            }
        }
    }


    
    static final class DevToolsFrontendSetupDevToolsFrontendParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public String apiScript;
        public org.chromium.mojo.bindings.AssociatedInterfaceNotSupported host;

        private DevToolsFrontendSetupDevToolsFrontendParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public DevToolsFrontendSetupDevToolsFrontendParams() {
            this(0);
        }

        public static DevToolsFrontendSetupDevToolsFrontendParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static DevToolsFrontendSetupDevToolsFrontendParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static DevToolsFrontendSetupDevToolsFrontendParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            DevToolsFrontendSetupDevToolsFrontendParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new DevToolsFrontendSetupDevToolsFrontendParams(elementsOrVersion);
                    {
                        
                    result.apiScript = decoder0.readString(8, false);
                    }
                    {
                        
                    result.host = decoder0.readAssociatedServiceInterfaceNotSupported(16, false);
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
            
            encoder0.encode(this.apiScript, 8, false);
            
            encoder0.encode(this.host, 16, false);
        }
    }



    
    static final class DevToolsFrontendSetupDevToolsExtensionApiParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public String extensionApi;

        private DevToolsFrontendSetupDevToolsExtensionApiParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public DevToolsFrontendSetupDevToolsExtensionApiParams() {
            this(0);
        }

        public static DevToolsFrontendSetupDevToolsExtensionApiParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static DevToolsFrontendSetupDevToolsExtensionApiParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static DevToolsFrontendSetupDevToolsExtensionApiParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            DevToolsFrontendSetupDevToolsExtensionApiParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new DevToolsFrontendSetupDevToolsExtensionApiParams(elementsOrVersion);
                    {
                        
                    result.extensionApi = decoder0.readString(8, false);
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
            
            encoder0.encode(this.extensionApi, 8, false);
        }
    }



}
