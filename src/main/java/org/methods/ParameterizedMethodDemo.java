package org.methods;

public class ParameterizedMethodDemo {
    public static void main(String[] args) {
        int sum_result = sum(20,50);
        System.out.println("The Sum is=" + sum_result);
    }
    static int sum(int firstNumber,int secondNumber){
        return firstNumber+secondNumber;
    }
}
