package com.java.class33;

abstract class PhoneActions{
    public abstract void calling();
    public abstract void texting();

    public void siri(){
        System.out.println("Hi Siri!");
    }

    public void listenMusic(){
        System.out.println("listening music");
    }

}

class Iphone extends PhoneActions{

    @Override
    public void calling() {
        System.out.println("Phone is calling");
    }

    @Override
    public void texting() {
        System.out.println("Phone is texting");
    }
}

class MainPhoneClass{
    public static void main(String[] args) {
       Iphone phone = new Iphone();
       phone.calling();
       phone.listenMusic();
       phone.siri();
       phone.texting();
    }
}

public class PracticeFinal {
}
