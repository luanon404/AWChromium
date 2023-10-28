//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.android_webview;

import org.jni_zero.CheckDiscard;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;
import org.jni_zero.GEN_JNI;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PrintAttributes;
import android.util.Log;
import android.view.ViewGroup;
import org.jni_zero.CalledByNative;
import org.jni_zero.JNINamespace;
import org.jni_zero.NativeMethods;
import org.chromium.android_webview.common.Lifetime;

@CheckDiscard("crbug.com/993421")
class AwPdfExporterJni implements AwPdfExporter.Natives {
  private static AwPdfExporter.Natives testInstance;

  public static final JniStaticTestMocker<AwPdfExporter.Natives> TEST_HOOKS =
      new JniStaticTestMocker<AwPdfExporter.Natives>() {
    @Override
    public void setInstanceForTesting(AwPdfExporter.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException(
            "Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void exportToPdf(long nativeAwPdfExporter, AwPdfExporter caller, int fd, int[] pages, CancellationSignal cancellationSignal) {
    GEN_JNI.org_chromium_android_1webview_AwPdfExporter_exportToPdf(nativeAwPdfExporter, caller, fd, pages, cancellationSignal);
  }

  public static AwPdfExporter.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException(
            "No mock found for the native implementation of AwPdfExporter.Natives. "
            + "The current configuration requires implementations be mocked.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded();
    return new AwPdfExporterJni();
  }
}
