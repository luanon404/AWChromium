// SpeechSynthesisVoiceListObserver.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/speech/speech_synthesis.mojom
//

package org.chromium.blink.mojom;


public interface SpeechSynthesisVoiceListObserver extends org.chromium.mojo.bindings.Interface {



    interface Proxy extends SpeechSynthesisVoiceListObserver, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<SpeechSynthesisVoiceListObserver, SpeechSynthesisVoiceListObserver.Proxy> MANAGER = SpeechSynthesisVoiceListObserver_Internal.MANAGER;

    void onSetVoiceList(
SpeechSynthesisVoice[] voiceList);


}
