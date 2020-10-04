package org.constructors;

public class Calculator {
    int i;
    int j;
    public Calculator()
    {
        System.out.println("Before Decoration : "+i);
        System.out.println("Default constructor");
        i = 20;
        System.out.println("After decoration :"+i);

    }
    public Calculator( int x , int y ){
        System.out.println("Before Decoration : i=" +i + "  j=" + j);
        System.out.println(" 2 Parameterized constructor");
        i = x;
        j = y;
        System.out.println("After Decoration : i=" +i + "  j=" + j);

    }
    public Calculator(int m){
        System.out.println("Before Decoration : i=" +i + "  j=" + j);
        System.out.println("1 parameterized constructor");
        i = m;
        System.out.println("After Decoration : i=" +i + "  j=" + j);
    }
}
