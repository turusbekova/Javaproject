package com.java.practice;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

//    int num = 10; // variable
//    String str = "Hello"; // variable(object)
//    String str2 = new String("Hello"); // object

public class StringBuilderClass {
    public static void main(String[] args) {
        // SB - object (non-primitive)


//        StringBuilder sb = new StringBuilder("Bishkek");  // object
//        System.out.println(sb.capacity()); // 23 = 7 + 16 (будет добавлять сверху) 7 - 7 букв в слове Бишкек
//
//        StringBuilder sb2 = new StringBuilder();
//        System.out.println(sb2.capacity()); // capacity - обьем (16) по умолчанию в пустом sb

        // (oldCapacity + 1) * 2

        StringBuilder sb5 = new StringBuilder("12345"); // 16 + 5 = 21 // по умолчанию мы еще храним 5 мест мы добавили к нашему месту еще 5 мест
        System.out.println(sb5.capacity());
        sb5.append("1234567890123456"); // append - может соединять стринг со всеми типа данных
        System.out.println(sb5); // 12345123456789012345 (соединил 22 и 24 линию)
        System.out.println(sb5.capacity()); //21 - 24 линия наполнила резервный обьем те 16 мест
        // если привысили те самые 16 мест то используется форма "(oldCapacity + 1) * 2" - в этом случае oldCapacity = 21
        sb5.append("123");
        System.out.println(sb5.capacity()); // (21 + 1) * 2
        sb5.append("11111111111111111111111");
        System.out.println(sb5.capacity()); // 90 - потому что превысили 44 обьем
        // append - обавляет уже в обьем 16, например если с append добавляем "hi" то идет как 16-2 = 14


    }

}
