// DeprecatedFileSystemFile.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/page_state/page_state.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public final class DeprecatedFileSystemFile extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.url.mojom.Url filesystemUrl;
    public long offset;
    public long length;
    public org.chromium.mojo_base.mojom.Time modificationTime;

    private DeprecatedFileSystemFile(int version) {
        super(STRUCT_SIZE, version);
    }

    public DeprecatedFileSystemFile() {
        this(0);
    }

    public static DeprecatedFileSystemFile deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static DeprecatedFileSystemFile deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static DeprecatedFileSystemFile decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        DeprecatedFileSystemFile result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new DeprecatedFileSystemFile(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.filesystemUrl = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                result.offset = decoder0.readLong(16);
                }
                {
                    
                result.length = decoder0.readLong(24);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, false);
                result.modificationTime = org.chromium.mojo_base.mojom.Time.decode(decoder1);
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
        
        encoder0.encode(this.filesystemUrl, 8, false);
        
        encoder0.encode(this.offset, 16);
        
        encoder0.encode(this.length, 24);
        
        encoder0.encode(this.modificationTime, 32, false);
    }
}