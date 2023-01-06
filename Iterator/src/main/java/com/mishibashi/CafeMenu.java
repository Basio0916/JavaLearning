package com.mishibashi;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu{
    Map<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

    public CafeMenu(){
        addItem("野菜バーガーとフライドポテト", "全粒小麦パンにレタスとトマトをはさんだ野菜バーガーとフライドポテト", true, 3.99);
        addItem("本日のスープ", "サラダがついた本日のスープ", false, 3.69);
        addItem("ブリトー", "インゲン豆、サルサ、グアカモーレ入りの大きなブリトー", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        // TODO Auto-generated method stub
        return menuItems.values().iterator();
    }
    
}
