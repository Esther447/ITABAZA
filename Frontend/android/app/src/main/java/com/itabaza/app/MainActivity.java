package com.itabaza.app;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {}
WebView myWebView = findViewById(R.id.webview);
myWebView.loadUrl("https://yourdomain.com");
myWebView.getSettings().setJavaScriptEnabled(true);
