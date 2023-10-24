//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.android_webview.permission;

import org.jni_zero.CheckDiscard;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;

@CheckDiscard("crbug.com/993421")
class AwPermissionRequestJni implements AwPermissionRequest.Natives {
    private static AwPermissionRequest.Natives testInstance;

    public static final JniStaticTestMocker<AwPermissionRequest.Natives> TEST_HOOKS = new JniStaticTestMocker<AwPermissionRequest.Natives>() {
        @Override
        public void setInstanceForTesting(AwPermissionRequest.Natives instance) {
            if (!GEN_JNI.TESTING_ENABLED) {
                throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
            }
            testInstance = instance;
        }
    };

    @Override
    public void destroy(long nativeAwPermissionRequest) {
        GEN_JNI.org_chromium_android_1webview_permission_AwPermissionRequest_destroy(nativeAwPermissionRequest);
    }

    @Override
    public void onAccept(long nativeAwPermissionRequest, AwPermissionRequest caller, boolean allowed) {
        GEN_JNI.org_chromium_android_1webview_permission_AwPermissionRequest_onAccept(nativeAwPermissionRequest, caller, allowed);
    }

    public static AwPermissionRequest.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            if (testInstance != null) {
                return testInstance;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation of AwPermissionRequest.Natives. " + "The current configuration requires implementations be mocked.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded();
        return new AwPermissionRequestJni();
    }
}
