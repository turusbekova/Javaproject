package com.java.homeWork.conditionalsHW;

public class ConditionalAndHomeWork {
    public static void main(String[] args) {

        int creditScore = 0;
        boolean maritalStatus = false;
        int numberOfChildren = 0;
        boolean giveFamilyHealthInsuranceCoverage;

        giveFamilyHealthInsuranceCoverage = creditScore > 680 && maritalStatus == true && numberOfChildren > 2;
        System.out.println(giveFamilyHealthInsuranceCoverage);

    }
}
