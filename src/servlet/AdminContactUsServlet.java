package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminDao;
import entity.ContactUsTab;

/**
 * Servlet implementation class AdminContactUsServlet
 */
@WebServlet("/balabala")
public class AdminContactUsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminContactUsServlet() {
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
		ArrayList<ContactUsTab> cus=new ArrayList<ContactUsTab>();
		AdminDao dao=new AdminDao();
		
		if("1".equals(choice)){
			int id=Integer.parseInt(request.getParameter("id"));
			ContactUsTab cu=dao.getContactUsById(id);
			cus.add(cu);
		}else if("2".equals(choice)){
			String cu__advice = request.getParameter("cu__advice");
			cus=dao.getContactUsByName(cu__advice);
		}else if("3".equals(choice)){
			cus=dao.getContactUsAll();
			}
		request.setAttribute("cus", cus);
		request.getRequestDispatcher("/gly.jsp").forward(request, response);
	}

}
