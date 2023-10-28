//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.base;

import org.jni_zero.CheckDiscard;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JNINamespace;
import org.jni_zero.NativeMethods;

@CheckDiscard("crbug.com/993421")
public class BaseFeatureMapJni implements BaseFeatureMap.Natives {
  private static BaseFeatureMap.Natives testInstance;

  public static final JniStaticTestMocker<BaseFeatureMap.Natives> TEST_HOOKS =
      new JniStaticTestMocker<BaseFeatureMap.Natives>() {
    @Override
    public void setInstanceForTesting(BaseFeatureMap.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException(
            "Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long getNativeMap() {
    return (long) GEN_JNI.org_chromium_base_BaseFeatureMap_getNativeMap();
  }

  public static BaseFeatureMap.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException(
            "No mock found for the native implementation of BaseFeatureMap.Natives. "
            + "The current configuration requires implementations be mocked.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded();
    return new BaseFeatureMapJni();
  }
}
