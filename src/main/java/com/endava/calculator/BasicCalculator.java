package com.endava.calculator;

public class BasicCalculator implements Calculator {

    @Override
    public Long add(Integer a, Integer b, Integer... list) {
        Integer sum = 0;
        sum = a+b;
        for(Integer i : list) {
            sum = sum+i;
        }
        return sum.longValue();
    }

    @Override
    public Long add (Long a, Long b, Long... list) {
        Long sum = 0L;
        sum = a+b;
        for(Long i : list) {
            sum = sum+i;
        }
        return sum;
    }

    @Override
    public Double add (Double a, Double b, Double... list) {
        Double sum = 0.0;
        sum = a+b;
        for(Double i : list) {
            sum = sum+i;
        }
        return sum;
    }
}

