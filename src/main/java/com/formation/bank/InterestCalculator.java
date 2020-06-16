/**
 * 
 */
package com.formation.bank;

/**
 * @author mengbaka
 *
 */
public interface InterestCalculator {
	
	public void setRate(double Rate);
	public double calculate (double amount, double year);

}
