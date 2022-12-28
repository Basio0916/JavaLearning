package com.mishibashi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RemoteControl remoteControl = new RemoteControl();

        // Light livingRoomLight = new Light("リビングルーム");
        // Light kitchenLight = new Light("キッチン");
        CeilingFan ceilingFan = new CeilingFan("リビングルーム");
        // GarageDoor garageDoor = new GarageDoor("ガレージ");
        // Stereo stereo = new Stereo("リビングルーム");

        // LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        // LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        // LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        // LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        // GarageDoorOpenCommand garageDoorUp = new GarageDoorOpenCommand(garageDoor);
        // GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        // StereoOnWithCDCommand stereoOnWithCd = new StereoOnWithCDCommand(stereo);
        // StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
        // remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        // remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
        // remoteControl.setCommand(4, stereoOnWithCd, stereoOff);
        
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        // remoteControl.onButtonWasPushed(1);
        // remoteControl.offButtonWasPushed(1);
        // remoteControl.onButtonWasPushed(2);
        // remoteControl.offButtonWasPushed(2);
        // remoteControl.onButtonWasPushed(3);
        // remoteControl.offButtonWasPushed(3);
        // remoteControl.onButtonWasPushed(4);
        // remoteControl.offButtonWasPushed(4);
    }
}
