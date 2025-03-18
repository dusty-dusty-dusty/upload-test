package ch12_cf;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Map - K,V의 한 쌍
//Key - 중복허용x( hashCode()-> 키값이 다르면 서로 다른키)
//					       ->      동일하면 -> equals()->같으면 =>같은 키다!
//													 ->다르면 =>다른 키다!	
//Value-중복허용
public class HashMap01_p457 {

	public static void main(String[] args) {
		//클래스 참조변수 = new 클래스();
		//HashMap map = new HashMap();
		
		//부모클래스 참조변수 = new 자식클래스();
		//Object map = new HashMap();
		
		//인터페이스 참조변수 = new 구현클래스();
		Map map = new HashMap();
		
		
		//저장된 개수확인
		System.out.println("size()="+map.size());//0

		//다양한 타입을 put(Object Key,Object value)
		//key가 중복되면 나중 키값으로 덮어진다
		//값은 중복되어도 된다
		map.put(1,"문자열"); //put(Integer,String)
		map.put(2,new String("wellcome")); //put(Integer,String)
		map.put(3.14,"문자열"); //put(Double,String)
		map.put('A',new int[5]); //put(Character,int배열)
		
		System.out.println("\n-for문이용하여 모든 요소꺼내기(p458 29~34참고)------------------");
		//Set keySet(): 모든 키가 저장된 Set반환 => 모든 key가져오기
		/* 아래 2줄을 한 줄로 줄일 수 있다
		Set keys = map.keySet(); //모든 key가져오기  //1,2,3.14, 'A'
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
		//Object get(Object Key): 검색
		Object o = map.get(1);
		System.out.println("map.get(1)="+o);//문자열
		
		o = map.get(3.14);
		System.out.println("map.get(3.14)="+o);//문자열
		
		o = map.get('A');
		System.out.println("map.get('A')="+o);//[I@626b2d4a
		
		//삭제
		map.remove('A'); // key가 'A'인 객체를 삭제
		
		//저장된 개수확인
		System.out.println("\n삭제후 size()="+map.size());//3
		System.out.println("삭제된 map.get('A')꺼내기="+map.get('A'));//null

	}

}
