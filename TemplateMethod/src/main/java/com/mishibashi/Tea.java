package com.mishibashi;

public class Tea extends CaffeineBeverage{
    public void brew(){
        System.out.println("紅茶を浸す");
    }

    public void addCondiments(){
        System.out.println("レモンを追加する");
    }
}
