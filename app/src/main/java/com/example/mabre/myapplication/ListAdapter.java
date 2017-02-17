package com.example.mabre.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mabre on 2/17/2017.
 */

public class ListAdapter extends ArrayAdapter<Apartment> {
    List<Apartment> results;

    public ListAdapter(Context context, int resource, List<Apartment> objects) {
        super(context, resource, objects);
        this.results = objects;
    }

    @Override
    public int getCount() {
        return results.size();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Apartment apartment;
        CardViewHolder viewHolder;
        View v =convertView;
        if(v==null){
            LayoutInflater vi = LayoutInflater.from(getContext());
            v= vi.inflate(R.layout.listviewrow, null);
        }
        v.setTag(position);
        viewHolder = new CardViewHolder(v);
        if(results!=null){
            apartment = results.get(position);
            viewHolder.phone.setText(apartment.getPhoneNumber());
            viewHolder.propertyName.setText(apartment.getPhoneNumber());
            viewHolder.propertyRating.setText(apartment.getPhoneNumber());
        }
        return v;
    }

    public static class CardViewHolder {

        ImageView propertyImage;
        TextView propertyName;
        TextView propertyRating;
        TextView phone;
        private int positionTag;

        CardViewHolder(View view) {
            propertyImage = (ImageView) view.findViewById(R.id.image);
            propertyName = (TextView) view.findViewById(R.id.name);
            propertyRating = (TextView) view.findViewById(R.id.rating);
            phone = (TextView) view.findViewById(R.id.phone);
            positionTag = (Integer) view.getTag();
        }

    }
}
