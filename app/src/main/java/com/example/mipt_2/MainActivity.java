package com.example.mipt_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mipt_2.utils.TextCounter;

public class MainActivity extends AppCompatActivity {

    Spinner spOption;
    EditText etSentenceInput;
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.spOption = findViewById(R.id.spOptions);
        this.etSentenceInput = findViewById(R.id.etSentenceInput);
        this.tvAnswer = findViewById(R.id.tvAnswer);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.counter_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spOption.setAdapter(adapter);
    }

    public void onBtnClick(View view) {
        String enteredText = this.etSentenceInput.getText().toString();
        String selectedOption = this.spOption.getSelectedItem().toString();
        if (enteredText.matches("")) {
            Toast.makeText(this, "Please enter any text", Toast.LENGTH_SHORT).show();
            return;
        }
        else {
            if (selectedOption.equals("Words")) {
                this.tvAnswer.setText(String.valueOf(TextCounter.getWordsCount(enteredText)));
            }
            else if (selectedOption.equals("Punctuation")) {
                this.tvAnswer.setText(String.valueOf(TextCounter.getPuncCount(enteredText)));
            }
        }
    }

}