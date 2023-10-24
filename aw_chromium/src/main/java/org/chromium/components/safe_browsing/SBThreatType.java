// Copyright 2023 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../components/safe_browsing/core/browser/db/v4_protocol_manager_util.h

package org.chromium.components.safe_browsing;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({SBThreatType.UNUSED, SBThreatType.SAFE, SBThreatType.URL_PHISHING, SBThreatType.URL_MALWARE, SBThreatType.URL_UNWANTED, SBThreatType.URL_BINARY_MALWARE, SBThreatType.URL_CLIENT_SIDE_PHISHING, SBThreatType.EXTENSION, SBThreatType.URL_CLIENT_SIDE_MALWARE, SBThreatType.BLOCKLISTED_RESOURCE, SBThreatType.API_ABUSE, SBThreatType.SUBRESOURCE_FILTER, SBThreatType.CSD_ALLOWLIST, SBThreatType.DEPRECATED_URL_PASSWORD_PROTECTION_PHISHING, SBThreatType.SAVED_PASSWORD_REUSE, SBThreatType.SIGNED_IN_SYNC_PASSWORD_REUSE, SBThreatType.SIGNED_IN_NON_SYNC_PASSWORD_REUSE, SBThreatType.BLOCKED_AD_REDIRECT, SBThreatType.AD_SAMPLE, SBThreatType.BLOCKED_AD_POPUP, SBThreatType.SUSPICIOUS_SITE, SBThreatType.ENTERPRISE_PASSWORD_REUSE, SBThreatType.BILLING, SBThreatType.APK_DOWNLOAD, SBThreatType.HIGH_CONFIDENCE_ALLOWLIST, SBThreatType.MANAGED_POLICY_WARN, SBThreatType.MANAGED_POLICY_BLOCK, SBThreatType.MAX})
@Retention(RetentionPolicy.SOURCE)
public @interface SBThreatType {
    /**
     * This type can be used for lists that can be checked synchronously so a client callback isn't
     * required, or for allowlists.
     */
    int UNUSED = 0;
    /**
     * No threat at all.
     */
    int SAFE = 1;
    /**
     * The URL is being used for phishing.
     */
    int URL_PHISHING = 2;
    /**
     * The URL hosts malware.
     */
    int URL_MALWARE = 3;
    /**
     * The URL hosts unwanted programs.
     */
    int URL_UNWANTED = 4;
    /**
     * The download URL is malware.
     */
    int URL_BINARY_MALWARE = 5;
    /**
     * Url detected by the client-side phishing model.  Note that unlike the above values, this does
     * not correspond to a downloaded list.
     */
    int URL_CLIENT_SIDE_PHISHING = 6;
    /**
     * The Chrome extension or app (given by its ID) is malware.
     */
    int EXTENSION = 7;
    /**
     * Url detected by the client-side malware IP list. This IP list is part of the client side
     * detection model.
     */
    int URL_CLIENT_SIDE_MALWARE = 8;
    /**
     * Url leads to a blocklisted resource script. Note that no warnings should be shown on this
     * threat type, but an incident report might be sent.
     */
    int BLOCKLISTED_RESOURCE = 9;
    /**
     * Url abuses a permission API.
     */
    int API_ABUSE = 10;
    /**
     * Activation patterns for the Subresource Filter.
     */
    int SUBRESOURCE_FILTER = 11;
    /**
     * CSD Phishing allowlist.  This "threat" means a URL matched the allowlist.
     */
    int CSD_ALLOWLIST = 12;
    /**
     * DEPRECATED. Url detected by password protection service.
     */
    int DEPRECATED_URL_PASSWORD_PROTECTION_PHISHING = 13;
    /**
     * Saved password reuse detected on low reputation page,
     */
    int SAVED_PASSWORD_REUSE = 14;
    /**
     * Chrome signed in and syncing gaia password reuse detected on low reputation page,
     */
    int SIGNED_IN_SYNC_PASSWORD_REUSE = 15;
    /**
     * Chrome signed in non syncing gaia password reuse detected on low reputation page,
     */
    int SIGNED_IN_NON_SYNC_PASSWORD_REUSE = 16;
    /**
     * A Google ad that caused a blocked autoredirect was collected
     */
    int BLOCKED_AD_REDIRECT = 17;
    /**
     * A sample of an ad was collected
     */
    int AD_SAMPLE = 18;
    /**
     * A report of Google ad that caused a blocked popup was collected.
     */
    int BLOCKED_AD_POPUP = 19;
    /**
     * The page loaded a resource from the Suspicious Site list.
     */
    int SUSPICIOUS_SITE = 20;
    /**
     * Enterprise password reuse detected on low reputation page.
     */
    int ENTERPRISE_PASSWORD_REUSE = 21;
    /**
     * Potential billing detected.
     */
    int BILLING = 22;
    /**
     * Off-market APK file downloaded, which could be potentially dangerous.
     */
    int APK_DOWNLOAD = 23;
    /**
     * Match found in the local high-confidence allowlist.
     */
    int HIGH_CONFIDENCE_ALLOWLIST = 24;
    /**
     * List of URLs that should shown an accuracy tip. DEPRECATED: ACCURACY_TIPS = 25, Managed policy
     * indicated to warn a navigation.
     */
    int MANAGED_POLICY_WARN = 26;
    /**
     * Managed policy indicated to block a navigation.
     */
    int MANAGED_POLICY_BLOCK = 27;
    int MAX = MANAGED_POLICY_BLOCK;
}
