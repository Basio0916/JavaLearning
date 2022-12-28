package com.mishibashi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("チーズ");
        System.out.println("イーサンの注文は" + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("チーズ");
        System.out.println("ジョエルの注文は" + pizza.getName() + "\n");
    }
}
