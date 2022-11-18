package com.example.everland;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class InfoAdapter extends BaseAdapter {

    LayoutInflater mInflater;

    String[] rides;
    String[] times;
    int t;

    public InfoAdapter(Context c, String[] r, int[] p) {
        rides = r;
        times = new String[p.length];
        for (int i = 0; i < p.length; i++) {
            t = p[i] * 2;
            times[i] = t + " minutes";
        }
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return rides.length;
    }

    @Override
    public Object getItem(int i) {
        return rides[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = mInflater.inflate(R.layout.ride_info, null);
        TextView nameTextView = (TextView) v.findViewById(R.id.nameTextView);
        TextView timeTextView = (TextView) v.findViewById(R.id.timeTextView);

        String name = rides[i];
        String wait = times[i];

        nameTextView.setText(name);
        timeTextView.setText(wait);

        return v;
    }
}
