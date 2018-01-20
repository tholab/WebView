package com.example.tholab.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView) findViewById(R.id.webView_Content);
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);    // untuk responsive di web nya.
        webView.loadUrl("https://www.smitcomunity.com"); // Menampilkan webview secara online

        //Menampilkan WebView secara Offline

        // webView.loadUrl("file:///android_asset/index.html");
        // penjelasan di atas
        // slash 3 kali(///) menunjukan bahwa posisi index.html melalui 3 folder yaitu src->main->assets
        // android_asset itu nilai default
    }
}
