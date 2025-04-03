package TEST;

public class T369 {

		public static void main(String[] args) { 
		
			int num = 33;
			int count = 0;
			
			for (int i=1; i<=num; i++) {
				for (char c : a.tochararray(i)) {
					if(c==3 || c==6|| c=9)
					System.out.println(i);
					count++;
				}else{
					System.out.println(i);
				}
			}System.out.println(count);
			
		}
}
