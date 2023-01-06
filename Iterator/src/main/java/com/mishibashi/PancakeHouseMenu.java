package com.mishibashi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu{
    List<MenuItem> menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList<MenuItem>();

        addItem("K&Bのパンケーキ朝食", "スクランブルエッグとトースト付きパンケーキ", true, 2.99);
        addItem("いつものパンケーキ朝食", "卵焼きとソーセージ付きパンケーキ", false, 2.99);
        addItem("ブルーベリーパンケーキ", "新鮮なブルーベリーを使ったパンケーキ", true, 3.49);
        addItem("ワッフル", "ブルーベリーか苺の好きな方を乗せたワッフル", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    // public List<MenuItem> getMenuItems(){
    //     return menuItems;
    // }

    public Iterator<MenuItem> createIterator(){
        return menuItems.iterator();
    }
}
