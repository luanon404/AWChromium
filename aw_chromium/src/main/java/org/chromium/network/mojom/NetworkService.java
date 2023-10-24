// NetworkService.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_service.mojom
//

package org.chromium.network.mojom;

public interface NetworkService extends org.chromium.mojo.bindings.Interface {


    interface Proxy extends NetworkService, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<NetworkService, NetworkService.Proxy> MANAGER = NetworkService_Internal.MANAGER;

    void setParams(NetworkServiceParams params);


    void startNetLog(org.chromium.mojo_base.mojom.File file, long maxTotalSize, int captureMode, org.chromium.mojo_base.mojom.DictionaryValue constants);


    void attachNetLogProxy(NetLogProxySource proxySource, org.chromium.mojo.bindings.InterfaceRequest<NetLogProxySink> proxySink);


    void setSslKeyLogFile(org.chromium.mojo_base.mojom.File file);


    void createNetworkContext(org.chromium.mojo.bindings.InterfaceRequest<NetworkContext> context, NetworkContextParams params);


    void configureStubHostResolver(boolean insecureDnsClientEnabled, int secureDnsMode, DnsOverHttpsConfig dnsOverHttpsConfig, boolean additionalDnsTypesEnabled);


    void disableQuic();


    void setUpHttpAuth(HttpAuthStaticParams httpAuthStaticParams);


    void configureHttpAuthPrefs(HttpAuthDynamicParams httpAuthDynamicParams);


    void setRawHeadersAccess(int processId, org.chromium.url.internal.mojom.Origin[] origins);


    void setMaxConnectionsPerProxy(int maxConnections);


    void getNetworkChangeManager(org.chromium.mojo.bindings.InterfaceRequest<NetworkChangeManager> networkChangeManager);


    void getNetworkQualityEstimatorManager(org.chromium.mojo.bindings.InterfaceRequest<NetworkQualityEstimatorManager> receiver);


    void getDnsConfigChangeManager(org.chromium.mojo.bindings.InterfaceRequest<DnsConfigChangeManager> receiver);


    void getNetworkList(int policy, GetNetworkList_Response callback);

    interface GetNetworkList_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<NetworkInterface[]> {
    }


    void onTrustStoreChanged();


    void onClientCertStoreChanged();


    void setEncryptionKey(org.chromium.mojo_base.mojom.ByteString encryptionKey);


    void onMemoryPressure(int memoryPressureLevel);


    void onPeerToPeerConnectionsCountChange(int count);


    void onApplicationStateChange(int state);


    void setEnvironment(EnvironmentVariable[] environment);


    void setTrustTokenKeyCommitments(String rawCommitments, SetTrustTokenKeyCommitments_Response callback);

    interface SetTrustTokenKeyCommitments_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 {
    }


    void clearSctAuditingCache();


    void configureSctAuditing(SctAuditingConfiguration configuration);


    void updateCtLogList(CtLogInfo[] logList, org.chromium.mojo_base.mojom.Time updateTime, UpdateCtLogList_Response callback);

    interface UpdateCtLogList_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 {
    }


    void updateCtKnownPopularScTs(byte[][] sctHashes, UpdateCtKnownPopularScTs_Response callback);

    interface UpdateCtKnownPopularScTs_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 {
    }


    void setCtEnforcementEnabled(boolean enabled, SetCtEnforcementEnabled_Response callback);

    interface SetCtEnforcementEnabled_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 {
    }


    void updateKeyPinsList(PinList pinList, org.chromium.mojo_base.mojom.Time updateTime);


    void dumpWithoutCrashing(org.chromium.mojo_base.mojom.Time dumpRequestTime);


    void bindTestInterfaceForTesting(org.chromium.mojo.bindings.InterfaceRequest<NetworkServiceTest> receiver);


    void setFirstPartySets(GlobalFirstPartySets sets);


    void setExplicitlyAllowedPorts(short[] ports);


    void updateMaskedDomainList(org.chromium.mojo_base.mojom.ByteString rawMdl);


    void parseHeaders(org.chromium.url.mojom.Url url, HttpResponseHeaders headers, ParseHeaders_Response callback);

    interface ParseHeaders_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<ParsedHeaders> {
    }


    void enableDataUseUpdates(boolean enable);


    void setIPv6ReachabilityOverride(boolean reachabilityOverride);


}
