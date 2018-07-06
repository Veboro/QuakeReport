package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {


    public EarthquakeAdapter(@NonNull Context context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }

        Earthquake currentEartquake = getItem(position);

        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude_view);
        magnitudeTextView.setText(currentEartquake.getMagnitude());

        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_view);
        placeTextView.setText(currentEartquake.getPlace());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_view);
        dateTextView.setText(currentEartquake.getDate());

        return listItemView;
    }
}
