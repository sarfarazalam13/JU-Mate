package com.example.jumate;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.ListResult;
import com.google.firebase.storage.StorageReference;

public class notice extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        webView = findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Create FirebaseStorage instance
        FirebaseStorage storage = FirebaseStorage.getInstance("gs://calendar-99956.appspot.com");

        // Get a reference to the root directory in Firebase Storage
        StorageReference storageRef = storage.getReference();

        // List all files in the root directory
        storageRef.listAll()
                .addOnSuccessListener(listResult -> {
                    StringBuilder htmlBuilder = new StringBuilder();

                    // Iterate through each file in the result
                    for (StorageReference item : listResult.getItems()) {
                        // Get the download URL of the file
                        item.getDownloadUrl().addOnSuccessListener(uri -> {
                            // Generate HTML markup for the file link
                            String fileLink = "<a href=\"" + uri.toString() + "\">" + item.getName() + "</a><br>";
                            htmlBuilder.append(fileLink);

                            // Check if it's the last file, then load the HTML into WebView
                            if (item == listResult.getItems().get(listResult.getItems().size() - 1)) {
                                webView.loadDataWithBaseURL(null, htmlBuilder.toString(), "text/html", "UTF-8", null);
                            }
                        }).addOnFailureListener(e -> {
                            // Handle any errors that occurred while retrieving the download URL
                        });
                    }
                })
                .addOnFailureListener(e -> {
                    // Handle any errors that occurred while listing the files
                });

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url.endsWith(".pdf")) {
                    // If the URL ends with ".pdf", open it in a PDF viewer
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setDataAndType(Uri.parse(url), "application/pdf");
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                    try {
                        startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        // PDF viewer app not installed, show error message
                        Toast.makeText(notice.this, "No PDF viewer app installed", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    // For other file types, open them in a web browser
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                }
                return true;
            }
        });
    }
}
