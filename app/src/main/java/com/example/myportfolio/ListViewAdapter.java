package com.example.myportfolio;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    private ArrayList<ListViewItem> listViewItemList = new ArrayList<ListViewItem>();

    public ListViewAdapter(ArrayList<ListViewItem>data){
        this.listViewItemList = data;
    }

    @Override
    public int getCount() {
        return listViewItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return listViewItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.row, parent, false);
        }

        ImageView iconImageView = (ImageView) convertView.findViewById(R.id.imageView1);
        TextView nameTextView = (TextView) convertView.findViewById(R.id.Name);
        TextView descTextView = (TextView) convertView.findViewById(R.id.desc);
        TextView locationTextView = (TextView) convertView.findViewById(R.id.location);
        TextView dateTextView = (TextView) convertView.findViewById(R.id.date);
        ListViewItem listViewItem = listViewItemList.get(position);

        iconImageView.setImageDrawable(listViewItem.getIcon());
        nameTextView.setText(listViewItem.getName());
        descTextView.setText(listViewItem.getDesc());
        locationTextView.setText(listViewItem.getLocation());
        dateTextView.setText(listViewItem.getDate());

        return  convertView;
    }
    public  void  addItem(Drawable icon, String name, String desc, String location, String date){
        ListViewItem item = new ListViewItem();
        item.setIcon(icon);
        item.setName(name);
        item.setDesc(desc);
        item.setLocation(location);
        item.setDate(date);
        listViewItemList.add(item);
    }
}
