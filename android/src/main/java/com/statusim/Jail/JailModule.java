package com.statusim.Jail;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.github.ethereum.go_ethereum.cmd.Geth;


public class JailModule extends ReactContextBaseJavaModule {

    public JailModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "Jail";
    }

    @ReactMethod
    public void init(String js) {
        Geth.initJail(js);
    }

    @ReactMethod
    public void parse(String chatId, String js, Callback succ) {
        succ.invoke(Geth.parse(chatId, js));
    }

    @ReactMethod
    public void call(String chatId, String path, String params, Callback callback) {
        callback.invoke(Geth.call(chatId, path, params));
    }
}
