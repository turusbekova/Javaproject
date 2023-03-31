package com.java.class37;

public class CheckedAndUnchecked {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");

        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("How are you?");
    }
}
