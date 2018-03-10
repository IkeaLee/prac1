package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.StudentTab;

public class StudentDao {
	public StudentTab s_Login(String s_name, String s_password) {
		StudentTab s_user = null;
		
		Connection s_conn = null;
		PreparedStatement s_st = null;
		ResultSet s_rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			s_conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
					"c##test");
			s_st = s_conn.prepareStatement("select * from student where s_name=? and s_password=?");
			s_st.setString(1, s_name);
			s_st.setString(2, s_password);
			s_rs = s_st.executeQuery();
			if (s_rs.next()) {
				s_user = new StudentTab();
				s_user.setS_id(s_rs.getInt("s_id"));
				s_user.setS_name(s_rs.getString("s_name"));
				s_user.setS_password(s_rs.getString("s_password"));
				s_user.setS_sex(s_rs.getString("s_sex"));
			    s_user.setS_age(s_rs.getInt("s_age"));
				s_user.setS_school(s_rs.getString("s_school"));
				s_user.setS_grade(s_rs.getInt("s_grade"));
				s_user.setS_subject(s_rs.getString("s_subject"));
				s_user.setS_telno(s_rs.getString("s_telno"));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (s_rs != null)
					s_rs.close();
				if (s_st != null)
					s_st.close();
				if (s_conn != null)
					s_conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return s_user;
	}
}

