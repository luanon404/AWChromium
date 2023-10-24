// ContentDecryptionModuleClient_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/content_decryption_module.mojom
//

package org.chromium.media.mojom;

class ContentDecryptionModuleClient_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<ContentDecryptionModuleClient, ContentDecryptionModuleClient.Proxy> MANAGER = new org.chromium.mojo.bindings.Interface.Manager<ContentDecryptionModuleClient, ContentDecryptionModuleClient.Proxy>() {

        @Override
        public String getName() {
            return "media.mojom.ContentDecryptionModuleClient";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, ContentDecryptionModuleClient impl) {
            return new Stub(core, impl);
        }

        @Override
        public ContentDecryptionModuleClient[] buildArray(int size) {
            return new ContentDecryptionModuleClient[size];
        }
    };


    private static final int ON_SESSION_MESSAGE_ORDINAL = 0;

    private static final int ON_SESSION_CLOSED_ORDINAL = 1;

    private static final int ON_SESSION_KEYS_CHANGE_ORDINAL = 2;

    private static final int ON_SESSION_EXPIRATION_UPDATE_ORDINAL = 3;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements ContentDecryptionModuleClient.Proxy {

        Proxy(org.chromium.mojo.system.Core core, org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void onSessionMessage(String sessionId, int messageType, byte[] message) {

            ContentDecryptionModuleClientOnSessionMessageParams _message = new ContentDecryptionModuleClientOnSessionMessageParams();

            _message.sessionId = sessionId;

            _message.messageType = messageType;

            _message.message = message;


            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(ON_SESSION_MESSAGE_ORDINAL)));

        }


        @Override
        public void onSessionClosed(String sessionId, int reason) {

            ContentDecryptionModuleClientOnSessionClosedParams _message = new ContentDecryptionModuleClientOnSessionClosedParams();

            _message.sessionId = sessionId;

            _message.reason = reason;


            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(ON_SESSION_CLOSED_ORDINAL)));

        }


        @Override
        public void onSessionKeysChange(String sessionId, boolean hasAdditionalUsableKey, CdmKeyInformation[] keysInfo) {

            ContentDecryptionModuleClientOnSessionKeysChangeParams _message = new ContentDecryptionModuleClientOnSessionKeysChangeParams();

            _message.sessionId = sessionId;

            _message.hasAdditionalUsableKey = hasAdditionalUsableKey;

            _message.keysInfo = keysInfo;


            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(ON_SESSION_KEYS_CHANGE_ORDINAL)));

        }


        @Override
        public void onSessionExpirationUpdate(String sessionId, double newExpiryTimeSec) {

            ContentDecryptionModuleClientOnSessionExpirationUpdateParams _message = new ContentDecryptionModuleClientOnSessionExpirationUpdateParams();

            _message.sessionId = sessionId;

            _message.newExpiryTimeSec = newExpiryTimeSec;


            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(ON_SESSION_EXPIRATION_UPDATE_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<ContentDecryptionModuleClient> {

        Stub(org.chromium.mojo.system.Core core, ContentDecryptionModuleClient impl) {
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
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(ContentDecryptionModuleClient_Internal.MANAGER, messageWithHeader);


                    case ON_SESSION_MESSAGE_ORDINAL: {

                        ContentDecryptionModuleClientOnSessionMessageParams data = ContentDecryptionModuleClientOnSessionMessageParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onSessionMessage(data.sessionId, data.messageType, data.message);
                        return true;
                    }


                    case ON_SESSION_CLOSED_ORDINAL: {

                        ContentDecryptionModuleClientOnSessionClosedParams data = ContentDecryptionModuleClientOnSessionClosedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onSessionClosed(data.sessionId, data.reason);
                        return true;
                    }


                    case ON_SESSION_KEYS_CHANGE_ORDINAL: {

                        ContentDecryptionModuleClientOnSessionKeysChangeParams data = ContentDecryptionModuleClientOnSessionKeysChangeParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onSessionKeysChange(data.sessionId, data.hasAdditionalUsableKey, data.keysInfo);
                        return true;
                    }


                    case ON_SESSION_EXPIRATION_UPDATE_ORDINAL: {

                        ContentDecryptionModuleClientOnSessionExpirationUpdateParams data = ContentDecryptionModuleClientOnSessionExpirationUpdateParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onSessionExpirationUpdate(data.sessionId, data.newExpiryTimeSec);
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
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(getCore(), ContentDecryptionModuleClient_Internal.MANAGER, messageWithHeader, receiver);


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e);
                return false;
            }
        }
    }


    static final class ContentDecryptionModuleClientOnSessionMessageParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public String sessionId;
        public int messageType;
        public byte[] message;

        private ContentDecryptionModuleClientOnSessionMessageParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ContentDecryptionModuleClientOnSessionMessageParams() {
            this(0);
        }

        public static ContentDecryptionModuleClientOnSessionMessageParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ContentDecryptionModuleClientOnSessionMessageParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ContentDecryptionModuleClientOnSessionMessageParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ContentDecryptionModuleClientOnSessionMessageParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ContentDecryptionModuleClientOnSessionMessageParams(elementsOrVersion);
                {

                    result.sessionId = decoder0.readString(8, false);
                }
                {

                    result.messageType = decoder0.readInt(16);
                    CdmMessageType.validate(result.messageType);
                    result.messageType = CdmMessageType.toKnownValue(result.messageType);
                }
                {

                    result.message = decoder0.readBytes(24, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
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

            encoder0.encode(this.sessionId, 8, false);

            encoder0.encode(this.messageType, 16);

            encoder0.encode(this.message, 24, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
        }
    }


    static final class ContentDecryptionModuleClientOnSessionClosedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public String sessionId;
        public int reason;

        private ContentDecryptionModuleClientOnSessionClosedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ContentDecryptionModuleClientOnSessionClosedParams() {
            this(0);
        }

        public static ContentDecryptionModuleClientOnSessionClosedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ContentDecryptionModuleClientOnSessionClosedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ContentDecryptionModuleClientOnSessionClosedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ContentDecryptionModuleClientOnSessionClosedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ContentDecryptionModuleClientOnSessionClosedParams(elementsOrVersion);
                {

                    result.sessionId = decoder0.readString(8, false);
                }
                {

                    result.reason = decoder0.readInt(16);
                    CdmSessionClosedReason.validate(result.reason);
                    result.reason = CdmSessionClosedReason.toKnownValue(result.reason);
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

            encoder0.encode(this.sessionId, 8, false);

            encoder0.encode(this.reason, 16);
        }
    }


    static final class ContentDecryptionModuleClientOnSessionKeysChangeParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public String sessionId;
        public boolean hasAdditionalUsableKey;
        public CdmKeyInformation[] keysInfo;

        private ContentDecryptionModuleClientOnSessionKeysChangeParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ContentDecryptionModuleClientOnSessionKeysChangeParams() {
            this(0);
        }

        public static ContentDecryptionModuleClientOnSessionKeysChangeParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ContentDecryptionModuleClientOnSessionKeysChangeParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ContentDecryptionModuleClientOnSessionKeysChangeParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ContentDecryptionModuleClientOnSessionKeysChangeParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ContentDecryptionModuleClientOnSessionKeysChangeParams(elementsOrVersion);
                {

                    result.sessionId = decoder0.readString(8, false);
                }
                {

                    result.hasAdditionalUsableKey = decoder0.readBoolean(16, 0);
                }
                {

                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                    {
                        org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        result.keysInfo = new CdmKeyInformation[si1.elementsOrVersion];
                        for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {

                            org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                            result.keysInfo[i1] = CdmKeyInformation.decode(decoder2);
                        }
                    }
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

            encoder0.encode(this.sessionId, 8, false);

            encoder0.encode(this.hasAdditionalUsableKey, 16, 0);

            if (this.keysInfo == null) {
                encoder0.encodeNullPointer(24, false);
            } else {
                org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.keysInfo.length, 24, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i0 = 0; i0 < this.keysInfo.length; ++i0) {

                    encoder1.encode(this.keysInfo[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                }
            }
        }
    }


    static final class ContentDecryptionModuleClientOnSessionExpirationUpdateParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public String sessionId;
        public double newExpiryTimeSec;

        private ContentDecryptionModuleClientOnSessionExpirationUpdateParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public ContentDecryptionModuleClientOnSessionExpirationUpdateParams() {
            this(0);
        }

        public static ContentDecryptionModuleClientOnSessionExpirationUpdateParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static ContentDecryptionModuleClientOnSessionExpirationUpdateParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static ContentDecryptionModuleClientOnSessionExpirationUpdateParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            ContentDecryptionModuleClientOnSessionExpirationUpdateParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new ContentDecryptionModuleClientOnSessionExpirationUpdateParams(elementsOrVersion);
                {

                    result.sessionId = decoder0.readString(8, false);
                }
                {

                    result.newExpiryTimeSec = decoder0.readDouble(16);
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

            encoder0.encode(this.sessionId, 8, false);

            encoder0.encode(this.newExpiryTimeSec, 16);
        }
    }


}
