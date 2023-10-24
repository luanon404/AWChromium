// Copyright 2023 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../media/base/audio_parameters.h

package org.chromium.media;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({AudioEncodingFormat.FAKE, AudioEncodingFormat.PCM_LINEAR, AudioEncodingFormat.PCM_LOW_LATENCY, AudioEncodingFormat.BITSTREAM_AC3, AudioEncodingFormat.BITSTREAM_EAC3, AudioEncodingFormat.BITSTREAM_DTS, AudioEncodingFormat.BITSTREAM_DTS_HD, AudioEncodingFormat.BITSTREAM_DTSX_P2, AudioEncodingFormat.BITSTREAM_IEC61937, AudioEncodingFormat.BITSTREAM_DTS_HD_MA, AudioEncodingFormat.FORMAT_LAST})
@Retention(RetentionPolicy.SOURCE)
public @interface AudioEncodingFormat {
    int FAKE = 0x000;
    int PCM_LINEAR = 0x001;
    int PCM_LOW_LATENCY = 0x002;
    int BITSTREAM_AC3 = 0x004;
    int BITSTREAM_EAC3 = 0x008;
    int BITSTREAM_DTS = 0x010;
    int BITSTREAM_DTS_HD = 0x020;
    int BITSTREAM_DTSX_P2 = 0x040;
    int BITSTREAM_IEC61937 = 0x080;
    int BITSTREAM_DTS_HD_MA = 0x100;
    int FORMAT_LAST = BITSTREAM_DTS_HD_MA;
}
