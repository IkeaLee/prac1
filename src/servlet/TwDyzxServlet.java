    package servlet;

	import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;









	import dao.QuestionDao;
import entity.StudentTab;

	@WebServlet("/TwDyzxServlet")
	public class TwDyzxServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;

		public TwDyzxServlet() {
			super();

		}

		protected void doPost(HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException {
			String q_subject=request.getParameter("q_subject");
			String q_content=request.getParameter("q_content");
			QuestionDao q_dao = new QuestionDao();
		    int t = 0;
		    
			StudentTab s_user = (StudentTab) request.getSession().getAttribute("s__user");
			
			if(s_user==null){
				request.getRequestDispatcher("/dyzxfail.jsp").forward(request, response);
			}else{
			
			 t=q_dao.q_tw(s_user.getS_id(),q_subject,q_content);
		
			if(t!=0)
			
//			request.setAttribute("users", users);
			{request.getRequestDispatcher("/dyzxsuccess.jsp").forward(request, response);}
			else{request.getRequestDispatcher("/dyzxfail.jsp").forward(request, response);}
			//PrintWriter out = response.getWriter();
			//out.println("success!");
		}

		
			
		}
	}
