package z_jfreechart;

import java.sql.*;
import java.util.*;

public class Database {

	String DRIVER 	= "oracle.jdbc.driver.OracleDriver";
	String URL 		= "jdbc:oracle:thin:@127.0.0.87:1521:xe";
	String USER 	= "scott";
	String PASS 	= "tiger";

	public ArrayList<ArrayList> getData() {

		ArrayList<ArrayList> data = new ArrayList<ArrayList>();
		try{
			Class.forName(DRIVER);
			Connection con = DriverManager.getConnection(URL, USER , PASS);	
			
			//***************************************************************
			String sql = "SELECT round(avg(SAL)) AS sal, nvl(JOB,'인턴') AS ename"
					+ " FROM EMP"
					+ " GROUP BY job";
			
			
			//***************************************************************
			
			PreparedStatement stmt = con.prepareStatement( sql );	

			ResultSet rset = stmt.executeQuery();

			
			while( rset.next() ){
				ArrayList temp = new ArrayList();
				temp.add( rset.getInt("sal"));				//****************
				temp.add( rset.getString("ename"));		//****************		
				data.add(temp);
			}
			rset.close();
			stmt.close();
			con.close();
		} catch(Exception ex){
			System.out.println("에러 : " + ex.getMessage() );
		}
		return data;
	}
}
