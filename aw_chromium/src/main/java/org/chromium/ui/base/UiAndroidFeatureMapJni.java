//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.ui.base;

import org.jni_zero.CheckDiscard;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JNINamespace;
import org.jni_zero.NativeMethods;
import org.chromium.base.FeatureMap;

@CheckDiscard("crbug.com/993421")
public class UiAndroidFeatureMapJni implements UiAndroidFeatureMap.Natives {
  private static UiAndroidFeatureMap.Natives testInstance;

  public static final JniStaticTestMocker<UiAndroidFeatureMap.Natives> TEST_HOOKS =
      new JniStaticTestMocker<UiAndroidFeatureMap.Natives>() {
    @Override
    public void setInstanceForTesting(UiAndroidFeatureMap.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException(
            "Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long getNativeMap() {
    return (long) GEN_JNI.org_chromium_ui_base_UiAndroidFeatureMap_getNativeMap();
  }

  public static UiAndroidFeatureMap.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException(
            "No mock found for the native implementation of UiAndroidFeatureMap.Natives. "
            + "The current configuration requires implementations be mocked.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded();
    return new UiAndroidFeatureMapJni();
  }
}
