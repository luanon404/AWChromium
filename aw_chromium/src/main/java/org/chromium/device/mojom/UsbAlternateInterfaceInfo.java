// UsbAlternateInterfaceInfo.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/usb_device.mojom
//

package org.chromium.device.mojom;

public final class UsbAlternateInterfaceInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public byte alternateSetting;
    public byte classCode;
    public byte subclassCode;
    public byte protocolCode;
    public org.chromium.mojo_base.mojom.String16 interfaceName;
    public UsbEndpointInfo[] endpoints;
    public byte[] extraData;

    private UsbAlternateInterfaceInfo(int version) {
        super(STRUCT_SIZE, version);
    }

    public UsbAlternateInterfaceInfo() {
        this(0);
    }

    public static UsbAlternateInterfaceInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static UsbAlternateInterfaceInfo deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static UsbAlternateInterfaceInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        UsbAlternateInterfaceInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new UsbAlternateInterfaceInfo(elementsOrVersion);
            {

                result.alternateSetting = decoder0.readByte(8);
            }
            {

                result.classCode = decoder0.readByte(9);
            }
            {

                result.subclassCode = decoder0.readByte(10);
            }
            {

                result.protocolCode = decoder0.readByte(11);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, true);
                result.interfaceName = org.chromium.mojo_base.mojom.String16.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.endpoints = new UsbEndpointInfo[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {

                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.endpoints[i1] = UsbEndpointInfo.decode(decoder2);
                    }
                }
            }
            {

                result.extraData = decoder0.readBytes(32, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
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

        encoder0.encode(this.alternateSetting, 8);

        encoder0.encode(this.classCode, 9);

        encoder0.encode(this.subclassCode, 10);

        encoder0.encode(this.protocolCode, 11);

        encoder0.encode(this.interfaceName, 16, true);

        if (this.endpoints == null) {
            encoder0.encodeNullPointer(24, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.endpoints.length, 24, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.endpoints.length; ++i0) {

                encoder1.encode(this.endpoints[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }

        encoder0.encode(this.extraData, 32, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
    }
}