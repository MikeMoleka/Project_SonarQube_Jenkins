/**
 * 
 */
package com.formation.bank;

import java.util.List;

/**
 * @author mengbaka
 *
 */
public interface InterestCalculator {
	
	public void setRate(double rate);
	public double calculate (double amount, double year);
	public double moyenne(List<Double> tab);
	public double sommeTab(List<Double> tab);

}
