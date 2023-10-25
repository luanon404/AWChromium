//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.url;

import org.jni_zero.CheckDiscard;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;

@CheckDiscard("crbug.com/993421")
class ParsedJni implements Parsed.Natives {
    private static Parsed.Natives testInstance;

    public static final JniStaticTestMocker<Parsed.Natives> TEST_HOOKS = new JniStaticTestMocker<>() {
        @Override
        public void setInstanceForTesting(Parsed.Natives instance) {
            if (!GEN_JNI.TESTING_ENABLED) {
                throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
            }
            testInstance = instance;
        }
    };

    @Override
    public long createNative(int schemeBegin, int schemeLength, int usernameBegin, int usernameLength, int passwordBegin, int passwordLength, int hostBegin, int hostLength, int portBegin, int portLength, int pathBegin, int pathLength, int queryBegin, int queryLength, int refBegin, int refLength, boolean potentiallyDanglingMarkup, long innerUrl) {
        return (long) GEN_JNI.org_chromium_url_Parsed_createNative(schemeBegin, schemeLength, usernameBegin, usernameLength, passwordBegin, passwordLength, hostBegin, hostLength, portBegin, portLength, pathBegin, pathLength, queryBegin, queryLength, refBegin, refLength, potentiallyDanglingMarkup, innerUrl);
    }

    public static Parsed.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            if (testInstance != null) {
                return testInstance;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation of Parsed.Natives. " + "The current configuration requires implementations be mocked.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded();
        return new ParsedJni();
    }
}
