package org.variable;

public class VariableDeclarationDemo {
    static int x;
    String y;
    static {
        x = 20;
        System.out.println("Value of x =" + x);
    }
    static void m1(){
        x = 30;
        System.out.println("Now the value of x ="+x);
    }
    {
        y="Hello!!";
        System.out.println("Here y="+y);
    }
    void m2(){
        y="Bye!!";
        System.out.println("Now y="+y);
    }
    public static void main(String[] args) {
        VariableDeclaration ob1 = new VariableDeclaration();
        ob1.m2();
        m1();

    }

}
