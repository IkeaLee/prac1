package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.AdminDao;
import entity.StudentTab;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminStudentServlet")
public class AdminStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminStudentServlet() {
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
		String choice=request.getParameter("choice");
		ArrayList<StudentTab> s_users=new ArrayList<StudentTab>();
		AdminDao dao=new AdminDao();
		
		if("1".equals(choice)){
			int s_id=Integer.parseInt(request.getParameter("s_id"));
			StudentTab s_user=dao.getS_userById(s_id);
			s_users.add(s_user);
		}else if("2".equals(choice)){
			String s__name = request.getParameter("s__name");
			s_users=dao.getS_userByName(s__name);
		}else if("3".equals(choice)){
			s_users=dao.getS_userAll();
		}
		request.setAttribute("s_users", s_users);
		request.getRequestDispatcher("/gly.jsp").forward(request, response);
		
	}

}
