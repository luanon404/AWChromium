//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.ui.base;

import org.jni_zero.CheckDiscard;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;

@CheckDiscard("crbug.com/993421")
class SelectFileDialogJni implements SelectFileDialog.Natives {
    private static SelectFileDialog.Natives testInstance;

    public static final JniStaticTestMocker<SelectFileDialog.Natives> TEST_HOOKS = new JniStaticTestMocker<SelectFileDialog.Natives>() {
        @Override
        public void setInstanceForTesting(SelectFileDialog.Natives instance) {
            if (!GEN_JNI.TESTING_ENABLED) {
                throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
            }
            testInstance = instance;
        }
    };

    @Override
    public void onContactsSelected(long nativeSelectFileDialogImpl, SelectFileDialog caller, String contacts) {
        GEN_JNI.org_chromium_ui_base_SelectFileDialog_onContactsSelected(nativeSelectFileDialogImpl, caller, contacts);
    }

    @Override
    public void onFileNotSelected(long nativeSelectFileDialogImpl, SelectFileDialog caller) {
        GEN_JNI.org_chromium_ui_base_SelectFileDialog_onFileNotSelected(nativeSelectFileDialogImpl, caller);
    }

    @Override
    public void onFileSelected(long nativeSelectFileDialogImpl, SelectFileDialog caller, String filePath, String displayName) {
        GEN_JNI.org_chromium_ui_base_SelectFileDialog_onFileSelected(nativeSelectFileDialogImpl, caller, filePath, displayName);
    }

    @Override
    public void onMultipleFilesSelected(long nativeSelectFileDialogImpl, SelectFileDialog caller, String[] filePathArray, String[] displayNameArray) {
        GEN_JNI.org_chromium_ui_base_SelectFileDialog_onMultipleFilesSelected(nativeSelectFileDialogImpl, caller, filePathArray, displayNameArray);
    }

    public static SelectFileDialog.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            if (testInstance != null) {
                return testInstance;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation of SelectFileDialog.Natives. " + "The current configuration requires implementations be mocked.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded();
        return new SelectFileDialogJni();
    }
}
