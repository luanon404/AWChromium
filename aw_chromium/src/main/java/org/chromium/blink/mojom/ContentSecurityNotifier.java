// ContentSecurityNotifier.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/loader/content_security_notifier.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface ContentSecurityNotifier extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends ContentSecurityNotifier, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<ContentSecurityNotifier, ContentSecurityNotifier.Proxy> MANAGER = ContentSecurityNotifier_Internal.MANAGER;

    void notifyContentWithCertificateErrorsRan(
);


    void notifyContentWithCertificateErrorsDisplayed(
);


    void notifyInsecureContentRan(
org.chromium.url.mojom.Url origin, org.chromium.url.mojom.Url insecureUrl);


}
