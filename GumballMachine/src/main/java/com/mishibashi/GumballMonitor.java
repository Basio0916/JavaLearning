package com.mishibashi;

import java.rmi.RemoteException;

public class GumballMonitor {
    GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void report(){
        try {     
            System.out.println("ガムボールマシン : " + gumballMachine.getLocation());
            System.out.println("現在の在庫 : " + gumballMachine.getCount());
            System.out.println("現在の状態 : " + gumballMachine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
