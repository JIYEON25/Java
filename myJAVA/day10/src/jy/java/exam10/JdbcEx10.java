package jy.java.exam10;

import java.io.*;
import java.sql.*;
import java.util.Properties;

import jy.java.common.ConnUtil;

public class JdbcEx10 {			//properties를 이용해서 transaction 만들기

	public static void main(String[] args) throws IOException, SQLException {
		Properties pro = new Properties();
		pro.load(new FileInputStream("src/department.properties"));
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));
			pstmt.setInt(1, 100);
			pstmt.setString(2, "산업공학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "5호관");
			int i = pstmt.executeUpdate();
			System.out.println(i + "개의 행이 추가되었습니다.");
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {if(pstmt != null) pstmt.close();} catch(SQLException e) {}
			try {if(con != null) con.close();} catch(SQLException e) {}
		}
	}

}
