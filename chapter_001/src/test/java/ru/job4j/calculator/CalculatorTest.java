package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Evgeny
 * @version 1.1
 * @since 22.03.19
 */
public class CalculatorTest {
	/**
	 * Test add.
	 */

	@Test
	public void whenAddOnePlusOneThenTwo(){
	Calculator calc = new Calculator();
	double result = calc.add(1D,1D);
	double expected = 2D;
	assertThat(result, is(expected));
	}
    /**
     * Test  subtract.
     */

    @Test
    public void whenSubtractOneMinusOneThenTwo(){
        Calculator calc = new Calculator();
        double result = calc.subtract(1D,1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Test  div.
     */

    @Test
    public void whenDivOneShareOneThenTwo(){
        Calculator calc = new Calculator();
        double result = calc.div(1D,1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
    /**
     * Test multiple.
     */

    @Test
    public void whenMultipleOneIncreaseOneThenTwo(){
        Calculator calc = new Calculator();
        double result = calc.multiple(1D,1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }
}