// HomeTabUnion.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/manifest/manifest.mojom
//

package org.chromium.blink.mojom;


public final class HomeTabUnion extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int Visibility = 0;
        public static final int Params = 1;
    }

    private int mVisibility;
    private HomeTabParams mParams;

    public void setVisibility(int visibility) {
        this.mTag = Tag.Visibility;
        this.mVisibility = visibility;
    }

    public int getVisibility() {
        assert this.mTag == Tag.Visibility;
        return this.mVisibility;
    }

    public void setParams(HomeTabParams params) {
        this.mTag = Tag.Params;
        this.mParams = params;
    }

    public HomeTabParams getParams() {
        assert this.mTag == Tag.Params;
        return this.mParams;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.Visibility: {
                
                encoder0.encode(this.mVisibility, offset + 8);
                break;
            }
            case Tag.Params: {
                
                encoder0.encode(this.mParams, offset + 8, false);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static HomeTabUnion deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final HomeTabUnion decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        HomeTabUnion result = new HomeTabUnion();
        switch (dataHeader.elementsOrVersion) {
            case Tag.Visibility: {
                
                result.mVisibility = decoder0.readInt(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE);
                    TabStripMemberVisibility.validate(result.mVisibility);
                    result.mVisibility = TabStripMemberVisibility.toKnownValue(result.mVisibility);
                result.mTag = Tag.Visibility;
                break;
            }
            case Tag.Params: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mParams = HomeTabParams.decode(decoder1);
                result.mTag = Tag.Params;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}