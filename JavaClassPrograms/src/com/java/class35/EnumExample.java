package com.java.class35;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.Map;

enum DaysOfWeek{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum MarksOfStudents{

    AIDAI(10), EMILY(20), BEGIMAI(30), AZAT(40), TAIRA(50), JANAT(60);

    int marks;

    MarksOfStudents(int marks) {
        this.marks = marks;
    }
}

public class EnumExample {
    public static void main(String[] args) {

        System.out.println(DaysOfWeek.SATURDAY);
        System.out.println(MarksOfStudents.AZAT);
        System.out.println(MarksOfStudents.AZAT.marks);

        MarksOfStudents[] listOfMarks = MarksOfStudents.values();

        // print out all values of Colors enum
        for (MarksOfStudents marksOfStudents: listOfMarks){
            System.out.println(marksOfStudents);
        }










//        Map<String, String> dataOfInput = new HashMap<>();
//        dataOfInput.put("amount", "100");
//        dataOfInput.put("description", "Enjoy your gift");
//        dataOfInput.put("purpose", "Gift");
//
//        Map<String, String> dataOfReview = new HashMap<>();
//        dataOfReview.put("transferAmount", "100");
//        dataOfReview.put("description", "Enjoy your gift");
//        dataOfReview.put("purpose", "gift");


    }
}
