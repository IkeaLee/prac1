package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import entity.TeacherTab;

public class TeacherDao {
	public TeacherTab t_Login(String t_name, String t_password) {
		TeacherTab t_user = null;
		
		Connection t_conn = null;
		PreparedStatement t_st = null;
		ResultSet t_rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			t_conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
					"c##test");
			t_st = t_conn.prepareStatement("select * from teacher where t_name=? and t_password=?");
			t_st.setString(1, t_name);
			t_st.setString(2, t_password);
			t_rs = t_st.executeQuery();
			if (t_rs.next()) {
				t_user = new TeacherTab();
				t_user.setT_id(t_rs.getInt("t_id"));
				t_user.setT_name(t_rs.getString("t_name"));
				t_user.setT_password(t_rs.getString("t_password"));
				t_user.setT_sex(t_rs.getString("t_sex"));
				t_user.setT_email(t_rs.getString("t_email"));
				t_user.setT_telno(t_rs.getString("t_telno"));
				t_user.setT_email(t_rs.getString("t_email"));
				t_user.setT_subject(t_rs.getString("t_subject"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (t_rs != null)
					t_rs.close();
				if (t_st != null)
					t_st.close();
				if (t_conn != null)
					t_conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return t_user;
	}
}


