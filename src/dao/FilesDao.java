package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.FilesTab;

public class FilesDao {
public List<FilesTab> f_query() {
		
		Connection f_conn = null;
		PreparedStatement f_st = null;
		ResultSet rs = null;
		List<FilesTab> fts = new ArrayList<FilesTab>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			f_conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
					"c##test");
			f_st = f_conn.prepareStatement("select * from (select f.f_id,f.f_subject,f.f_name,f.f_id1,f.f_address,f.f_category,rownum from files f  order by f.f_id desc)  where rownum<=10");
			
			rs = f_st.executeQuery();
			
			while(rs.next()){
				String id = rs.getString(1);
				String sub = rs.getString(2);
				String nam = rs.getString(3);
				String id1 = rs.getString(4);
				String add = rs.getString(5);
				String cat = rs.getString(6);
				
				FilesTab ft = new FilesTab(id, sub, nam, id1, add, cat);
				fts.add(ft);
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (f_st != null)
					f_st.close();
				if (f_conn != null)
					f_conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return fts;
	}


//public static void main(String[] args) {
//	FilesDao fd = new FilesDao();
//	List<FilesTab> fds = fd.f_query();
//	for (FilesTab filesTab : fds) {
//		System.out.println(filesTab);
//	}
//}
public List<FilesTab> f_yw() {
	
	Connection f_conn = null;
	PreparedStatement f_st = null;
	ResultSet rs = null;
	List<FilesTab> fts = new ArrayList<FilesTab>();
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		f_conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
				"c##test");
		f_st = f_conn.prepareStatement("select * from files where f_subject='语文'");
		
		rs =f_st.executeQuery();
		
		while(rs.next()){
			String id = rs.getString(1);
			String sub = rs.getString(2);
			String nam = rs.getString(3);
			String id1 = rs.getString(4);
			String add = rs.getString(5);
			String cat = rs.getString(6);
			
			FilesTab ft = new FilesTab(id, sub, nam, id1, add, cat);
			fts.add(ft);
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
			if (f_st != null)
				f_st.close();
			if (f_conn != null)
				f_conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	return fts;
}
public List<FilesTab> f_sx() {
	
	Connection f_conn = null;
	PreparedStatement f_st = null;
	ResultSet rs = null;
	List<FilesTab> fts = new ArrayList<FilesTab>();
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		f_conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
				"c##test");
		f_st = f_conn.prepareStatement("select * from files where f_subject='数学'");
		
		rs =f_st.executeQuery();
		
		while(rs.next()){
			String id = rs.getString(1);
			String sub = rs.getString(2);
			String nam = rs.getString(3);
			String id1 = rs.getString(4);
			String add = rs.getString(5);
			String cat = rs.getString(6);
			
			FilesTab ft = new FilesTab(id, sub, nam, id1, add, cat);
			fts.add(ft);
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
			if (f_st != null)
				f_st.close();
			if (f_conn != null)
				f_conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	return fts;
}
public List<FilesTab> f_yy() {
	
	Connection f_conn = null;
	PreparedStatement f_st = null;
	ResultSet rs = null;
	List<FilesTab> fts = new ArrayList<FilesTab>();
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		f_conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
				"c##test");
		f_st = f_conn.prepareStatement("select * from files where f_subject='英语'");
		
		rs =f_st.executeQuery();
		
		while(rs.next()){
			String id = rs.getString(1);
			String sub = rs.getString(2);
			String nam = rs.getString(3);
			String id1 = rs.getString(4);
			String add = rs.getString(5);
			String cat = rs.getString(6);
			
			FilesTab ft = new FilesTab(id, sub, nam, id1, add, cat);
			fts.add(ft);
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
			if (f_st != null)
				f_st.close();
			if (f_conn != null)
				f_conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	return fts;
}
public List<FilesTab> f_wl() {
	
	Connection f_conn = null;
	PreparedStatement f_st = null;
	ResultSet rs = null;
	List<FilesTab> fts = new ArrayList<FilesTab>();
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		f_conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
				"c##test");
		f_st = f_conn.prepareStatement("select * from files where f_subject='物理'");
		
