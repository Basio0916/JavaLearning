package com.mishibashi;

import java.rmi.*;
import java.rmi.server.*;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{
    private static final long serialVersionUID = 1L;
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;
    int count = 0;
    String location;

    public GumballMachine(String location, int count) throws RemoteException{
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        this.location = location;
        if(count > 0){
            state = noQuarterState;
        }
        else{
            state = soldOutState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state){
        this.state = state;
    }

    public void releaseBall(){
        System.out.println("ガムボールがスロットから出てきます");
        if(count != 0){
            count--;
        }
    }

    public void refill(int count){
        this.count += count;
        System.out.println("ガムボールマシンに補充しました。新たなガムボール数 : " + this.count);
        state.refill();
    }

    public State getSoldOutState(){
        return soldOutState;
    }

    public State getNoQuarterState(){
        return noQuarterState;
    }

    public State getHasQuarterState(){
        return hasQuarterState;
    }

    public State getSoldState(){
        return soldState;
    }

    public State getWinnerState(){
        return winnerState;
    }

    public int getCount(){
        return count;
    }

    public String getLocation(){
        return location;
    }

    public State getState(){
        return state;
    }

    public String toString(){
        String msg = "\n";
        msg += "Mighty Gumball, Inc.\n";
        msg += "Java対応据付型ガムボール　モデル#2004\n";
        msg += "在庫 : " + count + "個のガムボール\n";
        msg += state.toString();
        // switch(state){
        //     case HAS_QUARTER:
        //     msg += "マシンには25セントが投入されています";
        //     break;
        //     case NO_QUARTER:
        //     msg += "マシンは25セントが投入されるのを待っています";
        //     break;
        //     case SOLD:
        //     msg += "マシンはガムボールを排出中です";
        //     break;
        //     case SOLD_OUT:
        //     msg += "売り切れです";
        //     break;
        // }
        msg += "\n";
        return msg;
    }
}
