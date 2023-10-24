// BluetoothSystem.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/bluetooth_system.mojom
//

package org.chromium.device.mojom;

import androidx.annotation.IntDef;


public interface BluetoothSystem extends org.chromium.mojo.bindings.Interface {


    final class State {
        private static final boolean IS_EXTENSIBLE = false;

        @IntDef({State.UNSUPPORTED, State.UNAVAILABLE, State.POWERED_OFF, State.TRANSITIONING, State.POWERED_ON})
        public @interface EnumType {
        }

        public static final int UNSUPPORTED = 0;
        public static final int UNAVAILABLE = 1;
        public static final int POWERED_OFF = 2;
        public static final int TRANSITIONING = 3;
        public static final int POWERED_ON = 4;
        public static final int MIN_VALUE = 0;
        public static final int MAX_VALUE = 4;

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 4;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        public static int toKnownValue(int value) {
            return value;
        }

        private State() {
        }
    }


    final class SetPoweredResult {
        private static final boolean IS_EXTENSIBLE = false;

        @IntDef({

                SetPoweredResult.SUCCESS, SetPoweredResult.FAILED_UNKNOWN_REASON, SetPoweredResult.FAILED_BLUETOOTH_UNAVAILABLE, SetPoweredResult.FAILED_IN_PROGRESS})
        public @interface EnumType {
        }

        public static final int SUCCESS = 0;
        public static final int FAILED_UNKNOWN_REASON = 1;
        public static final int FAILED_BLUETOOTH_UNAVAILABLE = 2;
        public static final int FAILED_IN_PROGRESS = 3;
        public static final int MIN_VALUE = 0;
        public static final int MAX_VALUE = 3;

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 3;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        public static int toKnownValue(int value) {
            return value;
        }

        private SetPoweredResult() {
        }
    }


    final class ScanState {
        private static final boolean IS_EXTENSIBLE = false;

        @IntDef({

                ScanState.NOT_SCANNING, ScanState.TRANSITIONING, ScanState.SCANNING})
        public @interface EnumType {
        }

        public static final int NOT_SCANNING = 0;
        public static final int TRANSITIONING = 1;
        public static final int SCANNING = 2;
        public static final int MIN_VALUE = 0;
        public static final int MAX_VALUE = 2;

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 2;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        public static int toKnownValue(int value) {
            return value;
        }

        private ScanState() {
        }
    }


    final class StartScanResult {
        private static final boolean IS_EXTENSIBLE = false;

        @IntDef({

                StartScanResult.SUCCESS, StartScanResult.FAILED_UNKNOWN_REASON, StartScanResult.FAILED_BLUETOOTH_UNAVAILABLE})
        public @interface EnumType {
        }

        public static final int SUCCESS = 0;
        public static final int FAILED_UNKNOWN_REASON = 1;
        public static final int FAILED_BLUETOOTH_UNAVAILABLE = 2;
        public static final int MIN_VALUE = 0;
        public static final int MAX_VALUE = 2;

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 2;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        public static int toKnownValue(int value) {
            return value;
        }

        private StartScanResult() {
        }
    }


    final class StopScanResult {
        private static final boolean IS_EXTENSIBLE = false;

        @IntDef({

                StopScanResult.SUCCESS, StopScanResult.FAILED_UNKNOWN_REASON, StopScanResult.FAILED_BLUETOOTH_UNAVAILABLE})
        public @interface EnumType {
        }

        public static final int SUCCESS = 0;
        public static final int FAILED_UNKNOWN_REASON = 1;
        public static final int FAILED_BLUETOOTH_UNAVAILABLE = 2;
        public static final int MIN_VALUE = 0;
        public static final int MAX_VALUE = 2;

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 2;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        public static int toKnownValue(int value) {
            return value;
        }

        private StopScanResult() {
        }
    }


    interface Proxy extends BluetoothSystem, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<BluetoothSystem, BluetoothSystem.Proxy> MANAGER = BluetoothSystem_Internal.MANAGER;


    void getState(

            GetStateResponse callback);

    interface GetStateResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> {
    }


    void setPowered(boolean powered, SetPoweredResponse callback);

    interface SetPoweredResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> {
    }


    void getScanState(

            GetScanStateResponse callback);

    interface GetScanStateResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> {
    }


    void startScan(

            StartScanResponse callback);

    interface StartScanResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> {
    }


    void stopScan(

            StopScanResponse callback);

    interface StopScanResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> {
    }


    void getAvailableDevices(

            GetAvailableDevicesResponse callback);

    interface GetAvailableDevicesResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<BluetoothDeviceInfo[]> {
    }


}
