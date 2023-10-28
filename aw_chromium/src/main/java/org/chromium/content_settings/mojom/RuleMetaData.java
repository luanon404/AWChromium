// RuleMetaData.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     components/content_settings/core/common/content_settings.mojom
//

package org.chromium.content_settings.mojom;

import androidx.annotation.IntDef;


public final class RuleMetaData extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 56;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(56, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.mojo_base.mojom.Time lastModified;
    public org.chromium.mojo_base.mojom.Time lastUsed;
    public org.chromium.mojo_base.mojom.Time lastVisited;
    public org.chromium.mojo_base.mojom.Time expiration;
    public int sessionModel;
    public org.chromium.mojo_base.mojom.TimeDelta lifetime;

    private RuleMetaData(int version) {
        super(STRUCT_SIZE, version);
    }

    public RuleMetaData() {
        this(0);
    }

    public static RuleMetaData deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static RuleMetaData deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static RuleMetaData decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        RuleMetaData result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new RuleMetaData(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.lastModified = org.chromium.mojo_base.mojom.Time.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.lastUsed = org.chromium.mojo_base.mojom.Time.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.lastVisited = org.chromium.mojo_base.mojom.Time.decode(decoder1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.expiration = org.chromium.mojo_base.mojom.Time.decode(decoder1);
                }
                {
                    
                result.sessionModel = decoder0.readInt(40);
                    SessionModel.validate(result.sessionModel);
                    result.sessionModel = SessionModel.toKnownValue(result.sessionModel);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, false);
                result.lifetime = org.chromium.mojo_base.mojom.TimeDelta.decode(decoder1);
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
        
        encoder0.encode(this.lastModified, 8, false);
        
        encoder0.encode(this.lastUsed, 16, false);
        
        encoder0.encode(this.lastVisited, 24, false);
        
        encoder0.encode(this.expiration, 32, false);
        
        encoder0.encode(this.sessionModel, 40);
        
        encoder0.encode(this.lifetime, 48, false);
    }
}