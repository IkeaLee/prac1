package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.QuestionDao;
import entity.QuestionTab;

/**
 * Servlet implementation class DetailDyzxServlet
 */
@WebServlet("/dyzx/detail")
public class DetailDyzxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest, HttpServletResponse)(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String q_id = request.getParameter("q_id");
		
		QuestionDao qd = new QuestionDao();
		List<QuestionTab> qts = qd.selectQue(q_id);
		request.setAttribute("qtlist", qts);
		request.getRequestDispatcher("/wtxq.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
