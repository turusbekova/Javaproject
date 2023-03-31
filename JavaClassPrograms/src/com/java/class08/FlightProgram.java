package com.java.class08;

public class FlightProgram {
    public static void main(String[] args) {
        // ! - negating sign only works with booleans
        // it's very useful in if statements
        // where you want to execute the logic when condition is negative

        boolean doesHaveDriveLicense = false;

        if (!doesHaveDriveLicense){
            System.out.println("Give ticket");
        }
    }
}
