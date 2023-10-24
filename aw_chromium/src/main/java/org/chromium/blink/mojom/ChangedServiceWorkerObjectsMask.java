// ChangedServiceWorkerObjectsMask.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/service_worker/service_worker_registration.mojom
//

package org.chromium.blink.mojom;


public final class ChangedServiceWorkerObjectsMask extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 16;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public boolean installing;
    public boolean waiting;
    public boolean active;

    private ChangedServiceWorkerObjectsMask(int version) {
        super(STRUCT_SIZE, version);
    }

    public ChangedServiceWorkerObjectsMask() {
        this(0);
    }

    public static ChangedServiceWorkerObjectsMask deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static ChangedServiceWorkerObjectsMask deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static ChangedServiceWorkerObjectsMask decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        ChangedServiceWorkerObjectsMask result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new ChangedServiceWorkerObjectsMask(elementsOrVersion);
                {
                    
                result.installing = decoder0.readBoolean(8, 0);
                }
                {
                    
                result.waiting = decoder0.readBoolean(8, 1);
                }
                {
                    
                result.active = decoder0.readBoolean(8, 2);
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
        
        encoder0.encode(this.installing, 8, 0);
        
        encoder0.encode(this.waiting, 8, 1);
        
        encoder0.encode(this.active, 8, 2);
    }
}