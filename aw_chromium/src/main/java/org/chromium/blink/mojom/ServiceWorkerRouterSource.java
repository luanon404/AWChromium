// ServiceWorkerRouterSource.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/service_worker/service_worker_router_rule.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public final class ServiceWorkerRouterSource extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int NetworkSource = 0;
        public static final int RaceSource = 1;
        public static final int FetchEventSource = 2;
        public static final int CacheSource = 3;
    };
    private ServiceWorkerRouterNetworkSource mNetworkSource;
    private ServiceWorkerRouterRaceSource mRaceSource;
    private ServiceWorkerRouterFetchEventSource mFetchEventSource;
    private ServiceWorkerRouterCacheSource mCacheSource;

    public void setNetworkSource(ServiceWorkerRouterNetworkSource networkSource) {
        this.mTag = Tag.NetworkSource;
        this.mNetworkSource = networkSource;
    }

    public ServiceWorkerRouterNetworkSource getNetworkSource() {
        assert this.mTag == Tag.NetworkSource;
        return this.mNetworkSource;
    }

    public void setRaceSource(ServiceWorkerRouterRaceSource raceSource) {
        this.mTag = Tag.RaceSource;
        this.mRaceSource = raceSource;
    }

    public ServiceWorkerRouterRaceSource getRaceSource() {
        assert this.mTag == Tag.RaceSource;
        return this.mRaceSource;
    }

    public void setFetchEventSource(ServiceWorkerRouterFetchEventSource fetchEventSource) {
        this.mTag = Tag.FetchEventSource;
        this.mFetchEventSource = fetchEventSource;
    }

    public ServiceWorkerRouterFetchEventSource getFetchEventSource() {
        assert this.mTag == Tag.FetchEventSource;
        return this.mFetchEventSource;
    }

    public void setCacheSource(ServiceWorkerRouterCacheSource cacheSource) {
        this.mTag = Tag.CacheSource;
        this.mCacheSource = cacheSource;
    }

    public ServiceWorkerRouterCacheSource getCacheSource() {
        assert this.mTag == Tag.CacheSource;
        return this.mCacheSource;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.NetworkSource: {
                
                encoder0.encode(this.mNetworkSource, offset + 8, false);
                break;
            }
            case Tag.RaceSource: {
                
                encoder0.encode(this.mRaceSource, offset + 8, false);
                break;
            }
            case Tag.FetchEventSource: {
                
                encoder0.encode(this.mFetchEventSource, offset + 8, false);
                break;
            }
            case Tag.CacheSource: {
                
                encoder0.encode(this.mCacheSource, offset + 8, false);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static ServiceWorkerRouterSource deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final ServiceWorkerRouterSource decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        ServiceWorkerRouterSource result = new ServiceWorkerRouterSource();
        switch (dataHeader.elementsOrVersion) {
            case Tag.NetworkSource: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mNetworkSource = ServiceWorkerRouterNetworkSource.decode(decoder1);
                result.mTag = Tag.NetworkSource;
                break;
            }
            case Tag.RaceSource: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mRaceSource = ServiceWorkerRouterRaceSource.decode(decoder1);
                result.mTag = Tag.RaceSource;
                break;
            }
            case Tag.FetchEventSource: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mFetchEventSource = ServiceWorkerRouterFetchEventSource.decode(decoder1);
                result.mTag = Tag.FetchEventSource;
                break;
            }
            case Tag.CacheSource: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mCacheSource = ServiceWorkerRouterCacheSource.decode(decoder1);
                result.mTag = Tag.CacheSource;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}