//
// This file was generated by third_party/jni_zero/jni_generator.py
//
package org.chromium.content.browser;

import org.jni_zero.CheckDiscard;
import org.jni_zero.JniStaticTestMocker;
import org.jni_zero.NativeLibraryLoadedStatus;
import org.jni_zero.GEN_JNI;
import android.Manifest;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import org.jni_zero.CalledByNative;
import org.jni_zero.JNINamespace;
import org.jni_zero.NativeMethods;
import org.chromium.content_public.browser.ContactsPicker;
import org.chromium.content_public.browser.ContactsPickerListener;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import java.nio.ByteBuffer;
import java.util.List;

@CheckDiscard("crbug.com/993421")
class ContactsDialogHostJni implements ContactsDialogHost.Natives {
  private static ContactsDialogHost.Natives testInstance;

  public static final JniStaticTestMocker<ContactsDialogHost.Natives> TEST_HOOKS =
      new JniStaticTestMocker<ContactsDialogHost.Natives>() {
    @Override
    public void setInstanceForTesting(ContactsDialogHost.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException(
            "Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void addContact(long nativeContactsProviderAndroid, String[] names, String[] emails, String[] tel, ByteBuffer[] addresses, ByteBuffer[] icons) {
    GEN_JNI.org_chromium_content_browser_ContactsDialogHost_addContact(nativeContactsProviderAndroid, names, emails, tel, addresses, icons);
  }

  @Override
  public void endContactsList(long nativeContactsProviderAndroid, int percentageShared, int propertiesSiteRequested) {
    GEN_JNI.org_chromium_content_browser_ContactsDialogHost_endContactsList(nativeContactsProviderAndroid, percentageShared, propertiesSiteRequested);
  }

  @Override
  public void endWithPermissionDenied(long nativeContactsProviderAndroid) {
    GEN_JNI.org_chromium_content_browser_ContactsDialogHost_endWithPermissionDenied(nativeContactsProviderAndroid);
  }

  public static ContactsDialogHost.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException(
            "No mock found for the native implementation of ContactsDialogHost.Natives. "
            + "The current configuration requires implementations be mocked.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded();
    return new ContactsDialogHostJni();
  }
}
