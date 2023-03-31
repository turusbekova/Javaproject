package com.java.practice;

public class MethodsPractice {
    public static void main(String[] args) {
//        String str = "Hello World!";
//      //  System.out.println(str.length()); //123456789011
//
//      //  System.out.println(str + "8");
//
//        String ch = "9";
//       // System.out.println("By Islam " + str.substring(0,11) + ch);
//
//        str += ch;
//        System.out.println(str);
//
//        StringBuilder sb = new StringBuilder("Hello World!");
//        String str3 = "n";
//        System.out.println(sb.insert(12,"z"));
//
//
//        String name = "James Bond";
//        System.out.println(name.length());
//        System.out.println(name.length() - 1);
//        System.out.println(name.length() - 4);
//        //                                     6               10
//        System.out.println(name.substring(name.length() - 4, name.length()));

        // reverse - отзеркаливает, показывает слова наоборот

      //  StringBuilder name = new StringBuilder("Masha");
        //System.out.println(name.reverse());

        // в этот раз main нужен для того чтобы запускать наши методы
        // если в методе уже имеется sout не нужно его вызыват в main

        MethodsPractice obj1 = new MethodsPractice();
        sumOfTwoNumbers();
       obj1.multipleOfTwoNumbers(2,3, "hello"); // чтобы не написали выйдет
        // то что находится внутри метода и не переназнается

        MethodsPractice obj2 = new MethodsPractice();
        System.out.println(obj2.getResults());

        System.out.println(obj2.calculate(1,2));
    }

    public static void sumOfTwoNumbers(){
        int num1 = 10;
        int num2 = 7;
        System.out.println(num1 + num2);
    }





    // static methods - принадлежность к текущему классу (где был создан этот метод)
    // public -
    // compile error - когда сразу до запуска кода показывает где ошибка
    // runtime error - когда при написании ошибки не видно но после запуска выходит ошибка

     // если метод нестатичный нужно создать его объект а потом только вызываем его

    // if(smth) - condition
    // public static void smth(what){} - "what" - parameter

    // void - ничего не возвращает
    // return - возвращает

    public String getPrice(String product, double price){
        return product + " -->";
    }

    // методы друг у друга можно вызывать если одинаковый тип возврата
    //  метод void у  другого void нельзя вызывать


    public int getResults(){
        int result1 = 10;
        int result2 = 12;
        int result3 = 13;
        return result1 + result2 + result3;
    }

    public int calculate(int num1, int num2){
        return num1 + num2;
    }
    public void multipleOfTwoNumbers(int num1, int num2, String str){
        str = " multiple of two numbers"; //console: 6 multiple of two numbers
        System.out.println(num1 * num2 + str);
        System.out.println(num1 + num2 + str);
    }





}
