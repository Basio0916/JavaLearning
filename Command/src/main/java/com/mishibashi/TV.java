package com.mishibashi;

public class TV {
    String room;
    public TV(String room){
        this.room = room;
    }
    public void on(){
        System.out.println(room + "TV ON");
    }

    public void off(){
        System.out.println(room + "TV OFF");
    }
}
