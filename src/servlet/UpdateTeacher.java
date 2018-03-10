package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.PersonalCenterDao;

import entity.TeacherTab;

/**
 * Servlet implementation class UpdateTeacher
 */
@WebServlet("/UpdateTeacher")
public class UpdateTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String t_name=request.getParameter("t_name");
		String t_password=request.getParameter("t_password");
		String t_sex=request.getParameter("t_sex");
		String t_email=request.getParameter("t_email");
		String t_subject=request.getParameter("t_subject");
		String t_telno=request.getParameter("t_telno");
		TeacherTab t_user = (TeacherTab)request.getSession().getAttribute("t__user");
		int t_id=t_user.getT_id();
		PersonalCenterDao dao=new PersonalCenterDao();
		dao.UpdateTeacher(t_id, t_name, t_password, t_sex, t_subject, t_telno, t_email);
		
		HttpSession session=request.getSession();
		t_user=(TeacherTab)session.getAttribute("t__user");
		t_user.setT_name(t_name);
		t_user.setT_password(t_password);
		t_user.setT_sex(t_sex);
		t_user.setT_email(t_email);
		t_user.setT_subject(t_subject);
		t_user.setT_telno(t_telno);
		request.getRequestDispatcher("/tgrzx.jsp").forward(request, response);
	}

}
