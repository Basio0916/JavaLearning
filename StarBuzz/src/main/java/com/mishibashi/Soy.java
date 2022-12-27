package com.mishibashi;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + "、豆乳";
    }

    public double cost(){
        double additionalCost = 0.0;
        switch(getSize()){
            case TALL:
                additionalCost = 0.10;
                break;
            case GRANDE:
                additionalCost = 0.15;
                break;
            case VENTI:
                additionalCost = 0.20;
                break;
        }
        
        return beverage.cost() + additionalCost;
    }
}
