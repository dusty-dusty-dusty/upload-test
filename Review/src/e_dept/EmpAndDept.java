package e_dept;

import java.sql.*;

/*
 * 부서번호가 20번인 사원의 사번, 이름, 업무, 월급, 입사일 출력
 */



public class EmpAndDept {
	
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
				/*
				 * [해당 사원의 정보를 검색]
				 */
				//int buseo = 20;
				String sql = "SELECT d.dname dname   "
			               + "         ,e.empno empno   "
			               + "         ,e.ename ename   "
			               + "         ,e.job job      "
			               + "         ,e.sal sal      "
			               + "         ,e.hiredate hiredate"
			               + " FROM  emp e INNER JOIN dept d "
			               + " ON    e.DEPTNO = d.DEPTNO "
			               + " WHERE d.dname = 'RESEARCH' ";
						
				//String sql = "SELECT WHERE sabun=7900";
				
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
					System.out.print(	rs.getInt("SAL")		+"/");
					System.out.println(	rs.getString("HIREDATE") + "내가 이겼다");
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