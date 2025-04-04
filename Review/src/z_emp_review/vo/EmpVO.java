package z_emp_review.vo;

public class EmpVO {
		//멤버변수
		//생성자 (인자 / 디폴트)
		//setter , getter
		//toString()
	
		private int sabun;		//사번 (empno)
		private String irum;	//사원명 (ename)
		private int wolgup;		//급여 (sal)
		private String upmu;	//업무 (job)
 		private int buseo;		//부서번호 (deptno)
 		
 		public EmpVO() {
 			
 		}
 		
 		
		public EmpVO(int sabun, String irum, int wolgup, String upmu, int buseo) {
			super();
			this.sabun = sabun;
			this.irum = irum;
			this.wolgup = wolgup;
			this.upmu = upmu;
			this.buseo = buseo;
		}


		@Override
		public String toString() {
			return "EmpVO [sabun=" + sabun + ", irum=" + irum + ", wolgup=" + wolgup + ", upmu=" + upmu + ", buseo="
					+ buseo + "]";
		}


		/**
		 * @return the sabun
		 */
		public int getSabun() {
			return sabun;
		}


		/**
		 * @param sabun the sabun to set
		 */
		public void setSabun(int sabun) {
			this.sabun = sabun;
		}


		/**
		 * @return the irum
		 */
		public String getIrum() {
			return irum;
		}


		/**
		 * @param irum the irum to set
		 */
		public void setIrum(String irum) {
			this.irum = irum;
		}


		/**
		 * @return the wolgup
		 */
		public int getWolgup() {
			return wolgup;
		}


		/**
		 * @param wolgup the wolgup to set
		 */
		public void setWolgup(int wolgup) {
			this.wolgup = wolgup;
		}


		/**
		 * @return the upmu
		 */
		public String getUpmu() {
			return upmu;
		}


		/**
		 * @param upmu the upmu to set
		 */
		public void setUpmu(String upmu) {
			this.upmu = upmu;
		}


		/**
		 * @return the buseo
		 */
		public int getBuseo() {
			return buseo;
		}


		/**
		 * @param buseo the buseo to set
		 */
		public void setBuseo(int buseo) {
			this.buseo = buseo;
		}
 		
 		
 		
}
/*
 * 데이타를 전송하는 객채
 * VO : value object
 * DTO : Data Tranfer Object
 */
	
	
