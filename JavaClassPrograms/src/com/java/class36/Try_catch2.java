package com.java.class36;

import javax.xml.stream.FactoryConfigurationError;

public class Try_catch2 {

    public static int division(int num1, int num2) throws FactoryConfigurationError { // throws он выходит когда вызываем на уровне метода
        // и это означает то что этот метод может вызвать НЕСКОЛЬКО видов исключений
        return num1 / num2;
    }

    public static void main(String[] args) {

        int [] nums = {0, 45, 12, 8};


        try {
            System.out.println(nums[40]);
            division(34,0);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
//        } catch (ArrayIndexOutOfBoundsException i) {
//            throw new ArrayIndexOutOfBoundsException("Takogo zaprosa net"); // throw new используется чтобы вызвать именно название exception
        } finally {
            System.out.println("Srabotal try catch");
        }

        // finally это как в if-else "else" оно нужно для того чтобы просто показать что try-catch закончился
        // finally все равно будет если даже try catch не заработал


    }
}
