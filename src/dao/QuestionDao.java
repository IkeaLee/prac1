package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;







import entity.QuestionTab;


public class QuestionDao {
	public List<QuestionTab> q_query() {
		
		Connection q_conn = null;
		PreparedStatement q_st = null;
		ResultSet rs = null;
		List<QuestionTab> qts = new ArrayList<QuestionTab>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			q_conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
					"c##test");
			q_st = q_conn.prepareStatement("select * from (select q.q_id,   q.q_subject,   q.q_content,  q.q_id1,q_id2,q.q_answer,rownum from question q  order by q.q_id desc) where rownum<=10");
			
			rs = q_st.executeQuery();
			
			while(rs.next()){
				String id = rs.getString(1);
				String sub = rs.getString(2);
				String con = rs.getString(3);
				String id1 = rs.getString(4);
				String id2 = rs.getString(5);
				String ans = rs.getString(6);
				
				QuestionTab qt = new QuestionTab(id, sub, id1, id2, ans, con);
				qts.add(qt);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (q_st != null)
					q_st.close();
				if (q_conn != null)
					q_conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return qts;
	}
	
	public List<QuestionTab> selectQue(String qid){
		
		Connection q_conn = null;
		PreparedStatement q_st = null;
		ResultSet rs = null;
		List<QuestionTab> qts = new ArrayList<QuestionTab>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			q_conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
					"c##test");
			q_st = q_conn.prepareStatement("select q.q_id,q.q_subject,q.q_content,q.q_id1,q_id2,q.q_answer from question q where q_id=?");
			q_st.setString(1, qid);
			rs = q_st.executeQuery();
			
			while(rs.next()){
				String id = rs.getString(1);
				String sub = rs.getString(2);
				String con = rs.getString(3);
				String id1 = rs.getString(4);
				String id2 = rs.getString(5);
				String ans = rs.getString(6);
				
				QuestionTab qt = new QuestionTab(id, sub, id1, id2, ans, con);
				qts.add(qt);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (q_st != null)
					q_st.close();
				if (q_conn != null)
					q_conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return qts;
		
	}
	
//public static void main(String[] args) {
//	QuestionDao qd = new QuestionDao();
//	List<QuestionTab> qts = qd.selectQue("1012");
//	System.out.println(qts);
//}
	
public List<QuestionTab> q_yw() {
		
		Connection q_conn = null;
		PreparedStatement q_st = null;
		ResultSet rs = null;
		List<QuestionTab> qts = new ArrayList<QuestionTab>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			q_conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
					"c##test");
			q_st = q_conn.prepareStatement("select * from question where q_subject='语文'");
			
			rs = q_st.executeQuery();
			
			while(rs.next()){
				String id = rs.getString(1);
				String sub = rs.getString(2);
				String con = rs.getString(3);
				String id1 = rs.getString(4);
				String id2 = rs.getString(5);
				String ans = rs.getString(6);
				
				QuestionTab qt = new QuestionTab(id, sub, id1, id2, ans, con);
				qts.add(qt);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (q_st != null)
					q_st.close();
				if (q_conn != null)
					q_conn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

		return qts;
	}
public List<QuestionTab> q_sx() {
	
	Connection q_conn = null;
	PreparedStatement q_st = null;
	ResultSet rs = null;
	List<QuestionTab> qts = new ArrayList<QuestionTab>();
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		q_conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
				"c##test");
		q_st = q_conn.prepareStatement("select * from question where q_subject='数学'");
		
		rs = q_st.executeQuery();
		
