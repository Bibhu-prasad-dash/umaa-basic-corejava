package org.methods;

public class NonStaticMethodDemo {
    {
        m1();
    }
    public static void main(String[] args) {
        NonStaticMethodDemo obj = new NonStaticMethodDemo();
        obj.m2();
    }
    void m1(){
        System.out.println("We Are Inside Non-Static Method m1");

    }
    void m2(){
        System.out.println("We Are Inside Non-static Method m2");
    }
}

