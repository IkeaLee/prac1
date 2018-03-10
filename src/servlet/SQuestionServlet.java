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
 * Servlet implementation class DeleteStudentServlet
 */
@WebServlet("/SQuestionServlet")
public class SQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SQuestionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String q_id = request.getParameter("q_id");
		System.out.println(q_id);
		QuestionDao dao=new QuestionDao();
		dao.q_sw(q_id);
		ArrayList<QuestionTab> q_users=dao.q_csy();
		request.setAttribute("q__users", q_users);
		request.getRequestDispatcher("/gly.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
