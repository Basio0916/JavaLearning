package com.mishibashi;

public class ChicagoPizzaStore extends PizzaStore{
    public Pizza createPizza(String type){
        return new ChicagoStyleCheesePizza();
    }
}
