package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





import dao.QuestionDao;
import entity.TeacherTab;

@WebServlet("/JdDyzxServlet")
public class JdDyzxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public JdDyzxServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String q_id=request.getParameter("q_id");
		String q_answer=request.getParameter("q_answer");
		QuestionDao q_dao = new QuestionDao();
	    int t = 0;
	    
		TeacherTab t_user = (TeacherTab) request.getSession().getAttribute("t__user");
		if(t_user==null){
			request.getRequestDispatcher("/dyzxfail.jsp").forward(request, response);
		}else{
		
		 t=q_dao.q_jd(q_id,t_user.getT_id(),q_answer);
	
		if(t!=0)
		
//		request.setAttribute("users", users);
		{request.getRequestDispatcher("/dyzxsuccess.jsp").forward(request, response);}
		else{request.getRequestDispatcher("/dyzxfail.jsp").forward(request, response);}
		//PrintWriter out = response.getWriter();
		//out.println("success!");
	}

	
		
	}
}

