package com.example.assign3lhm;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

// webview for displaying wiki
public class WebActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());

        Intent intent = getIntent();
        String str = intent.getStringExtra("url");
        if (str != null) {
            webView.loadUrl(str);
        }

    }

    // To navigate through internal link pages
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
            Toast.makeText(this, "Going back inside a webview", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Exiting a webview", Toast.LENGTH_SHORT).show();
            super.onBackPressed();
        }
    }

}