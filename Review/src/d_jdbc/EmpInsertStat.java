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

public class EmpInsertStat {
	
	//0. JDBC 필요한 변수 선언
	static String driver ="oracle.jdbc.driver.OracleDriver";
	static String url    ="jdbc:oracle:thin:@127.0.0.87:1521:xe";
	static String user   ="scott";
	static String pass   ="tiger";
	
	public static void main(String[] args) {
		
		Connection con = null;
		try {
			//1. 드라이버 로딩
			Class.forName(driver);
			
			//2. 연결객체
			con = DriverManager.getConnection(url, user, pass);
			
			//3. sql 문장
			int 	sabun 	= 1105;
			String 	samyung 	= "아무개";
			int 	wolgub 	= 4000;
			String 	upmu 	= "IT";
			
			String sql ="INSERT"
					+ " INTO emp(empno, ename, sal, job )"
					+ " VALUES("+sabun+",'"+samyung+"',"+wolgub+",'"+upmu+"')";
			
			//System.out.println("확인"+sql);
					
			//4. 전송객체 
			Statement ps = con.createStatement();
			
			
			//5. 전송
			ps.executeUpdate(sql);
			
			
			//[6. 결과 받아처리]
			
		}catch(Exception ex) {
			System.out.println("실패"+ex.getMessage());
			ex.printStackTrace();
		}finally {
			//7닫기
			try {con.close();} catch(Exception ex) {} 
		}
		
		

	}

}
