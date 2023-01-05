package com.mishibashi;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseIterator implements Iterator<MenuItem>{
    List<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseIterator(List<MenuItem> menuItems){
        this.menuItems = menuItems;
    }

    public MenuItem next(){
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }

    public boolean hasNext(){
        if(position >= menuItems.size()){
            return false;
        }
        else{
            return true;
        }
    }
}
