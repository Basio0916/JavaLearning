package com.mishibashi;

public class CeilingFanHighCommand implements Command{
    CeilingFan ceilingFan;
    int previousSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    public void execute(){
        previousSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    public void undo(){
        switch(previousSpeed){
            case CeilingFan.HIGH:
                ceilingFan.high();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFan.LOW:
                ceilingFan.low();
                break;
            case CeilingFan.OFF:
                ceilingFan.off();
                break;
        }
    }
}
