package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.StudentDao;
import entity.StudentTab;
import dao.TeacherDao;
import entity.TeacherTab;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String authory = request.getParameter("authory");
		if (authory.equals("s")) {
			// 1 获得请求参数
			String s_name = request.getParameter("name");
			String s_password = request.getParameter("password");
			// 2调用业务逻辑处理类
			
			StudentDao s_dao = new StudentDao();
			StudentTab s_user = s_dao.s_Login(s_name, s_password);
			// 3 资源跳转
			if (s_user != null) {
				
				HttpSession session = request.getSession();
				session.setAttribute("s__user", s_user);
				
				request.getRequestDispatcher("/zy.jsp").forward(request,
						response);

			} else {
				request.getRequestDispatcher("/dl.jsp").forward(request,
						response);
			}

		} else {
			// 1 获得请求参数
			String t_name = request.getParameter("name");
			String t_password = request.getParameter("password");
			// 2调用业务逻辑处理类
			TeacherDao t_dao = new TeacherDao();
			TeacherTab t_user = t_dao.t_Login(t_name, t_password);
			// 3 资源跳转
			

			if (t_user != null) {
				
				if(t_name.equals("教师")){request.getRequestDispatcher("gly.jsp").forward(request,
						response);}
				else{
				HttpSession session = request.getSession();
				session.setAttribute("t__user", t_user);
				
				request.getRequestDispatcher("/zy.jsp").forward(request,
						response);}

			} else {
				request.getRequestDispatcher("/dl.jsp").forward(request,
						response);
			}
		}
	}
}
