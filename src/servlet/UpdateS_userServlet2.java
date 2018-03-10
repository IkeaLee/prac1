package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminDao;
import entity.StudentTab;

/**
 * Servlet implementation class UpdateS_userServlet2
 */
@WebServlet("/UpdateS_userServlet2")
public class UpdateS_userServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateS_userServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int s_id = Integer.parseInt(request.getParameter("s_id"));
		String s_name=request.getParameter("s_name");
		String s_password=request.getParameter("s_password");
		String s_sex=request.getParameter("s_sex");
		int s_age=Integer.parseInt(request.getParameter("s_age"));
		String s_school=request.getParameter("s_school");
		int s_grade=Integer.parseInt(request.getParameter("s_grade"));
		String s_subject=request.getParameter("s_subject");
		String s_telno=request.getParameter("s_telno");
		AdminDao dao=new AdminDao();
		dao.updateS_user(s_id, s_name, s_password, s_sex, s_age, s_school, s_grade, s_subject, s_telno);
		request.setAttribute("s_users", dao.getS_userAll());
		request.getRequestDispatcher("/gly.jsp").forward(request, response);
		
	}

}
