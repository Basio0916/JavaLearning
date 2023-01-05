package com.mishibashi;

public class Coffee extends CaffeineBeverage{
    public void brew(){
        System.out.println("フィルタでコーヒーをドリップする");
    }

    public void addCondiments(){
        System.out.println("砂糖とミルクを追加する");
    }
}
