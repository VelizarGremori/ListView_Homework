package com.example.nata.listview_homework;

import android.app.ListActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Lesson_4_3_3 extends ListActivity {

    String[] myArr = { "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь" };
//    ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, myArr);

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);

         setListAdapter(getAdapter());
        }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String month = (String) getListAdapter().getItem(position);
        Toast.makeText(this, month, Toast.LENGTH_SHORT).show();
        this.myArr[10] = "November";
        getAdapter().notifyDataSetChanged();
    }

    public ArrayAdapter getAdapter(){
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, myArr);
        return monthAdapter;
    }
}

