package edu.dmacc.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExampleServlet
 */
@WebServlet("/ExampleServlet")
public class ExampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExampleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//here I'm grabbing my password from the jsp file
		String finalPassword = request.getParameter("password");
		
		//need to initialize printedPassword before so it doesnt get lost in my try/catch
		String printedPassword ="";
		
		//here I'll be using my encryptedPassword method from my encryptor class, to edit the user's password
		try {
			printedPassword = Encryptor.encryptedPassword(finalPassword);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//write back to the page with basic printwriter
		PrintWriter writer = response.getWriter();
		writer.print("Your encrypted password to be saved by the server is: ");
		writer.println(printedPassword);
		
	}

}
