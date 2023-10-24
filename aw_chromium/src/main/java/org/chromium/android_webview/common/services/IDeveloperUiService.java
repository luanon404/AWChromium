/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.android_webview.common.services;

public interface IDeveloperUiService extends android.os.IInterface {
    /**
     * Default implementation for IDeveloperUiService.
     */
    class Default implements org.chromium.android_webview.common.services.IDeveloperUiService {
        // Override flag values. |overriddenFlags| is a Map<String, Boolean>, where the boolean value
        // indicates whether to enable or disable the flag named by the string value. Strings can be
        // converted to org.chromium.android_webview.common.Flag via ProductionSupportedFlagList.
        //
        // This may only be called from the developer UI app itself. Calling this from any other context
        // (ex. the embedded WebView implementation) will throw a SecurityException.
        @Override
        public void setFlagOverrides(java.util.Map overriddenFlags) throws android.os.RemoteException {
        }

        @Override
        public android.os.IBinder asBinder() {
            return null;
        }
    }

    /**
     * Local-side IPC implementation stub class.
     */
    abstract class Stub extends android.os.Binder implements org.chromium.android_webview.common.services.IDeveloperUiService {
        /**
         * Construct the stub at attach it to the interface.
         */
        public Stub() {
            this.attachInterface(this, DESCRIPTOR);
        }

        /**
         * Cast an IBinder object into an org.chromium.android_webview.common.services.IDeveloperUiService interface,
         * generating a proxy if needed.
         */
        public static org.chromium.android_webview.common.services.IDeveloperUiService asInterface(android.os.IBinder obj) {
            if ((obj == null)) {
                return null;
            }
            android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
            if (((iin != null) && (iin instanceof org.chromium.android_webview.common.services.IDeveloperUiService))) {
                return ((org.chromium.android_webview.common.services.IDeveloperUiService) iin);
            }
            return new org.chromium.android_webview.common.services.IDeveloperUiService.Stub.Proxy(obj);
        }

        @Override
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
            java.lang.String descriptor = DESCRIPTOR;
            if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
                data.enforceInterface(descriptor);
            }
            switch (code) {
                case INTERFACE_TRANSACTION: {
                    reply.writeString(descriptor);
                    return true;
                }
            }
            switch (code) {
                case TRANSACTION_setFlagOverrides: {
                    java.util.Map _arg0;
                    java.lang.ClassLoader cl = (java.lang.ClassLoader) this.getClass().getClassLoader();
                    _arg0 = data.readHashMap(cl);
                    this.setFlagOverrides(_arg0);
                    reply.writeNoException();
                    break;
                }
                default: {
                    return super.onTransact(code, data, reply, flags);
                }
            }
            return true;
        }

        private static class Proxy implements org.chromium.android_webview.common.services.IDeveloperUiService {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder remote) {
                mRemote = remote;
            }

            @Override
            public android.os.IBinder asBinder() {
                return mRemote;
            }

            public java.lang.String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            // Override flag values. |overriddenFlags| is a Map<String, Boolean>, where the boolean value
            // indicates whether to enable or disable the flag named by the string value. Strings can be
            // converted to org.chromium.android_webview.common.Flag via ProductionSupportedFlagList.
            //
            // This may only be called from the developer UI app itself. Calling this from any other context
            // (ex. the embedded WebView implementation) will throw a SecurityException.
            @Override
            public void setFlagOverrides(java.util.Map overriddenFlags) throws android.os.RemoteException {
                android.os.Parcel _data = android.os.Parcel.obtain();
                android.os.Parcel _reply = android.os.Parcel.obtain();
                try {
                    _data.writeInterfaceToken(DESCRIPTOR);
                    _data.writeMap(overriddenFlags);
                    boolean _status = mRemote.transact(Stub.TRANSACTION_setFlagOverrides, _data, _reply, 0);
                    _reply.readException();
                } finally {
                    _reply.recycle();
                    _data.recycle();
                }
            }
        }

        static final int TRANSACTION_setFlagOverrides = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    }

    java.lang.String DESCRIPTOR = "org.chromium.android_webview.common.services.IDeveloperUiService";

    // Override flag values. |overriddenFlags| is a Map<String, Boolean>, where the boolean value
    // indicates whether to enable or disable the flag named by the string value. Strings can be
    // converted to org.chromium.android_webview.common.Flag via ProductionSupportedFlagList.
    //
    // This may only be called from the developer UI app itself. Calling this from any other context
    // (ex. the embedded WebView implementation) will throw a SecurityException.
    void setFlagOverrides(java.util.Map overriddenFlags) throws android.os.RemoteException;
}
