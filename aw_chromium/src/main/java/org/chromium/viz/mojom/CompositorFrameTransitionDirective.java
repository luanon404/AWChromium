// CompositorFrameTransitionDirective.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/viz/public/mojom/compositing/compositor_frame_transition_directive.mojom
//

package org.chromium.viz.mojom;

public final class CompositorFrameTransitionDirective extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.mojo_base.mojom.UnguessableToken navigationId;
    public int sequenceId;
    public int type;
    public CompositorFrameTransitionDirectiveSharedElement[] sharedElements;

    private CompositorFrameTransitionDirective(int version) {
        super(STRUCT_SIZE, version);
    }

    public CompositorFrameTransitionDirective() {
        this(0);
    }

    public static CompositorFrameTransitionDirective deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static CompositorFrameTransitionDirective deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static CompositorFrameTransitionDirective decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        CompositorFrameTransitionDirective result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new CompositorFrameTransitionDirective(elementsOrVersion);
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, true);
                result.navigationId = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
            }
            {

                result.sequenceId = decoder0.readInt(16);
            }
            {

                result.type = decoder0.readInt(20);
                CompositorFrameTransitionDirectiveType.validate(result.type);
                result.type = CompositorFrameTransitionDirectiveType.toKnownValue(result.type);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.sharedElements = new CompositorFrameTransitionDirectiveSharedElement[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {

                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.sharedElements[i1] = CompositorFrameTransitionDirectiveSharedElement.decode(decoder2);
                    }
                }
            }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);

        encoder0.encode(this.navigationId, 8, true);

        encoder0.encode(this.sequenceId, 16);

        encoder0.encode(this.type, 20);

        if (this.sharedElements == null) {
            encoder0.encodeNullPointer(24, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.sharedElements.length, 24, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.sharedElements.length; ++i0) {

                encoder1.encode(this.sharedElements[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
    }
}