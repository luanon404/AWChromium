// RunOutput.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     mojo/public/interfaces/bindings/interface_control_messages.mojom
//

package org.chromium.mojo.bindings.interfacecontrol;

import androidx.annotation.IntDef;

import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;


public final class RunOutput extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int QueryVersionResult = 0;
    }

    private QueryVersionResult mQueryVersionResult;

    public void setQueryVersionResult(QueryVersionResult queryVersionResult) {
        this.mTag = Tag.QueryVersionResult;
        this.mQueryVersionResult = queryVersionResult;
    }

    public QueryVersionResult getQueryVersionResult() {
        assert this.mTag == Tag.QueryVersionResult;
        return this.mQueryVersionResult;
    }


    @Override
    protected void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        if (mTag == Tag.QueryVersionResult) {
            encoder0.encode(this.mQueryVersionResult, offset + 8, false);
        }
    }

    public static RunOutput deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static RunOutput decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        RunOutput result = new RunOutput();
        if (dataHeader.elementsOrVersion == Tag.QueryVersionResult) {
            Decoder decoder1 = decoder0.readPointer(offset + DataHeader.HEADER_SIZE, false);
            result.mQueryVersionResult = QueryVersionResult.decode(decoder1);
            result.mTag = Tag.QueryVersionResult;
        }
        return result;
    }
}