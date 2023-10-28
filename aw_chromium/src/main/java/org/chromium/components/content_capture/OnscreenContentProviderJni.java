//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.components.content_capture;

import org.jni_zero.CheckDiscard;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;
import org.jni_zero.GEN_JNI;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import org.jni_zero.CalledByNative;
import org.jni_zero.JNINamespace;
import org.jni_zero.NativeMethods;
import org.chromium.base.Log;
import org.chromium.content_public.browser.RenderCoordinates;
import org.chromium.content_public.browser.WebContents;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@CheckDiscard("crbug.com/993421")
class OnscreenContentProviderJni implements OnscreenContentProvider.Natives {
  private static OnscreenContentProvider.Natives testInstance;

  public static final JniStaticTestMocker<OnscreenContentProvider.Natives> TEST_HOOKS =
      new JniStaticTestMocker<OnscreenContentProvider.Natives>() {
    @Override
    public void setInstanceForTesting(OnscreenContentProvider.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException(
            "Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void destroy(long nativeOnscreenContentProviderAndroid) {
    GEN_JNI.org_chromium_components_content_1capture_OnscreenContentProvider_destroy(nativeOnscreenContentProviderAndroid);
  }

  @Override
  public long init(OnscreenContentProvider caller, WebContents webContents) {
    return (long) GEN_JNI.org_chromium_components_content_1capture_OnscreenContentProvider_init(caller, webContents);
  }

  @Override
  public void onWebContentsChanged(long nativeOnscreenContentProviderAndroid, WebContents webContents) {
    GEN_JNI.org_chromium_components_content_1capture_OnscreenContentProvider_onWebContentsChanged(nativeOnscreenContentProviderAndroid, webContents);
  }

  public static OnscreenContentProvider.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException(
            "No mock found for the native implementation of OnscreenContentProvider.Natives. "
            + "The current configuration requires implementations be mocked.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded();
    return new OnscreenContentProviderJni();
  }
}
