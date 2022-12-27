package com.mishibashi;

public class NYPizzaStore extends PizzaStore{
    Pizza createPizza(String type){
        return new NYStyleCheesePizza();
    }
}
