//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.components.gwp_asan;

import org.jni_zero.CheckDiscard;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;

@CheckDiscard("crbug.com/993421")
public class GwpAsanFeatureMapJni implements GwpAsanFeatureMap.Natives {
    private static GwpAsanFeatureMap.Natives testInstance;

    public static final JniStaticTestMocker<GwpAsanFeatureMap.Natives> TEST_HOOKS = new JniStaticTestMocker<GwpAsanFeatureMap.Natives>() {
        @Override
        public void setInstanceForTesting(GwpAsanFeatureMap.Natives instance) {
            if (!GEN_JNI.TESTING_ENABLED) {
                throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
            }
            testInstance = instance;
        }
    };

    @Override
    public long getNativeMap() {
        return (long) GEN_JNI.org_chromium_components_gwp_1asan_GwpAsanFeatureMap_getNativeMap();
    }

    public static GwpAsanFeatureMap.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            if (testInstance != null) {
                return testInstance;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation of GwpAsanFeatureMap.Natives. " + "The current configuration requires implementations be mocked.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded();
        return new GwpAsanFeatureMapJni();
    }
}
