// AuctionAdConfigMaybePromiseBuyerTimeouts.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/interest_group/interest_group_types.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public final class AuctionAdConfigMaybePromiseBuyerTimeouts extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int Promise = 0;
        public static final int Value = 1;
    };
    private int mPromise;
    private AuctionAdConfigBuyerTimeouts mValue;

    public void setPromise(int promise) {
        this.mTag = Tag.Promise;
        this.mPromise = promise;
    }

    public int getPromise() {
        assert this.mTag == Tag.Promise;
        return this.mPromise;
    }

    public void setValue(AuctionAdConfigBuyerTimeouts value) {
        this.mTag = Tag.Value;
        this.mValue = value;
    }

    public AuctionAdConfigBuyerTimeouts getValue() {
        assert this.mTag == Tag.Value;
        return this.mValue;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.Promise: {
                
                encoder0.encode(this.mPromise, offset + 8);
                break;
            }
            case Tag.Value: {
                
                encoder0.encode(this.mValue, offset + 8, false);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static AuctionAdConfigMaybePromiseBuyerTimeouts deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final AuctionAdConfigMaybePromiseBuyerTimeouts decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        AuctionAdConfigMaybePromiseBuyerTimeouts result = new AuctionAdConfigMaybePromiseBuyerTimeouts();
        switch (dataHeader.elementsOrVersion) {
            case Tag.Promise: {
                
                result.mPromise = decoder0.readInt(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE);
                result.mTag = Tag.Promise;
                break;
            }
            case Tag.Value: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mValue = AuctionAdConfigBuyerTimeouts.decode(decoder1);
                result.mTag = Tag.Value;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}