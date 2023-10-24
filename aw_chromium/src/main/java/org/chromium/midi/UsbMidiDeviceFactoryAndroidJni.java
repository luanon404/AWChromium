//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.midi;

import org.jni_zero.CheckDiscard;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;

@CheckDiscard("crbug.com/993421")
class UsbMidiDeviceFactoryAndroidJni implements UsbMidiDeviceFactoryAndroid.Natives {
    private static UsbMidiDeviceFactoryAndroid.Natives testInstance;

    public static final JniStaticTestMocker<UsbMidiDeviceFactoryAndroid.Natives> TEST_HOOKS = new JniStaticTestMocker<UsbMidiDeviceFactoryAndroid.Natives>() {
        @Override
        public void setInstanceForTesting(UsbMidiDeviceFactoryAndroid.Natives instance) {
            if (!GEN_JNI.TESTING_ENABLED) {
                throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
            }
            testInstance = instance;
        }
    };

    @Override
    public void onUsbMidiDeviceAttached(long nativeUsbMidiDeviceFactoryAndroid, Object device) {
        GEN_JNI.org_chromium_midi_UsbMidiDeviceFactoryAndroid_onUsbMidiDeviceAttached(nativeUsbMidiDeviceFactoryAndroid, device);
    }

    @Override
    public void onUsbMidiDeviceDetached(long nativeUsbMidiDeviceFactoryAndroid, int index) {
        GEN_JNI.org_chromium_midi_UsbMidiDeviceFactoryAndroid_onUsbMidiDeviceDetached(nativeUsbMidiDeviceFactoryAndroid, index);
    }

    @Override
    public void onUsbMidiDeviceRequestDone(long nativeUsbMidiDeviceFactoryAndroid, Object[] devices) {
        GEN_JNI.org_chromium_midi_UsbMidiDeviceFactoryAndroid_onUsbMidiDeviceRequestDone(nativeUsbMidiDeviceFactoryAndroid, devices);
    }

    public static UsbMidiDeviceFactoryAndroid.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            if (testInstance != null) {
                return testInstance;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation of UsbMidiDeviceFactoryAndroid.Natives. " + "The current configuration requires implementations be mocked.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded();
        return new UsbMidiDeviceFactoryAndroidJni();
    }
}
