package com.java.class15;

import javax.jws.soap.SOAPBinding;

public class Replace {
    public static void main(String[] args) {
        String str = "earth is flat";
        System.out.println(str);
        System.out.println(str.replace('a','w'));

        String str1 = "public static void main(String{} args)";
        String str2 = str1.replace('{', '[');
        System.out.println(str2);

        String str3 = str2.replace('}', ']');
        System.out.println(str3);

         // Replace String
        String str4 = "I hate Java";
       // str4.replace("hate", "love");
        System.out.println(str4.replace("hate","love"));

        String str5 = "system.out.println(Hello World)";
        System.out.println(str5.replaceFirst("s","S").replace("Hello World", "\"Hello World\"") + ";");

        //System.out.println(str6.replace("Hello World", "\"Hello World\""));
    }
}
