package com.java.homeWork.getterAndSetterHW;

class Person{
    private String appearance;
    private int age = 20;
    private String education;
    private String language;

    public String getAppearance() {
        System.out.println("Appearance");
        return appearance;
    }

    public void setAppearance(String appearance) {
        System.out.println("Appearance --> " + appearance);
        this.appearance = appearance;
    }

    public int getAge() {
        System.out.println("Age");
        return age;
    }

    public void setAge(int age) {
        System.out.println("Age --> " + age);
        this.age = age;
    }

    public String getEducation() {
        System.out.println("Education");
        return education;
    }

    public void setEducation(String education) {
        System.out.println("Education --> " + education);
        this.education = education;
    }

    public String getLanguage() {
        System.out.println("Language");
        return language;
    }

    public void setLanguage(String language) {
        System.out.println("Language --> " + language);
        this.language = language;
    }
}

class MainPerson{
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Get methods:");
        person.getAge();
        person.getAppearance();
        person.getEducation();
        person.getLanguage();
        System.out.println("Set Methods:");
        person.setAge(20);
        person.setAppearance("Handsome");
        person.setEducation("Middle");
        person.setLanguage("Russian");



    }
}


public class ClassOneHW02 {
//    Create a class Person with different properties of a person (Make all variables private)
//    Create getters and setters
//    Create a MainClass and create object of Person class
//    Use the object to call setters to set the values of variables
//                    Use the object to call getters to get the values of variables

}
