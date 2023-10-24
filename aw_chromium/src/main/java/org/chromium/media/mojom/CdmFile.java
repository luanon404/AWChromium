// CdmFile.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/cdm_storage.mojom
//

package org.chromium.media.mojom;

import androidx.annotation.IntDef;


public interface CdmFile extends org.chromium.mojo.bindings.Interface {


    final class Status {
        private static final boolean IS_EXTENSIBLE = false;

        @IntDef({Status.SUCCESS, Status.FAILURE})
        public @interface EnumType {
        }

        public static final int SUCCESS = 0;
        public static final int FAILURE = 1;
        public static final int MIN_VALUE = 0;
        public static final int MAX_VALUE = 1;

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 1;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        public static int toKnownValue(int value) {
            return value;
        }

        private Status() {
        }
    }


    interface Proxy extends CdmFile, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<CdmFile, CdmFile.Proxy> MANAGER = CdmFile_Internal.MANAGER;

    void read(

            Read_Response callback);

    interface Read_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, byte[]> {
    }


    void write(byte[] data, Write_Response callback);

    interface Write_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> {
    }


}
