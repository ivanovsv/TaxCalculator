package com.gradsnet.tax.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gradsnet.tax.beans.Salary;

/**
 * Servlet implementation class TaxCalculations
 */
@WebServlet("/taxcalc")
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
		double pay = Double.parseDouble(salaryString);
		TaxProcessor processor = new TaxProcessor(pay);
		Salary salary = processor.getCalculatedSalary();

		request.setAttribute("salary", salary);
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
