//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.base;

import org.jni_zero.CheckDiscard;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;
import org.jni_zero.GEN_JNI;

@CheckDiscard("crbug.com/993421")
class EarlyTraceEventJni implements EarlyTraceEvent.Natives {
  private static EarlyTraceEvent.Natives testInstance;

  public static final JniStaticTestMocker<EarlyTraceEvent.Natives> TEST_HOOKS =
      new JniStaticTestMocker<EarlyTraceEvent.Natives>() {
    @Override
    public void setInstanceForTesting(EarlyTraceEvent.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException(
            "Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void recordEarlyAsyncBeginEvent(String name, long id, long timeNanos) {
    GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyAsyncBeginEvent(name, id, timeNanos);
  }

  @Override
  public void recordEarlyAsyncEndEvent(long id, long timeNanos) {
    GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyAsyncEndEvent(id, timeNanos);
  }

  @Override
  public void recordEarlyBeginEvent(String name, long timeNanos, int threadId, long threadMillis) {
    GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyBeginEvent(name, timeNanos, threadId, threadMillis);
  }

  @Override
  public void recordEarlyEndEvent(String name, long timeNanos, int threadId, long threadMillis) {
    GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyEndEvent(name, timeNanos, threadId, threadMillis);
  }

  @Override
  public void recordEarlyToplevelBeginEvent(String name, long timeNanos, int threadId, long threadMillis) {
    GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyToplevelBeginEvent(name, timeNanos, threadId, threadMillis);
  }

  @Override
  public void recordEarlyToplevelEndEvent(String name, long timeNanos, int threadId, long threadMillis) {
    GEN_JNI.org_chromium_base_EarlyTraceEvent_recordEarlyToplevelEndEvent(name, timeNanos, threadId, threadMillis);
  }

  public static EarlyTraceEvent.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException(
            "No mock found for the native implementation of EarlyTraceEvent.Natives. "
            + "The current configuration requires implementations be mocked.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded();
    return new EarlyTraceEventJni();
  }
}
