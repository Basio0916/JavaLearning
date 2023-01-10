package com.mishibashi;

import java.rmi.Naming;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
        try{
            gumballMachine = new GumballMachine("austin.mightygumball.com", 100);
            Naming.rebind("//localhost/gumballmachine", gumballMachine);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
