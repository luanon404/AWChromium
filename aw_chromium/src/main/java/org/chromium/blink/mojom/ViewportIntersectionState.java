// ViewportIntersectionState.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/viewport_intersection_state.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public final class ViewportIntersectionState extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 64;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(64, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.gfx.mojom.Rect viewportIntersection;
    public org.chromium.gfx.mojom.Rect mainFrameIntersection;
    public org.chromium.gfx.mojom.Rect compositorVisibleRect;
    public int occlusionState;
    public org.chromium.gfx.mojom.Size outermostMainFrameSize;
    public org.chromium.gfx.mojom.Point outermostMainFrameScrollPosition;
    public org.chromium.gfx.mojom.Transform mainFrameTransform;

    private ViewportIntersectionState(int version) {
        super(STRUCT_SIZE, version);
        this.occlusionState = (int) FrameOcclusionState.UNKNOWN;
    }

    public ViewportIntersectionState() {
        this(0);
    }

    public static ViewportIntersectionState deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static ViewportIntersectionState deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static ViewportIntersectionState decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        ViewportIntersectionState result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new ViewportIntersectionState(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.viewportIntersection = org.chromium.gfx.mojom.Rect.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.mainFrameIntersection = org.chromium.gfx.mojom.Rect.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.compositorVisibleRect = org.chromium.gfx.mojom.Rect.decode(decoder1);
                }
                {
                    
                result.occlusionState = decoder0.readInt(32);
                    FrameOcclusionState.validate(result.occlusionState);
                    result.occlusionState = FrameOcclusionState.toKnownValue(result.occlusionState);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.outermostMainFrameSize = org.chromium.gfx.mojom.Size.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, false);
                result.outermostMainFrameScrollPosition = org.chromium.gfx.mojom.Point.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, false);
                result.mainFrameTransform = org.chromium.gfx.mojom.Transform.decode(decoder1);
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
        
        encoder0.encode(this.viewportIntersection, 8, false);
        
        encoder0.encode(this.mainFrameIntersection, 16, false);
        
        encoder0.encode(this.compositorVisibleRect, 24, false);
        
        encoder0.encode(this.occlusionState, 32);
        
        encoder0.encode(this.outermostMainFrameSize, 40, false);
        
        encoder0.encode(this.outermostMainFrameScrollPosition, 48, false);
        
        encoder0.encode(this.mainFrameTransform, 56, false);
    }
}