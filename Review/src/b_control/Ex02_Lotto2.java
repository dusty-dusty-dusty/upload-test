package b_control;
import java.util.Arrays;

public class Ex02_Lotto2 {

	public static void main(String[] args) {
		
		int [][]lotto = new int[5][6];
		
		//로또번호 생성
		for (int a=0; a<lotto.length; a++) {
			for(int j=0; j<lotto[a].length; j++) {
				lotto[a][j] = (int)(Math.random() *45)+1;
			}
		}
		
		for(int i=0; i<lotto.length; i++) {
			Arrays.sort(lotto[i]);
		}
		
		
		//출력
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<lotto[i].length; j++) {
				System.out.print(lotto[i][j]+"/");
			}
			System.out.println();
		}
	}
}
