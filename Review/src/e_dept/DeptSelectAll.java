package e_dept;

import java.sql.*;


/*
 * 부서테이블의 모든 정보를 콘솔에 출력하기
 */

public class DeptSelectAll {

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
					String sql = "SELECT * FROM emp";
					
					//4. 전송객체 
					PreparedStatement ps = con.prepareStatement(sql);
					//ps.setInt(1, buseo);
					
					//5. 전송
					ResultSet rs = ps.executeQuery();
					//[6. 결과 받아처리]
					
					while(rs.next()) {
						System.out.print(	rs.getInt("EMPNO")		+"/");
						System.out.print(	rs.getString("ENAME")	+"/");
						System.out.print(	rs.getString("JOB")		+"/");
						System.out.print(	rs.getInt("MGR")		+"/");
						System.out.print(	rs.getString("HIREDATE")+"/");
						System.out.print(	rs.getInt("SAL") 		+"/");
						System.out.print(	rs.getInt("COMM") 		+"/");
						System.out.println(	rs.getInt("DEPTNO") 	+"내가 또 이겼다");
					}
					
					
				}catch(Exception ex) {
					System.out.println("실패"+ex.getMessage());
					ex.printStackTrace();
				}finally {
					//7닫기
					try {con.close();} catch(Exception ex) {} 
				}
				
				

			}

		}