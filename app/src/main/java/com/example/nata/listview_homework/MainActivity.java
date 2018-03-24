package com.example.nata.listview_homework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    ListView mainListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainListView=findViewById(R.id.mainListView);
        String[] mainArrList={"Lesson_4.3.2","Lesson_4.3.3", "Lesson_4.3.4", "Практикум" };
        ArrayAdapter<String> mainAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainArrList);
        mainListView.setAdapter(mainAdapter);

        mainListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                switch (i){
                    case 0:
                        intent = new Intent(MainActivity.this, Lesson_4_3_2.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, Lesson_4_3_3.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, Lesson_4_3_4.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(MainActivity.this, Praktika.class);
                        startActivity(intent);
                        break;

                }
            }
        });
    }
}

