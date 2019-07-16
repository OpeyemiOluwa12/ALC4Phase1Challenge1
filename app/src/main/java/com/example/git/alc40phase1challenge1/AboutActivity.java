package com.example.git.alc40phase1challenge1;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        loadWebViewUrl();
    }

    private void loadWebViewUrl(){
        WebView aboutWebView = findViewById(R.id.aboutWebview);

        aboutWebView.getSettings().setJavaScriptEnabled(true);
        aboutWebView.getSettings().setLoadWithOverviewMode(true);
        aboutWebView.getSettings().setUseWideViewPort(true);
        aboutWebView.setHorizontalScrollBarEnabled(false);
        aboutWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        aboutWebView.loadUrl("https://andela.com/alc/");
    }
}
