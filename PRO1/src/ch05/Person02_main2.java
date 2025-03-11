package ch05;

public class Person02_main2 {

	public static void main(String[] args) {
		// Person02클래스의 객체생성
		// 객체 생성 할 때 마다 서로 다른 heap영역의 주소에 위치
		Person02 p1 = new Person02();  		//ch05.Person02@626b2d4a
		//Person02 p2 = new Person02("유관순"); //ch05.Person02@5e91993f
		//Person02 p3 = new Person02(150.9);  //ch05.Person02@1c4af82c
		//Person02 p4 = new Person02(14);		//ch05.Person02@379619aa
		
		//객체생성시 다수개의 data를 제시하여 생성자를 통한  field값을 설정하고자 한다.
		Person02 p2 = new Person02("유관순", 150.9); 
		Person02 p3 = new Person02("김구", 180.8, 45); 
		//Person02 p3 = new Person02("김구",180.8, 45);
		
		//System.out.println("p1.toString() ="+p1.toString());//
		System.out.println("p2.toString() ="+p2.toString());//
		
		System.out.println("p2="+p2);//
		System.out.println("p3="+p3);//
		
		//System.out.println("p1 ="+p1);
		System.out.println("p2.hashCode() ="+p2.hashCode());//
		System.out.println("p3.hashCode() ="+p3.hashCode());//
		//System.out.println("p1.toString() ="+p1.toString());//
		//System.out.println("p2.toString() ="+p2.toString());//
		//System.out.println("p3 ="+p3);//
		//System.out.println("p4 ="+p4);//
		
	}

}
