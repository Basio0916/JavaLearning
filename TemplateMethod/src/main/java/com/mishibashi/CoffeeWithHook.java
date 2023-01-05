package com.mishibashi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
    public void brew(){
        System.out.println("フィルタを使ってコーヒーをドリップする");
    }

    public void addCondiments(){
        System.out.println("砂糖とミルクを加える");
    }

    public boolean customerWantsCondiments(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            return true;
        }
        else{
            return false;
        }
    }

    private String getUserInput(){
        String answer = null;

        System.out.print("コーヒーに砂糖とミルクを入れますか？(y/n) ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        }
        catch(IOException ioe){
            System.err.println("回答読み込み時のI/Oエラー");
        }
        if(answer == null){
            return "no";
        }
        return answer;
    }
}
