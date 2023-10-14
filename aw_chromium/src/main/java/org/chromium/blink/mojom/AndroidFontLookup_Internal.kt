// AndroidFontLookup_Internal.java is auto generated by mojom_bindings_generator.py, do not edit
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.
// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/android_font_lookup/android_font_lookup.mojom
//
package org.chromium.blink.mojom

import org.chromium.blink.mojom.AndroidFontLookup.GetUniqueNameLookupTableResponse
import org.chromium.blink.mojom.AndroidFontLookup.MatchLocalFontByUniqueNameResponse
import org.chromium.mojo.bindings.BindingsHelper
import org.chromium.mojo.bindings.DataHeader
import org.chromium.mojo.bindings.Decoder
import org.chromium.mojo.bindings.DeserializationException
import org.chromium.mojo.bindings.Encoder
import org.chromium.mojo.bindings.Interface
import org.chromium.mojo.bindings.Interface.AbstractProxy
import org.chromium.mojo.bindings.Interface.Manager
import org.chromium.mojo.bindings.InterfaceControlMessagesHelper
import org.chromium.mojo.bindings.Message
import org.chromium.mojo.bindings.MessageHeader
import org.chromium.mojo.bindings.MessageReceiver
import org.chromium.mojo.bindings.MessageReceiverWithResponder
import org.chromium.mojo.bindings.SideEffectFreeCloseable
import org.chromium.mojo.bindings.Struct
import org.chromium.mojo.bindings.interfacecontrol.InterfaceControlMessagesConstants
import org.chromium.mojo.system.Core
import org.chromium.mojo_base.mojom.ReadOnlyFile
import java.nio.ByteBuffer

internal object AndroidFontLookup_Internal {
    val MANAGER: Manager<AndroidFontLookup?, AndroidFontLookup.Proxy?> =
        object : Manager<AndroidFontLookup?, AndroidFontLookup.Proxy?>() {
            override fun getName(): String {
                return "blink.mojom.AndroidFontLookup"
            }

            override fun getVersion(): Int {
                return 0
            }

            public override fun buildProxy(
                core: Core,
                messageReceiver: MessageReceiverWithResponder
            ): Proxy {
                return Proxy(core, messageReceiver)
            }

            override fun buildStub(
                core: Core?,
                impl: AndroidFontLookup?
            ): Interface.Stub<AndroidFontLookup?> {
                return Stub(core, impl)
            }

            public override fun buildArray(size: Int): Array<AndroidFontLookup?> {
                return arrayOfNulls(size)
            }
        }
    private const val GET_UNIQUE_NAME_LOOKUP_TABLE_ORDINAL = 0
    private const val MATCH_LOCAL_FONT_BY_UNIQUE_NAME_ORDINAL = 1

    internal class Proxy(
        core: Core?,
        messageReceiver: MessageReceiverWithResponder?
    ) : AbstractProxy(core, messageReceiver), AndroidFontLookup.Proxy {
        override fun getUniqueNameLookupTable(
            callback: GetUniqueNameLookupTableResponse
        ) {
            val _message = AndroidFontLookupGetUniqueNameLookupTableParams()
            proxyHandler.messageReceiver.acceptWithResponder(
                _message.serializeWithHeader(
                    proxyHandler.core,
                    MessageHeader(
                        GET_UNIQUE_NAME_LOOKUP_TABLE_ORDINAL,
                        MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                        0
                    )
                ),
                AndroidFontLookupGetUniqueNameLookupTableResponseParamsForwardToCallback(callback)
            )
        }

        override fun matchLocalFontByUniqueName(
            fontUniqueName: String?,
            callback: MatchLocalFontByUniqueNameResponse
        ) {
            val _message = AndroidFontLookupMatchLocalFontByUniqueNameParams()
            _message.fontUniqueName = fontUniqueName
            proxyHandler.messageReceiver.acceptWithResponder(
                _message.serializeWithHeader(
                    proxyHandler.core,
                    MessageHeader(
                        MATCH_LOCAL_FONT_BY_UNIQUE_NAME_ORDINAL,
                        MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG,
                        0
                    )
                ),
                AndroidFontLookupMatchLocalFontByUniqueNameResponseParamsForwardToCallback(callback)
            )
        }
    }

