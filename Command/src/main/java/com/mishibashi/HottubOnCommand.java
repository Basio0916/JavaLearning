package com.mishibashi;

public class HottubOnCommand implements Command{
    Hottub hottub;

    public HottubOnCommand(Hottub hottub){
        this.hottub = hottub;
    }

    public void execute(){
        hottub.on();
    }

    public void undo(){
        hottub.off();
    }
}
