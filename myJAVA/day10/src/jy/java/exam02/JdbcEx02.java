package jy.java.exam02;

import java.sql.*;

public class JdbcEx02 {		//update

	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		sql.append("update department ");
		sql.append("set dname = '전자계산학과' ");
		sql.append("where deptno = 203 ");
		
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1","mytest","mytest");
			stmt = conn.createStatement();
			
			int i = stmt.executeUpdate(sql.toString());
			System.out.println(i + "개의 행이 변경되었습니다.");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try { if(stmt != null) stmt.close();} catch(SQLException e) {}
			try { if(conn != null) conn.close();} catch(SQLException e) {}
		}
	}

}
