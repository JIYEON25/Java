package jy.java.exam01;

import java.sql.*;

public class JdbcEx01 {				//insert

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/XEPDB1","mytest","mytest");
			stmt = conn.createStatement();
			
			StringBuffer sql = new StringBuffer();
			sql.append("insert into department ");
			sql.append("values (203,'제어계측공학과', 200, '7호관')");
			
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result + " 개의 행이 추가되었습니다.");
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
