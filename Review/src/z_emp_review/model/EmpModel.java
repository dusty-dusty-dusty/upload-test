package z_emp_review.model;

import java.util.ArrayList;

import z_emp_review.vo.EmpVO;

public interface EmpModel {

	
	void insertEmp(EmpVO vo) throws Exception;
	
	int updateEmp(EmpVO vo)throws Exception;

	/*
	 * 메서드명	: selectAll
	 * 인	자	: 사원정보 리스트
	 * 리 턴 값	: 검색한 결과
	 * 역	할	: 테이블에 모든 사원정보 검색
	 */
	ArrayList<EmpVO> selectAll()throws Exception;

	//사번으로 검색
	/*
	 * 메서드명	: selectByEmpno
	 * 인	자	: 사번
	 * 리 턴 값	: 
	 * 역	할	: 해당하는 사번의 사원정보 검색
	 */
	EmpVO selectByEmpno(int sabun)throws Exception;

	//사번으로 검색해 삭제
	/*
	 * 메서드명	: deleteEmp
	 * 인	자	: 사번
	 * 리 턴 값	: 삭제된 사번 번호 
	 * 역	할	: 해당하는 사원 정보 삭제
	 */
	int deleteEmp(int sabun)throws Exception;

	

}