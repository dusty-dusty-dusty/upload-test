package z_emp_review.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import z_emp_review.vo.EmpVO;

public class EmpModelImpl implements EmpModel {
	//void가없어야 생성자함수 
	
	//0. JDBC 필요한 변수 선언
	static String driver ="oracle.jdbc.driver.OracleDriver";
	static String url    ="jdbc:oracle:thin:@127.0.0.87:1521:xe";
	static String user   ="scott";
	static String pass   ="tiger";
	
	public EmpModelImpl()throws Exception {
		//1.드라이버를 메모리 로딩
		Class.forName(driver);
	}
	/*
	 *  메서드명	: insertEmp
	 *  인	자	: 사원정보를 가진 EmpVO
	 *  		  (사번, 사원명, 월급, 부서, 업무)
	 *  리 턴 값	: 없음 (void)
	 *  역	할	: 사원정보를 넘겨받아 emp테이블에 입력
	 * 
	 */
	
	//메소드명 : insertEmp
	@Override
	public void insertEmp(EmpVO vo)throws Exception{
		Connection con = null;
		PreparedStatement ps =  null;
		try {
		//2. 연결객체 얻어오기
		con = DriverManager.getConnection(url, user, pass);
		
		String sql = "INSERT"
				+ "	INTO emp(empno, ename, job, sal, deptno)"
				+ "	VALUES(?,?,?,?,?)";
		//4. 전송객체 		
		ps = con.prepareStatement(sql);
		ps.setInt(1, vo.getSabun());
		ps.setString(2, vo.getIrum());
		ps.setString(3, vo.getUpmu());
		ps.setInt(4, vo.getWolgup());
		ps.setInt(5, vo.getBuseo());
		
		ps.executeUpdate();
		
	} finally {
		try {
			
			con.close();
			} catch(Exception ex) {} }
	}
	
	
	/*
	 * 메서드명	: updateEmp
	 * 인	자	: 사원정보를 가진 EmpVo
	 * 			(사번, 월급, 부서번호)
	 * 리 턴 값 	: 수정한 결과 행(레코드)수
	 * 역	할	: 해당하는 사번의 사원정보에서 업무와 부서번호를 동시에 수정
	 */
	
	@Override
	public int updateEmp(EmpVO vo) throws Exception{
		int result = 0;
		Connection con = null;
		PreparedStatement ps =  null;
		try {
		//2. 연결객체 얻어오기
		con = DriverManager.getConnection(url, user, pass);
		
		//3. SQL
		String sql = 	"UPDATE EMP"
				+ " SET job=?, deptno=? "
				+ " WHERE empno= ? ";		
		
		
		//4. 전송객체 		
		ps = con.prepareStatement(sql);
		ps.setString(1, vo.getUpmu());
		ps.setInt(2, vo.getBuseo());
		ps.setInt(3, vo.getSabun());
	
		
		result = ps.executeUpdate();
		return result;
		
	} finally {
		try {
			ps.close();			
			con.close();
			} catch(Exception ex) {}
		}  
				
	}
	
	
	
	
	/*
	 * 메서드명	: selectAll
	 * 인	자	: 사원정보 리스트
	 * 리 턴 값	: 검색한 결과
	 * 역	할	: 테이블에 모든 사원정보 검색
	 */
	@Override
	public ArrayList<EmpVO> selectAll()throws Exception {
		ArrayList<EmpVO> data = new ArrayList<EmpVO>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs =null;
		
		try {
			//2. 연결객체
			con = DriverManager.getConnection(url, user, pass);
			
			//3. SQL
			String sql = "SELECT empno, ename, job, deptno FROM emp";
			
			//4. 전송객체
			ps = con.prepareStatement(sql);
			
			//5. 전송
			rs = ps.executeQuery();
			//6. 결과처리
			while(rs.next()) {
				EmpVO vo = new EmpVO();
				vo.setSabun( rs.getInt("EMPNO"));
				vo.setIrum( rs.getString("ENAME"));
				vo.setUpmu( rs.getString("JOB"));
				vo.setBuseo( rs.getInt("DEPTNO"));
				
				data.add(vo);
				
			}
		} finally {
			try {
				rs.close();
				ps.close();			
				con.close();
			} catch(Exception ex) {}
			
		}
		
		return data;
}
	
	//사번으로 검색
	/*
	 * 메서드명	: selectByEmpno
	 * 인	자	: 사번
	 * 리 턴 값	: 
	 * 역	할	: 해당하는 사번의 사원정보 검색
	 */
	@Override
	public EmpVO selectByEmpno(int sabun) throws Exception {
	    EmpVO result = new EmpVO();

	    Connection con = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;

	    try {
	        // 1. 연결객체
	        con = DriverManager.getConnection(url, user, pass);

	        // 2. SQL 문장
	        String sql = "SELECT * FROM emp "
	        		+ " WHERE empno=?";

	        // 3. 전송객체
	        ps = con.prepareStatement(sql);
	        ps.setInt(1, sabun);

	        // 4. 전송
	        rs = ps.executeQuery();

	        // 5. 결과처리
	        if (rs.next()) {
	            result = new EmpVO();
	            result.setSabun(rs.getInt("EMPNO"));
	            result.setIrum(rs.getString("ENAME"));
	            result.setWolgup(rs.getInt("SAL"));
	            result.setUpmu(rs.getString("JOB"));
	            result.setBuseo(rs.getInt("DEPTNO"));
	        }
	        return result;
	    } finally {
	        try {
	        	rs.close();
				ps.close();			
				con.close();
			} catch(Exception ex) {}
			
		}
}

	
	
	
	//사번으로 검색해 삭제
	/*
	 * 메서드명	: deleteEmp
	 * 인	자	: 사번
	 * 리 턴 값	: 삭제된 사번 번호 
	 * 역	할	: 해당하는 사원 정보 삭제
	 */
	@Override
	public int deleteEmp(int sabun)throws Exception {
		int result = 0;
		Connection con = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;
	    
	    try {
	    	// 2. SQL 문장
	        String sql = "DELETE * FROM emp "
	        		+ " WHERE empno is null";

	        // 3. 전송객체
	        ps = con.prepareStatement(sql);
	        ps.setInt(1, sabun);
			  		
	} 	
}
