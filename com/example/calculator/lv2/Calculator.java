package com.example.calculator.lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    //속성
    private List<Integer> list = new ArrayList();
    private List<Integer> resultList;

    //생성자
    public Calculator() {
    }

    //기능
    public int calculater(int num1, int num2, String operator) {
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

        resultList.add(result); //결과를 리스트에 저장
        return result;
    }

    //결과 리스트를 확인할 수 있는 기능
    public List<Integer> getResultList() {
        return resultList;
    }
}
