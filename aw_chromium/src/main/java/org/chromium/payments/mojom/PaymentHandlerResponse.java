// PaymentHandlerResponse.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/payments/payment_app.mojom
//

package org.chromium.payments.mojom;

import androidx.annotation.IntDef;


public final class PaymentHandlerResponse extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 72;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(72, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String methodName;
    public String stringifiedDetails;
    public int responseType;
    public String payerName;
    public String payerEmail;
    public String payerPhone;
    public PaymentAddress shippingAddress;
    public String shippingOption;

    private PaymentHandlerResponse(int version) {
        super(STRUCT_SIZE, version);
    }

    public PaymentHandlerResponse() {
        this(0);
    }

    public static PaymentHandlerResponse deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static PaymentHandlerResponse deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static PaymentHandlerResponse decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        PaymentHandlerResponse result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new PaymentHandlerResponse(elementsOrVersion);
                {
                    
                result.methodName = decoder0.readString(8, false);
                }
                {
                    
                result.stringifiedDetails = decoder0.readString(16, false);
                }
                {
                    
                result.responseType = decoder0.readInt(24);
                    PaymentEventResponseType.validate(result.responseType);
                    result.responseType = PaymentEventResponseType.toKnownValue(result.responseType);
                }
                {
                    
                result.payerName = decoder0.readString(32, true);
                }
                {
                    
                result.payerEmail = decoder0.readString(40, true);
                }
                {
                    
                result.payerPhone = decoder0.readString(48, true);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, true);
                result.shippingAddress = PaymentAddress.decode(decoder1);
                }
                {
                    
                result.shippingOption = decoder0.readString(64, true);
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
        
        encoder0.encode(this.methodName, 8, false);
        
        encoder0.encode(this.stringifiedDetails, 16, false);
        
        encoder0.encode(this.responseType, 24);
        
        encoder0.encode(this.payerName, 32, true);
        
        encoder0.encode(this.payerEmail, 40, true);
        
        encoder0.encode(this.payerPhone, 48, true);
        
        encoder0.encode(this.shippingAddress, 56, true);
        
        encoder0.encode(this.shippingOption, 64, true);
    }
}