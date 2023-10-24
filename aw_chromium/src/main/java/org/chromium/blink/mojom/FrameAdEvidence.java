// FrameAdEvidence.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/ad_tagging/ad_evidence.mojom
//

package org.chromium.blink.mojom;


public final class FrameAdEvidence extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 24;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(24, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public boolean isComplete;
    public boolean parentIsAd;
    public int latestFilterListResult;
    public int mostRestrictiveFilterListResult;
    public int createdByAdScript;

    private FrameAdEvidence(int version) {
        super(STRUCT_SIZE, version);
        this.latestFilterListResult = (int) FilterListResult.NOT_CHECKED;
        this.mostRestrictiveFilterListResult = (int) FilterListResult.NOT_CHECKED;
        this.createdByAdScript = (int) FrameCreationStackEvidence.NOT_CREATED_BY_AD_SCRIPT;
    }

    public FrameAdEvidence() {
        this(0);
    }

    public static FrameAdEvidence deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static FrameAdEvidence deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static FrameAdEvidence decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        FrameAdEvidence result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new FrameAdEvidence(elementsOrVersion);
                {
                    
                result.isComplete = decoder0.readBoolean(8, 0);
                }
                {
                    
                result.parentIsAd = decoder0.readBoolean(8, 1);
                }
                {
                    
                result.latestFilterListResult = decoder0.readInt(12);
                    FilterListResult.validate(result.latestFilterListResult);
                    result.latestFilterListResult = FilterListResult.toKnownValue(result.latestFilterListResult);
                }
                {
                    
                result.mostRestrictiveFilterListResult = decoder0.readInt(16);
                    FilterListResult.validate(result.mostRestrictiveFilterListResult);
                    result.mostRestrictiveFilterListResult = FilterListResult.toKnownValue(result.mostRestrictiveFilterListResult);
                }
                {
                    
                result.createdByAdScript = decoder0.readInt(20);
                    FrameCreationStackEvidence.validate(result.createdByAdScript);
                    result.createdByAdScript = FrameCreationStackEvidence.toKnownValue(result.createdByAdScript);
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
        
        encoder0.encode(this.isComplete, 8, 0);
        
        encoder0.encode(this.parentIsAd, 8, 1);
        
        encoder0.encode(this.latestFilterListResult, 12);
        
        encoder0.encode(this.mostRestrictiveFilterListResult, 16);
        
        encoder0.encode(this.createdByAdScript, 20);
    }
}