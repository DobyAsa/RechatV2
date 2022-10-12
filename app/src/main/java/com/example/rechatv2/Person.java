package com.example.rechatv2;

import android.graphics.drawable.Drawable;

public class Person {
    private Drawable Avatar;
    private String Name;
    private String LastChatTime;

    Person(Drawable a, String n, String l) {
        Avatar = a;
        Name = n;
        LastChatTime = l;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastChatTime() {
        return LastChatTime;
    }

    public void setLastChatTime(String lastChatTime) {
        LastChatTime = lastChatTime;
    }

    public Drawable getAvatar() {
        return Avatar;
    }

    public void setAvatar(Drawable avatar) {
        Avatar = avatar;
    }
}
