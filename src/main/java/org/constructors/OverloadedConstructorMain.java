package org.constructors;

public class OverloadedConstructorMain {
    public static void main(String[] args) {
        Calculator ob = new Calculator();
        Calculator ob1 = new Calculator(200);
        Calculator ob2 = new Calculator(400,500);

        System.out.println(ob.i + " " +ob.j);
        System.out.println(ob1.i + " " +ob1.j);
        System.out.println(ob2.i + " " +ob2.j);
    }
}
