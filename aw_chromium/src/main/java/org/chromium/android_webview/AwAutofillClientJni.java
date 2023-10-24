//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.android_webview;

import org.jni_zero.CheckDiscard;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;

@CheckDiscard("crbug.com/993421")
class AwAutofillClientJni implements AwAutofillClient.Natives {
    private static AwAutofillClient.Natives testInstance;

    public static final JniStaticTestMocker<AwAutofillClient.Natives> TEST_HOOKS = new JniStaticTestMocker<AwAutofillClient.Natives>() {
        @Override
        public void setInstanceForTesting(AwAutofillClient.Natives instance) {
            if (!GEN_JNI.TESTING_ENABLED) {
                throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
            }
            testInstance = instance;
        }
    };

    @Override
    public void dismissed(long nativeAwAutofillClient, AwAutofillClient caller) {
        GEN_JNI.org_chromium_android_1webview_AwAutofillClient_dismissed(nativeAwAutofillClient, caller);
    }

    @Override
    public void suggestionSelected(long nativeAwAutofillClient, AwAutofillClient caller, int position) {
        GEN_JNI.org_chromium_android_1webview_AwAutofillClient_suggestionSelected(nativeAwAutofillClient, caller, position);
    }

    public static AwAutofillClient.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            if (testInstance != null) {
                return testInstance;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation of AwAutofillClient.Natives. " + "The current configuration requires implementations be mocked.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded();
        return new AwAutofillClientJni();
    }
}
