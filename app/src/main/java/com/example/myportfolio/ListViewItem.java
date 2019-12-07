package com.example.myportfolio;

import android.graphics.drawable.Drawable;

public class ListViewItem {
    private Drawable icon;
    private String name;
    private String desc;
    private String location;
    private String date;
    private String github;

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void setData(Drawable ic, String title, String Desc, String Location, String Date, String github){
        icon = ic;
        name = title;
        desc = Desc;
        location = Location;
        date = Date;
        this.github = github;
    }
}
