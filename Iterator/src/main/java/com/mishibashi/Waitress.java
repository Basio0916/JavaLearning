package com.mishibashi;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }
    
    public void printMenu(){

        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();

        System.out.println("メニュー\n----\n朝食");
        printMenu(pancakeIterator);
        System.out.println("\n昼食");
        printMenu(dinerIterator);
        System.out.println("\n夕食");
        printMenu(cafeIterator);
    }

    public void printMenu(Iterator<MenuItem> iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + "、");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
