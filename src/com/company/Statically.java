package com.company;

public class Statically {
    public static void main(String[] args){
        String glue = "Epoxy";
        String jello = "Jello";
        moveAndShake();
        stubborn();
        explain(glue);
        System.out.println(jello);
        System.out.println(glue);
    }
    public static void moveAndShake(){
        System.out.println("Never Stagnate in life. Be agile, change, and improve....");
    }
    public static void stubborn(){
        moveAndShake();
        System.out.println("Please dont make me change! I hate change");
    }
    public static void explain(String glue){
        stubborn();
        System.out.println(glue);
    }
}
