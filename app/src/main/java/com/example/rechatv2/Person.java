package com.example.rechatv2;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public class Person {
    private Drawable Avatar;
    private String Name;
    private String LastChatTime;

    public void setAvatar(Drawable avatar) {
        Avatar = avatar;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setLastChatTime(String lastChatTime) {
        LastChatTime = lastChatTime;
    }

    Person(Drawable a, String n, String l){
        Avatar = a;
        Name = n;
        LastChatTime = l;
    }

    public String getName() {
        return Name;
    }

    public String getLastChatTime() {
        return LastChatTime;
    }

    public Drawable getAvatar() {
        return Avatar;
    }
}
