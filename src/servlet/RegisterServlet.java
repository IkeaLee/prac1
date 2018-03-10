package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.RegisterDao;

/**
 * Servlet implementation class ZCServlet
 */
@WebServlet("/ZCServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		//1.或的请求参数
		String s_name=request.getParameter("s_name");
		String s_password=request.getParameter("s_password");
		String s_telno=request.getParameter("s_telno");
		//2.调用业务逻辑类
		RegisterDao ret=new RegisterDao();
		int ZCStudent=ret.ZC(s_name, s_password, s_telno);
		
		//3.资源跳转
		if(ZCStudent==1){
			response.sendRedirect("dl.jsp");
		}else{
		//登陆成功保存登录用户的信息 可以使用户名称
		//也有时候直接保存登陆的用户对象
//			HttpSession session=request.getSession();
//			session.setAttribute("ZCStudent", ZCStudent);
			request.getRequestDispatcher("/zc.jsp").forward(request, response);	}

	}

}
