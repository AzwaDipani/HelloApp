package com.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class KeduaActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY = "com.example.android.pertamaActivity.extra.REPLY";

    private EditText mReply;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        mReply = findViewById(R.id.editText_second);

        Intent intent = getIntent();
        String message = intent.getStringExtra(pertamaActivity.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);

        Button buttonMoveToOtherActivity = findViewById(R.id.button_move_to_another_activity);
        buttonMoveToOtherActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KeduaActivity.this, pertamaActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {

        String reply = mReply.getText().toString().trim();
        if (!reply.isEmpty()) {
            Intent replyIntent = new Intent();
            replyIntent.putExtra(EXTRA_REPLY, reply);
            setResult(RESULT_OK, replyIntent);
        }
        super.onBackPressed();
    }
}

