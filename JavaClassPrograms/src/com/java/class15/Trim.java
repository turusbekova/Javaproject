package com.java.class15;

import java.util.Locale;

public class Trim {
    public static void main(String[] args) {
        String str = " Hello DevX! ";
        System.out.println(str);
        System.out.println(str.trim());

        String answer ="  yes  ";
        boolean yesOrNo = answer.equalsIgnoreCase("yes");
        System.out.println(yesOrNo);
        // trim a string without space
        System.out.println(answer.trim());
        //method chaining only if the method return a String
        switch (answer.toLowerCase().trim()){}
        if (answer.trim().equalsIgnoreCase("yes"));
    }
}
