//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.base.jank_tracker;

import org.jni_zero.CheckDiscard;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JNINamespace;
import org.jni_zero.NativeMethods;

@CheckDiscard("crbug.com/993421")
public class JankMetricUMARecorderJni implements JankMetricUMARecorder.Natives {
  private static JankMetricUMARecorder.Natives testInstance;

  public static final JniStaticTestMocker<JankMetricUMARecorder.Natives> TEST_HOOKS =
      new JniStaticTestMocker<JankMetricUMARecorder.Natives>() {
    @Override
    public void setInstanceForTesting(JankMetricUMARecorder.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException(
            "Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void recordJankMetrics(long[] durationsNs, boolean[] jankStatus, long reportingIntervalStartTime, long reportingIntervalDuration, int scenario) {
    GEN_JNI.org_chromium_base_jank_1tracker_JankMetricUMARecorder_recordJankMetrics(durationsNs, jankStatus, reportingIntervalStartTime, reportingIntervalDuration, scenario);
  }

  public static JankMetricUMARecorder.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException(
            "No mock found for the native implementation of JankMetricUMARecorder.Natives. "
            + "The current configuration requires implementations be mocked.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded();
    return new JankMetricUMARecorderJni();
  }
}
