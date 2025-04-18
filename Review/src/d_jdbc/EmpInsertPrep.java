package d_jdbc;

import java.sql.*;

/*
  	@ 전송객체 
 		- Statement				 : SQL 문장이 완벽한 경우
 		- PreparedStatement (***): SQL 문장이 미완성
 		- CallableStatement		 : 데이타베이스함수(function/proc)호출때
 		
 	@ 전송
 		-int excuteUpdate() : INSERT, DELETE, UPDATE
 		-ResultSet excuteQuery()  : SELECT
 */

public class EmpInsertPrep {
	
	//0. JDBC 필요한 변수 선언
	static String driver ="oracle.jdbc.driver.OracleDriver";
	static String url    ="jdbc:oracle:thin:@127.0.0.87:1521:xe";
	static String user   ="scott";
	static String pass   ="tiger";
	
	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps =null;
		try {
			//1. 드라이버 로딩
			Class.forName(driver);
			
			//2. 연결객체
			con = DriverManager.getConnection(url, user, pass);
			
			//3. sql 문장
			int 	sabun 	= 1312;
			String 	samyung 	= "테스트";
			int 	wolgub 	= 4500;
			String 	upmu 	= "IT";
			
			String sql = "INSERT "
					+ " INTO emp(empno, ename, sal, job) "
					+ " VALUES(?,?,?,?)";
			
			//4. 전송객체 
			ps = con.prepareStatement(sql);
			ps.setInt( 1, sabun);
			ps.setString( 2, samyung);
			ps.setInt( 3, wolgub);
			ps.setString( 4, upmu);
			
			//5. 전송
			//5. 전송
			int result = ps.executeUpdate(); // INSERT문은 이 메서드를 사용해야 함
			System.out.println(result + "행을 수행하였습니다.");
			
			//[6. 결과 받아처리]
			
		}catch(Exception ex) {
			System.out.println("실패"+ex.getMessage());
			ex.printStackTrace();
		}finally {
			//7닫기
			try {
				ps.close();
				con.close();
				} catch(Exception ex) {} 
		}
		
		

	}

}
