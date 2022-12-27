package com.mishibashi;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "シカゴスタイルのディープディッシュチーズピザ";
        dough = "極厚クラフト生地";
        sauce = "プラムトマトソース";

        toppings.add("シュレッドモッツァレラソース");
    }

    void cut(){
        System.out.println("ピザを四角形にカットする");
    }
}
