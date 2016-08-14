package com.readwrite.ch03;

/**
 * Created by 유소영 on 2016-07-31.
 */
public class CalculatorApp {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        double result = calculator.add(6,3);
        System.out.println(result);

        double result1 = calculator.multiply(6,3);
        System.out.println(result1);

        double result2 = calculator.divide(6,3);
        System.out.println(result2);

        double result3 = calculator.substract(6,3);
        System.out.println(result3);
    }
}
