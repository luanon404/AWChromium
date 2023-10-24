//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.net;

import org.jni_zero.CheckDiscard;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;

@CheckDiscard("crbug.com/993421")
class HttpUtilJni implements HttpUtil.Natives {
    private static HttpUtil.Natives testInstance;

    public static final JniStaticTestMocker<HttpUtil.Natives> TEST_HOOKS = new JniStaticTestMocker<HttpUtil.Natives>() {
        @Override
        public void setInstanceForTesting(HttpUtil.Natives instance) {
            if (!GEN_JNI.TESTING_ENABLED) {
                throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
            }
            testInstance = instance;
        }
    };

    @Override
    public boolean isAllowedHeader(String headerName, String headerValue) {
        return (boolean) GEN_JNI.org_chromium_net_HttpUtil_isAllowedHeader(headerName, headerValue);
    }

    public static HttpUtil.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            if (testInstance != null) {
                return testInstance;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation of HttpUtil.Natives. " + "The current configuration requires implementations be mocked.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded();
        return new HttpUtilJni();
    }
}
