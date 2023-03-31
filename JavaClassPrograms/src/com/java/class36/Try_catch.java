package com.java.class36;

public class Try_catch {

    public static int division(int num1, int num2){
        return num1 / num2;
    }

    public static void main(String[] args) {


        //System.out.println(division(23, 0)); // exception - потому что на ноль делить нельзя





        // exception - исключение и его можно словить и исправить
        // error - ошибка которую нельзя словить она болеее сложная для исправления

        // check exception - проверяемая ошибка
        //String str = 123;

        // uncheck exception - непроверяемая ошибка
        int [] nums = {12, 3, 4,12};
       // System.out.println(nums[29]); // потому что мы не видим что это ошибка и она после запуска только проявляется

        try { // try - постарайся
            System.out.println(nums[29]);
        } catch (Exception e){  // catch - словить и обработать
            // Exception мы прописываем когда не знаем точную ошибку то есть как она называет
            // а если знаем то можем именно ее и указать, например ArrayIndexOutOfBoundsException
            e.printStackTrace(); // возвращает какая ошибка есть
            System.out.println("Na nol' delit' nel'zya");
        }

        // try catch он нужен для того если у нас есть ошибка чтобы джава
        // могла в дальнейшем работать с нашим кодом
        // то есть try catch там говорит: "я вижу что здесь проблема но ты можешь продолжать свой код"

    }
}
