//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.components.autofill;

import org.jni_zero.CheckDiscard;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;
import org.jni_zero.GEN_JNI;
import org.jni_zero.CalledByNative;
import org.jni_zero.JNINamespace;
import org.jni_zero.NativeMethods;
import org.chromium.base.ResettersForTesting;
import org.chromium.base.ThreadUtils;

@CheckDiscard("crbug.com/993421")
class AddressNormalizerJni implements AddressNormalizer.Natives {
  private static AddressNormalizer.Natives testInstance;

  public static final JniStaticTestMocker<AddressNormalizer.Natives> TEST_HOOKS =
      new JniStaticTestMocker<AddressNormalizer.Natives>() {
    @Override
    public void setInstanceForTesting(AddressNormalizer.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException(
            "Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void loadRulesForAddressNormalization(long nativeAddressNormalizerImpl, String regionCode) {
    GEN_JNI.org_chromium_components_autofill_AddressNormalizer_loadRulesForAddressNormalization(nativeAddressNormalizerImpl, regionCode);
  }

  @Override
  public void startAddressNormalization(long nativeAddressNormalizerImpl, AutofillProfile profile, int timeoutSeconds, AddressNormalizer.NormalizedAddressRequestDelegate delegate) {
    GEN_JNI.org_chromium_components_autofill_AddressNormalizer_startAddressNormalization(nativeAddressNormalizerImpl, profile, timeoutSeconds, delegate);
  }

  public static AddressNormalizer.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException(
            "No mock found for the native implementation of AddressNormalizer.Natives. "
            + "The current configuration requires implementations be mocked.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded();
    return new AddressNormalizerJni();
  }
}
