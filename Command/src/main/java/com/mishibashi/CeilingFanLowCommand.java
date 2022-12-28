package com.mishibashi;

public class CeilingFanLowCommand implements Command{
    CeilingFan ceilingFan;
    int previousSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    public void execute(){
        previousSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
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
