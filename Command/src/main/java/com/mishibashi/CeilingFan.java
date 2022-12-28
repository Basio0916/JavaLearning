package com.mishibashi;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String room;
    int speed;

    public CeilingFan(String room){
        this.room = room;
        speed = OFF;
    }
    public void high(){
        System.out.println(room + "CeilingFan HIGH");
        speed = HIGH;
    }
    public void medium(){
        System.out.println(room + "CeilingFan MEDIUM");
        speed = MEDIUM;
    }
    public void low(){
        System.out.println(room + "CeilingFan LOW");
        speed = LOW;
    }

    public void off(){
        System.out.println(room + "CeilingFan OFF");
        speed = OFF;
    }
    
    public int getSpeed(){
        return speed;
    }
}
