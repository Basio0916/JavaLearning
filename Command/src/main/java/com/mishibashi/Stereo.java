package com.mishibashi;

public class Stereo {
    String room;
    public Stereo(String room){
        this.room = room;
    }
    public void on(){
        System.out.println(room + "Stereo ON");
    }
    public void off(){
        System.out.println(room + "Stereo OFF");
    }
    public void setCd(){
        System.out.println(room + "Stereo SET CD");
    }
    public void setDvd(){
        System.out.println(room + "Stereo SET DVD");
    }
    public void setRadio(){
        System.out.println(room + "Stereo SET RADIO");
    }
    public void setVolume(int volume){
        System.out.println(room + "Stereo SET VOLUME " + volume);
    }
}
