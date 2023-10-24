// BackgroundSyncRegistrationInfo.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/background_sync/background_sync.mojom
//

package org.chromium.blink.mojom;


public final class BackgroundSyncRegistrationInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public long serviceWorkerRegistrationId;
    public String tag;
    public int syncType;

    private BackgroundSyncRegistrationInfo(int version) {
        super(STRUCT_SIZE, version);
        this.serviceWorkerRegistrationId = (long) -1;
    }

    public BackgroundSyncRegistrationInfo() {
        this(0);
    }

    public static BackgroundSyncRegistrationInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static BackgroundSyncRegistrationInfo deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static BackgroundSyncRegistrationInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        BackgroundSyncRegistrationInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new BackgroundSyncRegistrationInfo(elementsOrVersion);
                {
                    
                result.serviceWorkerRegistrationId = decoder0.readLong(8);
                }
                {
                    
                result.tag = decoder0.readString(16, false);
                }
                {
                    
                result.syncType = decoder0.readInt(24);
                    BackgroundSyncType.validate(result.syncType);
                    result.syncType = BackgroundSyncType.toKnownValue(result.syncType);
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
        
        encoder0.encode(this.serviceWorkerRegistrationId, 8);
        
        encoder0.encode(this.tag, 16, false);
        
        encoder0.encode(this.syncType, 24);
    }
}