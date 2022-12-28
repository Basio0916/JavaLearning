package com.mishibashi;

public class CeilingFan {
    String room;
    public CeilingFan(String room){
        this.room = room;
    }
    public void on(){
        System.out.println(room + "CeilingFan ON");
    }

    public void off(){
        System.out.println(room + "CeilingFan OFF");
    }
    public void dim(){
        System.out.println(room + "CeilingFan DIM");
    }
}
