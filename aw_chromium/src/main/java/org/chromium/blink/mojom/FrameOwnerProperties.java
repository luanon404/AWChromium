// FrameOwnerProperties.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/frame_owner_properties.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public final class FrameOwnerProperties extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String name;
    public int scrollbarMode;
    public int marginWidth;
    public int marginHeight;
    public boolean allowFullscreen;
    public boolean allowPaymentRequest;
    public boolean isDisplayNone;
    public int colorScheme;

    private FrameOwnerProperties(int version) {
        super(STRUCT_SIZE, version);
        this.colorScheme = (int) ColorScheme.LIGHT;
    }

    public FrameOwnerProperties() {
        this(0);
    }

    public static FrameOwnerProperties deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static FrameOwnerProperties deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static FrameOwnerProperties decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        FrameOwnerProperties result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new FrameOwnerProperties(elementsOrVersion);
                {
                    
                result.name = decoder0.readString(8, false);
                }
                {
                    
                result.scrollbarMode = decoder0.readInt(16);
                    ScrollbarMode.validate(result.scrollbarMode);
                    result.scrollbarMode = ScrollbarMode.toKnownValue(result.scrollbarMode);
                }
                {
                    
                result.marginWidth = decoder0.readInt(20);
                }
                {
                    
                result.marginHeight = decoder0.readInt(24);
                }
                {
                    
                result.allowFullscreen = decoder0.readBoolean(28, 0);
                }
                {
                    
                result.allowPaymentRequest = decoder0.readBoolean(28, 1);
                }
                {
                    
                result.isDisplayNone = decoder0.readBoolean(28, 2);
                }
                {
                    
                result.colorScheme = decoder0.readInt(32);
                    ColorScheme.validate(result.colorScheme);
                    result.colorScheme = ColorScheme.toKnownValue(result.colorScheme);
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
        
        encoder0.encode(this.name, 8, false);
        
        encoder0.encode(this.scrollbarMode, 16);
        
        encoder0.encode(this.marginWidth, 20);
        
        encoder0.encode(this.marginHeight, 24);
        
        encoder0.encode(this.allowFullscreen, 28, 0);
        
        encoder0.encode(this.allowPaymentRequest, 28, 1);
        
        encoder0.encode(this.isDisplayNone, 28, 2);
        
        encoder0.encode(this.colorScheme, 32);
    }
}