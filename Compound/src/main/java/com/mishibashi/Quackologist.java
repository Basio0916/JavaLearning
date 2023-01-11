package com.mishibashi;

public class Quackologist implements Observer{
    public void update(QuackObservable duck){
        System.out.println("カモの鳴き声学者：" + duck + "が鳴きました");
    }
}
