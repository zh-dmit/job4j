package ru.job4j.calculator;

/**
 * add first + double
 * subtract first - double
 * div first / double
 * multiple first * double
 *
 * @author Evgeny Dmitriev
 */

public class Calculator {

	/**
	 * Method add.
	 * @return first + second.
	 */

	public double add(double first, double second){
		return first + second;
	}
    /**
     * Method subtract.
     * @return first - second.
     */
    public double subtract(double first, double second){
        return first - second;
    }
    /**
     * Method div.
     * @return first / second.
     */
    public double div(double first, double second){
        return first / second;
    }
    /**
     * Method multiple.
     * @return first * second.
     */
    public double multiple(double first, double second){
        return first * second;
    }
}