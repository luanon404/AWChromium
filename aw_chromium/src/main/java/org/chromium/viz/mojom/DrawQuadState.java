// DrawQuadState.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/viz/public/mojom/compositing/quads.mojom
//

package org.chromium.viz.mojom;

public final class DrawQuadState extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int DebugBorderQuadState = 0;
        public static final int RenderPassQuadState = 1;
        public static final int SolidColorQuadState = 2;
        public static final int SurfaceQuadState = 3;
        public static final int TextureQuadState = 4;
        public static final int TileQuadState = 5;
        public static final int YuvVideoQuadState = 6;
        public static final int VideoHoleQuadState = 7;
        public static final int SharedElementQuadState = 8;
    }

    private DebugBorderQuadState mDebugBorderQuadState;
    private CompositorRenderPassQuadState mRenderPassQuadState;
    private SolidColorQuadState mSolidColorQuadState;
    private SurfaceQuadState mSurfaceQuadState;
    private TextureQuadState mTextureQuadState;
    private TileQuadState mTileQuadState;
    private YuvVideoQuadState mYuvVideoQuadState;
    private VideoHoleQuadState mVideoHoleQuadState;
    private SharedElementQuadState mSharedElementQuadState;


    @Override
    protected void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.DebugBorderQuadState: {

                encoder0.encode(this.mDebugBorderQuadState, offset + 8, false);
                break;
            }
            case Tag.RenderPassQuadState: {

                encoder0.encode(this.mRenderPassQuadState, offset + 8, false);
                break;
            }
            case Tag.SolidColorQuadState: {

                encoder0.encode(this.mSolidColorQuadState, offset + 8, false);
                break;
            }
            case Tag.SurfaceQuadState: {

                encoder0.encode(this.mSurfaceQuadState, offset + 8, false);
                break;
            }
            case Tag.TextureQuadState: {

                encoder0.encode(this.mTextureQuadState, offset + 8, false);
                break;
            }
            case Tag.TileQuadState: {

                encoder0.encode(this.mTileQuadState, offset + 8, false);
                break;
            }
            case Tag.YuvVideoQuadState: {

                encoder0.encode(this.mYuvVideoQuadState, offset + 8, false);
                break;
            }
            case Tag.VideoHoleQuadState: {

                encoder0.encode(this.mVideoHoleQuadState, offset + 8, false);
                break;
            }
            case Tag.SharedElementQuadState: {

                encoder0.encode(this.mSharedElementQuadState, offset + 8, false);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static DrawQuadState deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static DrawQuadState decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        DrawQuadState result = new DrawQuadState();
        switch (dataHeader.elementsOrVersion) {
            case Tag.DebugBorderQuadState: {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mDebugBorderQuadState = DebugBorderQuadState.decode(decoder1);
                result.mTag = Tag.DebugBorderQuadState;
                break;
            }
            case Tag.RenderPassQuadState: {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mRenderPassQuadState = CompositorRenderPassQuadState.decode(decoder1);
                result.mTag = Tag.RenderPassQuadState;
                break;
            }
            case Tag.SolidColorQuadState: {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mSolidColorQuadState = SolidColorQuadState.decode(decoder1);
                result.mTag = Tag.SolidColorQuadState;
                break;
            }
            case Tag.SurfaceQuadState: {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mSurfaceQuadState = SurfaceQuadState.decode(decoder1);
                result.mTag = Tag.SurfaceQuadState;
                break;
            }
            case Tag.TextureQuadState: {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mTextureQuadState = TextureQuadState.decode(decoder1);
                result.mTag = Tag.TextureQuadState;
                break;
            }
            case Tag.TileQuadState: {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mTileQuadState = TileQuadState.decode(decoder1);
                result.mTag = Tag.TileQuadState;
                break;
            }
            case Tag.YuvVideoQuadState: {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mYuvVideoQuadState = YuvVideoQuadState.decode(decoder1);
                result.mTag = Tag.YuvVideoQuadState;
                break;
            }
            case Tag.VideoHoleQuadState: {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mVideoHoleQuadState = VideoHoleQuadState.decode(decoder1);
                result.mTag = Tag.VideoHoleQuadState;
                break;
            }
            case Tag.SharedElementQuadState: {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mSharedElementQuadState = SharedElementQuadState.decode(decoder1);
                result.mTag = Tag.SharedElementQuadState;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}