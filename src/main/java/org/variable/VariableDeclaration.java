package org.variable;

public class VariableDeclaration {
    static int x;
    static String y;
    static {
        System.out.println("Inside Static Block ,The Value Of x="+ x);
        System.out.println("Inside Static Block ,The value of y="+y);
    }
    {
        System.out.println("Inside NonStatic Block, The Value Of x="+ x);
        System.out.println("Inside NonStatic Block, The value of y="+ y);
    }
    public static void main(String[] args) {
        System.out.println("The Value Of x="+x);
        System.out.println("The value of y="+y);
        VariableDeclaration ob = new VariableDeclaration();
        ob.m2();
        m1();

    }
    static void m1(){
        System.out.println("Inside Static Method , The Value Of x="+x);
        System.out.println("Inside Static Method, The value of y="+y);
    }
    void m2(){
        System.out.println("Inside NonStatic Method, The Value Of x="+x);
        System.out.println("Inside NonStatic Method The value of y="+y);
    }

}
