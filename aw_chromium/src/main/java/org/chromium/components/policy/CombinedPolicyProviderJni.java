//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.components.policy;

import org.jni_zero.CheckDiscard;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;

@CheckDiscard("crbug.com/993421")
class CombinedPolicyProviderJni implements CombinedPolicyProvider.Natives {
    private static CombinedPolicyProvider.Natives testInstance;

    public static final JniStaticTestMocker<CombinedPolicyProvider.Natives> TEST_HOOKS = new JniStaticTestMocker<CombinedPolicyProvider.Natives>() {
        @Override
        public void setInstanceForTesting(CombinedPolicyProvider.Natives instance) {
            if (!GEN_JNI.TESTING_ENABLED) {
                throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
            }
            testInstance = instance;
        }
    };

    @Override
    public void flushPolicies(long nativeAndroidCombinedPolicyProvider, CombinedPolicyProvider caller) {
        GEN_JNI.org_chromium_components_policy_CombinedPolicyProvider_flushPolicies(nativeAndroidCombinedPolicyProvider, caller);
    }

    public static CombinedPolicyProvider.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            if (testInstance != null) {
                return testInstance;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation of CombinedPolicyProvider.Natives. " + "The current configuration requires implementations be mocked.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded();
        return new CombinedPolicyProviderJni();
    }
}
