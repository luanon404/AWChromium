// BigBuffer.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     mojo/public/mojom/base/big_buffer.mojom
//

package org.chromium.mojo_base.mojom;

import androidx.annotation.IntDef;


public final class BigBuffer extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int Bytes = 0;
        public static final int SharedMemory = 1;
        public static final int InvalidBuffer = 2;
    }

    private byte[] mBytes;
    private BigBufferSharedMemoryRegion mSharedMemory;
    private boolean mInvalidBuffer;

    public void setBytes(byte[] bytes) {
        this.mTag = Tag.Bytes;
        this.mBytes = bytes;
    }

    public byte[] getBytes() {
        assert this.mTag == Tag.Bytes;
        return this.mBytes;
    }

    public void setSharedMemory(BigBufferSharedMemoryRegion sharedMemory) {
        this.mTag = Tag.SharedMemory;
        this.mSharedMemory = sharedMemory;
    }

    public BigBufferSharedMemoryRegion getSharedMemory() {
        assert this.mTag == Tag.SharedMemory;
        return this.mSharedMemory;
    }

    public void setInvalidBuffer(boolean invalidBuffer) {
        this.mTag = Tag.InvalidBuffer;
        this.mInvalidBuffer = invalidBuffer;
    }

    public boolean getInvalidBuffer() {
        assert this.mTag == Tag.InvalidBuffer;
        return this.mInvalidBuffer;
    }


    @Override
    protected void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.Bytes: {
                
                encoder0.encode(this.mBytes, offset + 8, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                break;
            }
            case Tag.SharedMemory: {
                
                encoder0.encode(this.mSharedMemory, offset + 8, false);
                break;
            }
            case Tag.InvalidBuffer: {
                
                encoder0.encode(this.mInvalidBuffer, offset + 8, 0);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static BigBuffer deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static BigBuffer decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        BigBuffer result = new BigBuffer();
        switch (dataHeader.elementsOrVersion) {
            case Tag.Bytes: {
                
                result.mBytes = decoder0.readBytes(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                result.mTag = Tag.Bytes;
                break;
            }
            case Tag.SharedMemory: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mSharedMemory = BigBufferSharedMemoryRegion.decode(decoder1);
                result.mTag = Tag.SharedMemory;
                break;
            }
            case Tag.InvalidBuffer: {
                
                result.mInvalidBuffer = decoder0.readBoolean(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, 0);
                result.mTag = Tag.InvalidBuffer;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}