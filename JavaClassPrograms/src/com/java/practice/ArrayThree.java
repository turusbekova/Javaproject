package com.java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayThree {
    public static void main(String[] args) {
        int[] years = new int[]{1999, 2000, 2010, 2022};
        int name [] = {1,2,3,4};
        System.out.println(Arrays.toString(years));
        years[2] = 2009;
        System.out.println(Arrays.toString(years));
        System.out.println(years[3] + " " + years[0]);

        int var[] = {years[0], years[1]};
        System.out.println(Arrays.toString(var));
        int num[] = {1, 2, 3, 4};
        System.out.println(Arrays.toString(num));

        System.out.println("==================");

        //                      3
        for (int i = 0; i < years.length; i++) { // нельзя равно потому что индексация заканчивается 3
            System.out.print(years[i] + ", ");
        }

        // если хотите без [] то используйте for

        for (int i : years) { // only 2 conditions
            System.out.print(i + " ");
        }

        // for each --> работает со всеми типами данных
        // : вытаскивает по одному и переназначает под int i
        // 1999 2000 2009 2022 - int i


        // int i : years --> 1 : 1999
        // int i : years --> 2 : 2000
        // int i : years --> 3 : 2009
        // int i : years --> 4 : 2022

        int two = 2;
        while (two < 3) { // работает только когда условие тру или фолс
            System.out.println("hello");
            two++; // означает что нужно еще раз повторить
        }

        int zero = 0;
        int ten = 10;
        Scanner scan = new Scanner(System.in);
        while (zero < years.length) { // принимает до 4 потому что в массиве years всего 4 числа
            System.out.println("Please enter your number:");
            int n = scan.nextInt();
            if (n == 10) { // если число который ввел пользователь равен 10 то
                System.out.println(n); // должен возвратить
                break; // а потом остановить
            }
            zero++;
        }

        // пользователь вводит логин и пароль
        // если неправильно ввел логин то дать 2 попытки
        // если пароль то 3 попытки

//        System.out.println("Please enter your login:");
//        String login = scan.nextLine();
//        System.out.println("Please enter your password:");
//        String password = scan.nextLine();

        int tryAgainLogin = 3;
        int tryAgainPassword = 4;
        int i = 0;
        while ( i < tryAgainLogin){
            System.out.println("Please enter your login:");
            String login = scan.nextLine();
            if (login.equalsIgnoreCase("begimai")){
               while (i < tryAgainPassword){
                   System.out.println("Please enter your password");
                   String password = scan.nextLine();
                   if (password.equalsIgnoreCase("cool123")){
                       System.out.println("Great, Welcome!");
                       break;
                   }
                   break;
               }
             i++;
            }

    }

//        while (i < tryAgainLogin){
//            System.out.println("Please enter your login");
//            String login = scan.nextLine();
//            if (login.equalsIgnoreCase("begimai")){
//                System.out.println("Your login is: " + login);
//            }
//            break;
//        }
//
//

//








    }
}
