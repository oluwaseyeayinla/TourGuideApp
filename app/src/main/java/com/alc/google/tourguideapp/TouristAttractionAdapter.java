package com.alc.google.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TouristAttractionAdapter extends ArrayAdapter<TouristAttraction> {

    private Context mContext;

    public TouristAttractionAdapter(Context context, ArrayList<TouristAttraction> touristAttractionArrayList) {
        super(context, 0, touristAttractionArrayList);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TouristAttraction touristAttraction = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_attraction, parent, false);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.attraction_list_image_view);
        TextView nameTextView = (TextView) convertView.findViewById(R.id.attraction_list_name_text_view);
        TextView locTextView = (TextView) convertView.findViewById(R.id.attraction_list_location_text_view);
        TextView hoursIconTextView = (TextView) convertView.findViewById(R.id.attraction_list_hours_icon_text_view);
        TextView hoursTextView = (TextView) convertView.findViewById(R.id.attraction_list_hours_text_view);

        if(touristAttraction.hasImageResourceId())
        {
            imageView.setImageResource(touristAttraction.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else
        {
            imageView.setVisibility(View.GONE);
        }

        nameTextView.setText(touristAttraction.getName());
        locTextView.setText(touristAttraction.getLocation());

        if(touristAttraction.hasSchedule())
        {
            hoursIconTextView.setVisibility(View.VISIBLE);

            hoursTextView.setText(touristAttraction.getSchedule());
            hoursTextView.setVisibility(View.VISIBLE);
        }
        else
        {
            hoursIconTextView.setVisibility(View.GONE);
            hoursTextView.setVisibility(View.GONE);
        }

        return convertView;
    }
}