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
		//1.����������
				String name=request.getParameter("name");
				String email=request.getParameter("email");
				String telno=request.getParameter("telno");
				String advice=request.getParameter("advice");
				//2.����ҵ���߼���
				ContactUsDao ret=new ContactUsDao();
				int cu=ret.ContactUs( name, email, telno, advice);
				
				//3.��Դ��ת
				if(cu==1){
					HttpSession session=request.getSession();
					session.setAttribute("cu", cu);
					response.sendRedirect("zy.jsp");
				}else{
				//��½�ɹ������¼�û�����Ϣ ����ʹ�û�����
				//Ҳ��ʱ��ֱ�ӱ����½���û�����
					request.getRequestDispatcher("/lxwm.jsp").forward(request, response);	}
	}

}
