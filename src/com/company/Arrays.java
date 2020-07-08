package com.company;

public class Arrays {
    public static void main(String[] args) {
        int[] nums = {10,23,3,4,5,2,1};
        String[] greetings= {"hello","howdy","hallo","hola","bonjour","ciao","أهلا"};
        int[] binaries = {0,1,1,1,0,0,0,1,1,1,1,1,0,1,0,0,1,0};
        printNums(nums);
        printGreetings(greetings);
        printBinaries(binaries);
    }


    public static void printNums(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " This is the current number");
        }
    }
    public static void printGreetings(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void printBinaries(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}