// SynchronousCompositorHost_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/input/synchronous_compositor.mojom
//

package org.chromium.blink.mojom;


class SynchronousCompositorHost_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<SynchronousCompositorHost, SynchronousCompositorHost.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<SynchronousCompositorHost, SynchronousCompositorHost.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.SynchronousCompositorHost";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, SynchronousCompositorHost impl) {
            return new Stub(core, impl);
        }

        @Override
        public SynchronousCompositorHost[] buildArray(int size) {
          return new SynchronousCompositorHost[size];
        }
    };


    private static final int LAYER_TREE_FRAME_SINK_CREATED_ORDINAL = 0;

    private static final int UPDATE_STATE_ORDINAL = 1;

    private static final int SET_NEEDS_BEGIN_FRAMES_ORDINAL = 2;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements SynchronousCompositorHost.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void layerTreeFrameSinkCreated(
) {

            SynchronousCompositorHostLayerTreeFrameSinkCreatedParams _message = new SynchronousCompositorHostLayerTreeFrameSinkCreatedParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(LAYER_TREE_FRAME_SINK_CREATED_ORDINAL)));

        }


        @Override
        public void updateState(
SyncCompositorCommonRendererParams params) {

            SynchronousCompositorHostUpdateStateParams _message = new SynchronousCompositorHostUpdateStateParams();

            _message.params = params;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(UPDATE_STATE_ORDINAL)));

        }


        @Override
        public void setNeedsBeginFrames(
boolean needsBeginFrames) {

            SynchronousCompositorHostSetNeedsBeginFramesParams _message = new SynchronousCompositorHostSetNeedsBeginFramesParams();

            _message.needsBeginFrames = needsBeginFrames;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(SET_NEEDS_BEGIN_FRAMES_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<SynchronousCompositorHost> {

        Stub(org.chromium.mojo.system.Core core, SynchronousCompositorHost impl) {
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
                                SynchronousCompositorHost_Internal.MANAGER, messageWithHeader);





                    case LAYER_TREE_FRAME_SINK_CREATED_ORDINAL: {

                        SynchronousCompositorHostLayerTreeFrameSinkCreatedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().layerTreeFrameSinkCreated();
                        return true;
                    }





                    case UPDATE_STATE_ORDINAL: {

                        SynchronousCompositorHostUpdateStateParams data =
                                SynchronousCompositorHostUpdateStateParams.deserialize(messageWithHeader.getPayload());

                        getImpl().updateState(data.params);
                        return true;
                    }





                    case SET_NEEDS_BEGIN_FRAMES_ORDINAL: {

                        SynchronousCompositorHostSetNeedsBeginFramesParams data =
                                SynchronousCompositorHostSetNeedsBeginFramesParams.deserialize(messageWithHeader.getPayload());

                        getImpl().setNeedsBeginFrames(data.needsBeginFrames);
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
                                getCore(), SynchronousCompositorHost_Internal.MANAGER, messageWithHeader, receiver);








                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e);
                return false;
            }
        }
    }


    
    static final class SynchronousCompositorHostLayerTreeFrameSinkCreatedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private SynchronousCompositorHostLayerTreeFrameSinkCreatedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public SynchronousCompositorHostLayerTreeFrameSinkCreatedParams() {
            this(0);
        }

        public static SynchronousCompositorHostLayerTreeFrameSinkCreatedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SynchronousCompositorHostLayerTreeFrameSinkCreatedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static SynchronousCompositorHostLayerTreeFrameSinkCreatedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SynchronousCompositorHostLayerTreeFrameSinkCreatedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new SynchronousCompositorHostLayerTreeFrameSinkCreatedParams(elementsOrVersion);

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



    
    static final class SynchronousCompositorHostUpdateStateParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public SyncCompositorCommonRendererParams params;

        private SynchronousCompositorHostUpdateStateParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public SynchronousCompositorHostUpdateStateParams() {
            this(0);
        }

        public static SynchronousCompositorHostUpdateStateParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SynchronousCompositorHostUpdateStateParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static SynchronousCompositorHostUpdateStateParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SynchronousCompositorHostUpdateStateParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new SynchronousCompositorHostUpdateStateParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.params = SyncCompositorCommonRendererParams.decode(decoder1);
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
            
            encoder0.encode(this.params, 8, false);
        }
    }



    
    static final class SynchronousCompositorHostSetNeedsBeginFramesParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public boolean needsBeginFrames;

        private SynchronousCompositorHostSetNeedsBeginFramesParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public SynchronousCompositorHostSetNeedsBeginFramesParams() {
            this(0);
        }

        public static SynchronousCompositorHostSetNeedsBeginFramesParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SynchronousCompositorHostSetNeedsBeginFramesParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static SynchronousCompositorHostSetNeedsBeginFramesParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SynchronousCompositorHostSetNeedsBeginFramesParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new SynchronousCompositorHostSetNeedsBeginFramesParams(elementsOrVersion);
                    {
                        
                    result.needsBeginFrames = decoder0.readBoolean(8, 0);
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
            
            encoder0.encode(this.needsBeginFrames, 8, 0);
        }
    }



}
