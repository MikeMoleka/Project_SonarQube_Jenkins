/**
 * 
 */
package com.formation.bank;

/**
 * @author mengbaka
 *
 */
public class SimpleInterestCalculator implements InterestCalculator {
	
	private double rate;
	
	public void setRate(double rate) {
		this.rate = rate;
	}

	public double calculate(double amount, double year) {
		if (amount < 0 || year < 0) {
			throw new IllegalArgumentException("le montant et la dur�e doivent �tre positifs");
		}
		return amount * year * rate;
	}

}
