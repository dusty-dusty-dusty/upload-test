package ch07_array;

//배열의 복사p218 
/*깊은 복사(Deep Copy)    : 값복사
 *=>예> System.arraycopy(), clone()
 *=>원본의 값이 변경되어도 사본의 값은 변경x. why?주소가 다르다
 * 
 *얕은 복사(Shallow Copy) : 주소복사
 *=>원본의 값이 변경되면 사본의 값도 변경된다. why?주소가 동일하다
 */

public class ArrayCopy02_p218 {

	
	static void test(int[] arr){
	//매개변수 int[] arr에는   main메서드에서 넘겨받은 배열주소가 저장된다ㅣ
		System.out.println("test(int[] arr): "+arr);
		for(int temp:arr) {
			System.out.printf("%4d",temp); //[I@3d012ddd
		}
		System.out.println();
		System.out.println();
		System.out.println();
	} 
	
	public static void main(String[] args) {

		int[] originArr = new int[]{11,12,13};
		test(originArr);
		
		//얕은 복사(Shallow Copy) : 주소복사
		int[] arr2 = originArr;
		
		System.out.println("originArr="+originArr); //[I@3d012ddd
		System.out.println("arr2="+arr2);           //[I@3d012ddd
		
		System.out.println("-원본originArr------------");
		for(int temp:originArr) {
			System.out.printf("%4d",temp);
		}
		
		originArr[0]=11111;
		System.out.println("\n\n-Arr------------");
		for(int temp:originArr) {
			System.out.printf("%4d",temp);
		}
		
		System.out.println("\n\n-arr2------------");
		for(int temp:arr2) {
			System.out.printf("%4d",temp);
		}
	}
}
