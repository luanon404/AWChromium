// TransferableDirectory.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/transferable_directory.mojom
//

package org.chromium.network.mojom;

public final class TransferableDirectory extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int HandleForIpc = 0;
        public static final int Path = 1;
    }

    private org.chromium.mojo.system.UntypedHandle mHandleForIpc;
    private org.chromium.mojo_base.mojom.FilePath mPath;

    public void setHandleForIpc(org.chromium.mojo.system.UntypedHandle handleForIpc) {
        this.mTag = Tag.HandleForIpc;
        this.mHandleForIpc = handleForIpc;
    }

    public org.chromium.mojo.system.UntypedHandle getHandleForIpc() {
        assert this.mTag == Tag.HandleForIpc;
        return this.mHandleForIpc;
    }

    public void setPath(org.chromium.mojo_base.mojom.FilePath path) {
        this.mTag = Tag.Path;
        this.mPath = path;
    }

    public org.chromium.mojo_base.mojom.FilePath getPath() {
        assert this.mTag == Tag.Path;
        return this.mPath;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.HandleForIpc: {

                encoder0.encode(this.mHandleForIpc, offset + 8, false);
                break;
            }
            case Tag.Path: {

                encoder0.encode(this.mPath, offset + 8, false);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static TransferableDirectory deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final TransferableDirectory decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        TransferableDirectory result = new TransferableDirectory();
        switch (dataHeader.elementsOrVersion) {
            case Tag.HandleForIpc: {

                result.mHandleForIpc = decoder0.readUntypedHandle(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mTag = Tag.HandleForIpc;
                break;
            }
            case Tag.Path: {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mPath = org.chromium.mojo_base.mojom.FilePath.decode(decoder1);
                result.mTag = Tag.Path;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}