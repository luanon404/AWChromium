// AudioProcessorControls_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/audio_processing.mojom
//

package org.chromium.media.mojom;

class AudioProcessorControls_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<AudioProcessorControls, AudioProcessorControls.Proxy> MANAGER = new org.chromium.mojo.bindings.Interface.Manager<AudioProcessorControls, AudioProcessorControls.Proxy>() {

        @Override
        public String getName() {
            return "media.mojom.AudioProcessorControls";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, AudioProcessorControls impl) {
            return new Stub(core, impl);
        }

        @Override
        public AudioProcessorControls[] buildArray(int size) {
            return new AudioProcessorControls[size];
        }
    };


    private static final int GET_STATS_ORDINAL = 0;

    private static final int SET_PREFERRED_NUM_CAPTURE_CHANNELS_ORDINAL = 1;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements AudioProcessorControls.Proxy {

        Proxy(org.chromium.mojo.system.Core core, org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void getStats(

                GetStats_Response callback) {

            AudioProcessorControlsGetStatsParams _message = new AudioProcessorControlsGetStatsParams();


            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(GET_STATS_ORDINAL, org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG, 0)), new AudioProcessorControlsGetStatsResponseParamsForwardToCallback(callback));

        }


        @Override
        public void setPreferredNumCaptureChannels(int numPreferredChannels) {

            AudioProcessorControlsSetPreferredNumCaptureChannelsParams _message = new AudioProcessorControlsSetPreferredNumCaptureChannelsParams();

            _message.numPreferredChannels = numPreferredChannels;


            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(SET_PREFERRED_NUM_CAPTURE_CHANNELS_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<AudioProcessorControls> {

        Stub(org.chromium.mojo.system.Core core, AudioProcessorControls impl) {
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
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(AudioProcessorControls_Internal.MANAGER, messageWithHeader);


                    case SET_PREFERRED_NUM_CAPTURE_CHANNELS_ORDINAL: {

                        AudioProcessorControlsSetPreferredNumCaptureChannelsParams data = AudioProcessorControlsSetPreferredNumCaptureChannelsParams.deserialize(messageWithHeader.getPayload());

                        getImpl().setPreferredNumCaptureChannels(data.numPreferredChannels);
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
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(getCore(), AudioProcessorControls_Internal.MANAGER, messageWithHeader, receiver);


                    case GET_STATS_ORDINAL: {

                        AudioProcessorControlsGetStatsParams.deserialize(messageWithHeader.getPayload());

                        getImpl().getStats(new AudioProcessorControlsGetStatsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    }


    static final class AudioProcessorControlsGetStatsParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private AudioProcessorControlsGetStatsParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public AudioProcessorControlsGetStatsParams() {
            this(0);
        }

        public static AudioProcessorControlsGetStatsParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AudioProcessorControlsGetStatsParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static AudioProcessorControlsGetStatsParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AudioProcessorControlsGetStatsParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new AudioProcessorControlsGetStatsParams(elementsOrVersion);

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


    static final class AudioProcessorControlsGetStatsResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public AudioProcessingStats stats;

        private AudioProcessorControlsGetStatsResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public AudioProcessorControlsGetStatsResponseParams() {
            this(0);
        }

        public static AudioProcessorControlsGetStatsResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AudioProcessorControlsGetStatsResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static AudioProcessorControlsGetStatsResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AudioProcessorControlsGetStatsResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new AudioProcessorControlsGetStatsResponseParams(elementsOrVersion);
                {

                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.stats = AudioProcessingStats.decode(decoder1);
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

            encoder0.encode(this.stats, 8, false);
        }
    }

    static class AudioProcessorControlsGetStatsResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable implements org.chromium.mojo.bindings.MessageReceiver {
        private final AudioProcessorControls.GetStats_Response mCallback;

        AudioProcessorControlsGetStatsResponseParamsForwardToCallback(AudioProcessorControls.GetStats_Response callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader = message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(GET_STATS_ORDINAL, org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                AudioProcessorControlsGetStatsResponseParams response = AudioProcessorControlsGetStatsResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.stats);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class AudioProcessorControlsGetStatsResponseParamsProxyToResponder implements AudioProcessorControls.GetStats_Response {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        AudioProcessorControlsGetStatsResponseParamsProxyToResponder(org.chromium.mojo.system.Core core, org.chromium.mojo.bindings.MessageReceiver messageReceiver, long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(AudioProcessingStats stats) {
            AudioProcessorControlsGetStatsResponseParams _response = new AudioProcessorControlsGetStatsResponseParams();

            _response.stats = stats;

            org.chromium.mojo.bindings.ServiceMessage _message = _response.serializeWithHeader(mCore, new org.chromium.mojo.bindings.MessageHeader(GET_STATS_ORDINAL, org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG, mRequestId));
            mMessageReceiver.accept(_message);
        }
    }


    static final class AudioProcessorControlsSetPreferredNumCaptureChannelsParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int numPreferredChannels;

        private AudioProcessorControlsSetPreferredNumCaptureChannelsParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public AudioProcessorControlsSetPreferredNumCaptureChannelsParams() {
            this(0);
        }

        public static AudioProcessorControlsSetPreferredNumCaptureChannelsParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static AudioProcessorControlsSetPreferredNumCaptureChannelsParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static AudioProcessorControlsSetPreferredNumCaptureChannelsParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            AudioProcessorControlsSetPreferredNumCaptureChannelsParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new AudioProcessorControlsSetPreferredNumCaptureChannelsParams(elementsOrVersion);
                {

                    result.numPreferredChannels = decoder0.readInt(8);
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

            encoder0.encode(this.numPreferredChannels, 8);
        }
    }


}
