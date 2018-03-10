package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ContactUsDao;

/**
 * Servlet implementation class LxwmServlet
 */
@WebServlet("/LxwmServlet")
public class ContactUsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactUsServlet() {
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
				String name=request.getParameter("name");
				String email=request.getParameter("email");
				String telno=request.getParameter("telno");
				String advice=request.getParameter("advice");
				//2.调用业务逻辑类
				ContactUsDao ret=new ContactUsDao();
				int cu=ret.ContactUs( name, email, telno, advice);
				
				//3.资源跳转
				if(cu==1){
					HttpSession session=request.getSession();
					session.setAttribute("cu", cu);
					response.sendRedirect("zy.jsp");
				}else{
				//登陆成功保存登录用户的信息 可以使用户名称
				//也有时候直接保存登陆的用户对象
					request.getRequestDispatcher("/lxwm.jsp").forward(request, response);	}
	}

}
