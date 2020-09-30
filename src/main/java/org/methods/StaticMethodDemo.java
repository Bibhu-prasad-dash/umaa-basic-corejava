package org.methods;

public class StaticMethodDemo {
    static {
        m2();
    }
    public static void main(String[] args) {
        m1();
    }
    static void m1(){
        System.out.println("Inside Static Method m1");
    }
    static void m2(){
        System.out.println("Inside Static Method m2");
    }

}
