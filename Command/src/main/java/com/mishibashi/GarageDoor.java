package com.mishibashi;

public class GarageDoor {
    String room;
    public GarageDoor(String room){
        this.room = room;
    }
    public void up(){
        System.out.println(room + "GarageDoor UP");
    }

    public void down(){
        System.out.println(room + "GarageDoor DOWN");
    }

    public void stop(){
        System.out.println(room + "GarageDoor STOP");
    }

    public void lightOn(){
        System.out.println(room + "GarageDoor LIGHT ON");
    }

    public void lightOff(){
        System.out.println(room + "GarageDoor LIGHT OFF");
    }
}
