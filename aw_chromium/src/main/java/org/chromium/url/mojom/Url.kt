// Url.java is auto generated by mojom_bindings_generator.py, do not edit
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.
// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     url/mojom/url.mojom
//
package org.chromium.url.mojom

import org.chromium.mojo.bindings.DataHeader
import org.chromium.mojo.bindings.Decoder
import org.chromium.mojo.bindings.Encoder
import org.chromium.mojo.bindings.Message
import org.chromium.mojo.bindings.Struct
import java.nio.ByteBuffer

class Url private constructor(version: Int) : Struct(STRUCT_SIZE, version) {
    var url: String? = null

    constructor() : this(0)

    override fun encode(encoder: Encoder) {
        val encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO)
        encoder0.encode(url, 8, false)
    }

    companion object {
        private const val STRUCT_SIZE = 16
        private val VERSION_ARRAY = arrayOf(DataHeader(16, 0))
        private val DEFAULT_STRUCT_INFO = VERSION_ARRAY[0]
        fun deserialize(message: Message?): Url? {
            return decode(Decoder(message))
        }

        /**
         * Similar to the method above, but deserializes from a |ByteBuffer| instance.
         *
         * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
         */
        fun deserialize(data: ByteBuffer?): Url? {
            return deserialize(
                Message(
                    data, ArrayList()
                )
            )
        }

        @JvmStatic
        fun decode(decoder0: Decoder?): Url? {
            if (decoder0 == null) {
                return null
            }
            decoder0.increaseStackDepth()
            val result: Url
            try {
                val mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY)
                val elementsOrVersion = mainDataHeader.elementsOrVersion
                result = Url(elementsOrVersion)
                run { result.url = decoder0.readString(8, false) }
            } finally {
                decoder0.decreaseStackDepth()
            }
            return result
        }
    }
}