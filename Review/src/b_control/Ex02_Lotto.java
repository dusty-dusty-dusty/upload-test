package b_control;

public class Ex02_Lotto {

	public static void main(String[] args) {
		
		
		int [] lotto = new int [6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=(int)(Math.random() *45)+1;
					
					
			/*
			 * math.random() -> 0.0<=임의의 숫자< 1.0
			 * 
			 * (int)(math.random() *10)
			 * 
			 * 		  0.0009*10 =>0.009
			 * 		   0.888*10 =>8.88
			 * 	 	     0.5*10 =>5
			 */
		}
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+"/");
		}

	}

}
