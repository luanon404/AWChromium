// NavigationDownloadTypes.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/navigation/navigation_policy.mojom
//

package org.chromium.blink.mojom;


public final class NavigationDownloadTypes extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 16;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(16, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public boolean viewSource;
    public boolean interstitial;
    public boolean openerCrossOrigin;
    public boolean adFrameNoGesture;
    public boolean adFrame;
    public boolean sandbox;
    public boolean noGesture;

    private NavigationDownloadTypes(int version) {
        super(STRUCT_SIZE, version);
    }

    public NavigationDownloadTypes() {
        this(0);
    }

    public static NavigationDownloadTypes deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static NavigationDownloadTypes deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static NavigationDownloadTypes decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        NavigationDownloadTypes result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new NavigationDownloadTypes(elementsOrVersion);
                {
                    
                result.viewSource = decoder0.readBoolean(8, 0);
                }
                {
                    
                result.interstitial = decoder0.readBoolean(8, 1);
                }
                {
                    
                result.openerCrossOrigin = decoder0.readBoolean(8, 2);
                }
                {
                    
                result.adFrameNoGesture = decoder0.readBoolean(8, 3);
                }
                {
                    
                result.adFrame = decoder0.readBoolean(8, 4);
                }
                {
                    
                result.sandbox = decoder0.readBoolean(8, 5);
                }
                {
                    
                result.noGesture = decoder0.readBoolean(8, 6);
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
        
        encoder0.encode(this.viewSource, 8, 0);
        
        encoder0.encode(this.interstitial, 8, 1);
        
        encoder0.encode(this.openerCrossOrigin, 8, 2);
        
        encoder0.encode(this.adFrameNoGesture, 8, 3);
        
        encoder0.encode(this.adFrame, 8, 4);
        
        encoder0.encode(this.sandbox, 8, 5);
        
        encoder0.encode(this.noGesture, 8, 6);
    }
}