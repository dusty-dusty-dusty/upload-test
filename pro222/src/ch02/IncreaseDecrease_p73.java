package ch02;

/*증감연산자(p73) ++, --
▶ 증가연산자(++) : 피연산자의 값을 1 증가시킨다.
▶ 감소연산자(--) : 피연산자의 값을 1 감소시킨다.

*전위형
	예) j = ++i;
	값이 참조되기 전에 증가시킨다
	
*후위형
	예) j = i++;
	값이 참조된 후에 증가시킨다.
*/
public class IncreaseDecrease_p73 {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;  //int z = 0;
		
		System.out.println("x=" + x);//10
		System.out.println("y=" + y);//10
		
		System.out.println("-----------------------");
		x++;//10
		++x;//12
		System.out.println("x1=" + x);	//12

		System.out.println("-----------------------");		
		y--;//10
		--y;//8
		System.out.println("y1=" + y);	//8

		System.out.println("-----------------------");		
		z = x++;  //z = 12
		System.out.println("z1=" + z);	//12
		System.out.println("x2=" + x);	//13
		
		System.out.println("-----------------------");		
		z = ++x; //++x의 결과는 14   //z = 14
		System.out.println("z2=" + z);	//14
		System.out.println("x3=" + x);	//14
		
		System.out.println("-----------------------");				
		z = ++x + y++;
		//++x  //15
		//y++  //8
		// +연산  //15+8
		// +연산의 결과를 z=23
		System.out.println("z3=" + z);	//23
		System.out.println("x4=" + x);	//15
		System.out.println("y2=" + y);	//9
	}
}

