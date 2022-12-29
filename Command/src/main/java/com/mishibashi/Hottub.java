package com.mishibashi;

public class Hottub {
    String room;
    public Hottub(String room){
        this.room = room;
    }
    public void on(){
        System.out.println(room + "Hottub ON");
    }

    public void off(){
        System.out.println(room + "Hottub OFF");
    }
}
