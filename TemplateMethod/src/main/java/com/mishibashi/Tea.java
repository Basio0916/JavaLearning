package com.mishibashi;

public class Tea {
    
    void prepareRecipe(){
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void boilWater(){
        System.out.println("お湯を沸かす");
    }

    public void steepTeaBag(){
        System.out.println("紅茶を浸す");
    }

    public void addLemon(){
        System.out.println("レモンを追加する");
    }

    public void pourInCup(){
        System.out.println("カップに注ぐ");
    }
}
