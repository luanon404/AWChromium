// FrameWidgetHost_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/page/widget.mojom
//

package org.chromium.blink.mojom;


class FrameWidgetHost_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<FrameWidgetHost, FrameWidgetHost.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<FrameWidgetHost, FrameWidgetHost.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.FrameWidgetHost";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, FrameWidgetHost impl) {
            return new Stub(core, impl);
        }

        @Override
        public FrameWidgetHost[] buildArray(int size) {
          return new FrameWidgetHost[size];
        }
    };


    private static final int ANIMATE_DOUBLE_TAP_ZOOM_IN_MAIN_FRAME_ORDINAL = 0;

    private static final int ZOOM_TO_FIND_IN_PAGE_RECT_IN_MAIN_FRAME_ORDINAL = 1;

    private static final int SET_HAS_TOUCH_EVENT_CONSUMERS_ORDINAL = 2;

    private static final int INTRINSIC_SIZING_INFO_CHANGED_ORDINAL = 3;

    private static final int AUTOSCROLL_START_ORDINAL = 4;

    private static final int AUTOSCROLL_FLING_ORDINAL = 5;

    private static final int AUTOSCROLL_END_ORDINAL = 6;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements FrameWidgetHost.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void animateDoubleTapZoomInMainFrame(
org.chromium.gfx.mojom.Point tapPoint, org.chromium.gfx.mojom.Rect rectToZoom) {

            FrameWidgetHostAnimateDoubleTapZoomInMainFrameParams _message = new FrameWidgetHostAnimateDoubleTapZoomInMainFrameParams();

            _message.tapPoint = tapPoint;

            _message.rectToZoom = rectToZoom;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ANIMATE_DOUBLE_TAP_ZOOM_IN_MAIN_FRAME_ORDINAL)));

        }


        @Override
        public void zoomToFindInPageRectInMainFrame(
org.chromium.gfx.mojom.Rect rectToZoom) {

            FrameWidgetHostZoomToFindInPageRectInMainFrameParams _message = new FrameWidgetHostZoomToFindInPageRectInMainFrameParams();

            _message.rectToZoom = rectToZoom;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(ZOOM_TO_FIND_IN_PAGE_RECT_IN_MAIN_FRAME_ORDINAL)));

        }


        @Override
        public void setHasTouchEventConsumers(
TouchEventConsumers touchEventConsumers) {

            FrameWidgetHostSetHasTouchEventConsumersParams _message = new FrameWidgetHostSetHasTouchEventConsumersParams();

            _message.touchEventConsumers = touchEventConsumers;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(SET_HAS_TOUCH_EVENT_CONSUMERS_ORDINAL)));

        }


        @Override
        public void intrinsicSizingInfoChanged(
IntrinsicSizingInfo sizingInfo) {

            FrameWidgetHostIntrinsicSizingInfoChangedParams _message = new FrameWidgetHostIntrinsicSizingInfoChangedParams();

            _message.sizingInfo = sizingInfo;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(INTRINSIC_SIZING_INFO_CHANGED_ORDINAL)));

        }


        @Override
        public void autoscrollStart(
org.chromium.gfx.mojom.PointF position) {

            FrameWidgetHostAutoscrollStartParams _message = new FrameWidgetHostAutoscrollStartParams();

            _message.position = position;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(AUTOSCROLL_START_ORDINAL)));

        }


        @Override
        public void autoscrollFling(
org.chromium.gfx.mojom.Vector2dF velocity) {

            FrameWidgetHostAutoscrollFlingParams _message = new FrameWidgetHostAutoscrollFlingParams();

            _message.velocity = velocity;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(AUTOSCROLL_FLING_ORDINAL)));

        }


        @Override
        public void autoscrollEnd(
) {

            FrameWidgetHostAutoscrollEndParams _message = new FrameWidgetHostAutoscrollEndParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(AUTOSCROLL_END_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<FrameWidgetHost> {

        Stub(org.chromium.mojo.system.Core core, FrameWidgetHost impl) {
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
                                FrameWidgetHost_Internal.MANAGER, messageWithHeader);





                    case ANIMATE_DOUBLE_TAP_ZOOM_IN_MAIN_FRAME_ORDINAL: {

                        FrameWidgetHostAnimateDoubleTapZoomInMainFrameParams data =
                                FrameWidgetHostAnimateDoubleTapZoomInMainFrameParams.deserialize(messageWithHeader.getPayload());

                        getImpl().animateDoubleTapZoomInMainFrame(data.tapPoint, data.rectToZoom);
                        return true;
                    }





                    case ZOOM_TO_FIND_IN_PAGE_RECT_IN_MAIN_FRAME_ORDINAL: {

                        FrameWidgetHostZoomToFindInPageRectInMainFrameParams data =
                                FrameWidgetHostZoomToFindInPageRectInMainFrameParams.deserialize(messageWithHeader.getPayload());

                        getImpl().zoomToFindInPageRectInMainFrame(data.rectToZoom);
                        return true;
                    }





                    case SET_HAS_TOUCH_EVENT_CONSUMERS_ORDINAL: {

                        FrameWidgetHostSetHasTouchEventConsumersParams data =
                                FrameWidgetHostSetHasTouchEventConsumersParams.deserialize(messageWithHeader.getPayload());

                        getImpl().setHasTouchEventConsumers(data.touchEventConsumers);
                        return true;
                    }





                    case INTRINSIC_SIZING_INFO_CHANGED_ORDINAL: {

                        FrameWidgetHostIntrinsicSizingInfoChangedParams data =
                                FrameWidgetHostIntrinsicSizingInfoChangedParams.deserialize(messageWithHeader.getPayload());

                        getImpl().intrinsicSizingInfoChanged(data.sizingInfo);
                        return true;
                    }





                    case AUTOSCROLL_START_ORDINAL: {

                        FrameWidgetHostAutoscrollStartParams data =
                                FrameWidgetHostAutoscrollStartParams.deserialize(messageWithHeader.getPayload());

                        getImpl().autoscrollStart(data.position);
                        return true;
                    }





                    case AUTOSCROLL_FLING_ORDINAL: {

                        FrameWidgetHostAutoscrollFlingParams data =
                                FrameWidgetHostAutoscrollFlingParams.deserialize(messageWithHeader.getPayload());

                        getImpl().autoscrollFling(data.velocity);
                        return true;
                    }





                    case AUTOSCROLL_END_ORDINAL: {

                        FrameWidgetHostAutoscrollEndParams.deserialize(messageWithHeader.getPayload());

                        getImpl().autoscrollEnd();
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
                                getCore(), FrameWidgetHost_Internal.MANAGER, messageWithHeader, receiver);
















                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e);
                return false;
            }
        }
    }


    
    static final class FrameWidgetHostAnimateDoubleTapZoomInMainFrameParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.gfx.mojom.Point tapPoint;
        public org.chromium.gfx.mojom.Rect rectToZoom;

        private FrameWidgetHostAnimateDoubleTapZoomInMainFrameParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FrameWidgetHostAnimateDoubleTapZoomInMainFrameParams() {
            this(0);
        }

        public static FrameWidgetHostAnimateDoubleTapZoomInMainFrameParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FrameWidgetHostAnimateDoubleTapZoomInMainFrameParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FrameWidgetHostAnimateDoubleTapZoomInMainFrameParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FrameWidgetHostAnimateDoubleTapZoomInMainFrameParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FrameWidgetHostAnimateDoubleTapZoomInMainFrameParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.tapPoint = org.chromium.gfx.mojom.Point.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.rectToZoom = org.chromium.gfx.mojom.Rect.decode(decoder1);
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
            
            encoder0.encode(this.tapPoint, 8, false);
            
            encoder0.encode(this.rectToZoom, 16, false);
        }
    }



    
    static final class FrameWidgetHostZoomToFindInPageRectInMainFrameParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.gfx.mojom.Rect rectToZoom;

        private FrameWidgetHostZoomToFindInPageRectInMainFrameParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FrameWidgetHostZoomToFindInPageRectInMainFrameParams() {
            this(0);
        }

        public static FrameWidgetHostZoomToFindInPageRectInMainFrameParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FrameWidgetHostZoomToFindInPageRectInMainFrameParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FrameWidgetHostZoomToFindInPageRectInMainFrameParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FrameWidgetHostZoomToFindInPageRectInMainFrameParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FrameWidgetHostZoomToFindInPageRectInMainFrameParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.rectToZoom = org.chromium.gfx.mojom.Rect.decode(decoder1);
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
            
            encoder0.encode(this.rectToZoom, 8, false);
        }
    }



    
    static final class FrameWidgetHostSetHasTouchEventConsumersParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public TouchEventConsumers touchEventConsumers;

        private FrameWidgetHostSetHasTouchEventConsumersParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FrameWidgetHostSetHasTouchEventConsumersParams() {
            this(0);
        }

        public static FrameWidgetHostSetHasTouchEventConsumersParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FrameWidgetHostSetHasTouchEventConsumersParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FrameWidgetHostSetHasTouchEventConsumersParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FrameWidgetHostSetHasTouchEventConsumersParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FrameWidgetHostSetHasTouchEventConsumersParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.touchEventConsumers = TouchEventConsumers.decode(decoder1);
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
            
            encoder0.encode(this.touchEventConsumers, 8, false);
        }
    }



    
    static final class FrameWidgetHostIntrinsicSizingInfoChangedParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public IntrinsicSizingInfo sizingInfo;

        private FrameWidgetHostIntrinsicSizingInfoChangedParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FrameWidgetHostIntrinsicSizingInfoChangedParams() {
            this(0);
        }

        public static FrameWidgetHostIntrinsicSizingInfoChangedParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FrameWidgetHostIntrinsicSizingInfoChangedParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FrameWidgetHostIntrinsicSizingInfoChangedParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FrameWidgetHostIntrinsicSizingInfoChangedParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FrameWidgetHostIntrinsicSizingInfoChangedParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.sizingInfo = IntrinsicSizingInfo.decode(decoder1);
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
            
            encoder0.encode(this.sizingInfo, 8, false);
        }
    }



    
    static final class FrameWidgetHostAutoscrollStartParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.gfx.mojom.PointF position;

        private FrameWidgetHostAutoscrollStartParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FrameWidgetHostAutoscrollStartParams() {
            this(0);
        }

        public static FrameWidgetHostAutoscrollStartParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FrameWidgetHostAutoscrollStartParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FrameWidgetHostAutoscrollStartParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FrameWidgetHostAutoscrollStartParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FrameWidgetHostAutoscrollStartParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.position = org.chromium.gfx.mojom.PointF.decode(decoder1);
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
            
            encoder0.encode(this.position, 8, false);
        }
    }



    
    static final class FrameWidgetHostAutoscrollFlingParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.gfx.mojom.Vector2dF velocity;

        private FrameWidgetHostAutoscrollFlingParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FrameWidgetHostAutoscrollFlingParams() {
            this(0);
        }

        public static FrameWidgetHostAutoscrollFlingParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FrameWidgetHostAutoscrollFlingParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FrameWidgetHostAutoscrollFlingParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FrameWidgetHostAutoscrollFlingParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FrameWidgetHostAutoscrollFlingParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.velocity = org.chromium.gfx.mojom.Vector2dF.decode(decoder1);
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
            
            encoder0.encode(this.velocity, 8, false);
        }
    }



    
    static final class FrameWidgetHostAutoscrollEndParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private FrameWidgetHostAutoscrollEndParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public FrameWidgetHostAutoscrollEndParams() {
            this(0);
        }

        public static FrameWidgetHostAutoscrollEndParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static FrameWidgetHostAutoscrollEndParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static FrameWidgetHostAutoscrollEndParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            FrameWidgetHostAutoscrollEndParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new FrameWidgetHostAutoscrollEndParams(elementsOrVersion);

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
