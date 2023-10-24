// RenderFrameMetadataObserver_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     cc/mojom/render_frame_metadata.mojom
//

package org.chromium.cc.mojom;

class RenderFrameMetadataObserver_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<RenderFrameMetadataObserver, RenderFrameMetadataObserver.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<RenderFrameMetadataObserver, RenderFrameMetadataObserver.Proxy>() {

                @Override
                public String getName() {
                    return "cc.mojom.RenderFrameMetadataObserver";
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
                public Stub buildStub(org.chromium.mojo.system.Core core, RenderFrameMetadataObserver impl) {
                    return new Stub(core, impl);
                }

                @Override
                public RenderFrameMetadataObserver[] buildArray(int size) {
                    return new RenderFrameMetadataObserver[size];
                }
            };


    private static final int UPDATE_ROOT_SCROLL_OFFSET_UPDATE_FREQUENCY_ORDINAL = 0;

    private static final int REPORT_ALL_FRAME_SUBMISSIONS_FOR_TESTING_ORDINAL = 1;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements RenderFrameMetadataObserver.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void updateRootScrollOffsetUpdateFrequency(
                int frequency) {

            RenderFrameMetadataObserverUpdateRootScrollOffsetUpdateFrequencyParams _message = new RenderFrameMetadataObserverUpdateRootScrollOffsetUpdateFrequencyParams();

            _message.frequency = frequency;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(UPDATE_ROOT_SCROLL_OFFSET_UPDATE_FREQUENCY_ORDINAL)));

        }


        @Override
        public void reportAllFrameSubmissionsForTesting(
                boolean enabled) {

            RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams _message = new RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams();

            _message.enabled = enabled;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(REPORT_ALL_FRAME_SUBMISSIONS_FOR_TESTING_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<RenderFrameMetadataObserver> {

        Stub(org.chromium.mojo.system.Core core, RenderFrameMetadataObserver impl) {
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
                switch (header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                RenderFrameMetadataObserver_Internal.MANAGER, messageWithHeader);


                    case UPDATE_ROOT_SCROLL_OFFSET_UPDATE_FREQUENCY_ORDINAL: {

                        RenderFrameMetadataObserverUpdateRootScrollOffsetUpdateFrequencyParams data =
                                RenderFrameMetadataObserverUpdateRootScrollOffsetUpdateFrequencyParams.deserialize(messageWithHeader.getPayload());

                        getImpl().updateRootScrollOffsetUpdateFrequency(data.frequency);
                        return true;
                    }


                    case REPORT_ALL_FRAME_SUBMISSIONS_FOR_TESTING_ORDINAL: {

                        RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams data =
                                RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams.deserialize(messageWithHeader.getPayload());

                        getImpl().reportAllFrameSubmissionsForTesting(data.enabled);
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
                switch (header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), RenderFrameMetadataObserver_Internal.MANAGER, messageWithHeader, receiver);


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e);
                return false;
            }
        }
    }


    static final class RenderFrameMetadataObserverUpdateRootScrollOffsetUpdateFrequencyParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int frequency;

        private RenderFrameMetadataObserverUpdateRootScrollOffsetUpdateFrequencyParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public RenderFrameMetadataObserverUpdateRootScrollOffsetUpdateFrequencyParams() {
            this(0);
        }

        public static RenderFrameMetadataObserverUpdateRootScrollOffsetUpdateFrequencyParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static RenderFrameMetadataObserverUpdateRootScrollOffsetUpdateFrequencyParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static RenderFrameMetadataObserverUpdateRootScrollOffsetUpdateFrequencyParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            RenderFrameMetadataObserverUpdateRootScrollOffsetUpdateFrequencyParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new RenderFrameMetadataObserverUpdateRootScrollOffsetUpdateFrequencyParams(elementsOrVersion);
                {

                    result.frequency = decoder0.readInt(8);
                    RootScrollOffsetUpdateFrequency.validate(result.frequency);
                    result.frequency = RootScrollOffsetUpdateFrequency.toKnownValue(result.frequency);
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

            encoder0.encode(this.frequency, 8);
        }
    }


    static final class RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public boolean enabled;

        private RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams() {
            this(0);
        }

        public static RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams(elementsOrVersion);
                {

                    result.enabled = decoder0.readBoolean(8, 0);
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

            encoder0.encode(this.enabled, 8, 0);
        }
    }


}
