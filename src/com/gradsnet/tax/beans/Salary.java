package com.gradsnet.tax.beans;

import java.io.Serializable;

public class Salary implements Serializable {
	private double initialSalary;
	private double partAtBasicTax;
	private double partAtHigherTax;
	private double partAtAdditionalTax;
	private double partNILevel1;
	private double partNILevel2;
	private double salaryAfterTax;
	
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
}
