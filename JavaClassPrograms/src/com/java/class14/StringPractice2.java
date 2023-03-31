package com.java.class14;

public class StringPractice2 {
    public static void main(String[] args) {
        // concat

        //two ways of concatenating Strings
        // one via + sign
        String str = "<html>";
        str += "<body>";
        str += "<h1> Hello DevX </h1>";
        str += "/<body>";
        str += "/html>";

        System.out.println(str);

        // \n - create new line
        // \t - create a tab
        // \" - add " as a String
        // \\ - add \ as a String

        String str1 = "public class Hello";
        str1 = str1.concat("{");
        str1 = str1.concat("\n}");
        System.out.println(str1);

        // String is immutable object ->
        // String can not be modified in order to change a String you have to reassign values
        // whenever you use String manipulation


        String str2 = "Hello";
        str2 = str2.concat(" DevX!");
        System.out.println(str2);


        String str3 = "I ";
        str3.concat("love ");
        str3 = str3.concat("Java");
        System.out.println(str3);

    }
}
