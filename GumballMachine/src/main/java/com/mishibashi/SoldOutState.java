package com.mishibashi;

public class SoldOutState implements State{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    
    public void insertQuarter(){
        System.out.println("25セントを投入することはできません。売り切れです");
    }

    public void ejectQuarter(){
        System.out.println("返金できません。まだ25セントを投入していません");
    }

    public void turnCrank(){
        System.out.println("ハンドルを回しましたが、ガムボールがありません");
    }

    public void dispense(){
        System.out.println("販売するガムボールはありません");
    }

    public void refill(){
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public String toString(){
        return "売り切れです";
    }
}
