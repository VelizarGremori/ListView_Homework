package com.example.nata.listview_homework;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class praktikaAdapter extends ArrayAdapter<Person> {
    public praktikaAdapter(Context context, Person[] arr) {
        super(context, R.layout.list_item, arr);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        final Person person = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, null);
        }

        ((TextView) convertView.findViewById(R.id.name)).setText(person.name);
        ((TextView) convertView.findViewById(R.id.money)).setText(String.valueOf(person.money));
        ((ImageView) convertView.findViewById(R.id.flag)).setImageResource(person.flag_res);



        return convertView;
    }

}
