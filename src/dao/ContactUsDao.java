package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContactUsDao{
    public int ContactUs(String name,String email,String telno,String advice) {
	int ret = 0;
	// 用jdbc向StudentTab表中插入数据
	Connection conn = null;
	PreparedStatement st = null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
				"c##test");
		String sql = "insert into ContactUs(id,name,email,telno,advice) values(seq_contactus.nextval,?,?,?,?)";
		st = conn
				.prepareStatement(sql);
		st.setString(1, name);
		st.setString(2, email);
		st.setString(3, telno);
		st.setString(4, advice);
		ret = st.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {

		try {
			if (st != null)
				st.close();
			if (conn != null)
				;
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	// 方法运行完成，提供返回值
	return ret;
	}
}
