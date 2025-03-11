package ch05;

public class Student01_main {
	public static void main(String[] args) {
		Student01 stu = new Student01();
		System.out.println("stu="+stu);
		 
		System.out.println("*Student 클래스의 필드초기값--------");
		System.out.println(stu.getfullname());
		System.out.println(stu.getsNo());
		System.out.println(stu.getgender());
		System.out.println(stu.getheight());
		System.out.println(stu.getage());
		System.out.println(stu.getisForeigner());
		
		
		//student 클래스의 setter 호풀
		stu.setfullname("김주현");
		stu.setsNo("21509019");
		stu.setgender('M');
		stu.setheight(175.2);
		stu.setage(30);
		stu.setisForeigner(true);
		
		
		System.out.println("*Student 클래스의 필드초기값--------");
		System.out.println(stu.getfullname());
		System.out.println(stu.getsNo());
		System.out.println(stu.getgender());
		System.out.println(stu.getheight());
		System.out.println(stu.getage());
		System.out.println(stu.getisForeigner());
		
		
		System.out.println("\n*Student 클래스의 필드값--------");
	}
}
