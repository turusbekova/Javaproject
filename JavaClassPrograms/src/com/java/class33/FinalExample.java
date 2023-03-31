package com.java.class33;

class Parent{
   final void eat(){
        System.out.println("");
    }
}

final class Child extends Parent{
//    @Override
//    void eat() {
//        System.out.println("pizza");
//    }
//   we can't override final method


}



public class FinalExample {
    public static void main(String[] args) {
        final int i = 10;
        // i++; --> will be error
        System.out.println(i);
    }
}
