package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
	public int ZC(String s_name, String s_password,String s_telno) {
		// 设定返回值为0
		int ret = 0;
		// 用jdbc向StudentTab表中插入数据
		Connection conn = null;
		PreparedStatement st = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
					"c##test");
			String sql = "insert into Student(s_id,s_name,s_password,s_telno) values(seq_studenttab.nextval,?,?,?)";
			st = conn
					.prepareStatement(sql);
			st.setString(1, s_name);
			st.setString(2, s_password);
			st.setString(3, s_telno);
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
