// SearchParamsVariance.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/no_vary_search.mojom
//

package org.chromium.network.mojom;

import androidx.annotation.IntDef;


public final class SearchParamsVariance extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int NoVaryParams = 0;
        public static final int VaryParams = 1;
    };
    private String[] mNoVaryParams;
    private String[] mVaryParams;

    public void setNoVaryParams(String[] noVaryParams) {
        this.mTag = Tag.NoVaryParams;
        this.mNoVaryParams = noVaryParams;
    }

    public String[] getNoVaryParams() {
        assert this.mTag == Tag.NoVaryParams;
        return this.mNoVaryParams;
    }

    public void setVaryParams(String[] varyParams) {
        this.mTag = Tag.VaryParams;
        this.mVaryParams = varyParams;
    }

    public String[] getVaryParams() {
        assert this.mTag == Tag.VaryParams;
        return this.mVaryParams;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.NoVaryParams: {
                
                if (this.mNoVaryParams == null) {
                    encoder0.encodeNullPointer(offset + 8, false);
                } else {
                    org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.mNoVaryParams.length, offset + 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    for (int i0 = 0; i0 < this.mNoVaryParams.length; ++i0) {
                        
                        encoder1.encode(this.mNoVaryParams[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                    }
                }
                break;
            }
            case Tag.VaryParams: {
                
                if (this.mVaryParams == null) {
                    encoder0.encodeNullPointer(offset + 8, false);
                } else {
                    org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.mVaryParams.length, offset + 8, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    for (int i0 = 0; i0 < this.mVaryParams.length; ++i0) {
                        
                        encoder1.encode(this.mVaryParams[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
                    }
                }
                break;
            }
            default: {
                break;
            }
        }
    }

    public static SearchParamsVariance deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final SearchParamsVariance decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        SearchParamsVariance result = new SearchParamsVariance();
        switch (dataHeader.elementsOrVersion) {
            case Tag.NoVaryParams: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.mNoVaryParams = new String[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        result.mNoVaryParams[i1] = decoder1.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                    }
                }
                result.mTag = Tag.NoVaryParams;
                break;
            }
            case Tag.VaryParams: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.mVaryParams = new String[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        result.mVaryParams[i1] = decoder1.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                    }
                }
                result.mTag = Tag.VaryParams;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}