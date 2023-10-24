//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.android_webview.gfx;

import org.jni_zero.CheckDiscard;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;

@CheckDiscard("crbug.com/993421")
class RootBeginFrameSourceWebViewJni implements RootBeginFrameSourceWebView.Natives {
    private static RootBeginFrameSourceWebView.Natives testInstance;

    public static final JniStaticTestMocker<RootBeginFrameSourceWebView.Natives> TEST_HOOKS = new JniStaticTestMocker<RootBeginFrameSourceWebView.Natives>() {
        @Override
        public void setInstanceForTesting(RootBeginFrameSourceWebView.Natives instance) {
            if (!GEN_JNI.TESTING_ENABLED) {
                throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
            }
            testInstance = instance;
        }
    };

    @Override
    public void onUpdateRefreshRate(long nativeRootBeginFrameSourceWebView, RootBeginFrameSourceWebView caller, float refreshRate) {
        GEN_JNI.org_chromium_android_1webview_gfx_RootBeginFrameSourceWebView_onUpdateRefreshRate(nativeRootBeginFrameSourceWebView, caller, refreshRate);
    }

    public static RootBeginFrameSourceWebView.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            if (testInstance != null) {
                return testInstance;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation of RootBeginFrameSourceWebView.Natives. " + "The current configuration requires implementations be mocked.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded();
        return new RootBeginFrameSourceWebViewJni();
    }
}
