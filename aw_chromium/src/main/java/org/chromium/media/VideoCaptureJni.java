//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.media;

import org.jni_zero.CheckDiscard;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;
import org.jni_zero.GEN_JNI;
import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import org.jni_zero.CalledByNative;
import org.jni_zero.JNINamespace;
import org.jni_zero.NativeMethods;
import org.chromium.base.ContextUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@CheckDiscard("crbug.com/993421")
class VideoCaptureJni implements VideoCapture.Natives {
  private static VideoCapture.Natives testInstance;

  public static final JniStaticTestMocker<VideoCapture.Natives> TEST_HOOKS =
      new JniStaticTestMocker<VideoCapture.Natives>() {
    @Override
    public void setInstanceForTesting(VideoCapture.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException(
            "Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void dCheckCurrentlyOnIncomingTaskRunner(long nativeVideoCaptureDeviceAndroid, VideoCapture caller) {
    GEN_JNI.org_chromium_media_VideoCapture_dCheckCurrentlyOnIncomingTaskRunner(nativeVideoCaptureDeviceAndroid, caller);
  }

  @Override
  public void onError(long nativeVideoCaptureDeviceAndroid, VideoCapture caller, int androidVideoCaptureError, String message) {
    GEN_JNI.org_chromium_media_VideoCapture_onError(nativeVideoCaptureDeviceAndroid, caller, androidVideoCaptureError, message);
  }

  @Override
  public void onFrameAvailable(long nativeVideoCaptureDeviceAndroid, VideoCapture caller, byte[] data, int length, int rotation) {
    GEN_JNI.org_chromium_media_VideoCapture_onFrameAvailable(nativeVideoCaptureDeviceAndroid, caller, data, length, rotation);
  }

  @Override
  public void onFrameDropped(long nativeVideoCaptureDeviceAndroid, VideoCapture caller, int androidVideoCaptureFrameDropReason) {
    GEN_JNI.org_chromium_media_VideoCapture_onFrameDropped(nativeVideoCaptureDeviceAndroid, caller, androidVideoCaptureFrameDropReason);
  }

  @Override
  public void onGetPhotoCapabilitiesReply(long nativeVideoCaptureDeviceAndroid, VideoCapture caller, long callbackId, PhotoCapabilities result) {
    GEN_JNI.org_chromium_media_VideoCapture_onGetPhotoCapabilitiesReply(nativeVideoCaptureDeviceAndroid, caller, callbackId, result);
  }

  @Override
  public void onI420FrameAvailable(long nativeVideoCaptureDeviceAndroid, VideoCapture caller, ByteBuffer yBuffer, int yStride, ByteBuffer uBuffer, ByteBuffer vBuffer, int uvRowStride, int uvPixelStride, int width, int height, int rotation, long timestamp) {
    GEN_JNI.org_chromium_media_VideoCapture_onI420FrameAvailable(nativeVideoCaptureDeviceAndroid, caller, yBuffer, yStride, uBuffer, vBuffer, uvRowStride, uvPixelStride, width, height, rotation, timestamp);
  }

  @Override
  public void onPhotoTaken(long nativeVideoCaptureDeviceAndroid, VideoCapture caller, long callbackId, byte[] data) {
    GEN_JNI.org_chromium_media_VideoCapture_onPhotoTaken(nativeVideoCaptureDeviceAndroid, caller, callbackId, data);
  }

  @Override
  public void onStarted(long nativeVideoCaptureDeviceAndroid, VideoCapture caller) {
    GEN_JNI.org_chromium_media_VideoCapture_onStarted(nativeVideoCaptureDeviceAndroid, caller);
  }

  public static VideoCapture.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException(
            "No mock found for the native implementation of VideoCapture.Natives. "
            + "The current configuration requires implementations be mocked.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded();
    return new VideoCaptureJni();
  }
}
