package ch05;

public class Person03_main {
	public static void main(String[] args) {
		Person03 p1 = new Person03("홍길동3");
		System.out.println("p1="+p1);
		//Person02 [fullName=홍길동2, height=190.6, age=0]
		//Person02 [fullName=홍길동3, height=190.6, age=36]
	
		
		Person03 p2 = new Person03("allen",199.7, 25,true,"캐나다");
		System.out.println("p2="+p2);
	}
	
}
