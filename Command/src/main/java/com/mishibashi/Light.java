package com.mishibashi;

public class Light {
    String room;
    public Light(String room){
        this.room = room;
    }
    public void on(){
        System.out.println(room + "Light ON");
    }

    public void off(){
        System.out.println(room + "Light OFF");
    }
}
