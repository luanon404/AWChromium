// UrlLoader_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/url_loader.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;


class UrlLoader_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<UrlLoader, UrlLoader.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<UrlLoader, UrlLoader.Proxy>() {

        @Override
        public String getName() {
            return "network.mojom.URLLoader";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, UrlLoader impl) {
            return new Stub(core, impl);
        }

        @Override
        public UrlLoader[] buildArray(int size) {
          return new UrlLoader[size];
        }
    };


    private static final int FOLLOW_REDIRECT_ORDINAL = 0;

    private static final int SET_PRIORITY_ORDINAL = 1;

    private static final int PAUSE_READING_BODY_FROM_NET_ORDINAL = 2;

    private static final int RESUME_READING_BODY_FROM_NET_ORDINAL = 3;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements UrlLoader.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void followRedirect(
String[] removedHeaders, HttpRequestHeaders modifiedHeaders, HttpRequestHeaders modifiedCorsExemptHeaders, org.chromium.url.mojom.Url newUrl) {

            UrlLoaderFollowRedirectParams _message = new UrlLoaderFollowRedirectParams();

            _message.removedHeaders = removedHeaders;

            _message.modifiedHeaders = modifiedHeaders;

            _message.modifiedCorsExemptHeaders = modifiedCorsExemptHeaders;

            _message.newUrl = newUrl;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(FOLLOW_REDIRECT_ORDINAL)));

        }


        @Override
        public void setPriority(
int priority, int intraPriorityValue) {

            UrlLoaderSetPriorityParams _message = new UrlLoaderSetPriorityParams();

            _message.priority = priority;

            _message.intraPriorityValue = intraPriorityValue;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(SET_PRIORITY_ORDINAL)));

        }


        @Override
        public void pauseReadingBodyFromNet(
) {

            UrlLoaderPauseReadingBodyFromNetParams _message = new UrlLoaderPauseReadingBodyFromNetParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(PAUSE_READING_BODY_FROM_NET_ORDINAL)));

        }


        @Override
        public void resumeReadingBodyFromNet(
) {

            UrlLoaderResumeReadingBodyFromNetParams _message = new UrlLoaderResumeReadingBodyFromNetParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(RESUME_READING_BODY_FROM_NET_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<UrlLoader> {

        Stub(org.chromium.mojo.system.Core core, UrlLoader impl) {
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
                                UrlLoader_Internal.MANAGER, messageWithHeader);





                    case FOLLOW_REDIRECT_ORDINAL: {

                        UrlLoaderFollowRedirectParams data =
                                UrlLoaderFollowRedirectParams.deserialize(messageWithHeader.getPayload());

                        getImpl().followRedirect(data.removedHeaders, data.modifiedHeaders, data.modifiedCorsExemptHeaders, data.newUrl);
                        return true;
                    }





                    case SET_PRIORITY_ORDINAL: {

                        UrlLoaderSetPriorityParams data =
                                UrlLoaderSetPriorityParams.deserialize(messageWithHeader.getPayload());

                        getImpl().setPriority(data.priority, data.intraPriorityValue);
                        return true;
                    }





                    case PAUSE_READING_BODY_FROM_NET_ORDINAL: {

                        UrlLoaderPauseReadingBodyFromNetParams.deserialize(messageWithHeader.getPayload());

                        getImpl().pauseReadingBodyFromNet();
                        return true;
                    }





                    case RESUME_READING_BODY_FROM_NET_ORDINAL: {

                        UrlLoaderResumeReadingBodyFromNetParams.deserialize(messageWithHeader.getPayload());

                        getImpl().resumeReadingBodyFromNet();
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
                                getCore(), UrlLoader_Internal.MANAGER, messageWithHeader, receiver);










                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class UrlLoaderFollowRedirectParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 40;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public String[] removedHeaders;
        public HttpRequestHeaders modifiedHeaders;
        public HttpRequestHeaders modifiedCorsExemptHeaders;
        public org.chromium.url.mojom.Url newUrl;

        private UrlLoaderFollowRedirectParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public UrlLoaderFollowRedirectParams() {
            this(0);
        }

        public static UrlLoaderFollowRedirectParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static UrlLoaderFollowRedirectParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static UrlLoaderFollowRedirectParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            UrlLoaderFollowRedirectParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new UrlLoaderFollowRedirectParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    {
                        org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        result.removedHeaders = new String[si1.elementsOrVersion];
                        for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                            
                            result.removedHeaders[i1] = decoder1.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        }
                    }
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.modifiedHeaders = HttpRequestHeaders.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                    result.modifiedCorsExemptHeaders = HttpRequestHeaders.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, true);
                    result.newUrl = org.chromium.url.mojom.Url.decode(decoder1);
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
            
            if (this.removedHeaders == null) {
                encoder0.encodeNullPointer(8, false);
            } else {
                org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.removedHeaders.length, 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i0 = 0; i0 < this.removedHeaders.length; ++i0) {
                    
                    encoder1.encode(this.removedHeaders[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                }
            }
            
            encoder0.encode(this.modifiedHeaders, 16, false);
            
            encoder0.encode(this.modifiedCorsExemptHeaders, 24, false);
            
            encoder0.encode(this.newUrl, 32, true);
        }
    }



    
    static final class UrlLoaderSetPriorityParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int priority;
        public int intraPriorityValue;

        private UrlLoaderSetPriorityParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public UrlLoaderSetPriorityParams() {
            this(0);
        }

        public static UrlLoaderSetPriorityParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static UrlLoaderSetPriorityParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static UrlLoaderSetPriorityParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            UrlLoaderSetPriorityParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new UrlLoaderSetPriorityParams(elementsOrVersion);
                    {
                        
                    result.priority = decoder0.readInt(8);
                        RequestPriority.validate(result.priority);
                        result.priority = RequestPriority.toKnownValue(result.priority);
                    }
                    {
                        
                    result.intraPriorityValue = decoder0.readInt(12);
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
            
            encoder0.encode(this.priority, 8);
            
            encoder0.encode(this.intraPriorityValue, 12);
        }
    }



    
    static final class UrlLoaderPauseReadingBodyFromNetParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private UrlLoaderPauseReadingBodyFromNetParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public UrlLoaderPauseReadingBodyFromNetParams() {
            this(0);
        }

        public static UrlLoaderPauseReadingBodyFromNetParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static UrlLoaderPauseReadingBodyFromNetParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static UrlLoaderPauseReadingBodyFromNetParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            UrlLoaderPauseReadingBodyFromNetParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new UrlLoaderPauseReadingBodyFromNetParams(elementsOrVersion);

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



    
    static final class UrlLoaderResumeReadingBodyFromNetParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private UrlLoaderResumeReadingBodyFromNetParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public UrlLoaderResumeReadingBodyFromNetParams() {
            this(0);
        }

        public static UrlLoaderResumeReadingBodyFromNetParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static UrlLoaderResumeReadingBodyFromNetParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static UrlLoaderResumeReadingBodyFromNetParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            UrlLoaderResumeReadingBodyFromNetParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new UrlLoaderResumeReadingBodyFromNetParams(elementsOrVersion);

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



}
