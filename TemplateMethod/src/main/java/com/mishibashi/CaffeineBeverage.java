package com.mishibashi;

public abstract class CaffeineBeverage {
    
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    public void boilWater(){
        System.out.println("お湯を沸かす");
    }

    public void pourInCup(){
        System.out.println("カップに注ぐ");
    }

}
