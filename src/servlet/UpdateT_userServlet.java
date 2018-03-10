package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminDao;
import entity.TeacherTab;

/**
 * Servlet implementation class UpdateT_userServlet
 */
@WebServlet("/UpdateT_userServlet")
public class UpdateT_userServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateT_userServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int t_id=Integer.parseInt(request.getParameter("t_id"));
		AdminDao dao=new AdminDao();
		TeacherTab t_user=dao.getT_userById(t_id);
		request.setAttribute("t__user", t_user);
		request.getRequestDispatcher("/glyUpdateTeacher.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 doGet(request, response);
	}

}
