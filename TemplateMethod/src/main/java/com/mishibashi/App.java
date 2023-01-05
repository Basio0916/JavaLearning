package com.mishibashi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("コーヒーを淹れる");
        coffeeHook.prepareRecipe();
    }
}
