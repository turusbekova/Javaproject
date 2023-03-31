package com.java.class05;

public class ConditionalAnd {

    public static void main(String[] args) {
        //Conditional And is used when
        // you want to enforce multiple rules
        // before you execute your logic
        // all of the rules must be met

        //to issue certificate I want
        //students to have gdp more than 3.5
        //and I want students to have less than
        //3 missed classes

        boolean giveCertificate = false;

        double begimaiGPA = 3.8;
        int begimaiMissedClasses = 2;
                           // true              //true
        giveCertificate  = begimaiGPA > 3.5 && begimaiMissedClasses  < 3;
        System.out.println(giveCertificate);

        System.out.println("_______________________________________");

        int age = 19;
        boolean doesHavePassport  = true;

        if (age > 18 && doesHavePassport == true){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

        // HomeWork

        int creditScore = 0;
        boolean maritalStatus = false;
        int numberOfChildren = 0;
        boolean giveFamilyHealthInsuranceCoverage;

        giveFamilyHealthInsuranceCoverage = creditScore > 680 && maritalStatus == true && numberOfChildren > 2;
        System.out.println(giveFamilyHealthInsuranceCoverage);




    }
}
