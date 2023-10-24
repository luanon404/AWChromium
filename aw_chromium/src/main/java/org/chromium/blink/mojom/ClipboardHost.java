// ClipboardHost.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/clipboard/clipboard.mojom
//

package org.chromium.blink.mojom;


public interface ClipboardHost extends org.chromium.mojo.bindings.Interface {


    
    int MAX_FORMAT_SIZE = (int) 1024;



    
    int MAX_DATA_SIZE = (int) 1073741824;




    interface Proxy extends ClipboardHost, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<ClipboardHost, ClipboardHost.Proxy> MANAGER = ClipboardHost_Internal.MANAGER;

    void getSequenceNumber(
int buffer, 
GetSequenceNumber_Response callback);

    interface GetSequenceNumber_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<ClipboardSequenceNumberToken> { }


    void isFormatAvailable(
int format, int buffer, 
IsFormatAvailable_Response callback);

    interface IsFormatAvailable_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<Boolean> { }


    void readAvailableTypes(
int buffer, 
ReadAvailableTypes_Response callback);

    interface ReadAvailableTypes_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.String16[]> { }


    void readText(
int buffer, 
ReadText_Response callback);

    interface ReadText_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.BigString16> { }


    void readHtml(
int buffer, 
ReadHtml_Response callback);

    interface ReadHtml_Response extends org.chromium.mojo.bindings.Callbacks.Callback4<org.chromium.mojo_base.mojom.BigString16, org.chromium.url.mojom.Url, Integer, Integer> { }


    void readSvg(
int buffer, 
ReadSvg_Response callback);

    interface ReadSvg_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.BigString16> { }


    void readRtf(
int buffer, 
ReadRtf_Response callback);

    interface ReadRtf_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.BigString> { }


    void readPng(
int buffer, 
ReadPng_Response callback);

    interface ReadPng_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.BigBuffer> { }


    void readFiles(
int buffer, 
ReadFiles_Response callback);

    interface ReadFiles_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<ClipboardFiles> { }


    void readCustomData(
int buffer, org.chromium.mojo_base.mojom.String16 type, 
ReadCustomData_Response callback);

    interface ReadCustomData_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.BigString16> { }


    void readAvailableCustomAndStandardFormats(

ReadAvailableCustomAndStandardFormats_Response callback);

    interface ReadAvailableCustomAndStandardFormats_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.String16[]> { }


    void readUnsanitizedCustomFormat(
org.chromium.mojo_base.mojom.String16 format, 
ReadUnsanitizedCustomFormat_Response callback);

    interface ReadUnsanitizedCustomFormat_Response extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.mojo_base.mojom.BigBuffer> { }


    void writeText(
org.chromium.mojo_base.mojom.BigString16 text);


    void writeHtml(
org.chromium.mojo_base.mojom.BigString16 markup, org.chromium.url.mojom.Url url);


    void writeSvg(
org.chromium.mojo_base.mojom.BigString16 markup);


    void writeSmartPasteMarker(
);


    void writeCustomData(
java.util.Map<org.chromium.mojo_base.mojom.String16, org.chromium.mojo_base.mojom.BigString16> data);


    void writeBookmark(
String url, org.chromium.mojo_base.mojom.String16 title);


    void writeImage(
org.chromium.skia.mojom.BitmapN32 image);


    void writeUnsanitizedCustomFormat(
org.chromium.mojo_base.mojom.String16 format, org.chromium.mojo_base.mojom.BigBuffer data);


    void commitWrite(
);


}