		rs =f_st.executeQuery();
		
		while(rs.next()){
			String id = rs.getString(1);
			String sub = rs.getString(2);
			String nam = rs.getString(3);
			String id1 = rs.getString(4);
			String add = rs.getString(5);
			String cat = rs.getString(6);
			
			FilesTab ft = new FilesTab(id, sub, nam, id1, add, cat);
			fts.add(ft);
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	} finally {
		try {
			if (rs != null)
				rs.close();
			if (f_st != null)
				f_st.close();
			if (f_conn != null)
				f_conn.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

	return fts;
}
public List<FilesTab> f_hx() {
	
	Connection f_conn = null;
	PreparedStatement f_st = null;
	ResultSet rs = null;
	List<FilesTab> fts = new ArrayList<FilesTab>();
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		f_conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
				"c##test");
		f_st = f_conn.prepareStatement("select * from files where f_subject='化学'");
		
		rs =f_st.executeQuery();
		
		while(rs.next()){
			String id = rs.getString(1);
			String sub = rs.getString(2);
			String nam = rs.getString(3);
			String id1 = rs.getString(4);
			String add = rs.getString(5);
			String cat = rs.getString(6);
			
			FilesTab ft = new FilesTab(id, sub, nam, id1, add, cat);
			fts.add(ft);
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
			if (f_st != null)
				f_st.close();
			if (f_conn != null)
				f_conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	return fts;
}
public List<FilesTab> f_sw() {
	
	Connection f_conn = null;
	PreparedStatement f_st = null;
	ResultSet rs = null;
	List<FilesTab> fts = new ArrayList<FilesTab>();
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		f_conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
				"c##test");
		f_st = f_conn.prepareStatement("select * from files where f_subject='生物'");
		
		rs =f_st.executeQuery();
		
		while(rs.next()){
			String id = rs.getString(1);
			String sub = rs.getString(2);
			String nam = rs.getString(3);
			String id1 = rs.getString(4);
			String add = rs.getString(5);
			String cat = rs.getString(6);
			
			FilesTab ft = new FilesTab(id, sub, nam, id1, add, cat);
			fts.add(ft);
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
			if (f_st != null)
				f_st.close();
			if (f_conn != null)
				f_conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	return fts;
}
public List<FilesTab> f_zz() {
	
	Connection f_conn = null;
	PreparedStatement f_st = null;
	ResultSet rs = null;
	List<FilesTab> fts = new ArrayList<FilesTab>();
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		f_conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
				"c##test");
		f_st = f_conn.prepareStatement("select * from files where f_subject='政治'");
		
		rs =f_st.executeQuery();
		
		while(rs.next()){
			String id = rs.getString(1);
			String sub = rs.getString(2);
			String nam = rs.getString(3);
			String id1 = rs.getString(4);
			String add = rs.getString(5);
			String cat = rs.getString(6);
			
			FilesTab ft = new FilesTab(id, sub, nam, id1, add, cat);
			fts.add(ft);
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
			if (f_st != null)
				f_st.close();
			if (f_conn != null)
				f_conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	return fts;
}
public List<FilesTab> f_ls() {
	
	Connection f_conn = null;
	PreparedStatement f_st = null;
	ResultSet rs = null;
	List<FilesTab> fts = new ArrayList<FilesTab>();
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		f_conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
				"c##test");
		f_st = f_conn.prepareStatement("select * from files where f_subject='历史'");
		
		rs =f_st.executeQuery();
		while(rs.next()){
			String id = rs.getString(1);
			String sub = rs.getString(2);
			String nam = rs.getString(3);
			String id1 = rs.getString(4);
			String add = rs.getString(5);
			String cat = rs.getString(6);
			
			FilesTab ft = new FilesTab(id, sub, nam, id1, add, cat);
			fts.add(ft);
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
			if (f_st != null)
				f_st.close();
			if (f_conn != null)
				f_conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	return fts;
}
public List<FilesTab> f_dl() {
	
	Connection f_conn = null;
	PreparedStatement f_st = null;
	ResultSet rs = null;
	List<FilesTab> fts = new ArrayList<FilesTab>();
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		f_conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
				"c##test");
		f_st = f_conn.prepareStatement("select * from files where f_subject='地理'");
		
		rs =f_st.executeQuery();
		while(rs.next()){
			String id = rs.getString(1);
			String sub = rs.getString(2);
			String nam = rs.getString(3);
			String id1 = rs.getString(4);
			String add = rs.getString(5);
			String cat = rs.getString(6);
			
			FilesTab ft = new FilesTab(id, sub, nam, id1, add, cat);
			fts.add(ft);
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
			if (f_st != null)
				f_st.close();
			if (f_conn != null)
				f_conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	return fts;
}
//根据ID查询
	 public FilesTab f_cid(String f_id){
				FilesTab f_user=new FilesTab();
				Connection conn=null;
				PreparedStatement f_st=null;
				ResultSet f_rs=null;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn=DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl","c##test","c##test");
					
					f_st=conn.prepareStatement("select * from files where f_id=?");
					f_st.setString(1, f_id);
					f_rs=f_st.executeQuery();
						if(f_rs.next()){
							f_user.setF_id(f_rs.getString("f_id"));
							f_user.setF_subject(f_rs.getString("f_subject"));
							f_user.setF_name(f_rs.getString("f_name"));
							f_user.setF_id1(f_rs.getString("f_id1"));
							f_user.setF_address(f_rs.getString("f_address"));
							f_user.setF_category(f_rs.getString("f_category"));
						}
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return f_user;
			}
	 
	 
	 //查询所有
	 public ArrayList<FilesTab> f_csy(){
			ArrayList<FilesTab> f_users= new ArrayList<FilesTab>();
			Connection conn=null;
			PreparedStatement st=null;
			ResultSet rs=null;
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl","c##test","c##test");
				st=conn.prepareStatement("select * from files");
				rs=st.executeQuery();
				while(rs.next()){
					FilesTab f_user=new FilesTab();
					f_user.setF_id(rs.getString("f_id"));
					f_user.setF_subject(rs.getString("f_subject"));
					f_user.setF_name(rs.getString("f_name"));
					f_user.setF_id1(rs.getString("f_id1"));
					f_user.setF_address(rs.getString("f_address"));
					f_user.setF_category(rs.getString("f_category"));
					f_users.add(f_user);
				}
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return f_users;
		}
	 //根据名查询
	 public ArrayList<FilesTab> f_cmh(String f__name){
			ArrayList<FilesTab> f_users= new ArrayList<FilesTab>();
			FilesTab f_user=new FilesTab();
			Connection conn=null;
			PreparedStatement st=null;
			ResultSet rs=null;
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn=DriverManager.getConnection("jdbc:oracle:thin:@ghx:1521:orcl","c##test","c##test");
				st=conn.prepareStatement("select * from files where f_name like ?");
				st.setString(1, "%"+f__name+"%");
				rs=st.executeQuery();
				
				while(rs.next()){
					f_user.setF_id(rs.getString("f_id"));
					f_user.setF_subject(rs.getString("f_subject"));
					f_user.setF_name(rs.getString("f_name"));
					f_user.setF_id1(rs.getString("f_id1"));
					f_user.setF_address(rs.getString("f_address"));
					f_user.setF_category(rs.getString("f_category"));
					f_users.add(f_user);
				}
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return f_users;
		}
	 	
	 	//管理员删除
	 	public int f_sw(String f_id) {
			int ret = 0;

			Connection conn = null;
			PreparedStatement st = null;
			ResultSet rs = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@ghx:1521:orcl", "c##test",
						"c##test");
				st = conn.prepareStatement("delete from files where f_id=?");

				st.setString(1, f_id);
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

