//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.base;

import org.jni_zero.CheckDiscard;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;
import org.jni_zero.GEN_JNI;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Window;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import org.jni_zero.CalledByNative;
import org.jni_zero.JNINamespace;
import org.jni_zero.NativeMethods;
import org.chromium.build.BuildConfig;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

@CheckDiscard("crbug.com/993421")
class ApplicationStatusJni implements ApplicationStatus.Natives {
  private static ApplicationStatus.Natives testInstance;

  public static final JniStaticTestMocker<ApplicationStatus.Natives> TEST_HOOKS =
      new JniStaticTestMocker<ApplicationStatus.Natives>() {
    @Override
    public void setInstanceForTesting(ApplicationStatus.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException(
            "Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onApplicationStateChange(int newState) {
    GEN_JNI.org_chromium_base_ApplicationStatus_onApplicationStateChange(newState);
  }

  public static ApplicationStatus.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException(
            "No mock found for the native implementation of ApplicationStatus.Natives. "
            + "The current configuration requires implementations be mocked.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded();
    return new ApplicationStatusJni();
  }
}
