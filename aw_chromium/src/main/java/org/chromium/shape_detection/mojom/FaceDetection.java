// FaceDetection.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/shape_detection/public/mojom/facedetection.mojom
//

package org.chromium.shape_detection.mojom;

import androidx.annotation.IntDef;


public interface FaceDetection extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends FaceDetection, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<FaceDetection, FaceDetection.Proxy> MANAGER = FaceDetection_Internal.MANAGER;

    void detect(
org.chromium.skia.mojom.BitmapN32 bitmapData, 
Detect_Response callback);

    interface Detect_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<FaceDetectionResult[]> { }


}
