// FindInPageClient.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/find_in_page.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface FindInPageClient extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends FindInPageClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<FindInPageClient, FindInPageClient.Proxy> MANAGER = FindInPageClient_Internal.MANAGER;

    void setNumberOfMatches(
int requestId, int numberOfMatches, int updateType);


    void setActiveMatch(
int requestId, org.chromium.gfx.mojom.Rect activeMatchRect, int activeMatchOrdinal, int updateType);


}
