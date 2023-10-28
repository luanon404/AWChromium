// AudioInputDeviceCapabilities.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/mediastream/media_devices.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public final class AudioInputDeviceCapabilities extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 56;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(56, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String deviceId;
    public String groupId;
    public org.chromium.media.mojom.AudioParameters parameters;
    public boolean isValid;
    public int channels;
    public int sampleRate;
    public org.chromium.mojo_base.mojom.TimeDelta latency;

    private AudioInputDeviceCapabilities(int version) {
        super(STRUCT_SIZE, version);
    }

    public AudioInputDeviceCapabilities() {
        this(0);
    }

    public static AudioInputDeviceCapabilities deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static AudioInputDeviceCapabilities deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static AudioInputDeviceCapabilities decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        AudioInputDeviceCapabilities result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new AudioInputDeviceCapabilities(elementsOrVersion);
                {
                    
                result.deviceId = decoder0.readString(8, false);
                }
                {
                    
                result.groupId = decoder0.readString(16, false);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                result.parameters = org.chromium.media.mojom.AudioParameters.decode(decoder1);
                }
                {
                    
                result.isValid = decoder0.readBoolean(32, 0);
                }
                {
                    
                result.channels = decoder0.readInt(36);
                }
                {
                    
                result.sampleRate = decoder0.readInt(40);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, false);
                result.latency = org.chromium.mojo_base.mojom.TimeDelta.decode(decoder1);
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
        
        encoder0.encode(this.deviceId, 8, false);
        
        encoder0.encode(this.groupId, 16, false);
        
        encoder0.encode(this.parameters, 24, false);
        
        encoder0.encode(this.isValid, 32, 0);
        
        encoder0.encode(this.channels, 36);
        
        encoder0.encode(this.sampleRate, 40);
        
        encoder0.encode(this.latency, 48, false);
    }
}