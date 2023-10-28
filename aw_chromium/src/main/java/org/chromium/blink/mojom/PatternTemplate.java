// PatternTemplate.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/safe_url_pattern.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public final class PatternTemplate extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int Fixed = 0;
        public static final int FullWildcard = 1;
        public static final int SegmentWildcard = 2;
    };
    private FixedPattern mFixed;
    private WildcardPattern mFullWildcard;
    private WildcardPattern mSegmentWildcard;

    public void setFixed(FixedPattern fixed) {
        this.mTag = Tag.Fixed;
        this.mFixed = fixed;
    }

    public FixedPattern getFixed() {
        assert this.mTag == Tag.Fixed;
        return this.mFixed;
    }

    public void setFullWildcard(WildcardPattern fullWildcard) {
        this.mTag = Tag.FullWildcard;
        this.mFullWildcard = fullWildcard;
    }

    public WildcardPattern getFullWildcard() {
        assert this.mTag == Tag.FullWildcard;
        return this.mFullWildcard;
    }

    public void setSegmentWildcard(WildcardPattern segmentWildcard) {
        this.mTag = Tag.SegmentWildcard;
        this.mSegmentWildcard = segmentWildcard;
    }

    public WildcardPattern getSegmentWildcard() {
        assert this.mTag == Tag.SegmentWildcard;
        return this.mSegmentWildcard;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.Fixed: {
                
                encoder0.encode(this.mFixed, offset + 8, false);
                break;
            }
            case Tag.FullWildcard: {
                
                encoder0.encode(this.mFullWildcard, offset + 8, false);
                break;
            }
            case Tag.SegmentWildcard: {
                
                encoder0.encode(this.mSegmentWildcard, offset + 8, false);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static PatternTemplate deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final PatternTemplate decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        PatternTemplate result = new PatternTemplate();
        switch (dataHeader.elementsOrVersion) {
            case Tag.Fixed: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mFixed = FixedPattern.decode(decoder1);
                result.mTag = Tag.Fixed;
                break;
            }
            case Tag.FullWildcard: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mFullWildcard = WildcardPattern.decode(decoder1);
                result.mTag = Tag.FullWildcard;
                break;
            }
            case Tag.SegmentWildcard: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mSegmentWildcard = WildcardPattern.decode(decoder1);
                result.mTag = Tag.SegmentWildcard;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}