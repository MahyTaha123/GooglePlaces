package com.example.maha.mahagogleplaces.Adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.maha.mahagogleplaces.DataModel.ResturantModel;
import com.example.maha.mahagogleplaces.R;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Maha on 08/10/2017.
 */

public class ResturantAdapter extends ArrayAdapter<ResturantModel> {
    public ResturantAdapter(@NonNull Context context, @NonNull ResturantModel[] objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.restaurant_row, parent, false);
        }
        ResturantModel resturantModel = getItem(position);
///////////////////////////////////////////////////////////////////////////
        TextView restName = (TextView) convertView.findViewById(R.id.resturantName);
        restName.setText(resturantModel.getName());
/////////////////////////////imageView
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);

        Picasso.with(getContext()).load( resturantModel.getIcon()).into(imageView);

/////////////////////////////////Rating Bar
        RatingBar ratingBar = (RatingBar) convertView.findViewById(R.id.ratingBar);
        ratingBar.setRating(resturantModel.getRating());

        return convertView;
    }
}
