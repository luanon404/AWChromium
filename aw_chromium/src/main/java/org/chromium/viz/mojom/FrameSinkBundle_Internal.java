// FrameSinkBundle_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/viz/public/mojom/compositing/frame_sink_bundle.mojom
//

package org.chromium.viz.mojom;

class FrameSinkBundle_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<FrameSinkBundle, FrameSinkBundle.Proxy> MANAGER = new org.chromium.mojo.bindings.Interface.Manager<FrameSinkBundle, FrameSinkBundle.Proxy>() {

        @Override
        public String getName() {
            return "viz.mojom.FrameSinkBundle";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, FrameSinkBundle impl) {
            return new Stub(core, impl);
        }

        @Override
        public FrameSinkBundle[] buildArray(int size) {
            return new FrameSinkBundle[size];
        }
    };


    private static final int INITIALIZE_COMPOSITOR_FRAME_SINK_TYPE_ORDINAL = 0;

    private static final int SET_NEEDS_BEGIN_FRAME_ORDINAL = 1;

    private static final int SUBMIT_ORDINAL = 2;

    private static final int DID_ALLOCATE_SHARED_BITMAP_ORDINAL = 3;

    private static final int SET_THREAD_IDS_ORDINAL = 4;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements FrameSinkBundle.Proxy {

        Proxy(org.chromium.mojo.system.Core core, org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void initializeCompositorFrameSinkType(int sinkId, int type) {

            FrameSinkBundleInitializeCompositorFrameSinkTypeParams _message = new FrameSinkBundleInitializeCompositorFrameSinkTypeParams();

            _message.sinkId = sinkId;

            _message.type = type;


            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(INITIALIZE_COMPOSITOR_FRAME_SINK_TYPE_ORDINAL)));

        }


        @Override
        public void setNeedsBeginFrame(int sinkId, boolean needsBeginFrame) {

            FrameSinkBundleSetNeedsBeginFrameParams _message = new FrameSinkBundleSetNeedsBeginFrameParams();

            _message.sinkId = sinkId;

            _message.needsBeginFrame = needsBeginFrame;


            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(SET_NEEDS_BEGIN_FRAME_ORDINAL)));

        }


        @Override
        public void submit(BundledFrameSubmission[] submissions) {

            FrameSinkBundleSubmitParams _message = new FrameSinkBundleSubmitParams();

            _message.submissions = submissions;


            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(SUBMIT_ORDINAL)));

        }


        @Override
        public void didAllocateSharedBitmap(int sinkId, org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion region, org.chromium.gpu.mojom.Mailbox id) {

            FrameSinkBundleDidAllocateSharedBitmapParams _message = new FrameSinkBundleDidAllocateSharedBitmapParams();

            _message.sinkId = sinkId;

            _message.region = region;

            _message.id = id;


            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(DID_ALLOCATE_SHARED_BITMAP_ORDINAL)));

        }


        @Override
        public void setThreadIds(int sinkId, int[] threadIds) {

            FrameSinkBundleSetThreadIdsParams _message = new FrameSinkBundleSetThreadIdsParams();

            _message.sinkId = sinkId;

            _message.threadIds = threadIds;


            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new org.chromium.mojo.bindings.MessageHeader(SET_THREAD_IDS_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<FrameSinkBundle> {

        Stub(org.chromium.mojo.system.Core core, FrameSinkBundle impl) {
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
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(FrameSinkBundle_Internal.MANAGER, messageWithHeader);


                    case INITIALIZE_COMPOSITOR_FRAME_SINK_TYPE_ORDINAL: {

                        FrameSinkBundleInitializeCompositorFrameSinkTypeParams data = FrameSinkBundleInitializeCompositorFrameSinkTypeParams.deserialize(messageWithHeader.getPayload());

                        getImpl().initializeCompositorFrameSinkType(data.sinkId, data.type);
                        return true;
                    }


                    case SET_NEEDS_BEGIN_FRAME_ORDINAL: {

                        FrameSinkBundleSetNeedsBeginFrameParams data = FrameSinkBundleSetNeedsBeginFrameParams.deserialize(messageWithHeader.getPayload());

                        getImpl().setNeedsBeginFrame(data.sinkId, data.needsBeginFrame);
                        return true;
                    }


                    case SUBMIT_ORDINAL: {

                        FrameSinkBundleSubmitParams data = FrameSinkBundleSubmitParams.deserialize(messageWithHeader.getPayload());

                        getImpl().submit(data.submissions);
                        return true;
                    }


                    case DID_ALLOCATE_SHARED_BITMAP_ORDINAL: {

                        FrameSinkBundleDidAllocateSharedBitmapParams data = FrameSinkBundleDidAllocateSharedBitmapParams.deserialize(messageWithHeader.getPayload());

                        getImpl().didAllocateSharedBitmap(data.sinkId, data.region, data.id);
                        return true;
                    }


                    case SET_THREAD_IDS_ORDINAL: {

                        FrameSinkBundleSetThreadIdsParams data = FrameSinkBundleSetThreadIdsParams.deserialize(messageWithHeader.getPayload());

                        getImpl().setThreadIds(data.sinkId, data.threadIds);
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
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(getCore(), FrameSinkBundle_Internal.MANAGER, messageWithHeader, receiver);


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e);
                return false;
            }
        }
    }


    static final class FrameSinkBundleInitializeCompositorFrameSinkTypeParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int sinkId;
        public int type;

        private FrameSinkBundleInitializeCompositorFrameSinkTypeParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FrameSinkBundleInitializeCompositorFrameSinkTypeParams() {
            this(0);
        }

        public static FrameSinkBundleInitializeCompositorFrameSinkTypeParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FrameSinkBundleInitializeCompositorFrameSinkTypeParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FrameSinkBundleInitializeCompositorFrameSinkTypeParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FrameSinkBundleInitializeCompositorFrameSinkTypeParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FrameSinkBundleInitializeCompositorFrameSinkTypeParams(elementsOrVersion);
                {

                    result.sinkId = decoder0.readInt(8);
                }
                {

                    result.type = decoder0.readInt(12);
                    CompositorFrameSinkType.validate(result.type);
                    result.type = CompositorFrameSinkType.toKnownValue(result.type);
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

            encoder0.encode(this.sinkId, 8);

            encoder0.encode(this.type, 12);
        }
    }


    static final class FrameSinkBundleSetNeedsBeginFrameParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int sinkId;
        public boolean needsBeginFrame;

        private FrameSinkBundleSetNeedsBeginFrameParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FrameSinkBundleSetNeedsBeginFrameParams() {
            this(0);
        }

        public static FrameSinkBundleSetNeedsBeginFrameParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FrameSinkBundleSetNeedsBeginFrameParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FrameSinkBundleSetNeedsBeginFrameParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FrameSinkBundleSetNeedsBeginFrameParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FrameSinkBundleSetNeedsBeginFrameParams(elementsOrVersion);
                {

                    result.sinkId = decoder0.readInt(8);
                }
                {

                    result.needsBeginFrame = decoder0.readBoolean(12, 0);
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

            encoder0.encode(this.sinkId, 8);

            encoder0.encode(this.needsBeginFrame, 12, 0);
        }
    }


    static final class FrameSinkBundleSubmitParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public BundledFrameSubmission[] submissions;

        private FrameSinkBundleSubmitParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FrameSinkBundleSubmitParams() {
            this(0);
        }

        public static FrameSinkBundleSubmitParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FrameSinkBundleSubmitParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FrameSinkBundleSubmitParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FrameSinkBundleSubmitParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FrameSinkBundleSubmitParams(elementsOrVersion);
                {

                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    {
                        org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                        result.submissions = new BundledFrameSubmission[si1.elementsOrVersion];
                        for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {

                            org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                            result.submissions[i1] = BundledFrameSubmission.decode(decoder2);
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

            if (this.submissions == null) {
                encoder0.encodeNullPointer(8, false);
            } else {
                org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.submissions.length, 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                for (int i0 = 0; i0 < this.submissions.length; ++i0) {

                    encoder1.encode(this.submissions[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                }
            }
        }
    }


    static final class FrameSinkBundleDidAllocateSharedBitmapParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 32;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(32, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int sinkId;
        public org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion region;
        public org.chromium.gpu.mojom.Mailbox id;

        private FrameSinkBundleDidAllocateSharedBitmapParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FrameSinkBundleDidAllocateSharedBitmapParams() {
            this(0);
        }

        public static FrameSinkBundleDidAllocateSharedBitmapParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FrameSinkBundleDidAllocateSharedBitmapParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FrameSinkBundleDidAllocateSharedBitmapParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FrameSinkBundleDidAllocateSharedBitmapParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FrameSinkBundleDidAllocateSharedBitmapParams(elementsOrVersion);
                {

                    result.sinkId = decoder0.readInt(8);
                }
                {

                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.region = org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion.decode(decoder1);
                }
                {

                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                    result.id = org.chromium.gpu.mojom.Mailbox.decode(decoder1);
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

            encoder0.encode(this.sinkId, 8);

            encoder0.encode(this.region, 16, false);

            encoder0.encode(this.id, 24, false);
        }
    }


    static final class FrameSinkBundleSetThreadIdsParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int sinkId;
        public int[] threadIds;

        private FrameSinkBundleSetThreadIdsParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FrameSinkBundleSetThreadIdsParams() {
            this(0);
        }

        public static FrameSinkBundleSetThreadIdsParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FrameSinkBundleSetThreadIdsParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FrameSinkBundleSetThreadIdsParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FrameSinkBundleSetThreadIdsParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FrameSinkBundleSetThreadIdsParams(elementsOrVersion);
                {

                    result.sinkId = decoder0.readInt(8);
                }
                {

                    result.threadIds = decoder0.readInts(16, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
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

            encoder0.encode(this.sinkId, 8);

            encoder0.encode(this.threadIds, 16, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
        }
    }


}
