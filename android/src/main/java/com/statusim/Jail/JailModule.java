package com.statusim.Jail;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

public class JailModule extends ReactContextBaseJavaModule {

    public JailModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "Jail";
    }

    @ReactMethod
    public void parse(String chatId, String js, Callback succ, Callback fail) {
        succ.invoke("{\"commands\":{\"request-money\":" +
                "{\"description\":\"olala!\",\"name\":\"request-money\"," +
                "\"params\":{\"foo\":{\"type\":\"string\"}}}}," +
                "\"responses\":{}}");
    }

    @ReactMethod
    public void call(String chatId, ReadableArray path, ReadableMap params, Callback callback) {
        callback.invoke("call");
    }

    @ReactMethod
    public void addListener(String chatId, Callback callback) {
        callback.invoke("addListener " + chatId);
    }
}
