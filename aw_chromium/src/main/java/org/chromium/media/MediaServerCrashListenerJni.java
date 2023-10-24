//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.media;

import org.jni_zero.CheckDiscard;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;

@CheckDiscard("crbug.com/993421")
class MediaServerCrashListenerJni implements MediaServerCrashListener.Natives {
    private static MediaServerCrashListener.Natives testInstance;

    public static final JniStaticTestMocker<MediaServerCrashListener.Natives> TEST_HOOKS = new JniStaticTestMocker<MediaServerCrashListener.Natives>() {
        @Override
        public void setInstanceForTesting(MediaServerCrashListener.Natives instance) {
            if (!GEN_JNI.TESTING_ENABLED) {
                throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
            }
            testInstance = instance;
        }
    };

    @Override
    public void onMediaServerCrashDetected(long nativeMediaServerCrashListener, MediaServerCrashListener caller, boolean watchdogNeedsRelease) {
        GEN_JNI.org_chromium_media_MediaServerCrashListener_onMediaServerCrashDetected(nativeMediaServerCrashListener, caller, watchdogNeedsRelease);
    }

    public static MediaServerCrashListener.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            if (testInstance != null) {
                return testInstance;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation of MediaServerCrashListener.Natives. " + "The current configuration requires implementations be mocked.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded();
        return new MediaServerCrashListenerJni();
    }
}
