package com.example.assign3lhm;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


// holder to hold image text objects in a single view
public class ViewHolder {
    ImageView itemImage;
    TextView title;
    TextView description;

    ViewHolder(View v) {
        itemImage = v.findViewById(R.id.icon);
        title = v.findViewById(R.id.titleField);
        description = v.findViewById(R.id.description);
    }


}
