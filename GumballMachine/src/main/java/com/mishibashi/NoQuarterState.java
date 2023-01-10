package com.mishibashi;

public class NoQuarterState implements State{
    private static final long serialVersionUID = 1L;
    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("25セントを投入しました");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("25セントを投入していません");
    }

    @Override
    public void turnCrank() {
        System.out.println("ハンドルを回しましたが、25セントを投入していません");
    }

    @Override
    public void dispense() {
        System.out.println("まずお金を払う必要があります");
    }

    public void refill(){}
    
    public String toString(){
        return "マシンは25セントが投入されるのを待っています";
    }
}
