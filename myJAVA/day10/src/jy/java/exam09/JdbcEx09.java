package jy.java.exam09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

import jy.java.common.ConnUtil;

public class JdbcEx09 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("sql 입력 > ");
		String sql = br.readLine();
		
		Connection con = ConnUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("컬럼의 갯수 : " + rsmd.getColumnCount());
		
		for(int i=1; i<rsmd.getColumnCount(); i++) {
			System.out.print(rsmd.getColumnName(i) + "\t");
		}
		System.out.println();
		
		for(int i=1; i<rsmd.getColumnCount(); i++) {
			System.out.print(rsmd.getColumnTypeName(i) + "\t");
		}
		System.out.println();
		
		int colCount = rsmd.getColumnCount();	//컬럼갯수
		while(rs.next()) {
			for(int i=1; i<=colCount; i++) {	// i = 컬럼번호
				int colType = rsmd.getColumnType(i);
				switch(colType) {
				case Types.NUMERIC:
					System.out.print(rs.getInt(i) + "\t");
					break;
				case Types.VARCHAR:
					System.out.print(rs.getString(i) + "\t");
					break;
				case Types.DATE:
					System.out.print(rs.getDate(i) + "\t");
					break;
				}
			}
			System.out.println();
		}
		br.close();
		rs.close();
		pstmt.close();
		con.close();
	}

}
