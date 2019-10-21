package com.example.week8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class See2Activity extends AppCompatActivity {

    ArrayList<String> items = new ArrayList<>();
    ArrayAdapter<String> itemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView question2 = (TextView) findViewById(R.id.question2);
        items.add("Alfred Pennyworth");
        items.add("Damian Wayne");
        items.add("Barbara Gordon");
        setContentView(R.layout.activity_adapter2);
        itemsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(id == 0)
                {
                    Toast.makeText(See2Activity.this, "Correct Answer!", Toast.LENGTH_SHORT).show();
                }
                else
                {Snackbar.make(findViewById(R.id.list_view), "This is wrong!", Snackbar.LENGTH_LONG).show();}
                //Toast.makeText(SeeActivity.this,
                //      "wow i am at position : " + id, Toast.LENGTH_LONG).show();
            }
        });

    }
}
