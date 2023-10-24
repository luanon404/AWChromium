//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.device.geolocation;

import org.jni_zero.CheckDiscard;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;

@CheckDiscard("crbug.com/993421")
class LocationProviderAdapterJni implements LocationProviderAdapter.Natives {
    private static LocationProviderAdapter.Natives testInstance;

    public static final JniStaticTestMocker<LocationProviderAdapter.Natives> TEST_HOOKS = new JniStaticTestMocker<LocationProviderAdapter.Natives>() {
        @Override
        public void setInstanceForTesting(LocationProviderAdapter.Natives instance) {
            if (!GEN_JNI.TESTING_ENABLED) {
                throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
            }
            testInstance = instance;
        }
    };

    @Override
    public void newErrorAvailable(String message) {
        GEN_JNI.org_chromium_device_geolocation_LocationProviderAdapter_newErrorAvailable(message);
    }

    @Override
    public void newLocationAvailable(double latitude, double longitude, double timeStamp, boolean hasAltitude, double altitude, boolean hasAccuracy, double accuracy, boolean hasHeading, double heading, boolean hasSpeed, double speed) {
        GEN_JNI.org_chromium_device_geolocation_LocationProviderAdapter_newLocationAvailable(latitude, longitude, timeStamp, hasAltitude, altitude, hasAccuracy, accuracy, hasHeading, heading, hasSpeed, speed);
    }

    public static LocationProviderAdapter.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            if (testInstance != null) {
                return testInstance;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation of LocationProviderAdapter.Natives. " + "The current configuration requires implementations be mocked.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded();
        return new LocationProviderAdapterJni();
    }
}
