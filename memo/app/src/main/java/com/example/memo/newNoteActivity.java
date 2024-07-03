package com.example.memo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class NewNoteActivity extends AppCompatActivity {

    private EditText editTextNote;
    private Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_note);

        editTextNote = findViewById(R.id.editTextNote);
        buttonSave = findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noteText = editTextNote.getText().toString();
                Intent resultIntent = new Intent();
                resultIntent.putExtra("noteText", noteText);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }
}
