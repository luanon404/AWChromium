// DateTimeChooser.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/choosers/date_time_chooser.mojom
//

package org.chromium.blink.mojom;

import androidx.annotation.IntDef;


public interface DateTimeChooser extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends DateTimeChooser, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<DateTimeChooser, DateTimeChooser.Proxy> MANAGER = DateTimeChooser_Internal.MANAGER;

    void openDateTimeDialog(
DateTimeDialogValue value, 
OpenDateTimeDialog_Response callback);

    interface OpenDateTimeDialog_Response extends org.chromium.mojo.bindings.Callbacks.Callback2<Boolean, Double> { }


    void closeDateTimeDialog(
);


}
