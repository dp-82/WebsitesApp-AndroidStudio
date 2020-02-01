package com.dharmarajupilli.webapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HomeActivity extends AppCompatActivity {
    private String i;
    private WebView webViewAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        webViewAll = findViewById(R.id.webView);
        i = getIntent().getStringExtra("web");
        switch (i) {

            case "facebook":
                webViewAll.setWebViewClient(new WebViewClient());
                webViewAll.loadUrl("http://www.facebook.com");
                webViewAll.getSettings().setJavaScriptEnabled(true);
                break;
            case "instagram":
                webViewAll.setWebViewClient(new WebViewClient());
                webViewAll.loadUrl("https://www.instagram.com");
                webViewAll.getSettings().setJavaScriptEnabled(true);
                break;
            case "twitter":
                webViewAll.setWebViewClient(new WebViewClient());
                webViewAll.loadUrl("http://www.twitter.com");
                webViewAll.getSettings().setJavaScriptEnabled(true);
                break;
            case "youtube":
                webViewAll.setWebViewClient(new WebViewClient());
                webViewAll.loadUrl("http://www.youtube.com");
                webViewAll.getSettings().setJavaScriptEnabled(true);
                break;
            case "google":
                webViewAll.setWebViewClient(new WebViewClient());
                webViewAll.loadUrl("https://www.google.com");
                webViewAll.getSettings().setJavaScriptEnabled(true);
                break;
            case "cricket":
                webViewAll.setWebViewClient(new WebViewClient());
                webViewAll.loadUrl("https://www.cricbuzz.com");
                webViewAll.getSettings().setJavaScriptEnabled(true);
                break;
            default:
                break;

        }

    }

    @Override
    public void onBackPressed() {
        if (webViewAll.canGoBack()) {
            webViewAll.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
