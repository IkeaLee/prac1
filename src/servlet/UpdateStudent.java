package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.PersonalCenterDao;
import entity.StudentTab;
/**
 * Servlet implementation class UpdateStudent
 */
@WebServlet("/UpdateStudent")
public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String s_name=request.getParameter("s_name");
		String s_password=request.getParameter("s_password");
		String s_sex=request.getParameter("s_sex");
		int s_age=Integer.parseInt(request.getParameter("s_age"));
		String s_school=request.getParameter("s_school");
		int s_grade=Integer.parseInt(request.getParameter("s_grade"));
		String s_subject=request.getParameter("s_subject");
		String s_telno=request.getParameter("s_telno");
		StudentTab s_user = (StudentTab)request.getSession().getAttribute("s__user");
		int s_id=s_user.getS_id();
		PersonalCenterDao dao=new PersonalCenterDao();
		dao.UpdateStudent(s_id, s_name, s_password, s_sex, s_age, s_school, s_grade, s_subject, s_telno);
		
		HttpSession session=request.getSession();
		s_user=(StudentTab)session.getAttribute("s__user");
		s_user.setS_name(s_name);
		s_user.setS_password(s_password);
		s_user.setS_sex(s_sex);
		s_user.setS_age(s_age);
		s_user.setS_school(s_school);
		s_user.setS_grade(s_grade);
		s_user.setS_subject(s_subject);
		s_user.setS_telno(s_telno);
		request.getRequestDispatcher("/grzx.jsp").forward(request, response);
		
	}

}
