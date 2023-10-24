// AnchorElementMetrics.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/loader/navigation_predictor.mojom
//

package org.chromium.blink.mojom;


public final class AnchorElementMetrics extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 72;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(72, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int anchorId;
    public float ratioArea;
    public float ratioVisibleArea;
    public float ratioDistanceTopToVisibleTop;
    public float ratioDistanceCenterToVisibleTop;
    public float ratioDistanceRootTop;
    public float ratioDistanceRootBottom;
    public boolean isInIframe;
    public boolean containsImage;
    public boolean isSameHost;
    public boolean isUrlIncrementedByOne;
    public boolean hasTextSibling;
    public int fontSizePx;
    public int fontWeight;
    public org.chromium.url.mojom.Url sourceUrl;
    public org.chromium.url.mojom.Url targetUrl;
    public org.chromium.gfx.mojom.Size viewportSize;

    private AnchorElementMetrics(int version) {
        super(STRUCT_SIZE, version);
    }

    public AnchorElementMetrics() {
        this(0);
    }

    public static AnchorElementMetrics deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static AnchorElementMetrics deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static AnchorElementMetrics decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        AnchorElementMetrics result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new AnchorElementMetrics(elementsOrVersion);
                {
                    
                result.anchorId = decoder0.readInt(8);
                }
                {
                    
                result.ratioArea = decoder0.readFloat(12);
                }
                {
                    
                result.ratioVisibleArea = decoder0.readFloat(16);
                }
                {
                    
                result.ratioDistanceTopToVisibleTop = decoder0.readFloat(20);
                }
                {
                    
                result.ratioDistanceCenterToVisibleTop = decoder0.readFloat(24);
                }
                {
                    
                result.ratioDistanceRootTop = decoder0.readFloat(28);
                }
                {
                    
                result.ratioDistanceRootBottom = decoder0.readFloat(32);
                }
                {
                    
                result.isInIframe = decoder0.readBoolean(36, 0);
                }
                {
                    
                result.containsImage = decoder0.readBoolean(36, 1);
                }
                {
                    
                result.isSameHost = decoder0.readBoolean(36, 2);
                }
                {
                    
                result.isUrlIncrementedByOne = decoder0.readBoolean(36, 3);
                }
                {
                    
                result.hasTextSibling = decoder0.readBoolean(36, 4);
                }
                {
                    
                result.fontSizePx = decoder0.readInt(40);
                }
                {
                    
                result.fontWeight = decoder0.readInt(44);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, false);
                result.sourceUrl = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, false);
                result.targetUrl = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(64, false);
                result.viewportSize = org.chromium.gfx.mojom.Size.decode(decoder1);
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
        
        encoder0.encode(this.anchorId, 8);
        
        encoder0.encode(this.ratioArea, 12);
        
        encoder0.encode(this.ratioVisibleArea, 16);
        
        encoder0.encode(this.ratioDistanceTopToVisibleTop, 20);
        
        encoder0.encode(this.ratioDistanceCenterToVisibleTop, 24);
        
        encoder0.encode(this.ratioDistanceRootTop, 28);
        
        encoder0.encode(this.ratioDistanceRootBottom, 32);
        
        encoder0.encode(this.isInIframe, 36, 0);
        
        encoder0.encode(this.containsImage, 36, 1);
        
        encoder0.encode(this.isSameHost, 36, 2);
        
        encoder0.encode(this.isUrlIncrementedByOne, 36, 3);
        
        encoder0.encode(this.hasTextSibling, 36, 4);
        
        encoder0.encode(this.fontSizePx, 40);
        
        encoder0.encode(this.fontWeight, 44);
        
        encoder0.encode(this.sourceUrl, 48, false);
        
        encoder0.encode(this.targetUrl, 56, false);
        
        encoder0.encode(this.viewportSize, 64, false);
    }
}