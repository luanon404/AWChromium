// PermissionDescriptorExtension.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/permissions/permission.mojom
//

package org.chromium.blink.mojom;


public final class PermissionDescriptorExtension extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int Midi = 0;
        public static final int Clipboard = 1;
        public static final int CameraDevice = 2;
        public static final int TopLevelStorageAccess = 3;
    }

    private MidiPermissionDescriptor mMidi;
    private ClipboardPermissionDescriptor mClipboard;
    private CameraDevicePermissionDescriptor mCameraDevice;
    private TopLevelStorageAccessPermissionDescriptor mTopLevelStorageAccess;

    public void setMidi(MidiPermissionDescriptor midi) {
        this.mTag = Tag.Midi;
        this.mMidi = midi;
    }

    public MidiPermissionDescriptor getMidi() {
        assert this.mTag == Tag.Midi;
        return this.mMidi;
    }

    public void setClipboard(ClipboardPermissionDescriptor clipboard) {
        this.mTag = Tag.Clipboard;
        this.mClipboard = clipboard;
    }

    public ClipboardPermissionDescriptor getClipboard() {
        assert this.mTag == Tag.Clipboard;
        return this.mClipboard;
    }

    public void setCameraDevice(CameraDevicePermissionDescriptor cameraDevice) {
        this.mTag = Tag.CameraDevice;
        this.mCameraDevice = cameraDevice;
    }

    public CameraDevicePermissionDescriptor getCameraDevice() {
        assert this.mTag == Tag.CameraDevice;
        return this.mCameraDevice;
    }

    public void setTopLevelStorageAccess(TopLevelStorageAccessPermissionDescriptor topLevelStorageAccess) {
        this.mTag = Tag.TopLevelStorageAccess;
        this.mTopLevelStorageAccess = topLevelStorageAccess;
    }

    public TopLevelStorageAccessPermissionDescriptor getTopLevelStorageAccess() {
        assert this.mTag == Tag.TopLevelStorageAccess;
        return this.mTopLevelStorageAccess;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.Midi: {
                
                encoder0.encode(this.mMidi, offset + 8, false);
                break;
            }
            case Tag.Clipboard: {
                
                encoder0.encode(this.mClipboard, offset + 8, false);
                break;
            }
            case Tag.CameraDevice: {
                
                encoder0.encode(this.mCameraDevice, offset + 8, false);
                break;
            }
            case Tag.TopLevelStorageAccess: {
                
                encoder0.encode(this.mTopLevelStorageAccess, offset + 8, false);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static PermissionDescriptorExtension deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final PermissionDescriptorExtension decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        PermissionDescriptorExtension result = new PermissionDescriptorExtension();
        switch (dataHeader.elementsOrVersion) {
            case Tag.Midi: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mMidi = MidiPermissionDescriptor.decode(decoder1);
                result.mTag = Tag.Midi;
                break;
            }
            case Tag.Clipboard: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mClipboard = ClipboardPermissionDescriptor.decode(decoder1);
                result.mTag = Tag.Clipboard;
                break;
            }
            case Tag.CameraDevice: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mCameraDevice = CameraDevicePermissionDescriptor.decode(decoder1);
                result.mTag = Tag.CameraDevice;
                break;
            }
            case Tag.TopLevelStorageAccess: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mTopLevelStorageAccess = TopLevelStorageAccessPermissionDescriptor.decode(decoder1);
                result.mTag = Tag.TopLevelStorageAccess;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}