// BackgroundFetchRegistrationObserver_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/background_fetch/background_fetch.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


class BackgroundFetchRegistrationObserver_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<BackgroundFetchRegistrationObserver, BackgroundFetchRegistrationObserver.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<BackgroundFetchRegistrationObserver, BackgroundFetchRegistrationObserver.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.BackgroundFetchRegistrationObserver";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, BackgroundFetchRegistrationObserver impl) {
            return new Stub(core, impl);
        }

        @Override
        public BackgroundFetchRegistrationObserver[] buildArray(int size) {
          return new BackgroundFetchRegistrationObserver[size];
        }
    };


    private static final int ON_PROGRESS_ORDINAL = 0;

    private static final int ON_RECORDS_UNAVAILABLE_ORDINAL = 1;

    private static final int ON_REQUEST_COMPLETED_ORDINAL = 2;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements BackgroundFetchRegistrationObserver.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void onProgress(
long uploadTotal, long uploaded, long downloadTotal, long downloaded, int result, int failureReason) {

            BackgroundFetchRegistrationObserverOnProgressParams _message = new BackgroundFetchRegistrationObserverOnProgressParams();

            _message.uploadTotal = uploadTotal;

            _message.uploaded = uploaded;

            _message.downloadTotal = downloadTotal;

            _message.downloaded = downloaded;

            _message.result = result;

            _message.failureReason = failureReason;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_PROGRESS_ORDINAL)));

        }


        @Override
        public void onRecordsUnavailable(
) {

            BackgroundFetchRegistrationObserverOnRecordsUnavailableParams _message = new BackgroundFetchRegistrationObserverOnRecordsUnavailableParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_RECORDS_UNAVAILABLE_ORDINAL)));

        }


        @Override
        public void onRequestCompleted(
FetchApiRequest request, FetchApiResponse response) {

            BackgroundFetchRegistrationObserverOnRequestCompletedParams _message = new BackgroundFetchRegistrationObserverOnRequestCompletedParams();

            _message.request = request;

            _message.response = response;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ON_REQUEST_COMPLETED_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<BackgroundFetchRegistrationObserver> {

        Stub(org.chromium.mojo.system.Core core, BackgroundFetchRegistrationObserver impl) {
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
                                BackgroundFetchRegistrationObserver_Internal.MANAGER, messageWithHeader);





                    case ON_PROGRESS_ORDINAL: {

                        BackgroundFetchRegistrationObserverOnProgressParams data =
                                BackgroundFetchRegistrationObserverOnProgressParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onProgress(data.uploadTotal, data.uploaded, data.downloadTotal, data.downloaded, data.result, data.failureReason);
                        return true;
                    }





                    case ON_RECORDS_UNAVAILABLE_ORDINAL: {

                        BackgroundFetchRegistrationObserverOnRecordsUnavailableParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onRecordsUnavailable();
                        return true;
                    }





                    case ON_REQUEST_COMPLETED_ORDINAL: {

                        BackgroundFetchRegistrationObserverOnRequestCompletedParams data =
                                BackgroundFetchRegistrationObserverOnRequestCompletedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().onRequestCompleted(data.request, data.response);
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
                                getCore(), BackgroundFetchRegistrationObserver_Internal.MANAGER, messageWithHeader, receiver);








                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }


    
    static final class BackgroundFetchRegistrationObserverOnProgressParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 48;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(48, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public long uploadTotal;
        public long uploaded;
        public long downloadTotal;
        public long downloaded;
        public int result;
        public int failureReason;

        private BackgroundFetchRegistrationObserverOnProgressParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public BackgroundFetchRegistrationObserverOnProgressParams() {
            this(0);
        }

        public static BackgroundFetchRegistrationObserverOnProgressParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static BackgroundFetchRegistrationObserverOnProgressParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static BackgroundFetchRegistrationObserverOnProgressParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            BackgroundFetchRegistrationObserverOnProgressParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new BackgroundFetchRegistrationObserverOnProgressParams(elementsOrVersion);
                    {
                        
                    result.uploadTotal = decoder0.readLong(8);
                    }
                    {
                        
                    result.uploaded = decoder0.readLong(16);
                    }
                    {
                        
                    result.downloadTotal = decoder0.readLong(24);
                    }
                    {
                        
                    result.downloaded = decoder0.readLong(32);
                    }
                    {
                        
                    result.result = decoder0.readInt(40);
                        BackgroundFetchResult.validate(result.result);
                        result.result = BackgroundFetchResult.toKnownValue(result.result);
                    }
                    {
                        
                    result.failureReason = decoder0.readInt(44);
                        BackgroundFetchFailureReason.validate(result.failureReason);
                        result.failureReason = BackgroundFetchFailureReason.toKnownValue(result.failureReason);
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
            
            encoder0.encode(this.uploadTotal, 8);
            
            encoder0.encode(this.uploaded, 16);
            
            encoder0.encode(this.downloadTotal, 24);
            
            encoder0.encode(this.downloaded, 32);
            
            encoder0.encode(this.result, 40);
            
            encoder0.encode(this.failureReason, 44);
        }
    }



    
    static final class BackgroundFetchRegistrationObserverOnRecordsUnavailableParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private BackgroundFetchRegistrationObserverOnRecordsUnavailableParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public BackgroundFetchRegistrationObserverOnRecordsUnavailableParams() {
            this(0);
        }

        public static BackgroundFetchRegistrationObserverOnRecordsUnavailableParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static BackgroundFetchRegistrationObserverOnRecordsUnavailableParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static BackgroundFetchRegistrationObserverOnRecordsUnavailableParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            BackgroundFetchRegistrationObserverOnRecordsUnavailableParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new BackgroundFetchRegistrationObserverOnRecordsUnavailableParams(elementsOrVersion);

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



    
    static final class BackgroundFetchRegistrationObserverOnRequestCompletedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public FetchApiRequest request;
        public FetchApiResponse response;

        private BackgroundFetchRegistrationObserverOnRequestCompletedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public BackgroundFetchRegistrationObserverOnRequestCompletedParams() {
            this(0);
        }

        public static BackgroundFetchRegistrationObserverOnRequestCompletedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static BackgroundFetchRegistrationObserverOnRequestCompletedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static BackgroundFetchRegistrationObserverOnRequestCompletedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            BackgroundFetchRegistrationObserverOnRequestCompletedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new BackgroundFetchRegistrationObserverOnRequestCompletedParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.request = FetchApiRequest.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, true);
                    result.response = FetchApiResponse.decode(decoder1);
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
            
            encoder0.encode(this.request, 8, false);
            
            encoder0.encode(this.response, 16, true);
        }
    }



}
