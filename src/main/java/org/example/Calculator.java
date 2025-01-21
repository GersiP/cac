package org.example;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiplication(int a, int b){
        return a * b;
    }

    public int divide(int a, int b) throws DivideByZeroException{
        if(b == 0){
            throw new DivideByZeroException("Divide by 0");
        }else{
            return a/b;
        }
    }

}
