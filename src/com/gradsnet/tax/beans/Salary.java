package com.gradsnet.tax.beans;

import java.io.Serializable;

/**
 * Java Bean represents a salary.
 * 
 * @author V. Ivanovs
 *
 */
public class Salary implements Serializable {
	/**
	 * Salary before tax.
	 */
	private double initialSalary;
	
	/**
	 * Part of the salary which is used to calculate
	 * deductions of Basic tax rate of 20%.
	 */
	private double partAtBasicTax;
	
	/**
	 * Part of the salary which is used to calculate
	 * deductions of Higher tax rate of 40%. 
	 */
	private double partAtHigherTax;
	
	/**
	 * Part of the salary which is used to calculate
	 * deductions of Additional tax rate of 45%.
	 */
	private double partAtAdditionalTax;
	
	/**
	 * Part of the salary which is used to calculate
	 * deductions of National Insurance contributions
	 * at 12% rate.
	 */
	private double partNILevel1;
	
	/**
	 * Part of the salary which is used to calculate
	 * deductions of National Insurance contributions
	 * at 2% rate.
	 */
	private double partNILevel2;
	
	/**
	 * Salary after taxes.
	 */
	private double salaryAfterTax;
	
	/**
	 * Income tax total deductions.
	 */
	private double deductionsIncomeTax;

	/**
	 * National Insurance total deuctions.
	 */
	private double deductionsNI;
	
	public double getInitialSalary() {
		return initialSalary;
	}
	
	public void setInitialSalary(double initialSalary) {
		this.initialSalary = initialSalary;
	}
	
	public double getPartAtBasicTax() {
		return partAtBasicTax;
	}
	
	public void setPartAtBasicTax(double partAtBasicTax) {
		this.partAtBasicTax = partAtBasicTax;
	}
	
	public double getPartAtHigherTax() {
		return partAtHigherTax;
	}
	
	public void setPartAtHigherTax(double partAtHigherTax) {
		this.partAtHigherTax = partAtHigherTax;
	}
	
	public double getPartAtAdditionalTax() {
		return partAtAdditionalTax;
	}
	
	public void setPartAtAdditionalTax(double partAtAdditionalTax) {
		this.partAtAdditionalTax = partAtAdditionalTax;
	}
	
	public double getPartNILevel1() {
		return partNILevel1;
	}
	
	public void setPartNILevel1(double partNILevel1) {
		this.partNILevel1 = partNILevel1;
	}
	
	public double getPartNILevel2() {
		return partNILevel2;
	}
	
	public void setPartNILevel2(double partNILevel2) {
		this.partNILevel2 = partNILevel2;
	}
	
	public double getSalaryAfterTax() {
		return salaryAfterTax;
	}
	
	public void setSalaryAfterTax(double salaryAfterTax) {
		this.salaryAfterTax = salaryAfterTax;
	}
	
	public double getDeductionsIncomeTax() {
		return deductionsIncomeTax;
	}
	
	public void setDeductionsIncomeTax(double deductionsIncomeTax) {
		this.deductionsIncomeTax = deductionsIncomeTax;
	}
	
	public double getDeductionsNI() {
		return deductionsNI;
	}
	
	public void setDeductionsNI(double deductionsNI) {
		this.deductionsNI = deductionsNI;
	}
}
