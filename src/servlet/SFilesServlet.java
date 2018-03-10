package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.FilesDao;
import entity.FilesTab;

/**
 * Servlet implementation class SFilesServlet
 */
@WebServlet("/SFilesServlet")
public class SFilesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SFilesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("aaa");
		String f_id = request.getParameter("f_id");
		System.out.println(f_id);
		FilesDao dao=new FilesDao();
		dao.f_sw(f_id);
		ArrayList<FilesTab> f_users=dao.f_csy();
		request.setAttribute("f__users", f_users);
		request.getRequestDispatcher("/gly.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
