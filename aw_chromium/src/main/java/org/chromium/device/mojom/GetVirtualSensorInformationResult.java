// GetVirtualSensorInformationResult.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/sensor_provider.mojom
//

package org.chromium.device.mojom;

import androidx.annotation.IntDef;


public final class GetVirtualSensorInformationResult extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int Info = 0;
        public static final int Error = 1;
    };
    private VirtualSensorInformation mInfo;
    private int mError;

    public void setInfo(VirtualSensorInformation info) {
        this.mTag = Tag.Info;
        this.mInfo = info;
    }

    public VirtualSensorInformation getInfo() {
        assert this.mTag == Tag.Info;
        return this.mInfo;
    }

    public void setError(int error) {
        this.mTag = Tag.Error;
        this.mError = error;
    }

    public int getError() {
        assert this.mTag == Tag.Error;
        return this.mError;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.Info: {
                
                encoder0.encode(this.mInfo, offset + 8, false);
                break;
            }
            case Tag.Error: {
                
                encoder0.encode(this.mError, offset + 8);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static GetVirtualSensorInformationResult deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final GetVirtualSensorInformationResult decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        GetVirtualSensorInformationResult result = new GetVirtualSensorInformationResult();
        switch (dataHeader.elementsOrVersion) {
            case Tag.Info: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mInfo = VirtualSensorInformation.decode(decoder1);
                result.mTag = Tag.Info;
                break;
            }
            case Tag.Error: {
                
                result.mError = decoder0.readInt(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE);
                    GetVirtualSensorInformationError.validate(result.mError);
                    result.mError = GetVirtualSensorInformationError.toKnownValue(result.mError);
                result.mTag = Tag.Error;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}