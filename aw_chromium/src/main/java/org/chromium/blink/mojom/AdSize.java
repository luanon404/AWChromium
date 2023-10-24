// AdSize.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/interest_group/ad_display_size.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public final class AdSize extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

    public static final class LengthUnit {
        private static final boolean IS_EXTENSIBLE = true;
        @IntDef({

            LengthUnit.INVALID,
            LengthUnit.PIXELS,
            LengthUnit.SCREEN_WIDTH,
            LengthUnit.SCREEN_HEIGHT})
        public @interface EnumType {}

        public static final int INVALID = 0;
        public static final int PIXELS = 1;
        public static final int SCREEN_WIDTH = 2;
        public static final int SCREEN_HEIGHT = 3;
        public static final int MIN_VALUE = 0;
        public static final int MAX_VALUE = 3;
        public static final int DEFAULT_VALUE = 0;

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 3;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        public static int toKnownValue(int value) {
          if (isKnownValue(value)) {
            return value;
          }
          return DEFAULT_VALUE;
        }

        private LengthUnit() {}
    }
    public double width;
    public int widthUnits;
    public double height;
    public int heightUnits;

    private AdSize(int version) {
        super(STRUCT_SIZE, version);
    }

    public AdSize() {
        this(0);
    }

    public static AdSize deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static AdSize deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static AdSize decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        AdSize result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new AdSize(elementsOrVersion);
                {
                    
                result.width = decoder0.readDouble(8);
                }
                {
                    
                result.widthUnits = decoder0.readInt(16);
                    AdSize.LengthUnit.validate(result.widthUnits);
                    result.widthUnits = AdSize.LengthUnit.toKnownValue(result.widthUnits);
                }
                {
                    
                result.heightUnits = decoder0.readInt(20);
                    AdSize.LengthUnit.validate(result.heightUnits);
                    result.heightUnits = AdSize.LengthUnit.toKnownValue(result.heightUnits);
                }
                {
                    
                result.height = decoder0.readDouble(24);
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
        
        encoder0.encode(this.width, 8);
        
        encoder0.encode(this.widthUnits, 16);
        
        encoder0.encode(this.heightUnits, 20);
        
        encoder0.encode(this.height, 24);
    }
}