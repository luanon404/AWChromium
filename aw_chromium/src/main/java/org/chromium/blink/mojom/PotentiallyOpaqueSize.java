// PotentiallyOpaqueSize.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/fenced_frame/fenced_frame_config.mojom
//

package org.chromium.blink.mojom;


public final class PotentiallyOpaqueSize extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int Transparent = 0;
        public static final int Opaque = 1;
    }

    private org.chromium.gfx.mojom.Size mTransparent;
    private int mOpaque;

    public void setTransparent(org.chromium.gfx.mojom.Size transparent) {
        this.mTag = Tag.Transparent;
        this.mTransparent = transparent;
    }

    public org.chromium.gfx.mojom.Size getTransparent() {
        assert this.mTag == Tag.Transparent;
        return this.mTransparent;
    }

    public void setOpaque(int opaque) {
        this.mTag = Tag.Opaque;
        this.mOpaque = opaque;
    }

    public int getOpaque() {
        assert this.mTag == Tag.Opaque;
        return this.mOpaque;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.Transparent: {
                
                encoder0.encode(this.mTransparent, offset + 8, false);
                break;
            }
            case Tag.Opaque: {
                
                encoder0.encode(this.mOpaque, offset + 8);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static PotentiallyOpaqueSize deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final PotentiallyOpaqueSize decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        PotentiallyOpaqueSize result = new PotentiallyOpaqueSize();
        switch (dataHeader.elementsOrVersion) {
            case Tag.Transparent: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mTransparent = org.chromium.gfx.mojom.Size.decode(decoder1);
                result.mTag = Tag.Transparent;
                break;
            }
            case Tag.Opaque: {
                
                result.mOpaque = decoder0.readInt(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE);
                    Opaque.validate(result.mOpaque);
                    result.mOpaque = Opaque.toKnownValue(result.mOpaque);
                result.mTag = Tag.Opaque;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}