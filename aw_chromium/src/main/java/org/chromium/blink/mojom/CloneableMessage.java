// CloneableMessage.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/messaging/cloneable_message.mojom
//

package org.chromium.blink.mojom;


public final class CloneableMessage extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 88;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(88, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.mojo_base.mojom.BigBuffer encodedMessage;
    public SerializedBlob[] blobs;
    public org.chromium.url.internal.mojom.Origin senderOrigin;
    public long stackTraceId;
    public long stackTraceDebuggerIdFirst;
    public long stackTraceDebuggerIdSecond;
    public boolean stackTraceShouldPause;
    public org.chromium.mojo_base.mojom.UnguessableToken senderAgentClusterId;
    public boolean lockedToSenderAgentCluster;
    public FileSystemAccessTransferToken[] fileSystemAccessTokens;

    private CloneableMessage(int version) {
        super(STRUCT_SIZE, version);
    }

    public CloneableMessage() {
        this(0);
    }

    public static CloneableMessage deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static CloneableMessage deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static CloneableMessage decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        CloneableMessage result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new CloneableMessage(elementsOrVersion);
                {
                    
                result.encodedMessage = org.chromium.mojo_base.mojom.BigBuffer.decode(decoder0, 8);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.blobs = new SerializedBlob[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.blobs[i1] = SerializedBlob.decode(decoder2);
                    }
                }
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, true);
                result.senderOrigin = org.chromium.url.internal.mojom.Origin.decode(decoder1);
                }
                {
                    
                result.stackTraceId = decoder0.readLong(40);
                }
                {
                    
                result.stackTraceDebuggerIdFirst = decoder0.readLong(48);
                }
                {
                    
                result.stackTraceDebuggerIdSecond = decoder0.readLong(56);
                }
                {
                    
                result.stackTraceShouldPause = decoder0.readBoolean(64, 0);
                }
                {
                    
                result.lockedToSenderAgentCluster = decoder0.readBoolean(64, 1);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(72, false);
                result.senderAgentClusterId = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
                }
                {
                    
                result.fileSystemAccessTokens = decoder0.readServiceInterfaces(80, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH, FileSystemAccessTransferToken.MANAGER);
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
        
        encoder0.encode(this.encodedMessage, 8, false);
        
        if (this.blobs == null) {
            encoder0.encodeNullPointer(24, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.blobs.length, 24, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.blobs.length; ++i0) {
                
                encoder1.encode(this.blobs[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.senderOrigin, 32, true);
        
        encoder0.encode(this.stackTraceId, 40);
        
        encoder0.encode(this.stackTraceDebuggerIdFirst, 48);
        
        encoder0.encode(this.stackTraceDebuggerIdSecond, 56);
        
        encoder0.encode(this.stackTraceShouldPause, 64, 0);
        
        encoder0.encode(this.lockedToSenderAgentCluster, 64, 1);
        
        encoder0.encode(this.senderAgentClusterId, 72, false);
        
        encoder0.encode(this.fileSystemAccessTokens, 80, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH, FileSystemAccessTransferToken.MANAGER);
    }
}