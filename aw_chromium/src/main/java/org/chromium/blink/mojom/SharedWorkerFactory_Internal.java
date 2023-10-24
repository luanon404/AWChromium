// SharedWorkerFactory_Internal.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/worker/shared_worker_factory.mojom
//

package org.chromium.blink.mojom;


class SharedWorkerFactory_Internal {

    public static final org.chromium.mojo.bindings.Interface.Manager<SharedWorkerFactory, SharedWorkerFactory.Proxy> MANAGER =
            new org.chromium.mojo.bindings.Interface.Manager<SharedWorkerFactory, SharedWorkerFactory.Proxy>() {

        @Override
        public String getName() {
            return "blink.mojom.SharedWorkerFactory";
        }

        @Override
        public int getVersion() {
          return 0;
        }

        @Override
        public Proxy buildProxy(org.chromium.mojo.system.Core core,
                                org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override
        public Stub buildStub(org.chromium.mojo.system.Core core, SharedWorkerFactory impl) {
            return new Stub(core, impl);
        }

        @Override
        public SharedWorkerFactory[] buildArray(int size) {
          return new SharedWorkerFactory[size];
        }
    };


    private static final int CREATE_SHARED_WORKER_ORDINAL = 0;


    static final class Proxy extends org.chromium.mojo.bindings.Interface.AbstractProxy implements SharedWorkerFactory.Proxy {

        Proxy(org.chromium.mojo.system.Core core,
              org.chromium.mojo.bindings.MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }


        @Override
        public void createSharedWorker(
SharedWorkerInfo info, SharedWorkerToken token, StorageKey constructorKey, boolean isConstructorSecureContext, String userAgent, UserAgentMetadata uaMetadata, boolean pauseOnStart, org.chromium.mojo_base.mojom.UnguessableToken devtoolsWorkerToken, RendererPreferences rendererPreferences, org.chromium.mojo.bindings.InterfaceRequest<RendererPreferenceWatcher> preferenceWatcherReceiver, WorkerContentSettingsProxy contentSettings, ServiceWorkerContainerInfoForClient serviceWorkerContainerInfo, WorkerMainScriptLoadParams mainScriptLoadParams, UrlLoaderFactoryBundle subresourceLoaderFactories, ControllerServiceWorkerInfo controllerInfo, PolicyContainer policyContainer, SharedWorkerHost host, org.chromium.mojo.bindings.InterfaceRequest<SharedWorker> sharedWorker, BrowserInterfaceBroker browserInterfaceBroker, long ukmSourceId) {

            SharedWorkerFactoryCreateSharedWorkerParams _message = new SharedWorkerFactoryCreateSharedWorkerParams();

            _message.info = info;

            _message.token = token;

            _message.constructorKey = constructorKey;

            _message.isConstructorSecureContext = isConstructorSecureContext;

            _message.userAgent = userAgent;

            _message.uaMetadata = uaMetadata;

            _message.pauseOnStart = pauseOnStart;

            _message.devtoolsWorkerToken = devtoolsWorkerToken;

            _message.rendererPreferences = rendererPreferences;

            _message.preferenceWatcherReceiver = preferenceWatcherReceiver;

            _message.contentSettings = contentSettings;

            _message.serviceWorkerContainerInfo = serviceWorkerContainerInfo;

            _message.mainScriptLoadParams = mainScriptLoadParams;

            _message.subresourceLoaderFactories = subresourceLoaderFactories;

            _message.controllerInfo = controllerInfo;

            _message.policyContainer = policyContainer;

            _message.host = host;

            _message.sharedWorker = sharedWorker;

            _message.browserInterfaceBroker = browserInterfaceBroker;

            _message.ukmSourceId = ukmSourceId;


            getProxyHandler().getMessageReceiver().accept(
                    _message.serializeWithHeader(
                            getProxyHandler().getCore(),
                            new org.chromium.mojo.bindings.MessageHeader(CREATE_SHARED_WORKER_ORDINAL)));

        }


    }

    static final class Stub extends org.chromium.mojo.bindings.Interface.Stub<SharedWorkerFactory> {

        Stub(org.chromium.mojo.system.Core core, SharedWorkerFactory impl) {
            super(core, impl);
        }

        @Override
        public boolean accept(org.chromium.mojo.bindings.Message message) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.NO_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRunOrClosePipe(
                                SharedWorkerFactory_Internal.MANAGER, messageWithHeader);





                    case CREATE_SHARED_WORKER_ORDINAL: {

                        SharedWorkerFactoryCreateSharedWorkerParams data =
                                SharedWorkerFactoryCreateSharedWorkerParams.deserialize(messageWithHeader.getPayload());

                        getImpl().createSharedWorker(data.info, data.token, data.constructorKey, data.isConstructorSecureContext, data.userAgent, data.uaMetadata, data.pauseOnStart, data.devtoolsWorkerToken, data.rendererPreferences, data.preferenceWatcherReceiver, data.contentSettings, data.serviceWorkerContainerInfo, data.mainScriptLoadParams, data.subresourceLoaderFactories, data.controllerInfo, data.policyContainer, data.host, data.sharedWorker, data.browserInterfaceBroker, data.ukmSourceId);
                        return true;
                    }


                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e);
                return false;
            }
        }

        @Override
        public boolean acceptWithResponder(org.chromium.mojo.bindings.Message message, org.chromium.mojo.bindings.MessageReceiver receiver) {
            try {
                org.chromium.mojo.bindings.ServiceMessage messageWithHeader =
                        message.asServiceMessage();
                org.chromium.mojo.bindings.MessageHeader header = messageWithHeader.getHeader();
                int flags = org.chromium.mojo.bindings.MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG;
                if (header.hasFlag(org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags | org.chromium.mojo.bindings.MessageHeader.MESSAGE_IS_SYNC_FLAG;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch(header.getType()) {

                    case org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants.RUN_MESSAGE_ID:
                        return org.chromium.mojo.bindings.InterfaceControlMessagesHelper.handleRun(
                                getCore(), SharedWorkerFactory_Internal.MANAGER, messageWithHeader, receiver);




                    default:
                        return false;
                }
            } catch (org.chromium.mojo.bindings.DeserializationException e) {
                System.err.println(e);
                return false;
            }
        }
    }


    
    static final class SharedWorkerFactoryCreateSharedWorkerParams extends org.chromium.mojo.bindings.Struct {

        private static final int STRUCT_SIZE = 152;
        private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(152, 0)};
        private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
        public SharedWorkerInfo info;
        public SharedWorkerToken token;
        public StorageKey constructorKey;
        public boolean isConstructorSecureContext;
        public String userAgent;
        public UserAgentMetadata uaMetadata;
        public boolean pauseOnStart;
        public org.chromium.mojo_base.mojom.UnguessableToken devtoolsWorkerToken;
        public RendererPreferences rendererPreferences;
        public org.chromium.mojo.bindings.InterfaceRequest<RendererPreferenceWatcher> preferenceWatcherReceiver;
        public WorkerContentSettingsProxy contentSettings;
        public ServiceWorkerContainerInfoForClient serviceWorkerContainerInfo;
        public WorkerMainScriptLoadParams mainScriptLoadParams;
        public UrlLoaderFactoryBundle subresourceLoaderFactories;
        public ControllerServiceWorkerInfo controllerInfo;
        public PolicyContainer policyContainer;
        public SharedWorkerHost host;
        public org.chromium.mojo.bindings.InterfaceRequest<SharedWorker> sharedWorker;
        public BrowserInterfaceBroker browserInterfaceBroker;
        public long ukmSourceId;

        private SharedWorkerFactoryCreateSharedWorkerParams(int version) {
            super(STRUCT_SIZE, version);
        }

        public SharedWorkerFactoryCreateSharedWorkerParams() {
            this(0);
        }

        public static SharedWorkerFactoryCreateSharedWorkerParams deserialize(org.chromium.mojo.bindings.Message message) {
            return decode(new org.chromium.mojo.bindings.Decoder(message));
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        public static SharedWorkerFactoryCreateSharedWorkerParams deserialize(java.nio.ByteBuffer data) {
            return deserialize(new org.chromium.mojo.bindings.Message(
                    data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
        }

        @SuppressWarnings("unchecked")
        public static SharedWorkerFactoryCreateSharedWorkerParams decode(org.chromium.mojo.bindings.Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            SharedWorkerFactoryCreateSharedWorkerParams result;
            try {
                org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                final int elementsOrVersion = mainDataHeader.elementsOrVersion;
                result = new SharedWorkerFactoryCreateSharedWorkerParams(elementsOrVersion);
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                    result.info = SharedWorkerInfo.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                    result.token = SharedWorkerToken.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(24, false);
                    result.constructorKey = StorageKey.decode(decoder1);
                    }
                    {
                        
                    result.isConstructorSecureContext = decoder0.readBoolean(32, 0);
                    }
                    {
                        
                    result.pauseOnStart = decoder0.readBoolean(32, 1);
                    }
                    {
                        
                    result.preferenceWatcherReceiver = decoder0.readInterfaceRequest(36, false);
                    }
                    {
                        
                    result.userAgent = decoder0.readString(40, false);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(48, false);
                    result.uaMetadata = UserAgentMetadata.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(56, false);
                    result.devtoolsWorkerToken = org.chromium.mojo_base.mojom.UnguessableToken.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(64, false);
                    result.rendererPreferences = RendererPreferences.decode(decoder1);
                    }
                    {
                        
                    result.contentSettings = decoder0.readServiceInterface(72, false, WorkerContentSettingsProxy.MANAGER);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(80, true);
                    result.serviceWorkerContainerInfo = ServiceWorkerContainerInfoForClient.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(88, false);
                    result.mainScriptLoadParams = WorkerMainScriptLoadParams.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(96, false);
                    result.subresourceLoaderFactories = UrlLoaderFactoryBundle.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(104, true);
                    result.controllerInfo = ControllerServiceWorkerInfo.decode(decoder1);
                    }
                    {
                        
                    org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(112, false);
                    result.policyContainer = PolicyContainer.decode(decoder1);
                    }
                    {
                        
                    result.host = decoder0.readServiceInterface(120, false, SharedWorkerHost.MANAGER);
                    }
                    {
                        
                    result.sharedWorker = decoder0.readInterfaceRequest(128, false);
                    }
                    {
                        
                    result.browserInterfaceBroker = decoder0.readServiceInterface(132, false, BrowserInterfaceBroker.MANAGER);
                    }
                    {
                        
                    result.ukmSourceId = decoder0.readLong(144);
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
            
            encoder0.encode(this.info, 8, false);
            
            encoder0.encode(this.token, 16, false);
            
            encoder0.encode(this.constructorKey, 24, false);
            
            encoder0.encode(this.isConstructorSecureContext, 32, 0);
            
            encoder0.encode(this.pauseOnStart, 32, 1);
            
            encoder0.encode(this.preferenceWatcherReceiver, 36, false);
            
            encoder0.encode(this.userAgent, 40, false);
            
            encoder0.encode(this.uaMetadata, 48, false);
            
            encoder0.encode(this.devtoolsWorkerToken, 56, false);
            
            encoder0.encode(this.rendererPreferences, 64, false);
            
            encoder0.encode(this.contentSettings, 72, false, WorkerContentSettingsProxy.MANAGER);
            
            encoder0.encode(this.serviceWorkerContainerInfo, 80, true);
            
            encoder0.encode(this.mainScriptLoadParams, 88, false);
            
            encoder0.encode(this.subresourceLoaderFactories, 96, false);
            
            encoder0.encode(this.controllerInfo, 104, true);
            
            encoder0.encode(this.policyContainer, 112, false);
            
            encoder0.encode(this.host, 120, false, SharedWorkerHost.MANAGER);
            
            encoder0.encode(this.sharedWorker, 128, false);
            
            encoder0.encode(this.browserInterfaceBroker, 132, false, BrowserInterfaceBroker.MANAGER);
            
            encoder0.encode(this.ukmSourceId, 144);
        }
    }



}
