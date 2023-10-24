// FileInformation.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     components/services/filesystem/public/mojom/types.mojom
//

package org.chromium.filesystem.mojom;

public final class FileInformation extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 48;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(48, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public int type;
    public long size;
    public double atime;
    public double mtime;
    public double ctime;

    private FileInformation(int version) {
        super(STRUCT_SIZE, version);
    }

    public FileInformation() {
        this(0);
    }

    public static FileInformation deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static FileInformation deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static FileInformation decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        FileInformation result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new FileInformation(elementsOrVersion);
            {

                result.type = decoder0.readInt(8);
                FsFileType.validate(result.type);
                result.type = FsFileType.toKnownValue(result.type);
            }
            {

                result.size = decoder0.readLong(16);
            }
            {

                result.atime = decoder0.readDouble(24);
            }
            {

                result.mtime = decoder0.readDouble(32);
            }
            {

                result.ctime = decoder0.readDouble(40);
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

        encoder0.encode(this.type, 8);

        encoder0.encode(this.size, 16);

        encoder0.encode(this.atime, 24);

        encoder0.encode(this.mtime, 32);

        encoder0.encode(this.ctime, 40);
    }
}