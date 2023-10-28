//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.content.app;

import org.jni_zero.CheckDiscard;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JNINamespace;
import org.jni_zero.NativeMethods;

@CheckDiscard("crbug.com/993421")
class ContentMainJni implements ContentMain.Natives {
  private static ContentMain.Natives testInstance;

  public static final JniStaticTestMocker<ContentMain.Natives> TEST_HOOKS =
      new JniStaticTestMocker<ContentMain.Natives>() {
    @Override
    public void setInstanceForTesting(ContentMain.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException(
            "Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int start(boolean startMinimalBrowser) {
    return (int) GEN_JNI.org_chromium_content_app_ContentMain_start(startMinimalBrowser);
  }

  public static ContentMain.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException(
            "No mock found for the native implementation of ContentMain.Natives. "
            + "The current configuration requires implementations be mocked.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded();
    return new ContentMainJni();
  }
}
