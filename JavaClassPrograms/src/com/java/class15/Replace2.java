package com.java.class15;

public class Replace2 {
    public static void main(String[] args) {
        // write a program that updates the first e in the second word
        String str = "DevX Adventures World";
        String str2 = "Hello Coder Superstar";
        String str3 = "I went to College";
//        String str1 = str.substring(5,13);
//        System.out.println(str1.replace('e', 'X'));

        int indexOfFirstSpace = str.indexOf(" ");
        System.out.println(str.substring(indexOfFirstSpace).replaceFirst("e","X"));
        System.out.println("-------------------------------------------------");
        String noDevXEReplaced = str.substring(indexOfFirstSpace).replaceFirst("e","X");
        String devXOnly = str.substring(0,indexOfFirstSpace);
        String finalResult = devXOnly.concat(noDevXEReplaced);
        System.out.println(finalResult);


    }
}
