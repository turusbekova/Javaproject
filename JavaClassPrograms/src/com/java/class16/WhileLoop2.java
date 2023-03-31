package com.java.class16;

public class WhileLoop2 {
    // space complexity =>
    // time complexity  =>
    // big annotation   =>

    public static void main(String[] args) {
        String str = "Hello DevXer";
        // vowel characters: e o e e -> 4
        // consonant characters: h l l d v x r -> 8 (with spaces)
        int vowel = 0;
        int consonant = 0;
        int i =0;
        while (i < str.length()){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u'){
                vowel++;
            }
            else {
                consonant++;
            }
            i++;
        }
        System.out.println("number of vowels: " + vowel);
        System.out.println("number of consonant: " + consonant);
    }

}
