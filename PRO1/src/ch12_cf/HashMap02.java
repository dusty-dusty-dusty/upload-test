package ch12_cf;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ch07_array.Ex03;
import ch09.Computer292;

//Map - K,V의 한 쌍
//Key - 중복허용x( hashCode()-> 키값이 다르면 서로 다른키)
//					       ->      동일하면 -> equals()->같으면 =>같은 키다!
//													 ->다르면 =>다른 키다!	
//Value-중복허용
public class HashMap02 {

	public static void main(String[] args) {
		//클래스 참조변수 = new 클래스();
		//HashMap map = new HashMap();
		
		//부모클래스 참조변수 = new 자식클래스();
		//Object map = new HashMap();
		
		//인터페이스 참조변수 = new 구현클래스();
		//Map<String,Member01> map = new Hashtable<String,Member01>();
		Map<String,Member01> map = new HashMap<String,Member01>();
		
		//HashMap<String,Member01> map = new HashMap<String,Member01>();
		//저장된 개수확인
		System.out.println("size()="+map.size());//0

		//다양한 타입을 put(Object Key,Object value)
		//key가 중복되면 나중 키값으로 덮어진다
		//값은 중복되어도 된다
		//map.put("m",new Ex03()); //put(String,Ex03)이므로 믄제발생
		//The method put(String, Member01) in the type HashMap<String,Member01> is not applicable for the arguments (String, Ex03)
		map.put("m001",new Member01(1,"세종대왕",30)); //put(String,Member01)
		map.put("m002",new Member01(2,"이순신",35));
		map.put("m003",new Member01(3,"김9",40));
		map.put("m004",new Member01(4,"유관순",15));
		map.put("m005",new Member01(5,"현빈",60));
		map.put("m006",new Member01(5,"현빈",60));
		map.put("m001",new Member01(7,"현빈6",16));
		
		System.out.println("\n-for문이용하여 모든 요소꺼내기(p458 29~34참고)------------------");
		//Set keySet(): 모든 키가 저장된 Set반환 => 모든 key가져오기
		/* 아래 2줄을 한 줄로 줄일 수 있다
		Set keys = map.keySet(); //모든 key가져오기 
		Iterator iter = keys.iterator();//한 개의 key가져오기*/
		
		Iterator iter = map.keySet().iterator();//p458 29참고
		while(iter.hasNext()) {
			Object key = iter.next();
			//System.out.println(key); //가져온 한 개의 key출력
			
			Object value = map.get(key);
			//System.out.println("map.get(key)="+value); //value 출력
			
			System.out.println(key+"="+value); //key=value 출력
		}
		System.out.println("\n-get(Object Key): 검색------------------");
		//Member01 get(Object Key): 검색
		Member01 m = map.get("m004");
		System.out.println("m.getName()="+m.getName());//유관순
		

		System.out.println("\n-get(Object Key): 검색------------------");
		//Object get(Object Key): 검색
		Object o = map.get("m004");
		System.out.println("map.get(\"m004\")="+o);    //Member01 [mNo=4, name=유관순, age=15]
		m = (Member01)map.get("m004");
		System.out.println("m.getName()="+m.getName());//유관순

		
		//저장된 개수확인
		System.out.println("\nsize()="+map.size());//


	}

}
