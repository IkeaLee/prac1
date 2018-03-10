package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminDao;

import entity.TeacherTab;

/**
 * Servlet implementation class AdminTeacherServlet
 */
@WebServlet("/AdminTeacherServlet")
public class AdminTeacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminTeacherServlet() {
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
		ArrayList<TeacherTab> t_users=new ArrayList<TeacherTab>();
		AdminDao dao=new AdminDao();
		
		if("1".equals(choice)){
			int t_id=Integer.parseInt(request.getParameter("t_id"));
			TeacherTab t_user=dao.getT_userById(t_id);
			t_users.add(t_user);
		}else if("2".equals(choice)){
			String t__name = request.getParameter("t__name");
			t_users=dao.getT_userByName(t__name);
		}else if("3".equals(choice)){
			t_users=dao.getT_userAll();
		}
		request.setAttribute("t_users", t_users);
		request.getRequestDispatcher("/gly.jsp").forward(request, response);
		
	}

}
