// StableVideoDecoderFactory_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/stable/stable_video_decoder.mojom
//

package org.chromium.media.stable.mojom;

class StableVideoDecoderFactory_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<StableVideoDecoderFactory, StableVideoDecoderFactory.Proxy> MANAGER = new org.chromium.mojo.bindings.Interface.Manager<StableVideoDecoderFactory, StableVideoDecoderFactory.Proxy>() {

        @Override
        public String getName() {
            return "media.stable.mojom.StableVideoDecoderFactory";
        }

        @Override
        public int getVersion() {
            return 1;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core, org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, StableVideoDecoderFactory impl) {
            return new Stub(core, impl);
        }

        @Override
        public StableVideoDecoderFactory[] buildArray(int size) {
            return new StableVideoDecoderFactory[size];
        }
    };


    private static final int CREATE_STABLE_VIDEO_DECODER_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements StableVideoDecoderFactory.Proxy {

        Proxy(org.chromium.mojo.system.Core core, org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void createStableVideoDecoder(org.chromium.mojo.bindings.InterfaceRequest<StableVideoDecoder> receiver, StableVideoDecoderTracker tracker) {

            StableVideoDecoderFactoryCreateStableVideoDecoderParams _message = new StableVideoDecoderFactoryCreateStableVideoDecoderParams();

            _message.receiver = receiver;

            _message.tracker = tracker;


            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(CREATE_STABLE_VIDEO_DECODER_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<StableVideoDecoderFactory> {

        Stub(org.chromium.mojo.system.Core core, StableVideoDecoderFactory impl) {
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
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(StableVideoDecoderFactory_Internal.MANAGER, messageWithHeader);


                    case CREATE_STABLE_VIDEO_DECODER_ORDINAL: {

                        StableVideoDecoderFactoryCreateStableVideoDecoderParams data = StableVideoDecoderFactoryCreateStableVideoDecoderParams.deserialize(messageWithHeader.getPayload());

                        getImpl().createStableVideoDecoder(data.receiver, data.tracker);
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
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(getCore(), StableVideoDecoderFactory_Internal.MANAGER, messageWithHeader, receiver);


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e);
                return false;
            }
        }
    }


    static final class StableVideoDecoderFactoryCreateStableVideoDecoderParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(16, 0), new org.chromium.mojo.bindings.DataHeader(24, 1)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[1];
        public org.chromium.mojo.bindings.InterfaceRequest<StableVideoDecoder> receiver;
        public StableVideoDecoderTracker tracker;

        private StableVideoDecoderFactoryCreateStableVideoDecoderParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public StableVideoDecoderFactoryCreateStableVideoDecoderParams() {
            this(1);
        }

        public static StableVideoDecoderFactoryCreateStableVideoDecoderParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static StableVideoDecoderFactoryCreateStableVideoDecoderParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static StableVideoDecoderFactoryCreateStableVideoDecoderParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            StableVideoDecoderFactoryCreateStableVideoDecoderParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new StableVideoDecoderFactoryCreateStableVideoDecoderParams(elementsOrVersion);
                {

                    result.receiver = decoder0.readInterfaceRequest(8, false);
                }
                if (elementsOrVersion >= 1) {
                    {

                        result.tracker = decoder0.readServiceInterface(12, true, StableVideoDecoderTracker.MANAGER);
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

            encoder0.encode(this.receiver, 8, false);

            encoder0.encode(this.tracker, 12, true, StableVideoDecoderTracker.MANAGER);
        }
    }


}
