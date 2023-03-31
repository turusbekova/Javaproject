package com.java.class14;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        // charAt(int i) -> return a character method at ith = index

        //            012345678
        String str = "WeDevX.co";
        System.out.println(str.charAt(1));// e
        System.out.println(str.charAt(0));// w
        System.out.println(str.charAt(5));// x
        System.out.println(str.charAt(6));// .

        System.out.println("-------------------");
        //             012345678901
        String str1 = "Hello World!";
        System.out.println(str1.charAt(5));// space

        System.out.println("-------------------");
        String str2 = "Superstar";
        System.out.println(str2.charAt(8));// index out of bound
        //Exception are runtime errors
        //StringIndexOutOfBoundsException

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some sentence:");
        String str5 = scan.nextLine();
        // Hello World -> 11 - 1 = 10
        System.out.println(lastChar(str5));
    }

    public static char lastChar(String charAtIndex){
        return charAtIndex.charAt(charAtIndex.length()-1);
        // forEx: DevX.length -> 4              4 - 1 = 3


    }
}
