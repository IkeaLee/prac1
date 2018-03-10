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
 * Servlet implementation class CFilesServlet
 */
@WebServlet("/CFilesServlet")
public class CFilesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CFilesServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	String choice=request.getParameter("choice");
	ArrayList<FilesTab> f_users=new ArrayList<FilesTab>();
	FilesDao dao=new FilesDao();
	
	if("1".equals(choice)){
		String f_id=request.getParameter("f_id");
		FilesTab f_user=dao.f_cid(f_id);
		f_users.add(f_user);
		System.out.println(f_users);
	}else if("2".equals(choice)){
		String f_name = request.getParameter("f_name");
		f_users=dao.f_cmh(f_name);
		System.out.println(f_users);
	}else if("3".equals(choice)){
		//System.out.println("qqq");
		f_users=dao.f_csy();
		System.out.println(f_users);
	}
	request.setAttribute("f__users", f_users);
	request.getRequestDispatcher("/gly.jsp").forward(request, response);
	
}
}
