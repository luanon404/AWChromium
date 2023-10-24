// AdAuctionService.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/interest_group/ad_auction_service.mojom
//

package org.chromium.blink.mojom;


public interface AdAuctionService extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends AdAuctionService, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<AdAuctionService, AdAuctionService.Proxy> MANAGER = AdAuctionService_Internal.MANAGER;

    void createAdRequest(
AdRequestConfig config, 
CreateAdRequest_Response callback);

    interface CreateAdRequest_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<String> { }


    void finalizeAd(
String adsGuid, AuctionAdConfig config, 
FinalizeAd_Response callback);

    interface FinalizeAd_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.url.mojom.Url> { }


    void createAuctionNonce(

CreateAuctionNonce_Response callback);

    interface CreateAuctionNonce_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.Uuid> { }


    void runAdAuction(
AuctionAdConfig config, org.chromium.mojo.bindings.InterfaceRequest<AbortableAdAuction> abortReceiver, 
RunAdAuction_Response callback);

    interface RunAdAuction_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Boolean, FencedFrameConfig> { }


    void joinInterestGroup(
InterestGroup group, 
JoinInterestGroup_Response callback);

    interface JoinInterestGroup_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }


    void leaveInterestGroup(
org.chromium.url.internal.mojom.Origin owner, String name, 
LeaveInterestGroup_Response callback);

    interface LeaveInterestGroup_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }


    void leaveInterestGroupForDocument(
);


    void clearOriginJoinedInterestGroups(
org.chromium.url.internal.mojom.Origin owner, String[] interestGroupsToKeep, 
ClearOriginJoinedInterestGroups_Response callback);

    interface ClearOriginJoinedInterestGroups_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }


    void updateAdInterestGroups(
);


    void deprecatedGetUrlFromUrn(
org.chromium.url.mojom.Url uuidUrl, boolean sendReports, 
DeprecatedGetUrlFromUrn_Response callback);

    interface DeprecatedGetUrlFromUrn_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.url.mojom.Url> { }


    void deprecatedReplaceInUrn(
org.chromium.url.mojom.Url uuidUrl, AdKeywordReplacement[] replacements, 
DeprecatedReplaceInUrn_Response callback);

    interface DeprecatedReplaceInUrn_Response extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


    void getInterestGroupAdAuctionData(
org.chromium.url.internal.mojom.Origin seller, org.chromium.url.internal.mojom.Origin coordinator, 
GetInterestGroupAdAuctionData_Response callback);

    interface GetInterestGroupAdAuctionData_Response extends org.chromium.mojo.bindings.Callbacks.Callback3<org.chromium.mojo_base.mojom.BigBuffer, org.chromium.mojo_base.mojom.Uuid, String> { }


}
