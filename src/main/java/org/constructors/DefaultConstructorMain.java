package org.constructors;

public class DefaultConstructorMain {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.i);
        System.out.println(obj.j);

        Calculator obj1 = new Calculator();
        System.out.println(obj1.i);

        System.out.println(obj == obj1);

        obj1.i = 100;
        System.out.println(obj.i);
        System.out.println(obj1.i);
    }
}
