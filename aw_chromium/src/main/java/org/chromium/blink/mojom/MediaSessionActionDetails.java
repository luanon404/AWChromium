// MediaSessionActionDetails.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/mediasession/media_session.mojom
//

package org.chromium.blink.mojom;


public final class MediaSessionActionDetails extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int SeekTo = 0;
    }

    private MediaSessionSeekToDetails mSeekTo;

    public void setSeekTo(MediaSessionSeekToDetails seekTo) {
        this.mTag = Tag.SeekTo;
        this.mSeekTo = seekTo;
    }

    public MediaSessionSeekToDetails getSeekTo() {
        assert this.mTag == Tag.SeekTo;
        return this.mSeekTo;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.SeekTo: {
                
                encoder0.encode(this.mSeekTo, offset + 8, false);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static MediaSessionActionDetails deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final MediaSessionActionDetails decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        MediaSessionActionDetails result = new MediaSessionActionDetails();
        switch (dataHeader.elementsOrVersion) {
            case Tag.SeekTo: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mSeekTo = MediaSessionSeekToDetails.decode(decoder1);
                result.mTag = Tag.SeekTo;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}