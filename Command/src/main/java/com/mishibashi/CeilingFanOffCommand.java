package com.mishibashi;

public class CeilingFanOffCommand implements Command{
    CeilingFan ceilingFan;
    int previousSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    public void execute(){
        previousSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
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
