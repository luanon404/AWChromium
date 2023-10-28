//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.content.browser.androidoverlay;

import org.jni_zero.CheckDiscard;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;
import org.jni_zero.GEN_JNI;
import android.content.Context;
import android.os.IBinder;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import org.jni_zero.CalledByNative;
import org.jni_zero.JNINamespace;
import org.jni_zero.NativeMethods;
import org.chromium.base.ContextUtils;
import org.chromium.base.ThreadUtils;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.gfx.mojom.Rect;
import org.chromium.media.mojom.AndroidOverlay;
import org.chromium.media.mojom.AndroidOverlayClient;
import org.chromium.media.mojom.AndroidOverlayConfig;
import org.chromium.mojo.system.MessagePipeHandle;
import org.chromium.mojo.system.MojoException;
import org.chromium.ui.base.WindowAndroid;

@CheckDiscard("crbug.com/993421")
class DialogOverlayImplJni implements DialogOverlayImpl.Natives {
  private static DialogOverlayImpl.Natives testInstance;

  public static final JniStaticTestMocker<DialogOverlayImpl.Natives> TEST_HOOKS =
      new JniStaticTestMocker<DialogOverlayImpl.Natives>() {
    @Override
    public void setInstanceForTesting(DialogOverlayImpl.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException(
            "Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void completeInit(long nativeDialogOverlayImpl, DialogOverlayImpl caller) {
    GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_completeInit(nativeDialogOverlayImpl, caller);
  }

  @Override
  public void destroy(long nativeDialogOverlayImpl, DialogOverlayImpl caller) {
    GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_destroy(nativeDialogOverlayImpl, caller);
  }

  @Override
  public void getCompositorOffset(long nativeDialogOverlayImpl, DialogOverlayImpl caller, Rect rect) {
    GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_getCompositorOffset(nativeDialogOverlayImpl, caller, rect);
  }

  @Override
  public long init(DialogOverlayImpl caller, long high, long low, boolean isPowerEfficient) {
    return (long) GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_init(caller, high, low, isPowerEfficient);
  }

  @Override
  public Surface lookupSurfaceForTesting(int surfaceId) {
    return (Surface) GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_lookupSurfaceForTesting(surfaceId);
  }

  @Override
  public void notifyDestroyedSynchronously(long messagePipeHandle) {
    GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_notifyDestroyedSynchronously(messagePipeHandle);
  }

  @Override
  public int registerSurface(Surface surface) {
    return (int) GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_registerSurface(surface);
  }

  @Override
  public void unregisterSurface(int surfaceId) {
    GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_unregisterSurface(surfaceId);
  }

  public static DialogOverlayImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException(
            "No mock found for the native implementation of DialogOverlayImpl.Natives. "
            + "The current configuration requires implementations be mocked.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded();
    return new DialogOverlayImplJni();
  }
}
