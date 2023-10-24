// SmartCardListReadersResult.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/smart_card.mojom
//

package org.chromium.device.mojom;

public final class SmartCardListReadersResult extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int Readers = 0;
        public static final int Error = 1;
    }

    private String[] mReaders;
    private int mError;

    public void setReaders(String[] readers) {
        this.mTag = Tag.Readers;
        this.mReaders = readers;
    }

    public String[] getReaders() {
        assert this.mTag == Tag.Readers;
        return this.mReaders;
    }

    public void setError(int error) {
        this.mTag = Tag.Error;
        this.mError = error;
    }

    public int getError() {
        assert this.mTag == Tag.Error;
        return this.mError;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.Readers: {

                if (this.mReaders == null) {
                    encoder0.encodeNullPointer(offset + 8, false);
                } else {
                    org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.mReaders.length, offset + 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    for (int i0 = 0; i0 < this.mReaders.length; ++i0) {

                        encoder1.encode(this.mReaders[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                    }
                }
                break;
            }
            case Tag.Error: {

                encoder0.encode(this.mError, offset + 8);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static SmartCardListReadersResult deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final SmartCardListReadersResult decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        SmartCardListReadersResult result = new SmartCardListReadersResult();
        switch (dataHeader.elementsOrVersion) {
            case Tag.Readers: {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.mReaders = new String[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {

                        result.mReaders[i1] = decoder1.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                    }
                }
                result.mTag = Tag.Readers;
                break;
            }
            case Tag.Error: {

                result.mError = decoder0.readInt(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE);
                SmartCardError.validate(result.mError);
                result.mError = SmartCardError.toKnownValue(result.mError);
                result.mTag = Tag.Error;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}