package com.mishibashi;
import java.util.Random;

public class HasQuarterState implements State{
    GumballMachine gumballMachine;
    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    
    public void insertQuarter(){
        System.out.println("もう一度25セントを投入することはできません");
    }

    public void ejectQuarter(){
        System.out.println("25セントを返却しました");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank(){
        System.out.println("ハンドルを回しました");
        int winner = randomWinner.nextInt(10);
        if((winner == 0) && (gumballMachine.getCount() > 0)){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }
        else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense(){
        System.out.println("ガムボールが出せません");
    }

    public String toString(){
        return "マシンには25セントが投入されています";
    }
}
