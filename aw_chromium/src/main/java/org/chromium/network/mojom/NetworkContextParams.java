// NetworkContextParams.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_context.mojom
//

package org.chromium.network.mojom;

public final class NetworkContextParams extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 232;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[]{new org.chromium.mojo.bindings.DataHeader(232, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public String userAgent;
    public String acceptLanguage;
    public boolean enableBrotli;
    public boolean enableZstd;
    public boolean enableReferrers;
    public boolean validateReferrerPolicyOnInitialRequest;
    public org.chromium.proxy_resolver.mojom.ProxyResolverFactory proxyResolverFactory;
    public boolean enableEncryptedCookies;
    public boolean restoreOldSessionCookies;
    public boolean persistSessionCookies;
    public boolean httpCacheEnabled;
    public int httpCacheMaxSize;
    public HttpCacheBackendFileOperationsFactory httpCacheFileOperationsFactory;
    public boolean checkClearTextPermitted;
    public boolean disableIdleSocketsCloseOnMemoryPressure;
    public SslConfig initialSslConfig;
    public org.chromium.mojo.bindings.InterfaceRequest<SslConfigClient> sslConfigClientReceiver;
    public ProxyConfigWithAnnotation initialProxyConfig;
    public org.chromium.mojo.bindings.InterfaceRequest<ProxyConfigClient> proxyConfigClientReceiver;
    public CustomProxyConfig initialCustomProxyConfig;
    public org.chromium.mojo.bindings.InterfaceRequest<CustomProxyConfigClient> customProxyConfigClientReceiver;
    public CustomProxyConnectionObserver customProxyConnectionObserverRemote;
    public ProxyConfigPollerClient proxyConfigPollerClient;
    public ProxyErrorClient proxyErrorClient;
    public IpProtectionConfigGetter ipProtectionConfigGetter;
    public boolean pacQuickCheckEnabled;
    public boolean enableCertificateReporting;
    public boolean enforceChromeCtPolicy;
    public int sctAuditingMode;
    public CtPolicy ctPolicy;
    public CertVerifierServiceRemoteParams certVerifierParams;
    public CookieManagerParams cookieManagerParams;
    public org.chromium.mojo.bindings.InterfaceRequest<CookieManager> cookieManager;
    public boolean enableDomainReliability;
    public String domainReliabilityUploadReporter;
    public boolean discardDomainReliablityUploads;
    public org.chromium.mojo_base.mojom.TimeDelta reportingDeliveryInterval;
    public boolean skipReportingSendPermissionCheck;
    public CorsOriginAccessPatterns[] corsOriginAccessList;
    public String[] corsExemptHeaderList;
    public boolean allowAnyCorsExemptHeaderForBrowser;
    public String[] hstsPolicyBypassList;
    public HttpAuthStaticNetworkContextParams httpAuthStaticNetworkContextParams;
    public boolean resetHttpCacheBackend;
    public boolean splitAuthCacheByNetworkAnonymizationKey;
    public boolean requireNetworkAnonymizationKey;
    public NetworkContextFilePaths filePaths;
    public boolean blockTrustTokens;
    public boolean sharedDictionaryEnabled;
    public long sharedDictionaryCacheMaxSize;
    public FirstPartySetsAccessDelegateParams firstPartySetsAccessDelegateParams;
    public org.chromium.mojo.bindings.InterfaceRequest<FirstPartySetsAccessDelegate> firstPartySetsAccessDelegateReceiver;
    public boolean acamPreflightSpecConformant;
    public String cookieDeprecationLabel;
    public boolean afpBlockListExperimentEnabled;

    private NetworkContextParams(int version) {
        super(STRUCT_SIZE, version);
        this.enableBrotli = (boolean) true;
        this.enableZstd = (boolean) false;
        this.enableReferrers = (boolean) true;
        this.validateReferrerPolicyOnInitialRequest = (boolean) true;
        this.enableEncryptedCookies = (boolean) true;
        this.restoreOldSessionCookies = (boolean) false;
        this.persistSessionCookies = (boolean) false;
        this.httpCacheEnabled = (boolean) true;
        this.httpCacheMaxSize = (int) 0;
        this.checkClearTextPermitted = (boolean) false;
        this.disableIdleSocketsCloseOnMemoryPressure = (boolean) false;
        this.pacQuickCheckEnabled = (boolean) true;
        this.enableCertificateReporting = (boolean) false;
        this.enforceChromeCtPolicy = (boolean) false;
        this.sctAuditingMode = (int) SctAuditingMode.DISABLED;
        this.enableDomainReliability = (boolean) false;
        this.discardDomainReliablityUploads = (boolean) false;
        this.skipReportingSendPermissionCheck = (boolean) false;
        this.allowAnyCorsExemptHeaderForBrowser = (boolean) false;
        this.resetHttpCacheBackend = (boolean) false;
        this.splitAuthCacheByNetworkAnonymizationKey = (boolean) false;
        this.requireNetworkAnonymizationKey = (boolean) false;
        this.sharedDictionaryEnabled = (boolean) false;
        this.sharedDictionaryCacheMaxSize = (long) 0;
        this.acamPreflightSpecConformant = (boolean) true;
        this.afpBlockListExperimentEnabled = (boolean) false;
    }

    public NetworkContextParams() {
        this(0);
    }

    public static NetworkContextParams deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static NetworkContextParams deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static NetworkContextParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        NetworkContextParams result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new NetworkContextParams(elementsOrVersion);
            {

                result.userAgent = decoder0.readString(8, false);
            }
            {

                result.acceptLanguage = decoder0.readString(16, false);
            }
            {

                result.enableBrotli = decoder0.readBoolean(24, 0);
            }
            {

                result.enableZstd = decoder0.readBoolean(24, 1);
            }
            {

                result.enableReferrers = decoder0.readBoolean(24, 2);
            }
            {

                result.validateReferrerPolicyOnInitialRequest = decoder0.readBoolean(24, 3);
            }
            {

                result.enableEncryptedCookies = decoder0.readBoolean(24, 4);
            }
            {

                result.restoreOldSessionCookies = decoder0.readBoolean(24, 5);
            }
            {

                result.persistSessionCookies = decoder0.readBoolean(24, 6);
            }
            {

                result.httpCacheEnabled = decoder0.readBoolean(24, 7);
            }
            {

                result.checkClearTextPermitted = decoder0.readBoolean(25, 0);
            }
            {

                result.disableIdleSocketsCloseOnMemoryPressure = decoder0.readBoolean(25, 1);
            }
            {

                result.pacQuickCheckEnabled = decoder0.readBoolean(25, 2);
            }
            {

                result.enableCertificateReporting = decoder0.readBoolean(25, 3);
            }
            {

                result.enforceChromeCtPolicy = decoder0.readBoolean(25, 4);
            }
            {

                result.enableDomainReliability = decoder0.readBoolean(25, 5);
            }
            {

                result.discardDomainReliablityUploads = decoder0.readBoolean(25, 6);
            }
            {

                result.skipReportingSendPermissionCheck = decoder0.readBoolean(25, 7);
            }
            {

                result.allowAnyCorsExemptHeaderForBrowser = decoder0.readBoolean(26, 0);
            }
            {

                result.resetHttpCacheBackend = decoder0.readBoolean(26, 1);
            }
            {

                result.splitAuthCacheByNetworkAnonymizationKey = decoder0.readBoolean(26, 2);
            }
            {

                result.requireNetworkAnonymizationKey = decoder0.readBoolean(26, 3);
            }
            {

                result.blockTrustTokens = decoder0.readBoolean(26, 4);
            }
            {

                result.sharedDictionaryEnabled = decoder0.readBoolean(26, 5);
            }
            {

                result.acamPreflightSpecConformant = decoder0.readBoolean(26, 6);
            }
            {

                result.afpBlockListExperimentEnabled = decoder0.readBoolean(26, 7);
            }
            {

                result.proxyResolverFactory = decoder0.readServiceInterface(28, true, org.chromium.proxy_resolver.mojom.ProxyResolverFactory.MANAGER);
            }
            {

                result.httpCacheMaxSize = decoder0.readInt(36);
            }
            {

                result.httpCacheFileOperationsFactory = decoder0.readServiceInterface(40, true, HttpCacheBackendFileOperationsFactory.MANAGER);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, true);
                result.initialSslConfig = SslConfig.decode(decoder1);
            }
            {

                result.sslConfigClientReceiver = decoder0.readInterfaceRequest(56, true);
            }
            {

                result.proxyConfigClientReceiver = decoder0.readInterfaceRequest(60, true);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(64, true);
                result.initialProxyConfig = ProxyConfigWithAnnotation.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(72, true);
                result.initialCustomProxyConfig = CustomProxyConfig.decode(decoder1);
            }
            {

                result.customProxyConfigClientReceiver = decoder0.readInterfaceRequest(80, true);
            }
            {

                result.customProxyConnectionObserverRemote = decoder0.readServiceInterface(84, true, CustomProxyConnectionObserver.MANAGER);
            }
            {

                result.proxyConfigPollerClient = decoder0.readServiceInterface(92, true, ProxyConfigPollerClient.MANAGER);
            }
            {

                result.proxyErrorClient = decoder0.readServiceInterface(100, true, ProxyErrorClient.MANAGER);
            }
            {

                result.ipProtectionConfigGetter = decoder0.readServiceInterface(108, true, IpProtectionConfigGetter.MANAGER);
            }
            {

                result.sctAuditingMode = decoder0.readInt(116);
                SctAuditingMode.validate(result.sctAuditingMode);
                result.sctAuditingMode = SctAuditingMode.toKnownValue(result.sctAuditingMode);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(120, true);
                result.ctPolicy = CtPolicy.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(128, false);
                result.certVerifierParams = CertVerifierServiceRemoteParams.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(136, true);
                result.cookieManagerParams = CookieManagerParams.decode(decoder1);
            }
            {

                result.cookieManager = decoder0.readInterfaceRequest(144, true);
            }
            {

                result.firstPartySetsAccessDelegateReceiver = decoder0.readInterfaceRequest(148, true);
            }
            {

                result.domainReliabilityUploadReporter = decoder0.readString(152, false);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(160, true);
                result.reportingDeliveryInterval = org.chromium.mojo_base.mojom.TimeDelta.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(168, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.corsOriginAccessList = new CorsOriginAccessPatterns[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {

                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.corsOriginAccessList[i1] = CorsOriginAccessPatterns.decode(decoder2);
                    }
                }
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(176, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.corsExemptHeaderList = new String[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {

                        result.corsExemptHeaderList[i1] = decoder1.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                    }
                }
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(184, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                    result.hstsPolicyBypassList = new String[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {

                        result.hstsPolicyBypassList[i1] = decoder1.readString(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                    }
                }
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(192, true);
                result.httpAuthStaticNetworkContextParams = HttpAuthStaticNetworkContextParams.decode(decoder1);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(200, true);
                result.filePaths = NetworkContextFilePaths.decode(decoder1);
            }
            {

                result.sharedDictionaryCacheMaxSize = decoder0.readLong(208);
            }
            {

                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(216, true);
                result.firstPartySetsAccessDelegateParams = FirstPartySetsAccessDelegateParams.decode(decoder1);
            }
            {

                result.cookieDeprecationLabel = decoder0.readString(224, true);
            }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);

        encoder0.encode(this.userAgent, 8, false);

        encoder0.encode(this.acceptLanguage, 16, false);

        encoder0.encode(this.enableBrotli, 24, 0);

        encoder0.encode(this.enableZstd, 24, 1);

        encoder0.encode(this.enableReferrers, 24, 2);

        encoder0.encode(this.validateReferrerPolicyOnInitialRequest, 24, 3);

        encoder0.encode(this.enableEncryptedCookies, 24, 4);

        encoder0.encode(this.restoreOldSessionCookies, 24, 5);

        encoder0.encode(this.persistSessionCookies, 24, 6);

        encoder0.encode(this.httpCacheEnabled, 24, 7);

        encoder0.encode(this.checkClearTextPermitted, 25, 0);

        encoder0.encode(this.disableIdleSocketsCloseOnMemoryPressure, 25, 1);

        encoder0.encode(this.pacQuickCheckEnabled, 25, 2);

        encoder0.encode(this.enableCertificateReporting, 25, 3);

        encoder0.encode(this.enforceChromeCtPolicy, 25, 4);

        encoder0.encode(this.enableDomainReliability, 25, 5);

        encoder0.encode(this.discardDomainReliablityUploads, 25, 6);

        encoder0.encode(this.skipReportingSendPermissionCheck, 25, 7);

        encoder0.encode(this.allowAnyCorsExemptHeaderForBrowser, 26, 0);

        encoder0.encode(this.resetHttpCacheBackend, 26, 1);

        encoder0.encode(this.splitAuthCacheByNetworkAnonymizationKey, 26, 2);

        encoder0.encode(this.requireNetworkAnonymizationKey, 26, 3);

        encoder0.encode(this.blockTrustTokens, 26, 4);

        encoder0.encode(this.sharedDictionaryEnabled, 26, 5);

        encoder0.encode(this.acamPreflightSpecConformant, 26, 6);

        encoder0.encode(this.afpBlockListExperimentEnabled, 26, 7);

        encoder0.encode(this.proxyResolverFactory, 28, true, org.chromium.proxy_resolver.mojom.ProxyResolverFactory.MANAGER);

        encoder0.encode(this.httpCacheMaxSize, 36);

        encoder0.encode(this.httpCacheFileOperationsFactory, 40, true, HttpCacheBackendFileOperationsFactory.MANAGER);

        encoder0.encode(this.initialSslConfig, 48, true);

        encoder0.encode(this.sslConfigClientReceiver, 56, true);

        encoder0.encode(this.proxyConfigClientReceiver, 60, true);

        encoder0.encode(this.initialProxyConfig, 64, true);

        encoder0.encode(this.initialCustomProxyConfig, 72, true);

        encoder0.encode(this.customProxyConfigClientReceiver, 80, true);

        encoder0.encode(this.customProxyConnectionObserverRemote, 84, true, CustomProxyConnectionObserver.MANAGER);

        encoder0.encode(this.proxyConfigPollerClient, 92, true, ProxyConfigPollerClient.MANAGER);

        encoder0.encode(this.proxyErrorClient, 100, true, ProxyErrorClient.MANAGER);

        encoder0.encode(this.ipProtectionConfigGetter, 108, true, IpProtectionConfigGetter.MANAGER);

        encoder0.encode(this.sctAuditingMode, 116);

        encoder0.encode(this.ctPolicy, 120, true);

        encoder0.encode(this.certVerifierParams, 128, false);

        encoder0.encode(this.cookieManagerParams, 136, true);

        encoder0.encode(this.cookieManager, 144, true);

        encoder0.encode(this.firstPartySetsAccessDelegateReceiver, 148, true);

        encoder0.encode(this.domainReliabilityUploadReporter, 152, false);

        encoder0.encode(this.reportingDeliveryInterval, 160, true);

        if (this.corsOriginAccessList == null) {
            encoder0.encodeNullPointer(168, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.corsOriginAccessList.length, 168, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.corsOriginAccessList.length; ++i0) {

                encoder1.encode(this.corsOriginAccessList[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }

        if (this.corsExemptHeaderList == null) {
            encoder0.encodeNullPointer(176, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.corsExemptHeaderList.length, 176, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.corsExemptHeaderList.length; ++i0) {

                encoder1.encode(this.corsExemptHeaderList[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }

        if (this.hstsPolicyBypassList == null) {
            encoder0.encodeNullPointer(184, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.hstsPolicyBypassList.length, 184, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
            for (int i0 = 0; i0 < this.hstsPolicyBypassList.length; ++i0) {

                encoder1.encode(this.hstsPolicyBypassList[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }

        encoder0.encode(this.httpAuthStaticNetworkContextParams, 192, true);

        encoder0.encode(this.filePaths, 200, true);

        encoder0.encode(this.sharedDictionaryCacheMaxSize, 208);

        encoder0.encode(this.firstPartySetsAccessDelegateParams, 216, true);

        encoder0.encode(this.cookieDeprecationLabel, 224, true);
    }
}