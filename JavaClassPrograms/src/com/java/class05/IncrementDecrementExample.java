package com.java.class05;

public class IncrementDecrementExample {
    public static void main(String[] args) {

        double gasPrice = 3.99;
        gasPrice++; // gasPrice + 1.0
        System.out.println(gasPrice);

        double gasPriceAfterTax = gasPrice++;
        System.out.println(gasPriceAfterTax);

        // when you have a post increment/decrement
        // it changes it's own value, but return the old value

        int num = 1;
        int y = num++; // incremented itself but returns the not increment value (old value)
        System.out.println(num);
        System.out.println(y);

        System.out.println("_______________________________");

        int x = 1;
        int w = ++x;
        System.out.println(x);
        System.out.println(w);

        int z = 10;
        int r = z++;
        System.out.println(r);
        System.out.println(z);

        System.out.println(z++); // 11 on line where you are post incrementing
        // the returned value is still going to be old one

        System.out.println(z);

        System.out.println("_______________________________");

        int u = 11;
        int q = u++;
        int t = q++;

        System.out.println(u);
        System.out.println(q);
        System.out.println(t);

        System.out.println("_________________________");

        int ab = 50;
        int ac = ab++; // ac =50, ab = 51
        int ad = ++ab; // ad = 52; ab = 52
        System.out.println(ad++); //52
        System.out.println(++ab); //53

        // System.out.println(tempVar = ab++);
        System.out.println(ab++);
        System.out.println(ab++);
        System.out.println(ab);

        int il = 10;
        int temp = il++;
        System.out.println(temp);
        System.out.println(il);

        int var = 10;
        System.out.println(var++);

        System.out.println("______________________________");

        //Когда мы объявляем переменную var2, var1 = 22. При этом, var2 становится 22,
        // а var1 становится 23, т.к. ++ стоит после var1 (сначала присваиваем к var2,
        // а потом прибавляем 1 к var1).
        //Когда мы объявляем переменную var3, var1 = 23. При этом, var3 становится 24 и
        // var1 тоже 24, так как ++ стоит перед var1 и мы сначала добавляем 1 к var1,
        // а потом уже присваиваем это число к var3

        int var1 = 20;      //21
        System.out.println(var1++);

                           //22
        System.out.println(++var1);


       int var2 = var1++;
       int var3 = ++var1;

        System.out.println(var1);
        System.out.println(var2);
       System.out.println(var3);

    }

}
