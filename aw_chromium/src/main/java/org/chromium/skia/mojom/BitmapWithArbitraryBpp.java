// BitmapWithArbitraryBpp.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     skia/public/mojom/bitmap.mojom
//

package org.chromium.skia.mojom;

import androidx.annotation.IntDef;


public final class BitmapWithArbitraryBpp extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public ImageInfo imageInfo;
    public long unusedRowBytes;
    public org.chromium.mojo_base.mojom.BigBuffer pixelData;

    private BitmapWithArbitraryBpp(int version) {
        super(STRUCT_SIZE, version);
    }

    public BitmapWithArbitraryBpp() {
        this(0);
    }

    public static BitmapWithArbitraryBpp deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static BitmapWithArbitraryBpp deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static BitmapWithArbitraryBpp decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        BitmapWithArbitraryBpp result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new BitmapWithArbitraryBpp(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.imageInfo = ImageInfo.decode(decoder1);
                }
                {
                    
                result.unusedRowBytes = decoder0.readLong(16);
                }
                {
                    
                result.pixelData = org.chromium.mojo_base.mojom.BigBuffer.decode(decoder0, 24);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.imageInfo, 8, false);
        
        encoder0.encode(this.unusedRowBytes, 16);
        
        encoder0.encode(this.pixelData, 24, false);
    }
}