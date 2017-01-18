package com.example.ramiro.applicationofsecondclass.utils;

/**
 * Created by ramiro on 18/01/17.
 */

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.ramiro.applicationofsecondclass.R;

public class Adapter extends BaseAdapter {
    private Context mContext;

    public Adapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mImages.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mImages[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mImages = {
            R.drawable.images2,
            R.drawable.images3,
            R.drawable.images4,
            R.drawable.images,
            R.drawable.images1,
            R.drawable.images5,
            R.drawable.images6,
            R.drawable.images7,
            R.drawable.saturn,
            R.drawable.images8
    };
}

