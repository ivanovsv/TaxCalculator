package com.gradsnet.tax.servlets;

import com.gradsnet.tax.beans.Salary;
import static com.gradsnet.tax.util.TaxCalculations.*;

/**
 * @author V.Ivanovs
 *
 */
public class TaxProcessor {
	private double salary;
	private double[] partsNI = null;
	private double[] partsIncomeTax = null;
	
	/**
	 * Splits initial salary into two arrays. Elements are assigned
	 * based on taxation rules. 
	 * 
	 * @param salary
	 */
	public TaxProcessor(double salary){
		this.salary = salary;
		partsNI = calculateNITaxableAmounts(salary);
		partsIncomeTax = calculateIncomeTaxableAmounts(salary);
	}
	
	/**
	 * Creates Salary object with calculated values
	 * 
	 * @return Salary bean for displaying on the webpage
	 */
	public Salary getCalculatedSalary(){
		double deductionsNI = calculateNIContributions(partsNI);
		double deductionsIncomeTax = calculateIncomeTax(partsIncomeTax);
		
		Salary pay = new Salary();

		pay.setInitialSalary(salary);
		pay.setPartAtBasicTax(partsIncomeTax[1]);
		pay.setPartAtHigherTax(partsIncomeTax[2]);
		pay.setPartAtAdditionalTax(partsIncomeTax[3]);
		pay.setPartNILevel1(partsNI[1]);
		pay.setPartNILevel2(partsNI[2]);
		pay.setDeductionsIncomeTax(deductionsIncomeTax);
		pay.setDeductionsNI(deductionsNI);
		pay.setSalaryAfterTax(salary - deductionsIncomeTax - deductionsNI);
		
		return pay;
	}

}
