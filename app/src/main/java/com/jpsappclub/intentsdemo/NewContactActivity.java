package com.jpsappclub.intentsdemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NewContactActivity extends AppCompatActivity {
    private EditText nameField, ageField, telephoneNumberField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_contact);

        nameField = (EditText) findViewById(R.id.name);
        ageField = (EditText) findViewById(R.id.age);
        telephoneNumberField = (EditText) findViewById(R.id.number);

        findViewById(R.id.done).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                Bundle bundle = new Bundle(3);
                bundle.putString("name", nameField.getText().toString());
                bundle.putInt("age", Integer.parseInt(ageField.getText().toString()));
                bundle.putString("telephoneNumber", telephoneNumberField.getText().toString());

                intent.putExtras(bundle);
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
    }
}
