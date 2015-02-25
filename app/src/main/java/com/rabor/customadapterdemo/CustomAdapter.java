package com.rabor.customadapterdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.ImageView;

/**
 * Created by Joy on 2/23/2015.
 */
class CustomAdapter extends ArrayAdapter<String> {

    CustomAdapter(Context context, String[] foods) {
        super(context, R.layout.custom_row, foods);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater myInflater = LayoutInflater.from(getContext());

        View customView = myInflater.inflate(R.layout.custom_row, parent, false);

        // get reference to everything
        String singleFoodItem = getItem(position);
        TextView myText = (TextView) customView.findViewById(R.id.myText);
        CheckBox myCheckBox = (CheckBox) customView.findViewById(R.id.myCheckBox);

        myText.setText(singleFoodItem);
        myCheckBox.setChecked(false);
        return customView;

    }
}

