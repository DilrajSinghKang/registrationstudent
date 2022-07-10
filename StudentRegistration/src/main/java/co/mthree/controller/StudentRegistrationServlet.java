package co.mthree.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mthree.model.Student;

/**
 * Servlet implementation class StudentRegistrationServlet
 */
@WebServlet(name = "StudentRegistrationServlets", urlPatterns = { "/StudentRegistrationServlets" })
public class StudentRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegistrationServlet() {
        super();
        System.out.println("Inside default constructor of StudentRegistrationServlet");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside doGet of StudentRegistrationServlet");
        }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Inside doPost of StudentRegistrationServlet");

		Student new_student = new Student();

		new_student.setUsername(request.getParameter("username"));
		new_student.setUserage(Integer.parseInt(request.getParameter("userage")));
		new_student.setUsermobile(Integer.parseInt(request.getParameter("usermobile")));
		new_student.setUseraddress(request.getParameter("useraddress"));

		request.setAttribute("student", new_student);
		request.getRequestDispatcher("/success.jsp").forward(request, response);

	}
	
	@Override
	public void destroy() {
		System.out.println("Inside destroy of StudentRegistrationServlet");
		//super.destroy();
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Inside init of StudentRegistrationServlet");
		//super.init();
	}
}
