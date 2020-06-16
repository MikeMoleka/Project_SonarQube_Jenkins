/**
 * 
 */
package com.formation.bank;

import java.util.List;

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
	
	public double moyenne(List<Double> tab) {
		if (tab.size() > 0) {
			double somme = 0;
			for (int i = 0; i < tab.size(); i++) {
				somme += tab.get(i);
			}
			return somme/tab.size();
		} else {
			return 0;
		}
		
	}
	
	public double sommeTab(List<Double> tab) {
		if (tab.size() > 0) {
			double somme = 0;
			for (int i = 0; i < tab.size()-1; i++) {
				somme += tab.get(i);
			}
			return somme;
		} else {
			return 0;
		}
	}

}
