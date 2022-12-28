package com.mishibashi;

public enum ChocolateBoiler {
    INSTANCE;
    
    private boolean empty;
    private boolean boiled;
    private boolean initialized;

    public static ChocolateBoiler getInstance(){
        if(INSTANCE.initialized == false){
            INSTANCE.initialized = true;
            INSTANCE.empty = true;
            INSTANCE.boiled = false;
        }

        return INSTANCE;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
            System.out.println("fill");
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
            System.out.println("drain");
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            boiled = true;
            System.out.println("boil");
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
