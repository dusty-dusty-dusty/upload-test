/*여러줄 
 * 주석문
 * 
 */
package testPack;

public class Hi {

	public static void main(String[] args) {
		String[] psGames = new String[6];
		
		psGames[0] = "God of War";  
		psGames[1] = "The Last of Us";  
		psGames[2] = "Spider-Man";  
		psGames[3] = "Final Fantasy";  
		psGames[4] = "Horizon Zero Dawn";  
		psGames[5] = "Elden ring";  
		
		System.out.println("짱재밋는 " + psGames[5]); //배열에서 게임 꺼내기
		System.out.println("CD 랙 크기"+psGames.length);
		
//		for (int i=0; i<=5; i++) {
//			System.out.println("CD 보관함"+i+"번 슬롯"+psGames[i]);
//			} 
		for(int i=0; i<=5; i++) {
			System.out.println("dd+i");
		}
		
		
		for(int d=0; d<=5; d++) {
			System.out.println(d);
		}
		
		for(int q=1; q>=10; q++) {
			System.out.println(q);
		}
		
		
		
		
	}
}