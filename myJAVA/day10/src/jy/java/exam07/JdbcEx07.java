package jy.java.exam07;

import java.sql.*;

import jy.java.common.ConnUtil;

public class JdbcEx07 {

	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		sql.append("select a.name, a.profno, a.position, b.dname ");
		sql.append("from professor a, department b ");
		sql.append("where a.deptno = b.deptno ");
		sql.append("and a.deptno = ? ");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 203);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getInt("profno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.print(rs.getString("position") + "\t");
			}	
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try { if(rs != null) rs.close();} catch(SQLException e) {}
			try { if(pstmt != null) pstmt.close();} catch(SQLException e) {}
			try { if(con != null) con.close();} catch(SQLException e) {}
		}
		
	}

}
