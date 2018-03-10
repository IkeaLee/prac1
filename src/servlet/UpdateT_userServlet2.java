package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminDao;

/**
 * Servlet implementation class UpdateT_userServlet2
 */
@WebServlet("/UpdateT_userServlet2")
public class UpdateT_userServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateT_userServlet2() {
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
		int t_id = Integer.parseInt(request.getParameter("t_id"));
		String t_name=request.getParameter("t_name");
		String t_password=request.getParameter("t_password");
		String t_sex=request.getParameter("t_sex");
		String t_email=request.getParameter("t_email");
		String t_subject=request.getParameter("t_subject");
		String t_telno=request.getParameter("t_telno");
		AdminDao dao=new AdminDao();
		dao.updateT_user(t_id, t_name, t_password, t_sex, t_subject, t_telno, t_email);
		request.setAttribute("t_users", dao.getT_userAll());
		request.getRequestDispatcher("/gly.jsp").forward(request, response);
	}

}