		while(rs.next()){
			String id = rs.getString(1);
			String sub = rs.getString(2);
			String con = rs.getString(3);
			String id1 = rs.getString(4);
			String id2 = rs.getString(5);
			String ans = rs.getString(6);
			
			QuestionTab qt = new QuestionTab(id, sub, id1, id2, ans, con);
			qts.add(qt);
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		try {
			if (rs != null)
				rs.close();
			if (q_st != null)
				q_st.close();
			if (q_conn != null)
				q_conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	return qts;
}
public List<QuestionTab> q_wl() {
	
	Connection q_conn = null;
	PreparedStatement q_st = null;
	ResultSet rs = null;
	List<QuestionTab> qts = new ArrayList<QuestionTab>();
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		q_conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
				"c##test");
		q_st = q_conn.prepareStatement("select * from question where q_subject='物理'");
		
		rs = q_st.executeQuery();
		
		while(rs.next()){
			String id = rs.getString(1);
			String sub = rs.getString(2);
			String con = rs.getString(3);
			String id1 = rs.getString(4);
			String id2 = rs.getString(5);
			String ans = rs.getString(6);
			
			QuestionTab qt = new QuestionTab(id, sub, id1, id2, ans, con);
			qts.add(qt);
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		try {
			if (rs != null)
				rs.close();
			if (q_st != null)
				q_st.close();
			if (q_conn != null)
				q_conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	return qts;
}
public List<QuestionTab> q_hx() {
	
	Connection q_conn = null;
	PreparedStatement q_st = null;
	ResultSet rs = null;
	List<QuestionTab> qts = new ArrayList<QuestionTab>();
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		q_conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
				"c##test");
		q_st = q_conn.prepareStatement("select * from question where q_subject='化学'");
		
		rs = q_st.executeQuery();
		
		while(rs.next()){
			String id = rs.getString(1);
			String sub = rs.getString(2);
			String con = rs.getString(3);
			String id1 = rs.getString(4);
			String id2 = rs.getString(5);
			String ans = rs.getString(6);
			
			QuestionTab qt = new QuestionTab(id, sub, id1, id2, ans, con);
			qts.add(qt);
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		try {
			if (rs != null)
				rs.close();
			if (q_st != null)
				q_st.close();
			if (q_conn != null)
				q_conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	return qts;
}
public List<QuestionTab> q_sw() {
	
	Connection q_conn = null;
	PreparedStatement q_st = null;
	ResultSet rs = null;
	List<QuestionTab> qts = new ArrayList<QuestionTab>();
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		q_conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
				"c##test");
		q_st = q_conn.prepareStatement("select * from question where q_subject='生物'");
		
		rs = q_st.executeQuery();
		
		while(rs.next()){
			String id = rs.getString(1);
			String sub = rs.getString(2);
			String con = rs.getString(3);
			String id1 = rs.getString(4);
			String id2 = rs.getString(5);
			String ans = rs.getString(6);
			
			QuestionTab qt = new QuestionTab(id, sub, id1, id2, ans, con);
			qts.add(qt);
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		try {
			if (rs != null)
				rs.close();
			if (q_st != null)
				q_st.close();
			if (q_conn != null)
				q_conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	return qts;
}
public List<QuestionTab> q_zz() {
	
	Connection q_conn = null;
	PreparedStatement q_st = null;
	ResultSet rs = null;
	List<QuestionTab> qts = new ArrayList<QuestionTab>();
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		q_conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
				"c##test");
		q_st = q_conn.prepareStatement("select * from question where q_subject='政治'");
		
		rs = q_st.executeQuery();
		
		while(rs.next()){
			String id = rs.getString(1);
			String sub = rs.getString(2);
			String con = rs.getString(3);
			String id1 = rs.getString(4);
			String id2 = rs.getString(5);
			String ans = rs.getString(6);
			
			QuestionTab qt = new QuestionTab(id, sub, id1, id2, ans, con);
			qts.add(qt);
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		try {
			if (rs != null)
				rs.close();
			if (q_st != null)
				q_st.close();
			if (q_conn != null)
				q_conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	return qts;
}
public List<QuestionTab> q_ls() {
	
	Connection q_conn = null;
	PreparedStatement q_st = null;
	ResultSet rs = null;
	List<QuestionTab> qts = new ArrayList<QuestionTab>();
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		q_conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
				"c##test");
		q_st = q_conn.prepareStatement("select * from question where q_subject='历史'");
		
		rs = q_st.executeQuery();
		
		while(rs.next()){
			String id = rs.getString(1);
			String sub = rs.getString(2);
			String con = rs.getString(3);
			String id1 = rs.getString(4);
			String id2 = rs.getString(5);
			String ans = rs.getString(6);
			
			QuestionTab qt = new QuestionTab(id, sub, id1, id2, ans, con);
			qts.add(qt);
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		try {
			if (rs != null)
				rs.close();
			if (q_st != null)
				q_st.close();
			if (q_conn != null)
				q_conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	return qts;
}
public List<QuestionTab> q_dl() {
	
	Connection q_conn = null;
	PreparedStatement q_st = null;
	ResultSet rs = null;
	List<QuestionTab> qts = new ArrayList<QuestionTab>();
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		q_conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
				"c##test");
		q_st = q_conn.prepareStatement("select * from question where q_subject='地理'");
		
		rs = q_st.executeQuery();
		
		while(rs.next()){
			String id = rs.getString(1);
			String sub = rs.getString(2);
			String con = rs.getString(3);
			String id1 = rs.getString(4);
			String id2 = rs.getString(5);
			String ans = rs.getString(6);
			
			QuestionTab qt = new QuestionTab(id, sub, id1, id2, ans, con);
			qts.add(qt);
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		try {
			if (rs != null)
				rs.close();
			if (q_st != null)
				q_st.close();
			if (q_conn != null)
				q_conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	return qts;
}
public List<QuestionTab> q_yy() {
	
	Connection q_conn = null;
	PreparedStatement q_st = null;
	ResultSet rs = null;
	List<QuestionTab> qts = new ArrayList<QuestionTab>();
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		q_conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
				"c##test");
		q_st = q_conn.prepareStatement("select * from question where q_subject='英语'");
		
		rs = q_st.executeQuery();
		
		while(rs.next()){
			String id = rs.getString(1);
			String sub = rs.getString(2);
			String con = rs.getString(3);
			String id1 = rs.getString(4);
			String id2 = rs.getString(5);
			String ans = rs.getString(6);
			
			QuestionTab qt = new QuestionTab(id, sub, id1, id2, ans, con);
			qts.add(qt);
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		try {
			if (rs != null)
				rs.close();
			if (q_st != null)
				q_st.close();
			if (q_conn != null)
				q_conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	return qts;
}
public int q_jd(String q_id,int q_id2,String q_answer)
{
	//设定返回值为0
	int jd=0;
	
	Connection conn=null;
	PreparedStatement st=null;
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl","c##test","c##test");
		st=conn.prepareStatement("update question set q_answer=?,q_id2=? where q_id=?");
		st.setString(1,q_answer);
		st.setInt(2, q_id2);
		st.setString(3, q_id);
		
		
		jd = st.executeUpdate();
		System.out.println("q_jd");
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		try{
		
			if(st!=null)
				st.close();
			if(conn!=null)
				conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	return jd;
}
public int q_tw(int q_id1,String q_subject,String q_content)
{
	//设定返回值为0
	
	int tw=0;
	Connection conn=null;
	PreparedStatement st=null;
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl","c##test","c##test");
		st=conn.prepareStatement("insert into question (q_id,q_subject,q_content,q_id1) values(seqquestion.nextval,?,?,?)");
		st.setString(1,q_subject);
		st.setString(2,q_content);
		
		st.setInt(3,q_id1);
		
		tw=st.executeUpdate();
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		try{
		
			if(st!=null)
				st.close();
			if(conn!=null)
				conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
return tw;
}
//public void q_csy( )//管理员全部查询
//{
//	ArrayList<QuestionTab> q_user = new ArrayList<QuestionTab>();
//	Connection conn=null;
//	PreparedStatement st=null;
//	ResultSet rs=null;
//	try{
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		conn=DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl","c##test","c##test");
//		
//    st=conn.prepareStatement("select * from question where id>=0 order by id ");
//	rs=st.executeQuery();
//	int count=0;
//	while(rs.next()){
//		count++;
//		q_user.setQ_id(rs.getString("q_id"));
//		q_user.setQ_subject(rs.getString("q_subject"));
//		q_user.setQ_content(rs.getString("q_content"));
//		q_user.setQ_id1(rs.getString("q_id1"));
//		q_user.setQ_id2(rs.getString("q_id2"));
//		q_user.setQ_answer(rs.getString("q_answer"));
//	}
//	if(count==0){
//		System.out.println("查询不到问题");
//		
//	}
//	}catch(ClassNotFoundException e){
//		e.printStackTrace();
//	}catch(SQLException e){
//		e.printStackTrace();
//	}finally{
//		try{
//		
//			if(st!=null)
//				st.close();
//			if(conn!=null)
//				conn.close();
//		}catch(SQLException e){
//			e.printStackTrace();
//		}
//	}
//}



//根据ID查询
	 public QuestionTab q_cid(String q_id){
		 QuestionTab q_user=new QuestionTab();
				Connection conn=null;
				PreparedStatement q_st=null;
				ResultSet q_rs=null;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn=DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl","c##test","c##test");
					
					q_st=conn.prepareStatement("select * from question where q_id=?");
					q_st.setString(1, q_id);
					q_rs=q_st.executeQuery();
						if(q_rs.next()){
							
							q_user.setQ_id(q_rs.getString("q_id"));
							q_user.setQ_subject(q_rs.getString("q_subject"));
							q_user.setQ_content(q_rs.getString("q_content"));
							q_user.setQ_id1(q_rs.getString("q_id1"));
							q_user.setQ_id2(q_rs.getString("q_id2"));
							q_user.setQ_answer(q_rs.getString("q_answer"));
						}
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return q_user;
			}
	 
	 
	 //查询所有
	 public ArrayList<QuestionTab> q_csy(){
			ArrayList<QuestionTab> q_users= new ArrayList<QuestionTab>();
			Connection conn=null;
			PreparedStatement st=null;
			ResultSet rs=null;
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl","c##test","c##test");
				st=conn.prepareStatement("select * from question");
				rs=st.executeQuery();
				while(rs.next()){
					QuestionTab q_user=new QuestionTab();
					q_user.setQ_id(rs.getString("q_id"));
					q_user.setQ_subject(rs.getString("q_subject"));
					q_user.setQ_content(rs.getString("q_content"));
					q_user.setQ_id1(rs.getString("q_id1"));
					q_user.setQ_id2(rs.getString("q_id2"));
					q_user.setQ_answer(rs.getString("q_answer"));
					q_users.add(q_user);
				}
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return q_users;
		}
	 //根据名查询
	 public ArrayList<QuestionTab> q_cmh(String q__content){
			ArrayList<QuestionTab> q_users= new ArrayList<QuestionTab>();
			Connection conn=null;
			PreparedStatement st=null;
			ResultSet rs=null;
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl","c##test","c##test");
				st=conn.prepareStatement("select * from question where q_content like ?");
				st.setString(1, "%"+q__content+"%");
				rs=st.executeQuery();
				
				while(rs.next()){
					QuestionTab q_user=new QuestionTab();
					q_user.setQ_id(rs.getString("q_id"));
					q_user.setQ_subject(rs.getString("q_subject"));
					q_user.setQ_content(rs.getString("q_content"));
					q_user.setQ_id1(rs.getString("q_id1"));
					q_user.setQ_id2(rs.getString("q_id2"));
					q_user.setQ_answer(rs.getString("q_answer"));
					q_users.add(q_user);
				}
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return q_users;
		}
	 	
	 	//管理员删除
	 	public int q_sw(String q_id) {
			int ret = 0;

			Connection conn = null;
			PreparedStatement st = null;
			ResultSet rs = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
						"c##test");
				st = conn.prepareStatement("delete from question where q_id=?");

				st.setString(1, q_id);
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
	 
	 	
		

//	public static void main(String[] args) {
//		QuestionDao qd = new QuestionDao();
//		qd.q_tw("ooooo");
//		
//	}
}
