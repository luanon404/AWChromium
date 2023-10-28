// PaymentOptions.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/payments/payment_request.mojom
//

package org.chromium.payments.mojom;

import androidx.annotation.IntDef;


public final class PaymentOptions extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 16;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public boolean requestPayerName;
    public boolean requestPayerEmail;
    public boolean requestPayerPhone;
    public boolean requestShipping;
    public int shippingType;

    private PaymentOptions(int version) {
        super(STRUCT_SIZE, version);
    }

    public PaymentOptions() {
        this(0);
    }

    public static PaymentOptions deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static PaymentOptions deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static PaymentOptions decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        PaymentOptions result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new PaymentOptions(elementsOrVersion);
                {
                    
                result.requestPayerName = decoder0.readBoolean(8, 0);
                }
                {
                    
                result.requestPayerEmail = decoder0.readBoolean(8, 1);
                }
                {
                    
                result.requestPayerPhone = decoder0.readBoolean(8, 2);
                }
                {
                    
                result.requestShipping = decoder0.readBoolean(8, 3);
                }
                {
                    
                result.shippingType = decoder0.readInt(12);
                    PaymentShippingType.validate(result.shippingType);
                    result.shippingType = PaymentShippingType.toKnownValue(result.shippingType);
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
        
        encoder0.encode(this.requestPayerName, 8, 0);
        
        encoder0.encode(this.requestPayerEmail, 8, 1);
        
        encoder0.encode(this.requestPayerPhone, 8, 2);
        
        encoder0.encode(this.requestShipping, 8, 3);
        
        encoder0.encode(this.shippingType, 12);
    }
}