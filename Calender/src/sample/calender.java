package sample;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.calbean;

@WebServlet("/calender")
public class calender extends HttpServlet {
	private calbean cb=new calbean();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			request.setCharacterEncoding("UTF8");
			String dt=request.getParameter("dates");
			String con=request.getParameter("contents");
			ServletContext sc=getServletContext();

			if(con.length()==0) {
				sc.getRequestDispatcher("/error1.html").forward(request, response);
				return;
			}
			else if(dt.length()==0) {
				sc.getRequestDispatcher("/error2.html").forward(request, response);
				return;
			}



			cb.setDate(dt);
			cb.setContent(con);



			request.setAttribute("cb", cb);
			sc.getRequestDispatcher("/calender.jsp").forward(request, response);

		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
