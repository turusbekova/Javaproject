package com.java.class13;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {

        // index always start from 0
        // length starts from 1
        System.out.println("IndexOf Method");
        String str = "Rose";

        // indexOf - return index, char/letter
        //                          parameters
        System.out.println(str.indexOf('s'));
        System.out.println(str.indexOf("ose"));
        System.out.println(str.indexOf(2));

        //             012345678901
        String str2 = "MaProc BoProok Pro";
        System.out.println(str2.indexOf("Book"));
        System.out.println(str2.indexOf('o',7)); // return 'o' from 7 number
        System.out.println(str2.indexOf("Pro",4));
        System.out.println(str2.indexOf('o'));

        // если выходят отрицательные числа - неправильно запросили

        System.out.println("Length Method");
        String name = "Jef Bezos";
        System.out.println(name.length());

        System.out.println("CharAt Method");
        System.out.println(name.charAt(2));
//        System.out.println(name.indexOf("Bez", 3));

        System.out.println("Concat Method");
        String company = " Amazon";
        System.out.println(name.concat(company));

        System.out.println("Substring Method");
        //               0123456789012345
        String author = "Chingiz Aitmatov";
        System.out.println(author);
        System.out.println(author.substring(12));
        System.out.println(author.substring(0,7));
        System.out.println(author.substring(3,8));

        // substring вырезает определенную часть в string
        // из большой строки берет маленькую которую мы сами указываем

        //  String firstName = "Aitmat"
        String firstName = author.substring(8,14); // Aitmat
        System.out.println(firstName);

        System.out.println("Trim Method");
        //              01234567890123
        String space = " WindowsXoP    ";
        System.out.println(space);
        System.out.println(space.trim());
        // trim - удаляет все пробелы (по бокам)

        //            0123456789
        String win = "WindowsXoP";
        System.out.println("LastIndexOf Method");
        // читает слева направо то есть с конца
        System.out.println(win.lastIndexOf('o'));

        System.out.println("Equals Method");
        String n1 = "sout";
        String n2 = "sOut";
        System.out.println(n1.equals(n2));

        System.out.println(n1.equalsIgnoreCase(n2));
        // сравнивает игнорируя буквы

        // toLowerCase
        String state = "california";
        System.out.println(state.toLowerCase());
        System.out.println(state.toUpperCase());

        // replace
        String country = "USA";
        System.out.println(country.replace('U','S'));
        System.out.println(country.replaceFirst("SS","US"));
        String country2 = "United States of America";
        System.out.println(country2.replace("of", "OF"));
        // replace все меняет
        System.out.println(country2.replaceAll("United States of America", "USA") + " " + country2.replace("of", "OF"));

        // String - неизменяемый, то есть без сохранения он не будет изменяться

        String phone = "Nokia";
        phone = "Fonex";
        System.out.println(phone); // идет переназначение но не изменение

        String version = "6300";
        phone.concat(version); // не изменился потому что не сохранили
        // то есть мы здесь изменили но не созранили поэтому и не изменился
        System.out.println(phone.concat(version));

        String repl = "Kyrgyz Republic";
        System.out.println(repl.replaceAll("R", "s").replaceAll("z","x"));

        // endWith
        String name1 = "Digit";
        System.out.println(name1.endsWith("Digit"));
        System.out.println(name1.startsWith("Di"));

        // сравнивает с каких букв начинается что end/start

        System.out.println(name1.toLowerCase().replaceAll("git", "tig"));
        // когда мы сразу используем несколько методов то это называется метод chaining

       // The isEmpty() method checks whether a string is empty or not.
        System.out.println(name1.isEmpty());
        String n3 = "";
        System.out.println(n3.isEmpty());
        // isEmpty - проверяет естть ли значение в переменной































    }
}
