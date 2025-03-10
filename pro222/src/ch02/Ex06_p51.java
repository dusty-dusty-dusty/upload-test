package ch02;

//character(p51)
public class Ex06_p51 {

	public static void main(String[] args) {
		char c1 = 'a';
		System.out.println("char c1="+c1);//a
		int c11 = 'a';
		System.out.println("int c11="+c11);//97
		
		char c2 = 'A';
		System.out.println("char c2="+c2);//A
		int c22 = c2;    //int c22 = 'A';
		System.out.println("int c22="+c22);//65
		
		char c3 = '1';
		System.out.println("char c3="+c3);//1
		
		char c4 = '!';
		System.out.println("char c4="+c4);//!
		int c44 = c4;   //int c44 = '!';
		System.out.println("int c44="+c44);//33
	}

}
