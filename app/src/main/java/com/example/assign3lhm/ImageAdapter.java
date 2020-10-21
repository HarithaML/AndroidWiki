package com.example.assign3lhm;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ImageAdapter extends ArrayAdapter<String> {
    Context context;
    String[] names;
    int[] images;
    String[] urls;
    String[] descriptions;

    public ImageAdapter(@NonNull Context context, int[] images, String[] names, String[] urls, String[] descriptions) {
        super(context, R.layout.item, R.id.titleField, names);
        this.context = context;
        this.images = images;
        this.names = names;
        this.urls = urls;
        this.descriptions = descriptions;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if (view == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.item, parent, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.itemImage.setImageResource(images[position]);
        viewHolder.title.setText(names[position]);
        String str = urls[position];
        viewHolder.description.setText(descriptions[position]);
        Toast t = Toast.makeText(getContext(),
                                 "You clicked me  " + names[position],
                                 Toast.LENGTH_SHORT);
        view.setOnClickListener(view1 -> {
            t.show();
            Intent openLinkIntent = new Intent(getContext(), WebActivity.class);
            view1.setBackgroundColor(Color.parseColor("#77AE50"));
            openLinkIntent.putExtra("url", str);
            getContext().startActivity(openLinkIntent);
        });


        return super.getView(position, view, parent);
    }
}

