//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.components.minidump_uploader;

import org.jni_zero.CheckDiscard;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;

@CheckDiscard("crbug.com/993421")
class CrashReportMimeWriterJni implements CrashReportMimeWriter.Natives {
    private static CrashReportMimeWriter.Natives testInstance;

    public static final JniStaticTestMocker<CrashReportMimeWriter.Natives> TEST_HOOKS = new JniStaticTestMocker<CrashReportMimeWriter.Natives>() {
        @Override
        public void setInstanceForTesting(CrashReportMimeWriter.Natives instance) {
            if (!GEN_JNI.TESTING_ENABLED) {
                throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
            }
            testInstance = instance;
        }
    };

    @Override
    public void rewriteAnrsAsMIMEs(String[] anrs, String destDir) {
        GEN_JNI.org_chromium_components_minidump_1uploader_CrashReportMimeWriter_rewriteAnrsAsMIMEs(anrs, destDir);
    }

    @Override
    public void rewriteMinidumpsAsMIMEs(String srcDir, String destDir) {
        GEN_JNI.org_chromium_components_minidump_1uploader_CrashReportMimeWriter_rewriteMinidumpsAsMIMEs(srcDir, destDir);
    }

    @Override
    public String[] rewriteMinidumpsAsMIMEsAndGetCrashKeys(String srcDir, String destDir) {
        return (String[]) GEN_JNI.org_chromium_components_minidump_1uploader_CrashReportMimeWriter_rewriteMinidumpsAsMIMEsAndGetCrashKeys(srcDir, destDir);
    }

    public static CrashReportMimeWriter.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            if (testInstance != null) {
                return testInstance;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation of CrashReportMimeWriter.Natives. " + "The current configuration requires implementations be mocked.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded();
        return new CrashReportMimeWriterJni();
    }
}
