package com.endava.calculator.factorialTest;

import com.endava.calculator.ExpertCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;

public class FactorialTest {
    ExpertCalculator expertCalculator;

    @Before
    public void instiantiateExpertCalculator() {
        expertCalculator = new ExpertCalculator();
    }

    @Test
    public void factorialTest() {
        assertThat(expertCalculator.factorial(4),is(equalTo(new Long(24))));
        assertThat(expertCalculator.factorial(3), is(equalTo(new Long(6))));
        assertThat(expertCalculator.factorial(3), is(new Long(6)));
        assertThat(expertCalculator.factorial(4), is(not(equalTo(new Long(0)))));
    }
}
