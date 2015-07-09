package com.gradsnet.tax.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.gradsnet.tax.util.TaxCalculations.*;


/**
 * Servlet implementation class TaxCalculations
 */
@WebServlet("/salary")
public class TaxCalculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaxCalculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String salaryString = request.getParameter("salary");
		double salary = Double.parseDouble(salaryString);
		double incomeTax = calculateIncomeTax(salary);
		double contributionsNI = calculateNIContributions(salary);
		double salaryAfterTax = salary - incomeTax - contributionsNI;

		request.setAttribute("salary", String.format("%.2f", salary));
		request.setAttribute("incomeTax", String.format("%.2f", incomeTax/12));
		request.setAttribute("contributionsNI", String.format("%.2f", contributionsNI/12));
		request.setAttribute("salaryAfterTax", String.format("%.2f", salaryAfterTax/12));
		request.getRequestDispatcher("/tax.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
