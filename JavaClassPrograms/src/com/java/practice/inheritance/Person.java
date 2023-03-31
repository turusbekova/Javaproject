package com.java.practice.inheritance;
class CharPerson{
    public String name;
    private int age;

    public CharPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "CharPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge1() {
        return age;
    }

    public String speak(){
        return "Bla bla BLA";
    }
}

class Employees extends CharPerson{ // employees от persona
    int experience;
    public String profession;

    public Employees(String name, int age){
    // name, age пришли с родительского класса
        super(name, age);
    }


        public Employees(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    public Employees(String name, int age, int experience, String profession) {
        super(name, age);
        this.experience = experience;
        this.profession = profession;
    }

    public String work1(){
        return "is working";
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", profession='" + profession + '\'' +
                '}';
    }
}

class Education extends Employees{
    private String diploma;

    public Education(String name, int age, int experience, String profession) {
        super(name, age, experience, profession);
    }

    public Education(String name, int age, String diploma) {
        super(name, age);
        this.diploma = diploma;
    }

    public String getdiploma() {
        return diploma;
    }
}

// Super Class --> parent class
// Sub Class --> son, daughter
// можно унаследовать только один раз

class Actress extends Employees{
    String oscar;

    public Actress(String name, int age, String oscar) {
        super(name, age);
        this.oscar = oscar;
    }

    public Actress(String name, int age) {
        super(name, age);
    }


    public Actress(String name, int age, int experience, String profession) {
        super(name, age, experience, profession);
    }

    public String greeting(){
        return name + " is greeting";
    }

    @Override
    public String toString() {
        return "Actress{" +
                "name='" + name + '\'' +
                "age='" + getAge1() + '\'' +
                "action='" + greeting() + '\'' + "\n" +
                "action='" + work1() + '\'' + "\n" +
                "action='" + speak() + '\'' +
                "oscar='" + oscar + '\'' + "\n" +
                '}';
    }



}
public class Person {
    public static void main(String[] args) {
        CharPerson esen = new CharPerson("Esen", 20);
        Employees asan = new Employees("Asan", 21);
        Employees doha = new Employees("Doha", 23, 5);
        Employees begimai = new Employees("Begimai", 20, 3, "SDET");
        System.out.println(begimai);
        Education smth = new Education("Begimai", 20, "econom");
        Actress actress = new Actress("Selena Gomez", 25);
        System.out.println(actress);
        Actress actress1 = new Actress("Penelopa", 23, "best actress");
        System.out.println(actress1);

    }
}
