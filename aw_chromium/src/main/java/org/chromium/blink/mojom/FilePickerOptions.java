// FilePickerOptions.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/file_system_access/file_system_access_manager.mojom
//

package org.chromium.blink.mojom;


public final class FilePickerOptions extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 48;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(48, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public TypeSpecificFilePickerOptionsUnion typeSpecificOptions;
    public String startingDirectoryId;
    public FilePickerStartInOptionsUnion startInOptions;

    private FilePickerOptions(int version) {
        super(STRUCT_SIZE, version);
    }

    public FilePickerOptions() {
        this(0);
    }

    public static FilePickerOptions deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static FilePickerOptions deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static FilePickerOptions decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        FilePickerOptions result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new FilePickerOptions(elementsOrVersion);
                {
                    
                result.typeSpecificOptions = TypeSpecificFilePickerOptionsUnion.decode(decoder0, 8);
                }
                {
                    
                result.startingDirectoryId = decoder0.readString(24, false);
                }
                {
                    
                result.startInOptions = FilePickerStartInOptionsUnion.decode(decoder0, 32);
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
        
        encoder0.encode(this.typeSpecificOptions, 8, false);
        
        encoder0.encode(this.startingDirectoryId, 24, false);
        
        encoder0.encode(this.startInOptions, 32, true);
    }
}