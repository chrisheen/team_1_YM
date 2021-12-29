package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Reservation")
public class ReservationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ReservationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
	
		String carPickupDate=request.getParameter("carPickupDate");
	    String carReturnDate=request.getParameter("carReturnDate");
		
	    RequestDispatcher rd = request.getRequestDispatcher("../reservation/viewReservationCheckPage.jsp");
   	    rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
