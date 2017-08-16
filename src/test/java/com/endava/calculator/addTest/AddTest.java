package com.endava.calculator.addTest;

import com.endava.calculator.BasicCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AddTest {
    BasicCalculator basicCalculator;
    @Before
    public void instantiateBasicCalculator(){
        basicCalculator = new BasicCalculator();
    }
    @Test
    public void testIntegerAdd(){
        assertThat(basicCalculator.add(2,3)).isEqualTo(new Long(5));
    }
    @Test
    public void testDoubleAdd1(){
        assertThat(basicCalculator.add(2.0, 1.0)).isEqualTo(new Double(3.0));
    }
    @Test
    public void testDoubleAdd2(){
        assertThat(basicCalculator.add(2.0, 1.0)).isNotEqualTo((new Double(4.0)));
    }

}


