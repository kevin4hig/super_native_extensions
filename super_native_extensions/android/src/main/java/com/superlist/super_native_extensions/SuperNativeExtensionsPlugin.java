package com.superlist.super_native_extensions;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import io.flutter.embedding.engine.plugins.FlutterPlugin;

/**
 * SuperNativeExtensionsPlugin - Desactivado para Android
 */
public class SuperNativeExtensionsPlugin implements FlutterPlugin {

    static final ClipDataHelper ClipDataHelper = new ClipDataHelper();
    static final DragDropHelper DragDropHelper = new DragDropHelper();

    private static boolean nativeInitialized = false;

    @Override
    public void onAttachedToEngine(@NonNull FlutterPluginBinding flutterPluginBinding) {
        // Desactivado para Android - solo soportado en iOS
        Log.i("SuperNativeExtensions", "Plugin desactivado en Android - solo funciona en iOS");
    }

    @Override
    public void onDetachedFromEngine(@NonNull FlutterPluginBinding binding) {
    }

    // Método init comentado - no se usa en Android
    // public static native void init(Context context,
    //                                ClipDataHelper ClipDataHelper,
    //                                DragDropHelper DragDropHelper);

    // Carga de librería nativa desactivada para Android
    // static {
    //     System.loadLibrary("super_native_extensions");
    // }
}
