//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.components.spellcheck;

import org.jni_zero.CheckDiscard;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;

@CheckDiscard("crbug.com/993421")
class SpellCheckerSessionBridgeJni implements SpellCheckerSessionBridge.Natives {
    private static SpellCheckerSessionBridge.Natives testInstance;

    public static final JniStaticTestMocker<SpellCheckerSessionBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<SpellCheckerSessionBridge.Natives>() {
        @Override
        public void setInstanceForTesting(SpellCheckerSessionBridge.Natives instance) {
            if (!GEN_JNI.TESTING_ENABLED) {
                throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
            }
            testInstance = instance;
        }
    };

    @Override
    public void processSpellCheckResults(long nativeSpellCheckerSessionBridge, SpellCheckerSessionBridge caller, int[] offsets, int[] lengths, String[][] suggestions) {
        GEN_JNI.org_chromium_components_spellcheck_SpellCheckerSessionBridge_processSpellCheckResults(nativeSpellCheckerSessionBridge, caller, offsets, lengths, suggestions);
    }

    public static SpellCheckerSessionBridge.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            if (testInstance != null) {
                return testInstance;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation of SpellCheckerSessionBridge.Natives. " + "The current configuration requires implementations be mocked.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded();
        return new SpellCheckerSessionBridgeJni();
    }
}
