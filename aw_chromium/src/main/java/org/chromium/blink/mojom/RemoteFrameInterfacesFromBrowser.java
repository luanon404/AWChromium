// RemoteFrameInterfacesFromBrowser.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/remote_frame.mojom
//

package org.chromium.blink.mojom;


public final class RemoteFrameInterfacesFromBrowser extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 24;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported frameReceiver;
    public org.chromium.mojo.bindings.AssociatedInterfaceNotSupported frameHost;

    private RemoteFrameInterfacesFromBrowser(int version) {
        super(STRUCT_SIZE, version);
    }

    public RemoteFrameInterfacesFromBrowser() {
        this(0);
    }

    public static RemoteFrameInterfacesFromBrowser deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static RemoteFrameInterfacesFromBrowser deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static RemoteFrameInterfacesFromBrowser decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        RemoteFrameInterfacesFromBrowser result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new RemoteFrameInterfacesFromBrowser(elementsOrVersion);
                {
                    
                result.frameReceiver = decoder0.readAssociatedInterfaceRequestNotSupported(8, false);
                }
                {
                    
                result.frameHost = decoder0.readAssociatedServiceInterfaceNotSupported(12, false);
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
        
        encoder0.encode(this.frameReceiver, 8, false);
        
        encoder0.encode(this.frameHost, 12, false);
    }
}