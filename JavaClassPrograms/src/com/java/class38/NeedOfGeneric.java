package com.java.class38;

class Box<T>{
    T data;

    T getData(){
        return data;
    }

    void setData(T data){
        this.data = data;
    }
}

public class NeedOfGeneric {
    public static void main(String[] args) {
//        Box b1 = new Box();
//        b1.setNum(50);
//        System.out.println(b1.getNum());

        Box<String> b1 = new Box<>();
        b1.setData("Hello");
        System.out.println(b1.getData());

        Box<Integer> b2 = new Box<>();
        b2.setData(20);
        System.out.println(b2.getData());
    }
}
