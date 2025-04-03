package d_jdbc;

import java.sql.*;

public class EmpInsert {

	//0. JDBC 필요한 변수 선언
	static String driver ="oracle.jdbc.driver.OracleDriver";
	static String url    ="jdbc:oracle:thin:@127.0.0.87:1521:xe";
	static String user   ="scott";
	static String pass   ="tiger";
	
	public static void main(String[] args) {
		try {
			//1.드라이버를 메모리 로딩
			Class.forName(driver);
			
			//2. 연결객채 얻어오기
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("연결성공");
			
			//3.SQL 문자
//			String sql="UPDATE emp" //"UPDATE (테이블명)"
//					   +" SET ename='김주현'"
//					   + ",sal=50000"
//					   + ",job='IT'"
//		               +" WHERE empno=1111";  //"SET 뭐='어떻게' 뭐2='어떻게2' "
			
//			String sql="UPDATE emp"
//						+"	SET	comm = nvl(comm,0)+500 "
//						+"	WHERE DEPTNO=20	";
					
			String sql = "DELETE "
						+ " FROM emp "
						+ " WHERE job is null";
						
			
			
			//4.전송객체 얻어오기
			Statement ps = con.createStatement();
			//5.전송
			ps.executeUpdate(sql);
			//[6]결과처리
			//7.닫기
			ps.close();
			con.close();
			
			System.out.println("고생하셨습니다.");
			
		}catch(Exception ex) {
			System.out.println("실패:"+ ex.getMessage());
			//es.printStackTrace();
		}
	}

}
