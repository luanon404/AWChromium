// NoVarySearchWithParseError.java is auto generated by mojom_bindings_generator.py, do not edit


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


public final class NoVarySearchWithParseError extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int NoVarySearch = 0;
        public static final int ParseError = 1;
    };
    private NoVarySearch mNoVarySearch;
    private int mParseError;

    public void setNoVarySearch(NoVarySearch noVarySearch) {
        this.mTag = Tag.NoVarySearch;
        this.mNoVarySearch = noVarySearch;
    }

    public NoVarySearch getNoVarySearch() {
        assert this.mTag == Tag.NoVarySearch;
        return this.mNoVarySearch;
    }

    public void setParseError(int parseError) {
        this.mTag = Tag.ParseError;
        this.mParseError = parseError;
    }

    public int getParseError() {
        assert this.mTag == Tag.ParseError;
        return this.mParseError;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.NoVarySearch: {
                
                encoder0.encode(this.mNoVarySearch, offset + 8, false);
                break;
            }
            case Tag.ParseError: {
                
                encoder0.encode(this.mParseError, offset + 8);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static NoVarySearchWithParseError deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final NoVarySearchWithParseError decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        NoVarySearchWithParseError result = new NoVarySearchWithParseError();
        switch (dataHeader.elementsOrVersion) {
            case Tag.NoVarySearch: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mNoVarySearch = NoVarySearch.decode(decoder1);
                result.mTag = Tag.NoVarySearch;
                break;
            }
            case Tag.ParseError: {
                
                result.mParseError = decoder0.readInt(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE);
                    NoVarySearchParseError.validate(result.mParseError);
                    result.mParseError = NoVarySearchParseError.toKnownValue(result.mParseError);
                result.mTag = Tag.ParseError;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}