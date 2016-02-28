package com.jpsappclub.intentsdemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ContactsActivity extends AppCompatActivity {
    private ArrayList<String> contacts = new ArrayList<>();
    private ArrayAdapter adapter;

    private final int NEW_CONTACT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, contacts);
        ((ListView) findViewById(R.id.contacts)).setAdapter(adapter);

        findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newContact();
            }
        });
    }

    public void newContact() {
        Intent intent = new Intent(this, NewContactActivity.class);
        startActivityForResult(intent, NEW_CONTACT_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        System.out.println("on activity result");
        if (requestCode == NEW_CONTACT_REQUEST && resultCode == Activity.RESULT_OK) {
            Bundle bundle = data.getExtras();
            if (bundle != null) {
                String name = bundle.getString("name");
                int age = bundle.getInt("age");
                String telephoneNumber = bundle.getString("telephoneNumber");

                contacts.add(name + ", " + age + ", " + telephoneNumber);
                adapter.notifyDataSetChanged();
            }
        }
    }
}
