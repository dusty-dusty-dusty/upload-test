package e_dept;
/*
	부서번호: 50
	부서명:	IT
	부서위치 :	신촌
	
	위의 정보를 부서테이블에 입력하기

*/

import java.sql.*;

public class DeptInsert {
	
	//0. JDBC 필요한 변수 선언
	static String driver ="oracle.jdbc.driver.OracleDriver";
	static String url    ="jdbc:oracle:thin:@127.0.0.87:1521:xe";
	static String user   ="scott";
	static String pass   ="tiger";
	
	public static void main(String[] args) {
	
	Connection con = null;
	PreparedStatement ps =null;
	try {
	
		//1.드라이버를 메모리 로딩
		Class.forName(driver);
		
		//2. 연결객채 얻어오기
		con = DriverManager.getConnection(url, user, pass);
		System.out.println("연결성공");
		
		//3. sql 문장
		int dno = 70;
		String dname = "It";
		String loc ="산본";
		
		String sql = "INSERT "
				+ " INTO dept (deptno, dname, loc) "
				+ " VALUES(?,?,?)";
		//4. 전송객체 
		ps = con.prepareStatement(sql);
		ps.setInt( 1, dno);
		ps.setString( 2, dname);
		ps.setString( 3, loc);
		
		
		//5. 전송
		int result = ps.executeUpdate();
		System.out.println(result+"행을 수행하였습니다.내가 또 이겻다");
		
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
