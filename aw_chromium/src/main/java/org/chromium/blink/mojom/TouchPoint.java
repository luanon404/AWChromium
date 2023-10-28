// TouchPoint.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/input/input_handler.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public final class TouchPoint extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int state;
    public float radiusX;
    public float radiusY;
    public float rotationAngle;
    public PointerData pointerData;

    private TouchPoint(int version) {
        super(STRUCT_SIZE, version);
    }

    public TouchPoint() {
        this(0);
    }

    public static TouchPoint deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static TouchPoint deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static TouchPoint decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        TouchPoint result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new TouchPoint(elementsOrVersion);
                {
                    
                result.state = decoder0.readInt(8);
                    TouchState.validate(result.state);
                    result.state = TouchState.toKnownValue(result.state);
                }
                {
                    
                result.radiusX = decoder0.readFloat(12);
                }
                {
                    
                result.radiusY = decoder0.readFloat(16);
                }
                {
                    
                result.rotationAngle = decoder0.readFloat(20);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.pointerData = PointerData.decode(decoder1);
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
        
        encoder0.encode(this.state, 8);
        
        encoder0.encode(this.radiusX, 12);
        
        encoder0.encode(this.radiusY, 16);
        
        encoder0.encode(this.rotationAngle, 20);
        
        encoder0.encode(this.pointerData, 24, false);
    }
}