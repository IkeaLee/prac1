package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import entity.StudentTab;

public class PersonalCenterDao {

		//学生修改信息
		public int UpdateStudent( int s_id,String s_name, String s_password, String s_sex,
				int s_age,String s_school,int s_grade,String s_subject,String s_telno) {
			int ret = 0;
			// 用jdbc向student表中插入数据
			Connection conn = null;
			PreparedStatement st = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl", "c##test","c##test");
				st = conn.prepareStatement("update student set  s_name=?,s_password=?,"
						+ "s_sex=?,s_age=?,s_school=?,s_grade=?,s_subject=?,s_telno=? where s_id=?");
				st.setString(1, s_name);
				st.setString(2, s_password);
				st.setString(3, s_sex);
				st.setInt(4, s_age);
				st.setString(5,s_school);
				st.setInt(6,s_grade);
				st.setString(7,s_subject);
				st.setString(8,s_telno);
				st.setInt(9, s_id);
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
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			// 方法运行完成，提供返回值
			return ret;
		}
		//教师修改信息
		public int UpdateTeacher(int t_id,String t_name, String t_password, String t_sex,
				String t_subject,String t_telno,String t_email) {
			int ret = 0;
			// 用jdbc向teacher表中插入数据
			Connection conn = null;
			PreparedStatement st = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl", "c##test","c##test");
				st = conn
						.prepareStatement("update teacher set t_name=?, t_password=?,t_sex=?,"
								+ "t_subject=?,t_telno=?,t_email=? where t_id=?");
				st.setString(1, t_name);
				st.setString(2, t_password);
				st.setString(3, t_sex);
				st.setString(4, t_subject);
				st.setString(5,t_telno);
				st.setString(6, t_email);
				st.setInt(7, t_id);
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
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			}
			// 方法运行完成，提供返回值
			return ret;
		}
		
		
	//根据ID查询学生用户信息
		public StudentTab getS_userId(int id){
			StudentTab s_user=null;
			Connection conn=null;
			PreparedStatement s_st=null;
			ResultSet s_rs=null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl","c##test","c##test");
				s_st=conn.prepareStatement("select * from StudentTab where id=?");
				s_st.setInt(1, id);
				s_rs=s_st.executeQuery();
					if(s_rs.next()){
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
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return s_user;
		}
		
}


