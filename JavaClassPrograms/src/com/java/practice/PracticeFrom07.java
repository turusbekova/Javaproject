package com.java.practice;
abstract class A {
    abstract void method1();

    void method2(){
        System.out.println("Second");
        method1();
    }
}

abstract class B extends A{
    @Override
    void method1() {
        System.out.println("First");
        method3();
    }

    abstract void method3();
}

class C extends B{

    @Override
    void method3() {
        System.out.println("THIRD");
    }
}
public class PracticeFrom07 {
    C c = new C();
}
