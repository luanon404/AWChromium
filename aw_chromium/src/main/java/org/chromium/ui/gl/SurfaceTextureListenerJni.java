//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.ui.gl;

import org.jni_zero.CheckDiscard;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;

@CheckDiscard("crbug.com/993421")
class SurfaceTextureListenerJni implements SurfaceTextureListener.Natives {
    private static SurfaceTextureListener.Natives testInstance;

    public static final JniStaticTestMocker<SurfaceTextureListener.Natives> TEST_HOOKS = new JniStaticTestMocker<SurfaceTextureListener.Natives>() {
        @Override
        public void setInstanceForTesting(SurfaceTextureListener.Natives instance) {
            if (!GEN_JNI.TESTING_ENABLED) {
                throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
            }
            testInstance = instance;
        }
    };

    @Override
    public void destroy(long nativeSurfaceTextureListener, SurfaceTextureListener caller) {
        GEN_JNI.org_chromium_ui_gl_SurfaceTextureListener_destroy(nativeSurfaceTextureListener, caller);
    }

    @Override
    public void frameAvailable(long nativeSurfaceTextureListener, SurfaceTextureListener caller) {
        GEN_JNI.org_chromium_ui_gl_SurfaceTextureListener_frameAvailable(nativeSurfaceTextureListener, caller);
    }

    public static SurfaceTextureListener.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            if (testInstance != null) {
                return testInstance;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation of SurfaceTextureListener.Natives. " + "The current configuration requires implementations be mocked.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded();
        return new SurfaceTextureListenerJni();
    }
}
