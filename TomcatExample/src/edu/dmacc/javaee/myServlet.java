package edu.dmacc.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myServlet
 */
@WebServlet("/myServlet")
public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//here I'm grabbing my numbers from my jsp and converting to double
		double num1 = Double.parseDouble(request.getParameter("num1"));
		double num2 = Double.parseDouble(request.getParameter("num2"));
		
		//time to do some math
		double sum = num1+num2;
		double difference = num1-num2;
		double product = num1*num2;
		double quotient = num1/num2;
		
		//write back to the page with basic printwriter
		PrintWriter writer = response.getWriter();
		writer.println("Hey you did it!");
		writer.println("Sum: " + sum);
		writer.println("Difference: " + difference);
		writer.println("Product: " + product);
		writer.println("Quotient: " + quotient);
		writer.close();
	}

}
