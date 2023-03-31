package com.java.class21;

public class Practice {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++){ // здесь их 3
            for (int j = 1; j <= 2; j ++){ // здесь их два
                System.out.println("Hello"); // это будет повторяться пока не остановиться первый for loop
            }
        }

        System.out.println("===============");

        for (int i = 1; i <= 5; i++){
           for (int j = 1; j <= i; j++){
               System.out.print(j);
           }
            System.out.println();
        }

        System.out.println("===============");

        for (int i = 1; i <= 5; i++){
            for (int s = 1; s <= 5 - i; s++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print(k);
            }
            System.out.println();
        }

        //we always use print inside loops and outside println




    }
}
