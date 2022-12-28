package com.mishibashi;

public abstract class Pizza {
    String name;
    
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    abstract void prepare();

    void bake(){
        System.out.println("180度で25分間焼く");
    }

    void cut(){
        System.out.println("ピザを扇状にカットする");
    }

    void box(){
        System.out.println("PizzaStoreの箱にピザを入れる");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        // ピザを出力するコード
        return "";
    }
}
