package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("첫번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();
            String operator;
            int num2;

            while (true) {
                System.out.println("두번째 숫자를 입력하세요: ");
                num2 = scanner.nextInt();

                System.out.println("사칙연산 기호를 입력하세요: ");
                operator = scanner.next();

                if (num2 == 0 && operator.equals("/")) {
                    System.out.println("나눗셈 연산 시 0이 입력될 수 없습니다. 재입력해주세요.");
                } else {
                    break;
                }
            }

            int result = 0;
            if (operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                result = num1 / num2;
            } else {
                System.out.println("알맞은 연산자를 입력해주세요.");
            }
            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exit = scanner.next();
            if (exit.equals("exit")) {
                break;
            }
        }
    }
}
