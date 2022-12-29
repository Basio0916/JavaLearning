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

        Light light = new Light("リビングルーム");
        TV tv = new TV("リビングルーム");
        Stereo stereo = new Stereo("リビングルーム");
        Hottub hottub = new Hottub("");

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, tvOn, stereoOn, hottubOn};
        Command[] partyOff = {lightOff, tvOff, stereoOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Macro ON ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Macro OFF ---");
        remoteControl.offButtonWasPushed(0);
        System.out.println("--- Macro UNDO ---");
        remoteControl.undoButtonWasPushed();

    }
}
