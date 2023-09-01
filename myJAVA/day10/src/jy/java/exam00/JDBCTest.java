package jy.java.exam00;

import java.sql.*;
import java.util.Scanner;

public class JDBCTest {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");		//.newInstance 가 생략되어있음. 근데 포함되어있어서 또 쓰면 에러
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로딩 실패");
		}
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "mytest", "mytest");
			System.out.println("데이터베이스 연결 성공");
		} catch(SQLException sqle) {
			System.err.println("데이터베이스 연결 실패");
		}
		
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//정적 쿼리 4,5
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from mytable");
			
			//동적 쿼리 4,5
//			Scanner scan = new Scanner(System.in);
//			System.out.print("몇 살 이상 검색 > ");
//			int inputAge = scan.nextInt();
//			
//			pstmt = conn.prepareStatement("select * from mytable where age > ?");
//			pstmt.setInt(1, inputAge);
//			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int num = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt("age");
				String address = rs.getString("address");
				java.sql.Date date = rs.getDate("birth");		// 자바에서는 계산이 안되고 db에서 계산을 해서 가져와야함.
				java.util.Date d = new java.util.Date(date.getTime());	// db에서 받아서 자바에서 계산하려면 util의 date로 바꿔야함.
				System.out.println(num + "\t" + name + "\t" + age + "\t" + address + "\t"
						+ date.toString() + "\t" + d.toString());
			}
			
		} catch(SQLException sqle) {
			System.out.println("쿼리문이 오류일 가능성이 높다");
			sqle.printStackTrace();
		} finally {
			try {if(rs != null) rs.close(); }catch(SQLException sqle) {}
			try {if(stmt != null) stmt.close(); }catch(SQLException sqle) {}
//			try {if(pstmt != null) rs.close(); }catch(SQLException sqle) {}
			try {if(conn != null) conn.close(); }catch(SQLException sqle) {}
		}
	}

}
