package com.java.practice;

public class Loop1 {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++){

            for (int j = 1; j < 4; j++) {
                System.out.print("*" + " ");
            }
            System.out.print(i + " ");
            System.out.println();
        }

        System.out.printf("%5d", (9));           // сразу печатает как вам нужно, с помощью специальных команд
        // означает что после 5 пробелов будет 9 // 5d - digital(число) 5(пробелы)
        // %s - означает что после слова еще один стринг
        // !%n - означает что в конце предложения будет ! знак
        // %n - новая строка



    }
}
