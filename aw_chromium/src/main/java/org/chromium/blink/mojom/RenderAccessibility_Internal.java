// RenderAccessibility_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/render_accessibility.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


class RenderAccessibility_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<RenderAccessibility, RenderAccessibility.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<RenderAccessibility, RenderAccessibility.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.RenderAccessibility";
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
        public Stub buildStub(org.chromium.mojo.system.Core core, RenderAccessibility impl) {
            return new Stub(core, impl);
        }

        @Override
        public RenderAccessibility[] buildArray(int size) {
          return new RenderAccessibility[size];
        }
    };


    private static final int SET_MODE_ORDINAL = 0;

    private static final int FATAL_ERROR_ORDINAL = 1;

    private static final int HIT_TEST_ORDINAL = 2;

    private static final int PERFORM_ACTION_ORDINAL = 3;

    private static final int RESET_ORDINAL = 4;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements RenderAccessibility.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void setMode(
org.chromium.ax.mojom.AxMode axMode, int resetToken) {

            RenderAccessibilitySetModeParams _message = new RenderAccessibilitySetModeParams();

            _message.axMode = axMode;

            _message.resetToken = resetToken;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(SET_MODE_ORDINAL)));

        }


        @Override
        public void fatalError(
) {

            RenderAccessibilityFatalErrorParams _message = new RenderAccessibilityFatalErrorParams();


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(FATAL_ERROR_ORDINAL)));

        }


        @Override
        public void hitTest(
org.chromium.gfx.mojom.Point point, int eventToFire, int requestId, 
HitTest_Response callback) {

            RenderAccessibilityHitTestParams _message = new RenderAccessibilityHitTestParams();

            _message.point = point;

            _message.eventToFire = eventToFire;

            _message.requestId = requestId;


            getProxyHandler().getMessageReceiver().acceptWithResponder(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(
                                    HIT_TEST_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                                    0)),
                    new RenderAccessibilityHitTestResponseParamsForwardToCallback(callback));

        }


        @Override
        public void performAction(
org.chromium.ax.mojom.AxActionData actionData) {

            RenderAccessibilityPerformActionParams _message = new RenderAccessibilityPerformActionParams();

            _message.actionData = actionData;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(PERFORM_ACTION_ORDINAL)));

        }


        @Override
        public void reset(
int resetToken) {

            RenderAccessibilityResetParams _message = new RenderAccessibilityResetParams();

            _message.resetToken = resetToken;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(RESET_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<RenderAccessibility> {

        Stub(org.chromium.mojo.system.Core core, RenderAccessibility impl) {
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
                                RenderAccessibility_Internal.MANAGER, messageWithHeader);





                    case SET_MODE_ORDINAL: {

                        RenderAccessibilitySetModeParams data =
                                RenderAccessibilitySetModeParams.deserialize(messageWithHeader.getPayload());

                        getImpl().setMode(data.axMode, data.resetToken);
                        return true;
                    }





                    case FATAL_ERROR_ORDINAL: {

                        RenderAccessibilityFatalErrorParams.deserialize(messageWithHeader.getPayload());

                        getImpl().fatalError();
                        return true;
                    }







                    case PERFORM_ACTION_ORDINAL: {

                        RenderAccessibilityPerformActionParams data =
                                RenderAccessibilityPerformActionParams.deserialize(messageWithHeader.getPayload());

                        getImpl().performAction(data.actionData);
                        return true;
                    }





                    case RESET_ORDINAL: {

                        RenderAccessibilityResetParams data =
                                RenderAccessibilityResetParams.deserialize(messageWithHeader.getPayload());

                        getImpl().reset(data.resetToken);
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
                                getCore(), RenderAccessibility_Internal.MANAGER, messageWithHeader, receiver);











                    case HIT_TEST_ORDINAL: {

                        RenderAccessibilityHitTestParams data =
                                RenderAccessibilityHitTestParams.deserialize(messageWithHeader.getPayload());

                        getImpl().hitTest(data.point, data.eventToFire, data.requestId, new RenderAccessibilityHitTestResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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


    
    static final class RenderAccessibilitySetModeParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.ax.mojom.AxMode axMode;
        public int resetToken;

        private RenderAccessibilitySetModeParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public RenderAccessibilitySetModeParams() {
            this(0);
        }

        public static RenderAccessibilitySetModeParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static RenderAccessibilitySetModeParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static RenderAccessibilitySetModeParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            RenderAccessibilitySetModeParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new RenderAccessibilitySetModeParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.axMode = org.chromium.ax.mojom.AxMode.decode(decoder1);
                    }
                    {
                        
                    result.resetToken = decoder0.readInt(16);
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
            
            encoder0.encode(this.axMode, 8, false);
            
            encoder0.encode(this.resetToken, 16);
        }
    }



    
    static final class RenderAccessibilityFatalErrorParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 8;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(8, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

        private RenderAccessibilityFatalErrorParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public RenderAccessibilityFatalErrorParams() {
            this(0);
        }

        public static RenderAccessibilityFatalErrorParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static RenderAccessibilityFatalErrorParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static RenderAccessibilityFatalErrorParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            RenderAccessibilityFatalErrorParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new RenderAccessibilityFatalErrorParams(elementsOrVersion);

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



    
    static final class RenderAccessibilityHitTestParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 24;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.gfx.mojom.Point point;
        public int eventToFire;
        public int requestId;

        private RenderAccessibilityHitTestParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public RenderAccessibilityHitTestParams() {
            this(0);
        }

        public static RenderAccessibilityHitTestParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static RenderAccessibilityHitTestParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static RenderAccessibilityHitTestParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            RenderAccessibilityHitTestParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new RenderAccessibilityHitTestParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.point = org.chromium.gfx.mojom.Point.decode(decoder1);
                    }
                    {
                        
                    result.eventToFire = decoder0.readInt(16);
                        org.chromium.ax.mojom.Event.validate(result.eventToFire);
                        result.eventToFire = org.chromium.ax.mojom.Event.toKnownValue(result.eventToFire);
                    }
                    {
                        
                    result.requestId = decoder0.readInt(20);
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
            
            encoder0.encode(this.point, 8, false);
            
            encoder0.encode(this.eventToFire, 16);
            
            encoder0.encode(this.requestId, 20);
        }
    }



    
    static final class RenderAccessibilityHitTestResponseParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public HitTestResponse hitTestResponse;

        private RenderAccessibilityHitTestResponseParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public RenderAccessibilityHitTestResponseParams() {
            this(0);
        }

        public static RenderAccessibilityHitTestResponseParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static RenderAccessibilityHitTestResponseParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static RenderAccessibilityHitTestResponseParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            RenderAccessibilityHitTestResponseParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new RenderAccessibilityHitTestResponseParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, true);
                    result.hitTestResponse = HitTestResponse.decode(decoder1);
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
            
            encoder0.encode(this.hitTestResponse, 8, true);
        }
    }

    static class RenderAccessibilityHitTestResponseParamsForwardToCallback extends org.chromium.mojo.bindings.SideEffectFreeCloseable
            implements org.chromium.mojo.bindings.MessageReceiver {
        private final RenderAccessibility.HitTest_Response mCallback;

        RenderAccessibilityHitTestResponseParamsForwardToCallback(RenderAccessibility.HitTest_Response callback) {
            this.mCallback = callback;
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(HIT_TEST_ORDINAL,
                                           org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG)) {
                    return false;
                }

                RenderAccessibilityHitTestResponseParams response = RenderAccessibilityHitTestResponseParams.deserialize(messageWithHeader.getPayload());

                mCallback.call(response.hitTestResponse);
                return true;
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                return false;
            }
        }
    }

    static class RenderAccessibilityHitTestResponseParamsProxyToResponder implements RenderAccessibility.HitTest_Response {

        private final org.chromium.mojo.system.Core mCore;
        private final org.chromium.mojo.bindings.MessageReceiver mMessageReceiver;
        private final long mRequestId;

        RenderAccessibilityHitTestResponseParamsProxyToResponder(
                org.chromium.mojo.system.Core core,
                org.chromium.mojo.bindings.MessageReceiver messageReceiver,
                long requestId) {
            mCore = core;
            mMessageReceiver = messageReceiver;
            mRequestId = requestId;
        }

        @Override
        public void call(HitTestResponse hitTestResponse) {
            RenderAccessibilityHitTestResponseParams _response = new RenderAccessibilityHitTestResponseParams();

            _response.hitTestResponse = hitTestResponse;

            org.chromium.mojo.bindings.ServiceMessage _message =
                    _response.serializeWithHeader(
                            mCore,
                            new org.chromium.mojo.bindings.MessageHeader(
                                    HIT_TEST_ORDINAL,
                                    org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_RESPONSE_FLAG,
                                    mRequestId));
            mMessageReceiver.accept(_message);
        }
    }



    
    static final class RenderAccessibilityPerformActionParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public org.chromium.ax.mojom.AxActionData actionData;

        private RenderAccessibilityPerformActionParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public RenderAccessibilityPerformActionParams() {
            this(0);
        }

        public static RenderAccessibilityPerformActionParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static RenderAccessibilityPerformActionParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static RenderAccessibilityPerformActionParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            RenderAccessibilityPerformActionParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new RenderAccessibilityPerformActionParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.actionData = org.chromium.ax.mojom.AxActionData.decode(decoder1);
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
            
            encoder0.encode(this.actionData, 8, false);
        }
    }



    
    static final class RenderAccessibilityResetParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 16;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public int resetToken;

        private RenderAccessibilityResetParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public RenderAccessibilityResetParams() {
            this(0);
        }

        public static RenderAccessibilityResetParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static RenderAccessibilityResetParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static RenderAccessibilityResetParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            RenderAccessibilityResetParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new RenderAccessibilityResetParams(elementsOrVersion);
                    {
                        
                    result.resetToken = decoder0.readInt(8);
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
            
            encoder0.encode(this.resetToken, 8);
        }
    }



}
