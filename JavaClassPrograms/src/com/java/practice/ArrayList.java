package com.java.practice;

public class ArrayList {
    public static void main(String[] args) {
        int num [] = {3,4,56, 87, 10, 11};

        System.out.println(sortArray(num));
    }
     public static int [] sortArray (int num []){
        for (int i = 1; i < num.length; i++){
           for (int j = 2; j < num.length; j++){
               if (i > j){
                   System.out.println(i);
               }
               else {
                   System.out.println(j);
               }
           }

        }
        return null;
     }
}
