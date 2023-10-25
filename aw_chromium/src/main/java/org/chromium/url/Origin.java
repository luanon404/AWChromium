// Copyright 2019 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.url;

import org.jni_zero.CalledByNative;
import org.jni_zero.JNINamespace;
import org.jni_zero.NativeMethods;

/**
 * An origin is either a (scheme, host, port) tuple or is opaque.
 */
@JNINamespace("url")
public class Origin {
    private final String mScheme;
    private final String mHost;
    private final short mPort;

    private final boolean mIsOpaque;

    // Serialization of the Unguessable Token. Do not use directly.
    private final long mTokenHighBits;
    private final long mTokenLowBits;

    /**
     * See origin.h for many warnings about this method.
     * <p>
     * Constructs an Origin from a GURL.
     */
    public static Origin create(GURL gurl) {
        return OriginJni.get().createFromGURL(gurl);
    }

    /**
     * Parses a mojo Origin into a Java analogue of the c++ Origin class.
     * <p>
     * `org.chromium.url.internal.mojom.Origin`s, are provided by Mojo-generated code but not
     * intended for direct use (see crbug.com/1156866).
     */
    public Origin(org.chromium.url.internal.mojom.Origin mojoOrigin) {
        mScheme = mojoOrigin.scheme;
        mHost = mojoOrigin.host;
        mPort = mojoOrigin.port;
        if (mojoOrigin.nonceIfOpaque != null) {
            mIsOpaque = true;
            mTokenHighBits = mojoOrigin.nonceIfOpaque.high;
            mTokenLowBits = mojoOrigin.nonceIfOpaque.low;
        } else {
            mIsOpaque = false;
            mTokenHighBits = 0;
            mTokenLowBits = 0;
        }
    }

    @CalledByNative
    private Origin(String scheme, String host, short port, boolean isOpaque, long tokenHighBits, long tokenLowBits) {
        mScheme = scheme;
        mHost = host;
        mPort = port;
        mIsOpaque = isOpaque;
        mTokenHighBits = tokenHighBits;
        mTokenLowBits = tokenLowBits;
    }

    /**
     * @return The scheme of the origin. Returns an empty string for an opaque origin.
     */
    public String getScheme() {
        return !isOpaque() ? mScheme : "";
    }

    /**
     * @return The host of the origin. Returns an empty string for an opaque origin.
     */
    public String getHost() {
        return !isOpaque() ? mHost : "";
    }

    /**
     * @return The port of the origin. Returns 0 for an opaque origin.
     */
    public int getPort() {
        return !isOpaque() ? Short.toUnsignedInt(mPort) : 0;
    }

    /**
     * @return Whether the origin is opaque.
     */
    public boolean isOpaque() {
        return mIsOpaque;
    }

    @CalledByNative
    private long toNativeOrigin() {
        return OriginJni.get().createNative(mScheme, mHost, mPort, mIsOpaque, mTokenHighBits, mTokenLowBits);
    }

    @NativeMethods
    interface Natives {

        /**
         * Constructs an Origin from a GURL.
         */
        Origin createFromGURL(GURL gurl);

        /**
         * Reconstructs the native Origin for this Java Origin, returning its native pointer.
         */
        long createNative(String scheme, String host, short port, boolean isOpaque, long tokenHighBits, long tokenLowBits);
    }
}
