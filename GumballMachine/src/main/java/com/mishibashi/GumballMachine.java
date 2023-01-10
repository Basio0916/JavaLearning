package com.mishibashi;

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count){
        this.count = count;
        if(count > 0){
            state = NO_QUARTER;
        }
    }

    public void insertQuarter(){
        switch(state){
            case HAS_QUARTER:
                System.out.println("もう一度25セントを投入することはできません");
                break;
            case NO_QUARTER:
                System.out.println("25セントを投入しました");
                state = HAS_QUARTER;
                break;
            case SOLD_OUT:
                System.out.println("25セントを投入することはできません。売り切れです");
                break;
            case SOLD:
                System.out.println("お待ちください。ガムボールを出す準備をしています");
                break;
        }
    }

    public void ejectQuarter(){
        switch(state){
            case HAS_QUARTER:
                System.out.println("25セントを返却しました");
                state = NO_QUARTER;
                break;
            case NO_QUARTER:
                System.out.println("25セントを投入していません");
                break;
            case SOLD_OUT:
                System.out.println("返金できません。まだ25セントを投入していません");
                break;
            case SOLD:
                System.out.println("申し訳ありません。すでにハンドルを回しています");
                break;
        }
    }

    public void turnCrank(){
        switch(state){
            case HAS_QUARTER:
                System.out.println("ハンドルを回しました");
                state = SOLD;
                dispense();
                break;
            case NO_QUARTER:
                System.out.println("ハンドルを回しましたが、25セントを投入していません");
                break;
            case SOLD_OUT:
                System.out.println("ハンドルを回しましたが、ガムボールがありません");
                break;
            case SOLD:
                System.out.println("2回回してもガムボールをもう1つ手に入れることはできません");
                break;
        }
    }

    public void dispense(){
        switch(state){
            case HAS_QUARTER:
                System.out.println("ハンドルを回す必要があります");
                break;
            case NO_QUARTER:
                System.out.println("まずお金を払う必要があります");
                break;
            case SOLD_OUT:
                System.out.println("販売するガムボールはありません");
                break;
            case SOLD:
                System.out.println("ガムボールがスロットから出てきます");
                count--;
                if(count == 0){
                    System.out.println("おっと、ガムボールが無くなりました！");
                    state = SOLD_OUT;
                }
                else{
                    state = NO_QUARTER;
                }
                break;
        }
    }

    public String toString(){
        String msg = "\n";
        msg += "Mighty Gumball, Inc.\n";
        msg += "Java対応据付型ガムボール　モデル#2004\n";
        msg += "在庫 : " + count + "個のガムボール\n";
        switch(state){
            case HAS_QUARTER:
            msg += "マシンには25セントが投入されています";
            break;
            case NO_QUARTER:
            msg += "マシンは25セントが投入されるのを待っています";
            break;
            case SOLD:
            msg += "マシンはガムボールを排出中です";
            break;
            case SOLD_OUT:
            msg += "売り切れです";
            break;
        }
        msg += "\n";
        return msg;
    }
}
