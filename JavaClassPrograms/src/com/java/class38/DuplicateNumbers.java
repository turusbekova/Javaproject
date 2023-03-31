package com.java.class38;

import java.util.HashSet;
import java.util.Set;

//Find duplicate characters in the String
public class DuplicateNumbers {
    public static void main(String[] args) {
        {

            String str = "We are almost finishing java";
            char[] chars = str.toCharArray();
            Set<Character> letter = new HashSet<>();
            Set<Character> duplicates = new HashSet<>();

            for (char c : chars) {
                if (!letter.add(c)) {
                    duplicates.add(c);
                }
            }

            System.out.println(str);
            System.out.println("Duplicate characters: " + duplicates + " ");

            
            System.out.println("========Second part=======");
            Set<Character> setOfChar = new HashSet<>();
            Set<Character> setOfDuplicate = new HashSet<>();
            for (int i = 0; i < str.length(); i++) {
                if (setOfChar.add(str.charAt(i)) == false) {
                   setOfDuplicate.add(str.charAt(i));
                }
            }
            System.out.println(setOfDuplicate);


        }}
}
