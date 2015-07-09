package com.gradsnet.tax.util;


/**
 * The class {@code TaxCalculations} contains methods for performing
 * taxation operations according to the UK rules.
 * 
 * <p>All implementations of functions of class {@code TaxCalculations} 
 * are defined to return approximation results and can't be used 
 * in any accounting software.
 * 
 * @author V. Ivanovs
 * @version v1.0
 *
 */
public class TaxCalculations {
    /**
     * The {@code double} value of <i>Basic Rate Income Tax</i>
     */
    private final static double BASIC_RATE_TAX = 0.2;
   
    /**
     * The {@code double} value of <i>Higher Rate Income Tax</i>
     */
    private final static double HIGHER_RATE_TAX = 0.4;
    
    /**
     * The {@code double} value of <i>Additional Rate Income Tax</i>
     */
    private final static double ADDITIONAL_RATE_TAX = 0.45;
    
    /**
     * The {@code double} value of <i>Basic Rate Income Tax</i>
     */
    private final static double STANDARD_THRESHOLD = 10600.0;
    
    /**
     * The {@code double} value of <i>Basic Rate Income Tax</i>
     */
    private final static double HIGHER_THRESHOLD = 42385.0;
    
    /**
     * The {@code double} value of <i>Basic Rate Income Tax</i>
     */
    private final static double ADDITIONAL_THRESHOLD = 160600.0;
    
    /**
     * The {@code double} value of <i>Basic Rate Income Tax</i>
     */
    private final static double NI_EMPLOYEE_LEVEL_1 = 0.12;
    
    /**
     * The {@code double} value of <i>Basic Rate Income Tax</i>
     */
    private final static double NI_EMPLOYEE_LEVEL_2 = 0.02;
    
    /**
     * The {@code double} value of <i>Basic Rate Income Tax</i>
     */
    private final static double NI_MONTHLY_UPPER_LIMIT = 3532.0;
    
    /**
     * The {@code double} value of <i>Basic Rate Income Tax</i>
     */
    private final static double NI_MONTHLY_PRIMARI_THRESHOLD = 672.0;

    /**
     * @param salary
     * @return
     */
    public static double[] calculateIncomeTaxableAmounts(double salary) {
        double difference = 0.0;
        if (salary > 100000.0 && salary <= 121200.0) {
            difference = (salary - 100000.0)/2.0;
        }else if (salary >121200.0){
            difference = STANDARD_THRESHOLD;
        }

        double[] amounts = new double[4];
        amounts[0] = 0.0;
        amounts[1] = STANDARD_THRESHOLD - difference;
        amounts[2] = HIGHER_THRESHOLD - difference;
        amounts[3] = ADDITIONAL_THRESHOLD - difference;

        double tempSalary;
        for (int i = 3; i >= 0; i--) {
            if (salary < amounts[i]) {
                amounts[i] = 0f;
            } else {
                tempSalary = amounts[i];
                amounts[i] = salary - amounts[i];
                salary = tempSalary;
            }
        }
        return amounts;
    }

    /**
     * @param salary amount of income before taxes
     * @return an array of NI taxable amounts
     */
    public static double[] calculateNITaxableAmounts(double salary) {
        double[] amounts = new double[3];
        amounts[0] = 0.0;
        amounts[1] = NI_MONTHLY_PRIMARI_THRESHOLD;
        amounts[2] = NI_MONTHLY_UPPER_LIMIT;

        double tempSalary;
        for (int i = 2; i >= 0; i--) {
            if (salary < amounts[i]) {
                amounts[i] = 0.0;
            } else {
                tempSalary = amounts[i];
                amounts[i] = salary - amounts[i];
                salary = tempSalary;
            }
        }
        return amounts;
    }

    /**
     * @param salary
     * @return
     */
    public static double calculateNIContributions(double[] amountsNI) {
        return amountsNI[1] * NI_EMPLOYEE_LEVEL_1 + amountsNI[2] * NI_EMPLOYEE_LEVEL_2;
    }

    /**
     * @param salary
     * @return
     */
    public static double calculateIncomeTax(double[] amountsIT) {
        return amountsIT[1] * BASIC_RATE_TAX + amountsIT[2] * HIGHER_RATE_TAX +
                amountsIT[3] * ADDITIONAL_RATE_TAX;
    }
}
