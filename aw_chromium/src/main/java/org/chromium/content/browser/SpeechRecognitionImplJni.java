//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.content.browser;

import org.jni_zero.CheckDiscard;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;
import org.jni_zero.GEN_JNI;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognitionService;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import org.jni_zero.CalledByNative;
import org.jni_zero.JNINamespace;
import org.jni_zero.NativeMethods;
import org.chromium.base.ContextUtils;
import org.chromium.base.Log;
import org.chromium.base.PackageUtils;
import org.chromium.blink.mojom.SpeechRecognitionErrorCode;
import org.chromium.android_webview.R;
import org.chromium.content_public.browser.SpeechRecognition;
import org.chromium.ui.widget.Toast;
import java.util.ArrayList;
import java.util.List;

@CheckDiscard("crbug.com/993421")
class SpeechRecognitionImplJni implements SpeechRecognitionImpl.Natives {
  private static SpeechRecognitionImpl.Natives testInstance;

  public static final JniStaticTestMocker<SpeechRecognitionImpl.Natives> TEST_HOOKS =
      new JniStaticTestMocker<SpeechRecognitionImpl.Natives>() {
    @Override
    public void setInstanceForTesting(SpeechRecognitionImpl.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException(
            "Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onAudioEnd(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller) {
    GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onAudioEnd(nativeSpeechRecognizerImplAndroid, caller);
  }

  @Override
  public void onAudioStart(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller) {
    GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onAudioStart(nativeSpeechRecognizerImplAndroid, caller);
  }

  @Override
  public void onRecognitionEnd(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller) {
    GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onRecognitionEnd(nativeSpeechRecognizerImplAndroid, caller);
  }

  @Override
  public void onRecognitionError(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller, int error) {
    GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onRecognitionError(nativeSpeechRecognizerImplAndroid, caller, error);
  }

  @Override
  public void onRecognitionResults(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller, String[] results, float[] scores, boolean provisional) {
    GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onRecognitionResults(nativeSpeechRecognizerImplAndroid, caller, results, scores, provisional);
  }

  @Override
  public void onSoundEnd(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller) {
    GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onSoundEnd(nativeSpeechRecognizerImplAndroid, caller);
  }

  @Override
  public void onSoundStart(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller) {
    GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onSoundStart(nativeSpeechRecognizerImplAndroid, caller);
  }

  public static SpeechRecognitionImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException(
            "No mock found for the native implementation of SpeechRecognitionImpl.Natives. "
            + "The current configuration requires implementations be mocked.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded();
    return new SpeechRecognitionImplJni();
  }
}
