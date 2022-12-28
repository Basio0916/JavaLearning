package com.mishibashi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
    }
}
