package com.mishibashi;

public class ChicagoPizzaStore extends PizzaStore{
    protected Pizza createPizza(String type){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch(type){
            case "チーズ":
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("シカゴスタイルチーズピザ");
            break;
            case "野菜":
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("シカゴスタイル野菜ピザ");
            break;
            case "アサリ":
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("シカゴスタイルアサリピザ");
            break;
            case "ペパロニ":
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("シカゴスタイルペパロニピザ");
            break;
        }
        return pizza;
    }
}
