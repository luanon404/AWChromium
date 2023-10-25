// TransferableResource.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/viz/public/mojom/compositing/transferable_resource.mojom
//

package org.chromium.viz.mojom;

public final class TransferableResource extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 88;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(88, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public ResourceId id;
    public SharedImageFormat format;
    public org.chromium.gfx.mojom.Size size;
    public org.chromium.gpu.mojom.MailboxHolder mailboxHolder;
    public int synchronizationType;
    public boolean isSoftware;
    public boolean isOverlayCandidate;
    public boolean isBackedBySurfaceTexture;
    public boolean wantsPromotionHint;
    public org.chromium.gfx.mojom.ColorSpace colorSpace;
    public org.chromium.gfx.mojom.ColorSpace colorSpaceWhenSampled;
    public org.chromium.gfx.mojom.HdrMetadata hdrMetadata;
    public org.chromium.gpu.mojom.VulkanYCbCrInfo ycbcrInfo;

    private TransferableResource(int version) {
        super(STRUCT_SIZE, version);
    }

    public static TransferableResource deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static TransferableResource deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<>()));
    }

    public static TransferableResource decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        TransferableResource result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new TransferableResource(elementsOrVersion);
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.id = ResourceId.decode(decoder1);
            }
            {

                result.format = SharedImageFormat.decode(decoder0, 16);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.size = org.chromium.gfx.mojom.Size.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(40, false);
                result.mailboxHolder = org.chromium.gpu.mojom.MailboxHolder.decode(decoder1);
            }
            {

                int synchronizationType = decoder0.readInt(48);
                SynchronizationType.validate(synchronizationType);
                result.synchronizationType = SynchronizationType.toKnownValue(synchronizationType);
            }
            {

                result.isSoftware = decoder0.readBoolean(52, 0);
            }
            {

                result.isOverlayCandidate = decoder0.readBoolean(52, 1);
            }
            {

                result.isBackedBySurfaceTexture = decoder0.readBoolean(52, 2);
            }
            {

                result.wantsPromotionHint = decoder0.readBoolean(52, 3);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, false);
                result.colorSpace = org.chromium.gfx.mojom.ColorSpace.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(64, true);
                result.colorSpaceWhenSampled = org.chromium.gfx.mojom.ColorSpace.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(72, false);
                result.hdrMetadata = org.chromium.gfx.mojom.HdrMetadata.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(80, true);
                result.ycbcrInfo = org.chromium.gpu.mojom.VulkanYCbCrInfo.decode(decoder1);
            }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @Override
    protected void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);

        encoder0.encode(this.id, 8, false);

        encoder0.encode(this.format, 16, false);

        encoder0.encode(this.size, 32, false);

        encoder0.encode(this.mailboxHolder, 40, false);

        encoder0.encode(this.synchronizationType, 48);

        encoder0.encode(this.isSoftware, 52, 0);

        encoder0.encode(this.isOverlayCandidate, 52, 1);

        encoder0.encode(this.isBackedBySurfaceTexture, 52, 2);

        encoder0.encode(this.wantsPromotionHint, 52, 3);

        encoder0.encode(this.colorSpace, 56, false);

        encoder0.encode(this.colorSpaceWhenSampled, 64, true);

        encoder0.encode(this.hdrMetadata, 72, false);

        encoder0.encode(this.ycbcrInfo, 80, true);
    }
}