// AnnotationAgentContainer.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/annotation/annotation.mojom
//

package org.chromium.blink.mojom;


public interface AnnotationAgentContainer extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends AnnotationAgentContainer, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<AnnotationAgentContainer, AnnotationAgentContainer.Proxy> MANAGER = AnnotationAgentContainer_Internal.MANAGER;

    void createAgent(
AnnotationAgentHost hostRemote, org.chromium.mojo.bindings.InterfaceRequest<AnnotationAgent> agentReceiver, int type, String serializedSelector);


    void createAgentFromSelection(
int type, 
CreateAgentFromSelection_Response callback);

    interface CreateAgentFromSelection_Response extends org.chromium.mojo.bindings.Callbacks.Callback3<SelectorCreationResult, Integer, Integer> { }


}
