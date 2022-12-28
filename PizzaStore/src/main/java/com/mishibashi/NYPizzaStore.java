package com.mishibashi;

public class NYPizzaStore extends PizzaStore{
    protected Pizza createPizza(String type){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch(type){
            case "チーズ":
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("ニューヨークスタイルチーズピザ");
            break;
            case "野菜":
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("ニューヨークスタイル野菜ピザ");
            break;
            case "アサリ":
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("ニューヨークスタイルアサリピザ");
            break;
            case "ペパロニ":
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("ニューヨークスタイルペパロニピザ");
            break;
        }
        return pizza;
    }
}
