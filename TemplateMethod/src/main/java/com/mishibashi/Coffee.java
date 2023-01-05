package com.mishibashi;

public class Coffee {
    void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilWater(){
        System.out.println("お湯を沸かす");
    }

    public void brewCoffeeGrinds(){
        System.out.println("フィルタでコーヒーをドリップする");
    }

    public void pourInCup(){
        System.out.println("カップに注ぐ");
    }

    public void addSugarAndMilk(){
        System.out.println("砂糖とミルクを追加する");
    }
}
