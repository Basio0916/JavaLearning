package com.mishibashi;

public class SoldState implements State{
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter(){
        System.out.println("お待ちください。ガムボールを出す準備をしています");
    }

    public void ejectQuarter(){
        System.out.println("申し訳ありません。すでにハンドルを回しています");
    }

    public void turnCrank(){
        System.out.println("2回回してもガムボールをもう1つ手に入れることはできません");
    }

    public void dispense(){
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
        else{
            System.out.println("おっと、ガムボールが無くなりました！");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    public String toString(){
        return "マシンはガムボールを排出中です";
    }
}
