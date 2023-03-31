package com.java.class24;

public class ForEachLoop {
    public static void main(String[] args) {
        int data [] = {43, 56, 10, 10, 11, 23};

        for (int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }

        System.out.println("=====================");


        int min = data[0];
        for (int temp : data){
            if (temp < min){
                min = temp;
            }
        }
        System.out.println(min);
    }
}
