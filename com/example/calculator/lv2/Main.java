package com.example.calculator.lv2;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int result1 = calc.calculater(1,2, "+");
        int result2 = calc.calculater(10,20,"/");

        System.out.println("결과 1: " + result1);
        System.out.println("결과 2: " + result2);

        System.out.println("저장된 결과들: " + calc.getResultList());
    }
}
