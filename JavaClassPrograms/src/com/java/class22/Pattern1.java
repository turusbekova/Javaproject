package com.java.class22;

public class Pattern1 {
    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++){
//            for (int s = 1; s <= 5 - i; s++){
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= 5; i++){
            for (int s = 0; s <= 5 - i; s++ ){
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
   }
}
