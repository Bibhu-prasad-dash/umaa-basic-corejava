package org.variable;

public class FinalVariableAndConstants {
    final static int x = 25;
    final int y = 65;
    public static void main(String[] args) {
        // x=56;
        // y=76;
        System.out.println("x="+x);
        new FinalVariableAndConstants();

    }
    {
        //   y=98;
        System.out.println("y="+y);
    }
}
