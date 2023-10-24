//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.android_webview;

import org.jni_zero.CheckDiscard;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;

@CheckDiscard("crbug.com/993421")
class AwTracingControllerJni implements AwTracingController.Natives {
    private static AwTracingController.Natives testInstance;

    public static final JniStaticTestMocker<AwTracingController.Natives> TEST_HOOKS = new JniStaticTestMocker<AwTracingController.Natives>() {
        @Override
        public void setInstanceForTesting(AwTracingController.Natives instance) {
            if (!GEN_JNI.TESTING_ENABLED) {
                throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
            }
            testInstance = instance;
        }
    };

    @Override
    public long init(AwTracingController caller) {
        return (long) GEN_JNI.org_chromium_android_1webview_AwTracingController_init(caller);
    }

    @Override
    public boolean isTracing(long nativeAwTracingController, AwTracingController caller) {
        return (boolean) GEN_JNI.org_chromium_android_1webview_AwTracingController_isTracing(nativeAwTracingController, caller);
    }

    @Override
    public boolean start(long nativeAwTracingController, AwTracingController caller, String categories, int traceMode) {
        return (boolean) GEN_JNI.org_chromium_android_1webview_AwTracingController_start(nativeAwTracingController, caller, categories, traceMode);
    }

    @Override
    public boolean stopAndFlush(long nativeAwTracingController, AwTracingController caller) {
        return (boolean) GEN_JNI.org_chromium_android_1webview_AwTracingController_stopAndFlush(nativeAwTracingController, caller);
    }

    public static AwTracingController.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            if (testInstance != null) {
                return testInstance;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation of AwTracingController.Natives. " + "The current configuration requires implementations be mocked.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded();
        return new AwTracingControllerJni();
    }
}
