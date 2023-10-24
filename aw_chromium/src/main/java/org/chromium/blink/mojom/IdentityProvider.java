// IdentityProvider.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/webid/federated_auth_request.mojom
//

package org.chromium.blink.mojom;


public final class IdentityProvider extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int Federated = 0;
        public static final int Holder = 1;
    }

    private IdentityProviderConfig mFederated;
    private WalletProvider mHolder;

    public void setFederated(IdentityProviderConfig federated) {
        this.mTag = Tag.Federated;
        this.mFederated = federated;
    }

    public IdentityProviderConfig getFederated() {
        assert this.mTag == Tag.Federated;
        return this.mFederated;
    }

    public void setHolder(WalletProvider holder) {
        this.mTag = Tag.Holder;
        this.mHolder = holder;
    }

    public WalletProvider getHolder() {
        assert this.mTag == Tag.Holder;
        return this.mHolder;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.Federated: {
                
                encoder0.encode(this.mFederated, offset + 8, false);
                break;
            }
            case Tag.Holder: {
                
                encoder0.encode(this.mHolder, offset + 8, false);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static IdentityProvider deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final IdentityProvider decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        IdentityProvider result = new IdentityProvider();
        switch (dataHeader.elementsOrVersion) {
            case Tag.Federated: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mFederated = IdentityProviderConfig.decode(decoder1);
                result.mTag = Tag.Federated;
                break;
            }
            case Tag.Holder: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mHolder = WalletProvider.decode(decoder1);
                result.mTag = Tag.Holder;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}