package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entity.ContactUsTab;
import entity.StudentTab;
import entity.TeacherTab;

public class AdminDao {
	//根据ID查询学生用户信息
	 public StudentTab getS_userById(int s_id){
				StudentTab s_user=null;
				Connection conn=null;
				PreparedStatement s_st=null;
				ResultSet s_rs=null;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn=DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl","c##test","c##test");
					
					s_st=conn.prepareStatement("select * from Student where s_id=?");
					s_st.setInt(1, s_id);
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
	 
	 
	 //查询所有学生用户信息
	 public ArrayList<StudentTab> getS_userAll(){
			ArrayList<StudentTab> s_users= new ArrayList<StudentTab>();
			Connection conn=null;
			PreparedStatement st=null;
			ResultSet rs=null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl","c##test","c##test");
				st=conn.prepareStatement("select * from Student");
				rs=st.executeQuery();
				while(rs.next()){
					StudentTab s_user=new StudentTab();
					s_user.setS_id(rs.getInt("s_id"));
					s_user.setS_name(rs.getString("s_name"));
					s_user.setS_password(rs.getString("s_password"));
					s_user.setS_sex(rs.getString("s_sex"));
				    s_user.setS_age(rs.getInt("s_age"));
					s_user.setS_school(rs.getString("s_school"));
					s_user.setS_grade(rs.getInt("s_grade"));
					s_user.setS_subject(rs.getString("s_subject"));
					s_user.setS_telno(rs.getString("s_telno"));
					s_users.add(s_user);
				}
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return s_users;
		}
	 //根据用户名学生查询信息
	 public ArrayList<StudentTab> getS_userByName(String s__name){
			ArrayList<StudentTab> s_users= new ArrayList<StudentTab>();
			Connection conn=null;
			PreparedStatement st=null;
			ResultSet rs=null;
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl","c##test","c##test");
				st=conn.prepareStatement("select * from student where s_name like ?");
				st.setString(1, "%"+s__name+"%");
				rs=st.executeQuery();
				
				while(rs.next()){
					StudentTab s_user=new StudentTab();
					s_user.setS_id(rs.getInt("s_id"));
					s_user.setS_name(rs.getString("s_name"));
					s_user.setS_password(rs.getString("s_password"));
					s_user.setS_sex(rs.getString("s_sex"));
				    s_user.setS_age(rs.getInt("s_age"));
					s_user.setS_school(rs.getString("s_school"));
					s_user.setS_grade(rs.getInt("s_grade"));
					s_user.setS_subject(rs.getString("s_subject"));
					s_user.setS_telno(rs.getString("s_telno"));
					s_users.add(s_user);
				}
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return s_users;
		}
	 	//添加学生用户
	 	public int addS_user(String s_name, String s_password ) {
			int ret = 0;

			Connection conn = null;
			PreparedStatement st = null;
			ResultSet rs = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
						"c##test");
				st = conn.prepareStatement("insert into student (s_id,s_name,s_password)  values (seq_studenttab.nextval,?,?)");
				st.setString(1, s_name);
				st.setString(2, s_password);
				ret = st.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {

				try {
					if (rs != null)
						rs.close();
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

			return ret;
		}
	 	//管理员删除学生用户
	 	public int deleteS_user(int s_id) {
			int ret = 0;

			Connection conn = null;
			PreparedStatement st = null;
			ResultSet rs = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
						"c##test");
				st = conn.prepareStatement("delete from student where s_id=?");

				st.setInt(1, s_id);
				ret = st.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {

				try {
					if (rs != null)
						rs.close();
					if (st != null)
						st.close();
					if (conn != null)
						conn.close();

				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			return ret;
		}
	 
	 	
		// 管理员修改学生用户

		public int updateS_user(int s_id,String s_name, String s_password, String s_sex,
				int s_age,String s_school,int s_grade,String s_subject,String s_telno) {
			int ret = 0;
			Connection conn = null;
			PreparedStatement st = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
						"c##test");
				st = conn
						.prepareStatement("update student set  s_name=?,s_password=?,"
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

	 	//根据ID查询教师用户信息
		 public TeacherTab getT_userById(int t_id){
					TeacherTab t_user=null;
					Connection conn=null;
					PreparedStatement st=null;
					ResultSet rs=null;
					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
						conn=DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl","c##test","c##test");
						st=conn.prepareStatement("select * from teacher where t_id=?");
						st.setInt(1, t_id);
						rs=st.executeQuery();
							if(rs.next()){
								t_user = new TeacherTab();
								t_user.setT_id(rs.getInt("t_id"));
								t_user.setT_name(rs.getString("t_name"));
								t_user.setT_password(rs.getString("t_password"));
								t_user.setT_sex(rs.getString("t_sex"));
								t_user.setT_email(rs.getString("t_email"));
								t_user.setT_subject(rs.getString("t_subject"));
								t_user.setT_telno(rs.getString("t_telno"));
							}
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return t_user;
				}
		 
		 
		 //查询所有教师用户信息
		 public ArrayList<TeacherTab> getT_userAll(){
				ArrayList<TeacherTab> t_users= new ArrayList<TeacherTab>();
				Connection conn=null;
				PreparedStatement st=null;
				ResultSet rs=null;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn=DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl","c##test","c##test");
					st=conn.prepareStatement("select * from teacher");
					rs=st.executeQuery();
					while(rs.next()){
						TeacherTab t_user = new TeacherTab();
						t_user.setT_id(rs.getInt("t_id"));
						t_user.setT_name(rs.getString("t_name"));
						t_user.setT_password(rs.getString("t_password"));
						t_user.setT_sex(rs.getString("t_sex"));
						t_user.setT_email(rs.getString("t_email"));
						t_user.setT_subject(rs.getString("t_subject"));
						t_user.setT_telno(rs.getString("t_telno"));
						t_users.add(t_user);
					}
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return t_users;
			}
		 // 根据教师用户名查询信息
		 public ArrayList<TeacherTab> getT_userByName(String t__name){
				ArrayList<TeacherTab> t_users= new ArrayList<TeacherTab>();
				Connection conn=null;
				PreparedStatement st=null;
				ResultSet rs=null;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn=DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl","c##test","c##test");
					st=conn.prepareStatement("select * from teacher where t_name like ?");
					st.setString(1, "%"+t__name+"%");
					rs=st.executeQuery();
					
					while(rs.next()){
						TeacherTab t_user=new TeacherTab();
						t_user.setT_id(rs.getInt("t_id"));
						t_user.setT_name(rs.getString("t_name"));
						t_user.setT_password(rs.getString("t_password"));
						t_user.setT_sex(rs.getString("t_sex"));
						t_user.setT_email(rs.getString("t_email"));
						t_user.setT_subject(rs.getString("t_subject"));
						t_user.setT_telno(rs.getString("t_telno"));
						t_users.add(t_user);
					}
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return t_users;
			}
		//添加教师用户
		 	public int addT_user(String t_name, String t_password ) {
				int ret = 0;

				Connection conn = null;
				PreparedStatement st = null;
				ResultSet rs = null;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(
							"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
							"c##test");
					st = conn.prepareStatement("insert into teacher (t_id,t_name,t_password)  values (SEQTEACHER.nextval,?,?)");
					st.setString(1, t_name);
					st.setString(2, t_password);
					ret = st.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {

					try {
						if (rs != null)
							rs.close();
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

				return ret;
			}
		 	//管理员删除教师用户
		 	public int deleteT_user(int t_id) {
				int ret = 0;

				Connection conn = null;
				PreparedStatement st = null;
				ResultSet rs = null;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(
							"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
							"c##test");
					st = conn.prepareStatement("delete from teacher where t_id=?");

					st.setInt(1, t_id);
					ret = st.executeUpdate();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {

					try {
						if (rs != null)
							rs.close();
						if (st != null)
							st.close();
						if (conn != null)
							conn.close();

					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				return ret;
			}
		 
		 	
			// 管理员修改教师用户

			public int updateT_user(int t_id,String t_name, String t_password, String t_sex,
					String t_subject,String t_telno,String t_email) {
				int ret = 0;
				Connection conn = null;
				PreparedStatement st = null;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection(
							"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
							"c##test");
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
			//根据ID查询建议信息
			 public ContactUsTab getContactUsById(int id){
				 		ContactUsTab cu=null;
						Connection conn=null;
						PreparedStatement st=null;
						ResultSet rs=null;
						try {
							Class.forName("oracle.jdbc.driver.OracleDriver");
							conn=DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl","c##test","c##test");
							
							st=conn.prepareStatement("select * from ContactUs where id=?");
							st.setInt(1, id);
							rs=st.executeQuery();
								if(rs.next()){
									cu = new ContactUsTab();
									cu.setId(rs.getInt("id"));
									cu.setName(rs.getString("name"));
									cu.setEmail(rs.getString("email"));
									cu.setTelno(rs.getString("telno"));
								    cu.setAdvice(rs.getString("advice"));
								}
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return cu;
					}
			 
			 
			 //查询所有建议信息
			 public ArrayList<ContactUsTab> getContactUsAll(){
					ArrayList<ContactUsTab> cus= new ArrayList<ContactUsTab>();
					Connection conn=null;
					PreparedStatement st=null;
					ResultSet rs=null;
					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
						conn=DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl","c##test","c##test");
						st=conn.prepareStatement("select * from ContactUs");
						rs=st.executeQuery();
						while(rs.next()){
							ContactUsTab cu=new ContactUsTab();
							cu.setId(rs.getInt("id"));
							cu.setName(rs.getString("name"));
							cu.setEmail(rs.getString("email"));
							cu.setTelno(rs.getString("telno"));
						    cu.setAdvice(rs.getString("advice"));
						    cus.add(cu);
						}
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return cus;
				}
			 //根据关键词查询建议信息
			 public ArrayList<ContactUsTab> getContactUsByName(String cu__advice){
					ArrayList<ContactUsTab> cus= new ArrayList<ContactUsTab>();
					Connection conn=null;
					PreparedStatement st=null;
					ResultSet rs=null;
					
					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
						conn=DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl","c##test","c##test");
						st=conn.prepareStatement("select * from ContactUs where advice like ?");
						st.setString(1, "%"+cu__advice+"%");
						rs=st.executeQuery();
						
						while(rs.next()){
							ContactUsTab cu=new ContactUsTab();
							cu.setId(rs.getInt("id"));
							cu.setName(rs.getString("name"));
							cu.setEmail(rs.getString("email"));
							cu.setTelno(rs.getString("telno"));
						    cu.setAdvice(rs.getString("advice"));
						    cus.add(cu);
						}
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return cus;
				} 
			//管理员删除用户建议
			 	public int deleteContactUs(int id) {
					int ret = 0;
					Connection conn = null;
					PreparedStatement st = null;
					ResultSet rs = null;
					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
						conn = DriverManager.getConnection(
								"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
								"c##test");
						st = conn.prepareStatement("delete from ContactUs where id=?");
						st.setInt(1, id);
						ret = st.executeUpdate();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {

						try {
							if (rs != null)
								rs.close();
							if (st != null)
								st.close();
							if (conn != null)
								conn.close();

						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

					return ret;
				}
			 
		 
		 
	}

