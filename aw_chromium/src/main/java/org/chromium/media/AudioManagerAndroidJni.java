//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.media;

import org.jni_zero.CheckDiscard;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;

@CheckDiscard("crbug.com/993421")
class AudioManagerAndroidJni implements AudioManagerAndroid.Natives {
    private static AudioManagerAndroid.Natives testInstance;

    public static final JniStaticTestMocker<AudioManagerAndroid.Natives> TEST_HOOKS = new JniStaticTestMocker<AudioManagerAndroid.Natives>() {
        @Override
        public void setInstanceForTesting(AudioManagerAndroid.Natives instance) {
            if (!GEN_JNI.TESTING_ENABLED) {
                throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
            }
            testInstance = instance;
        }
    };

    @Override
    public void setMute(long nativeAudioManagerAndroid, AudioManagerAndroid caller, boolean muted) {
        GEN_JNI.org_chromium_media_AudioManagerAndroid_setMute(nativeAudioManagerAndroid, caller, muted);
    }

    public static AudioManagerAndroid.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            if (testInstance != null) {
                return testInstance;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation of AudioManagerAndroid.Natives. " + "The current configuration requires implementations be mocked.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded();
        return new AudioManagerAndroidJni();
    }
}
