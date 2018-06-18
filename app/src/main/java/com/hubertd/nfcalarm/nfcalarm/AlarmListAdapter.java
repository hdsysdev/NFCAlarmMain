package com.hubertd.nfcalarm.nfcalarm;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static android.app.PendingIntent.getActivity;

public class AlarmListAdapter extends ArrayAdapter<Alarm> {
    private Context context;
    private ArrayList<Alarm> alarms;

    public AlarmListAdapter(Context context, ArrayList<Alarm> alarms) {
        super(context, R.layout.list_item);
        this.context = context;
        this.alarms = alarms;
    }


    @Override
    public int getCount() {
        return alarms.size();
    }


    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
        if (view == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            view = inflater.inflate(R.layout.list_item, viewGroup, false);

        }

        TextView title = (TextView) view.findViewById(R.id.titleTV);
        TextView time = (TextView) view.findViewById(R.id.timeTV);

        title.setText("Jeffff");
        return view;
    }

}
