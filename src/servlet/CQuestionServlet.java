package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import dao.QuestionDao;
import entity.QuestionTab;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/CQuestionServlet")
public class CQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CQuestionServlet() {
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
		ArrayList<QuestionTab> q_users=new ArrayList<QuestionTab>();
		QuestionDao dao=new QuestionDao();
		
		if("1".equals(choice)){
			String q_id=request.getParameter("q_id");
			QuestionTab q_user=dao.q_cid(q_id);
			q_users.add(q_user);
		}else if("2".equals(choice)){
			String q_name = request.getParameter("q_name");
			q_users=dao.q_cmh(q_name);
		}else if("3".equals(choice)){
			//System.out.println("qqq");
			q_users=dao.q_csy();
			System.out.println(q_users);
		}
		request.setAttribute("q__users", q_users);
		request.getRequestDispatcher("/gly.jsp").forward(request, response);
		
	}

}
