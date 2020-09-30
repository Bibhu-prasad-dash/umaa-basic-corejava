package org.statements;

public class StatementsDemo {
    public static void main(String[] args) {

        // declaration statements
        // person:
        // name: Rabindra, (String)
        // marks: 75 (int)  int vs Integer

        String name = "Bibhu"; // name is a variableName whose type is String
        int marks = 72; // marks is variableName whos type is int

        System.out.println(name);
        System.out.println(marks);

        // expression statements: calculation
        int a = 10;
        int b = 20;
        // = is an assignemnt operator
        int sum = a + b; // calculation with addition operator +
        System.out.println(sum);

        // control statements
        int age = 17;
        if( age >= 18)
        {
            System.out.println("you are eligible to vote, in the election");
        }
        else{
            System.out.println("you are not eligible to vote, in the election!!!");
        }
    }
}
