package com.endava.calculator;

public class ExpertCalculator extends BasicCalculator {

public Long factorial (int n) {

    if (n==0){
        return 1L;
    } else {
        return factorial(n-1)*n;
    }
}
}
