// CdmPromiseResult.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/content_decryption_module.mojom
//

package org.chromium.media.mojom;

import androidx.annotation.IntDef;


public final class CdmPromiseResult extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];

    public static final class Exception {
        private static final boolean IS_EXTENSIBLE = false;
        @IntDef({
    })
        public @interface EnumType {}


        public static boolean isKnownValue(int value) {
            return false;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        public static int toKnownValue(int value) {
          return value;
        }

        private Exception() {}
    }
    public boolean success;
    public int exception;
    public int systemCode;
    public String errorMessage;

    private CdmPromiseResult(int version) {
        super(STRUCT_SIZE, version);
    }

    public CdmPromiseResult() {
        this(0);
    }

    public static CdmPromiseResult deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static CdmPromiseResult deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static CdmPromiseResult decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        CdmPromiseResult result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new CdmPromiseResult(elementsOrVersion);
                {
                    
                result.success = decoder0.readBoolean(8, 0);
                }
                {
                    
                result.exception = decoder0.readInt(12);
                    CdmPromiseResult.Exception.validate(result.exception);
                    result.exception = CdmPromiseResult.Exception.toKnownValue(result.exception);
                }
                {
                    
                result.systemCode = decoder0.readInt(16);
                }
                {
                    
                result.errorMessage = decoder0.readString(24, false);
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
        
        encoder0.encode(this.success, 8, 0);
        
        encoder0.encode(this.exception, 12);
        
        encoder0.encode(this.systemCode, 16);
        
        encoder0.encode(this.errorMessage, 24, false);
    }
}