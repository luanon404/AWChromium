// PaymentRequest.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/payments/payment_request.mojom
//

package org.chromium.payments.mojom;

public interface PaymentRequest extends org.chromium.mojo.bindings.Interface {


    interface Proxy extends PaymentRequest, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<PaymentRequest, PaymentRequest.Proxy> MANAGER = PaymentRequest_Internal.MANAGER;

    void init(PaymentRequestClient client, PaymentMethodData[] methodData, PaymentDetails details, PaymentOptions options);


    void show(boolean waitForUpdatedDetails, boolean hadUserActivation);


    void updateWith(PaymentDetails details);


    void onPaymentDetailsNotUpdated();


    void abort();


    void complete(int result);


    void retry(PaymentValidationErrors errors);


    void canMakePayment();


    void hasEnrolledInstrument();


}
