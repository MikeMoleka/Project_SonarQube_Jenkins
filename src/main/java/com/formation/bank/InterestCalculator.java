/**
 * 
 */
package com.formation.bank;

import java.util.ArrayList;

/**
 * @author mengbaka
 *
 */
public interface InterestCalculator {
	
	public void setRate(double rate);
	public double calculate (double amount, double year);
	public double moyenne(ArrayList<Double> tab);
	public double sommeTab(ArrayList<Double> tab);

}
