// CookieDeprecationLabelDocumentService_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/cookie_deprecation_label/cookie_deprecation_label.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


class CookieDeprecationLabelDocumentService_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<CookieDeprecationLabelDocumentService, CookieDeprecationLabelDocumentService.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<CookieDeprecationLabelDocumentService, CookieDeprecationLabelDocumentService.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.CookieDeprecationLabelDocumentService";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, CookieDeprecationLabelDocumentService impl) {
            return new Stub(core, impl);
        }

        @Override
        public CookieDeprecationLabelDocumentService[] buildArray(int size) {
          return new CookieDeprecationLabelDocumentService[size];
        }
    };


    private static final int GET_VALUE_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements CookieDeprecationLabelDocumentService.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void getValue(

GetValue_Response callback) {

            CookieDeprecationLabelDocumentServiceGetValueParams _message = new CookieDeprecationLabelDocumentServiceGetValueParams();


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_VALUE_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new CookieDeprecationLabelDocumentServiceGetValueResponseParamsForwardToCallback(callback));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<CookieDeprecationLabelDocumentService> {

        Stub(org.chromium.mojo.system.Core core, CookieDeprecationLabelDocumentService impl) {
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
                                CookieDeprecationLabelDocumentService_Internal.MANAGER, messageWithHeader);




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
                                getCore(), CookieDeprecationLabelDocumentService_Internal.MANAGER, messageWithHeader, receiver);







                    case GET_VALUE_ORDINAL: {

                        CookieDeprecationLabelDocumentServiceGetValueParams.deserialize(messageWithHeader.getPayload());

                        getImpl().getValue(new CookieDeprecationLabelDocumentServiceGetValueResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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


    
    static final class CookieDeprecationLabelDocumentServiceGetValueParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private CookieDeprecationLabelDocumentServiceGetValueParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public CookieDeprecationLabelDocumentServiceGetValueParams() {
            this(0);
        }

        public static CookieDeprecationLabelDocumentServiceGetValueParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static CookieDeprecationLabelDocumentServiceGetValueParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static CookieDeprecationLabelDocumentServiceGetValueParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            CookieDeprecationLabelDocumentServiceGetValueParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new CookieDeprecationLabelDocumentServiceGetValueParams(elementsOrVersion);

            } finally {
                decoder0.decreaseStackDepth();
            }
            return result;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }



    
    static final class CookieDeprecationLabelDocumentServiceGetValueResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public String value;

        private CookieDeprecationLabelDocumentServiceGetValueResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public CookieDeprecationLabelDocumentServiceGetValueResponseParams() {
            this(0);
        }

        public static CookieDeprecationLabelDocumentServiceGetValueResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static CookieDeprecationLabelDocumentServiceGetValueResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static CookieDeprecationLabelDocumentServiceGetValueResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            CookieDeprecationLabelDocumentServiceGetValueResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new CookieDeprecationLabelDocumentServiceGetValueResponseParams(elementsOrVersion);
                    {
                        
                    result.value = decoder0.readString(8, true);
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
            
            encoder0.encode(this.value, 8, true);
        }
    }

    static class CookieDeprecationLabelDocumentServiceGetValueResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final CookieDeprecationLabelDocumentService.GetValue_Response mCallback;

        CookieDeprecationLabelDocumentServiceGetValueResponseParamsForwardToCallback(CookieDeprecationLabelDocumentService.GetValue_Response callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(GET_VALUE_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                CookieDeprecationLabelDocumentServiceGetValueResponseParams response = CookieDeprecationLabelDocumentServiceGetValueResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.value);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class CookieDeprecationLabelDocumentServiceGetValueResponseParamsProxyToResponder implements CookieDeprecationLabelDocumentService.GetValue_Response {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        CookieDeprecationLabelDocumentServiceGetValueResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(String value) {
            CookieDeprecationLabelDocumentServiceGetValueResponseParams _response = new CookieDeprecationLabelDocumentServiceGetValueResponseParams();

            _response.value = value;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    GET_VALUE_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



}
