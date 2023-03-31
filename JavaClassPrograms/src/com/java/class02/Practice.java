package com.java.class02;

public class Practice {
    public static void main(String[] args) {
        int num = 2;
        System.out.println(num);

//        byte	1 byte	Stores whole numbers from -128 to 127
//        short	2 bytes	Stores whole numbers from -32,768 to 32,767
//        int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//        long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//        float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//        double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
//        boolean	1 bit	Stores true or false values
//        char	2 bytes	Stores a single character/letter or ASCII values

        byte n = 127;

        float n1 = 1.5f;
        double n2 = 1.5;

        boolean n3 = true;

        char n4 = 'w';
        String n5 = "hello world";


        int num1 = 4; int num2 = 5;
         boolean result  = num1 != num2;
        System.out.println(result);


        int num3 = 5; // postfix
        num3++;
        num3++;          // 8
        System.out.println(num3++);
        System.out.println(num3);

        int num5 = 5; // prefix
        ++num5;
        ++num5;
        System.out.println(++num5);

        int num4 = 5;
        num4--;
        System.out.println(num4);

    }
}
