package jy.java.exam04;

import java.sql.*;

public class JdbcEx04 {		//select

	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		sql.append("select deptno, dname, college, loc ");
		sql.append("from department ");
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1","mytest","mytest");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql.toString());
			
			while(rs.next()) {
				int i = rs.getInt(1);
				String s1 = rs.getString(2);
				int j = rs.getInt("college");
				String s2 = rs.getString("loc");
				System.out.println(i + "\t" + s1 + "\t" + j + "\t" + s2);
			}
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try { if(rs != null) rs.close();} catch(SQLException e) {}
			try { if(stmt != null) stmt.close();} catch(SQLException e) {}
			try { if(conn != null) conn.close();} catch(SQLException e) {}
		}
	}

}
