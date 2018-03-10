package servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class FileUp
 */
@WebServlet("/FileUp")
@MultipartConfig
public class ScGxzxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		// �洢·��
		String savePath = request.getServletContext().getRealPath("/uploadFile");
		File f = new File(savePath);
		if(!f.exists()){
			f.mkdir();
		}
		// ��ȡ�ϴ����ļ�����
		Collection<Part> parts = request.getParts();
		// �ϴ������ļ�
		if (parts.size() == 1) {
			// Servlet3.0��multipart/form-data��POST�����װ��Part��ͨ��Part���ϴ����ļ����в�����
			// Part part = parts[0];//���ϴ����ļ������л�ȡPart����
			Part part = request.getPart("file");// ͨ����file�ؼ�(<input type="file"
												// name="file">)������ֱ�ӻ�ȡPart����
			// Servlet3û���ṩֱ�ӻ�ȡ�ļ����ķ���,��Ҫ������ͷ�н�������
			// ��ȡ����ͷ������ͷ�ĸ�ʽ��form-data; name="file"; filename="snmp4j--api.zip"
			String header = part.getHeader("content-disposition");
			// ��ȡ�ļ���
			String fileName = getFileName(header);
			// ���ļ�д��ָ��·��
			part.write(savePath + File.separator + fileName);
		} else {
			// һ�����ϴ�����ļ�
			for (Part part : parts) {// ѭ�������ϴ����ļ�
				// ��ȡ����ͷ������ͷ�ĸ�ʽ��form-data; name="file";
				// filename="snmp4j--api.zip"
				String header = part.getHeader("content-disposition");
				// ��ȡ�ļ���
				String fileName = getFileName(header);
				// ���ļ�д��ָ��·��
				System.out.println(savePath + File.separator + fileName);
				if(!"".equals(fileName)){
					part.write(savePath + File.separator + fileName);					
				}
			}
		}
		PrintWriter out = response.getWriter();
//		out.flush();
//		out.close();
		request.getRequestDispatcher("/gxzxsuccess.jsp").forward(request, response);

	}
	 /**
	      * ��������ͷ�������ļ���
	      * ����ͷ�ĸ�ʽ�������google������£�form-data; name="file"; filename="snmp4j--api.zip"
	      *                 IE������£�form-data; name="file"; filename="E:\snmp4j--api.zip"
	      * @param header ����ͷ
	      * @return �ļ���
	      */
	     public String getFileName(String header) {
	         /**
	          * String[] tempArr1 = header.split(";");����ִ����֮���ڲ�ͬ��������£�tempArr1���������������������
	          * �������google������£�tempArr1={form-data,name="file",filename="snmp4j--api.zip"}
	          * IE������£�tempArr1={form-data,name="file",filename="E:\snmp4j--api.zip"}
	          */
	         String[] tempArr1 = header.split(";");
	         /**
	          *�������google������£�tempArr2={filename,"snmp4j--api.zip"}
	          *IE������£�tempArr2={filename,"E:\snmp4j--api.zip"}
	          */
	         String[] tempArr2 = tempArr1[2].split("=");
	         //��ȡ�ļ��������ݸ����������д��
	         String fileName = tempArr2[1].substring(tempArr2[1].lastIndexOf("\\")+1).replaceAll("\"", "");
	         return fileName;
	     }

	
}
