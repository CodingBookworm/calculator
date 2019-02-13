package com.ti.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {

    @InjectMocks
    private CalculatorService calculatorService;

    @Test
    public void add_returnsThree_whenOneandTwoArePassed() throws Exception {
        Integer actual = calculatorService.add(1,2);
        Integer expected = 3;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void add_returns4_whenTwoAndTwoArePassed() throws Exception {
        Integer actual = calculatorService.add(2,2);
        Integer expected = 4;
        assertThat(actual).isEqualTo(expected);
    }

    @Test(expected = NullPointerException.class)
    public void add_returns_whenTwoAndNullArePassed() throws Exception {
        Integer actual = calculatorService.add(2,null);

    }

}