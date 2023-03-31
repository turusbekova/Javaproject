package com.java.homeWork.HW28;

class PhoneHW28{

    void call(){
        System.out.println("phone is calling");
    }

    void text(){
        System.out.println("phone is texting");
    }

    void repair(){
        System.out.println("phone is repairing");
    }
}

class Iphone extends PhoneHW28{

    @Override
    void repair() {
        super.repair();
    }

    @Override
    void call() {
        super.call();
    }

    @Override
    void text() {
        super.text();
    }
}

class Android extends PhoneHW28{
    @Override
    void repair() {
        super.repair();
    }

    @Override
    void call() {
        super.call();
    }

    @Override
    void text() {
        super.text();
    }
}

class ServiceCenter{
    void servicePhone(PhoneHW28 phone){
        phone.repair();
        phone.call();
        phone.repair();
    }
}

class PhoneMainClass{
    public static void main(String[] args) {
        Android android = new Android();
        Iphone iphone = new Iphone();
        ServiceCenter serviceCenter = new ServiceCenter();

        serviceCenter.servicePhone(iphone);
        serviceCenter.servicePhone(android);
    }
}

public class ClassOneHW28 {
//    Task 1:
//    Create a Base Class called Phone (with methods - call(), text(), and repair() )
//    Create two child classes AndroidPhone and IPhone & override repair() method from the Phone class
//    Create another class called ServiceCenter with the method servicePhone()
//    Create a MainClass with objects of AndroidPhone, IPhone and ServiceCenter
//    Using ServiceCenter class object call servicePhone() method and pass an object of androidPhone or iPhone
//    servicePhone() method will call repair() method AndroidPhone or IPhone class based
//        on the object we are passing


}
