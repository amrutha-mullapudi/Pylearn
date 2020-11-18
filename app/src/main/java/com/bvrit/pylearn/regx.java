package com.bvrit.pylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.ClipboardManager;
import android.widget.Toast;


public class regx extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regx);
        TextView t2= (TextView) findViewById(R.id.get5);
        t2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView t3= (TextView) findViewById(R.id.get6);
        t3.setMovementMethod(LinkMovementMethod.getInstance());
        final TextView text20 = (TextView) findViewById(R.id.trye2);
        Button button42manip = (Button) findViewById(R.id.button42manip);
        button42manip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager Clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("tyre2", text20.getText().toString());
                Clipboard.setPrimaryClip(clip);
                Toast.makeText(regx.this,"Copied", Toast.LENGTH_SHORT).show();

            }
        });

    }
    public void browser(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/python-programming/online-compiler/"));
        startActivity(browserIntent);
    }
}
