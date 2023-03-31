package com.java.practice;

public class ForLoop {
    public static void main(String[] args) {

        // loop помогает нам одно действие сделать несколько раз

        // for
        // while
        // do while
        // for each

        // в параметрах принимает начальный счетчик, конечный счетчик и инкремент или дикремент
        // int i = 0; --> означает что мы даем понять что счет должен начинаться от 0
        // i <= 5 --> означает что счет идти будет до/включительно 5
        // i++; --> означает что будет добавляться пока результата не достигнет
        for (int i = 0; i <= 5; i++){
            System.out.println(i + " Adios Amigo!");
//          Result:   0 Adios Amigo!
//                    1 Adios Amigo!
//                    2 Adios Amigo!
//                    3 Adios Amigo!
//                    4 Adios Amigo!
//                    5 Adios Amigo!

        }

        System.out.println("------------------");
        for (int i = 5; i >= 1; i--){
            System.out.println(i + " Adios Amigo");
        }

        // из-за того что idea читает сверху вниз и слева направо
        // это означает что он читает что int i = 3; находится как внутри условии
        System.out.println("-----------------");
        int i = 3;
        for (; i >= 0; i--){
            System.out.println(i + " Adios");
        }
//        бесконечно будет выходить так как в соут уже задали
        // и не дали конец
//        for (; ; ){
//            System.out.println(i + " Adios");
//        }




    }
}
