package com.example.myportfolio;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
        ImageView gitImageView = (ImageView) convertView.findViewById(R.id.github);
        ListViewItem listViewItem = listViewItemList.get(position);

        iconImageView.setImageDrawable(listViewItem.getIcon());
        nameTextView.setText(listViewItem.getName());
        descTextView.setText(listViewItem.getDesc());
        locationTextView.setText(listViewItem.getLocation());
        dateTextView.setText(listViewItem.getDate());

        gitImageView.setOnClickListener(v -> {
            AlertDialog.Builder alertdialog = new AlertDialog.Builder(context);
            alertdialog.setMessage(listViewItemList.get(pos).getName() + "으로 이동하시겠습니까?");
            alertdialog.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    if (listViewItemList.get(pos).getGithub() != null) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(listViewItemList.get(pos).getGithub()));
                        context.startActivity(intent);
                    } else {
                        Toast.makeText(context, "설정된 깃허브 주소가 없습니다.", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            alertdialog.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
        });
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