    internal class Stub(core: Core?, impl: AndroidFontLookup?) :
        Interface.Stub<AndroidFontLookup?>(core, impl) {
        override fun accept(message: Message): Boolean {
            return try {
                val messageWithHeader = message.asServiceMessage()
                val header = messageWithHeader.header
                var flags = MessageHeader.NO_FLAG
                if (header.hasFlag(MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags or MessageHeader.MESSAGE_IS_SYNC_FLAG
                }
                if (!header.validateHeader(flags)) {
                    return false
                }
                if (header.type == InterfaceControlMessagesConstants.RUN_OR_CLOSE_PIPE_MESSAGE_ID) {
                    InterfaceControlMessagesHelper.handleRunOrClosePipe(
                        MANAGER, messageWithHeader
                    )
                } else false
            } catch (e: DeserializationException) {
                System.err.println(e)
                false
            }
        }

        override fun acceptWithResponder(message: Message, receiver: MessageReceiver): Boolean {
            return try {
                val messageWithHeader = message.asServiceMessage()
                val header = messageWithHeader.header
                var flags = MessageHeader.MESSAGE_EXPECTS_RESPONSE_FLAG
                if (header.hasFlag(MessageHeader.MESSAGE_IS_SYNC_FLAG)) {
                    flags = flags or MessageHeader.MESSAGE_IS_SYNC_FLAG
                }
                if (!header.validateHeader(flags)) {
                    return false
                }
                when (header.type) {
                    InterfaceControlMessagesConstants.RUN_MESSAGE_ID -> InterfaceControlMessagesHelper.handleRun(
                        core, MANAGER, messageWithHeader, receiver
                    )

                    GET_UNIQUE_NAME_LOOKUP_TABLE_ORDINAL -> {
                        AndroidFontLookupGetUniqueNameLookupTableParams.deserialize(
                            messageWithHeader.payload
                        )
                        impl!!.getUniqueNameLookupTable(
                            AndroidFontLookupGetUniqueNameLookupTableResponseParamsProxyToResponder(
                                core, receiver, header.requestId
                            )
                        )
                        true
                    }

                    MATCH_LOCAL_FONT_BY_UNIQUE_NAME_ORDINAL -> {
                        val data = AndroidFontLookupMatchLocalFontByUniqueNameParams.deserialize(
                            messageWithHeader.payload
                        )
                        impl!!.matchLocalFontByUniqueName(
                            data!!.fontUniqueName,
                            AndroidFontLookupMatchLocalFontByUniqueNameResponseParamsProxyToResponder(
                                core, receiver, header.requestId
                            )
                        )
                        true
                    }

                    else -> false
                }
            } catch (e: DeserializationException) {
                System.err.println(e)
                false
            }
        }
    }

    internal class AndroidFontLookupGetUniqueNameLookupTableParams private constructor(version: Int) :
        Struct(
            STRUCT_SIZE, version
        ) {
        constructor() : this(0)

        override fun encode(encoder: Encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO)
        }

        companion object {
            private const val STRUCT_SIZE = 8
            private val VERSION_ARRAY = arrayOf(DataHeader(8, 0))
            private val DEFAULT_STRUCT_INFO = VERSION_ARRAY[0]
            fun deserialize(message: Message?): AndroidFontLookupGetUniqueNameLookupTableParams? {
                return decode(Decoder(message))
            }

            /**
             * Similar to the method above, but deserializes from a |ByteBuffer| instance.
             *
             * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
             */
            fun deserialize(data: ByteBuffer?): AndroidFontLookupGetUniqueNameLookupTableParams? {
                return deserialize(
                    Message(
                        data, ArrayList()
                    )
                )
            }

            fun decode(decoder0: Decoder?): AndroidFontLookupGetUniqueNameLookupTableParams? {
                if (decoder0 == null) {
                    return null
                }
                decoder0.increaseStackDepth()
                val result: AndroidFontLookupGetUniqueNameLookupTableParams
                result = try {
                    val mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY)
                    val elementsOrVersion = mainDataHeader.elementsOrVersion
                    AndroidFontLookupGetUniqueNameLookupTableParams(elementsOrVersion)
                } finally {
                    decoder0.decreaseStackDepth()
                }
                return result
            }
        }
    }

    internal class AndroidFontLookupGetUniqueNameLookupTableResponseParams private constructor(
        version: Int
    ) : Struct(
        STRUCT_SIZE, version
    ) {
        lateinit var uniqueFontNames: Array<String?>

        constructor() : this(0)

        override fun encode(encoder: Encoder) {
            val encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO)
            if (uniqueFontNames == null) {
                encoder0.encodeNullPointer(8, false)
            } else {
                val encoder1 = encoder0.encodePointerArray(
                    uniqueFontNames.size,
                    8,
                    BindingsHelper.UNSPECIFIED_ARRAY_LENGTH
                )
                for (i0 in uniqueFontNames.indices) {
                    encoder1.encode(
                        uniqueFontNames[i0],
                        DataHeader.HEADER_SIZE + BindingsHelper.POINTER_SIZE * i0,
                        false
                    )
                }
            }
        }

        companion object {
            private const val STRUCT_SIZE = 16
            private val VERSION_ARRAY = arrayOf(DataHeader(16, 0))
            private val DEFAULT_STRUCT_INFO = VERSION_ARRAY[0]
            fun deserialize(message: Message?): AndroidFontLookupGetUniqueNameLookupTableResponseParams? {
                return decode(Decoder(message))
            }

            /**
             * Similar to the method above, but deserializes from a |ByteBuffer| instance.
             *
             * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
             */
            fun deserialize(data: ByteBuffer?): AndroidFontLookupGetUniqueNameLookupTableResponseParams? {
                return deserialize(
                    Message(
                        data, ArrayList()
                    )
                )
            }

            fun decode(decoder0: Decoder?): AndroidFontLookupGetUniqueNameLookupTableResponseParams? {
                if (decoder0 == null) {
                    return null
                }
                decoder0.increaseStackDepth()
                val result: AndroidFontLookupGetUniqueNameLookupTableResponseParams
                try {
                    val mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY)
                    val elementsOrVersion = mainDataHeader.elementsOrVersion
                    result =
                        AndroidFontLookupGetUniqueNameLookupTableResponseParams(elementsOrVersion)
                    run {
                        val decoder1 = decoder0.readPointer(8, false)
                        run {
                            val si1 =
                                decoder1.readDataHeaderForPointerArray(BindingsHelper.UNSPECIFIED_ARRAY_LENGTH)
                            result.uniqueFontNames = arrayOfNulls(si1.elementsOrVersion)
                            for (i1 in 0 until si1.elementsOrVersion) {
                                result.uniqueFontNames[i1] = decoder1.readString(
                                    DataHeader.HEADER_SIZE + BindingsHelper.POINTER_SIZE * i1,
                                    false
                                )
                            }
                        }
                    }
                } finally {
                    decoder0.decreaseStackDepth()
                }
                return result
            }
        }
    }

    internal class AndroidFontLookupGetUniqueNameLookupTableResponseParamsForwardToCallback(private val mCallback: GetUniqueNameLookupTableResponse) :
        SideEffectFreeCloseable(), MessageReceiver {
        override fun accept(message: Message): Boolean {
            return try {
                val messageWithHeader = message.asServiceMessage()
                val header = messageWithHeader.header
                if (!header.validateHeader(
                        GET_UNIQUE_NAME_LOOKUP_TABLE_ORDINAL,
                        MessageHeader.MESSAGE_IS_RESPONSE_FLAG or MessageHeader.MESSAGE_IS_SYNC_FLAG
                    )
                ) {
                    return false
                }
                val response = AndroidFontLookupGetUniqueNameLookupTableResponseParams.deserialize(
                    messageWithHeader.payload
                )
                mCallback.call(response!!.uniqueFontNames)
                true
            } catch (e: DeserializationException) {
                false
            }
        }
    }

    internal class AndroidFontLookupGetUniqueNameLookupTableResponseParamsProxyToResponder(
        private val mCore: Core,
        private val mMessageReceiver: MessageReceiver,
        private val mRequestId: Long
    ) : GetUniqueNameLookupTableResponse {
        override fun call(uniqueFontNames: Array<String?>?) {
            val _response = AndroidFontLookupGetUniqueNameLookupTableResponseParams()
            _response.uniqueFontNames = uniqueFontNames!!
            val _message = _response.serializeWithHeader(
                mCore,
                MessageHeader(
                    GET_UNIQUE_NAME_LOOKUP_TABLE_ORDINAL,
                    MessageHeader.MESSAGE_IS_RESPONSE_FLAG or MessageHeader.MESSAGE_IS_SYNC_FLAG,
                    mRequestId
                )
            )
            mMessageReceiver.accept(_message)
        }
    }

    internal class AndroidFontLookupMatchLocalFontByUniqueNameParams private constructor(version: Int) :
        Struct(
            STRUCT_SIZE, version
        ) {
        var fontUniqueName: String? = null

        constructor() : this(0)

        override fun encode(encoder: Encoder) {
            val encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO)
            encoder0.encode(fontUniqueName, 8, false)
        }

        companion object {
            private const val STRUCT_SIZE = 16
            private val VERSION_ARRAY = arrayOf(DataHeader(16, 0))
            private val DEFAULT_STRUCT_INFO = VERSION_ARRAY[0]
            fun deserialize(message: Message?): AndroidFontLookupMatchLocalFontByUniqueNameParams? {
                return decode(Decoder(message))
            }

            /**
             * Similar to the method above, but deserializes from a |ByteBuffer| instance.
             *
             * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
             */
            fun deserialize(data: ByteBuffer?): AndroidFontLookupMatchLocalFontByUniqueNameParams? {
                return deserialize(
                    Message(
                        data, ArrayList()
                    )
                )
            }

            fun decode(decoder0: Decoder?): AndroidFontLookupMatchLocalFontByUniqueNameParams? {
                if (decoder0 == null) {
                    return null
                }
                decoder0.increaseStackDepth()
                val result: AndroidFontLookupMatchLocalFontByUniqueNameParams
                try {
                    val mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY)
                    val elementsOrVersion = mainDataHeader.elementsOrVersion
                    result = AndroidFontLookupMatchLocalFontByUniqueNameParams(elementsOrVersion)
                    run { result.fontUniqueName = decoder0.readString(8, false) }
                } finally {
                    decoder0.decreaseStackDepth()
                }
                return result
            }
        }
    }

    internal class AndroidFontLookupMatchLocalFontByUniqueNameResponseParams private constructor(
        version: Int
    ) : Struct(
        STRUCT_SIZE, version
    ) {
        var fontFileHandle: ReadOnlyFile? = null

        constructor() : this(0)

        override fun encode(encoder: Encoder) {
            val encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO)
            encoder0.encode(fontFileHandle, 8, true)
        }

        companion object {
            private const val STRUCT_SIZE = 16
            private val VERSION_ARRAY = arrayOf(DataHeader(16, 0))
            private val DEFAULT_STRUCT_INFO = VERSION_ARRAY[0]
            fun deserialize(message: Message?): AndroidFontLookupMatchLocalFontByUniqueNameResponseParams? {
                return decode(Decoder(message))
            }

            /**
             * Similar to the method above, but deserializes from a |ByteBuffer| instance.
             *
             * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
             */
            fun deserialize(data: ByteBuffer?): AndroidFontLookupMatchLocalFontByUniqueNameResponseParams? {
                return deserialize(
                    Message(
                        data, ArrayList()
                    )
                )
            }

            fun decode(decoder0: Decoder?): AndroidFontLookupMatchLocalFontByUniqueNameResponseParams? {
                if (decoder0 == null) {
                    return null
                }
                decoder0.increaseStackDepth()
                val result: AndroidFontLookupMatchLocalFontByUniqueNameResponseParams
                try {
                    val mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY)
                    val elementsOrVersion = mainDataHeader.elementsOrVersion
                    result =
                        AndroidFontLookupMatchLocalFontByUniqueNameResponseParams(elementsOrVersion)
                    run {
                        val decoder1 = decoder0.readPointer(8, true)
                        result.fontFileHandle = ReadOnlyFile.decode(decoder1)
                    }
                } finally {
                    decoder0.decreaseStackDepth()
                }
                return result
            }
        }
    }

    internal class AndroidFontLookupMatchLocalFontByUniqueNameResponseParamsForwardToCallback(
        private val mCallback: MatchLocalFontByUniqueNameResponse
    ) : SideEffectFreeCloseable(), MessageReceiver {
        override fun accept(message: Message): Boolean {
            return try {
                val messageWithHeader = message.asServiceMessage()
                val header = messageWithHeader.header
                if (!header.validateHeader(
                        MATCH_LOCAL_FONT_BY_UNIQUE_NAME_ORDINAL,
                        MessageHeader.MESSAGE_IS_RESPONSE_FLAG or MessageHeader.MESSAGE_IS_SYNC_FLAG
                    )
                ) {
                    return false
                }
                val response =
                    AndroidFontLookupMatchLocalFontByUniqueNameResponseParams.deserialize(
                        messageWithHeader.payload
                    )
                mCallback.call(response!!.fontFileHandle)
                true
            } catch (e: DeserializationException) {
                false
            }
        }
    }

    internal class AndroidFontLookupMatchLocalFontByUniqueNameResponseParamsProxyToResponder(
        private val mCore: Core,
        private val mMessageReceiver: MessageReceiver,
        private val mRequestId: Long
    ) : MatchLocalFontByUniqueNameResponse {
        override fun call(fontFileHandle: ReadOnlyFile?) {
            val _response = AndroidFontLookupMatchLocalFontByUniqueNameResponseParams()
            _response.fontFileHandle = fontFileHandle
            val _message = _response.serializeWithHeader(
                mCore,
                MessageHeader(
                    MATCH_LOCAL_FONT_BY_UNIQUE_NAME_ORDINAL,
                    MessageHeader.MESSAGE_IS_RESPONSE_FLAG or MessageHeader.MESSAGE_IS_SYNC_FLAG,
                    mRequestId
                )
            )
            mMessageReceiver.accept(_message)
        }
    }
}