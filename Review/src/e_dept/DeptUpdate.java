package e_dept;

import java.sql.*;
/*
	부서번호: 50
	부서명:	개발
	부서위치 :	강남
	
	50번정보를 부서테이블에 입력하기

*/


public class DeptUpdate {
	
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
			
			//3. SQL 문장
			
			int dno = 50;
			String dname = "개발";
			String loc ="강남";
			
			String sql =
						"UPDATE DEPT"
					+ " SET dname=?, loc=? "
					+ " WHERE DEPTNO= ? ";			
			//4. 전송객체 
			ps = con.prepareStatement(sql);
			//sql문장의 ? 지정
			ps.setString( 1, dname);
			ps.setString( 2, loc);
			ps.setInt(3, dno);
			
			//5. 전송
			int result = ps.executeUpdate();
			System.out.println(result+"행을 수행하였습니다. 내가 또 이겼다 ㅅㅅ");
			
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
