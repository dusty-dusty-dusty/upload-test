package ch07_array;

import java.util.Arrays;

//배열의 복사p218 
/*깊은 복사(Deep Copy)    : 값복사
 *=>예> System.arraycopy(), clone()
 *=>원본의 값이 변경되어도 사본의 값은 변경x. why?주소가 다르다
 * 
 *얕은 복사(Shallow Copy) : 주소복사
 *=>원본의 값이 변경되면 사본의 값도 변경된다. why?주소가 동일하다


 *Arrays : java.util패키지에 있는 Arrays클래스
 			배열과 관련한 여러 편리한 기능을 제공
 			예)Arrays.toString(배열명) : 배열의 값을 문자열로 제공
 */
public class ArrayCopy_p218{

	public static void main(String[] args) {
		int[] originArr = new int[]{11,12,13};
		int[] arr2 = new int[10];
		
		System.out.println("originArr="+originArr); //[I@3d012ddd
		System.out.println("arr2="+arr2);           //[I@626b2d4a
		System.out.println("arr2.toString()="+arr2.toString());//[I@626b2d4a
		
		//깊은 복사(Deep Copy) : 값복사 clone()
		int[] deepCopyArr1 = originArr.clone();
		System.out.println("deepCopyArr1="+deepCopyArr1);//[I@5e91993f
		System.out.println("Arrays.toString(deepCopyArr1)="+Arrays.toString(deepCopyArr1));

		
		//------------------------------------------------
		originArr[0]=11111;
		System.out.println("\n\n-원본originArr------------");
		for(int temp:originArr) {
			System.out.printf("%4d",temp);
		}
		
		System.out.println("\n\n-arr2------------");
		for(int temp:arr2) {
			System.out.printf("%4d",temp);
		}
		
		/*Parameters:
		 * src-the source array. 복사할 배열(->원본배열)
		 * srcPos-starting position in the source array.복사할 첫 위치(->원본배열에서 복사할 시작index번호)
		 * dest-the destination array.대상배열(->새 배열)
		 * destPos-starting position in the destination data.붙여 넣을 첫 위치(새 배열의 붙여넣기 할 시작index번호)
		 * length-the number of array elements to be copied.복사할 요소 개수(원본배열에서 복사할 개수)
		 *arraycopy(originArr, 0, arr2, 1, 3)
		 *원본배열originArr의 0번째부터 3개를 복사하여
		 *새 배열arr2의 1번부터 붙여넣기
		 *결과는=>  0   11   12   13   0   0   0   0   0   0
		 *
		 *arraycopy(originArr, 0, arr2, 0, 2)
		 *결과는=>  11   12   0   0   0   0   0   0   0   0 
		 *
		 *arraycopy(originArr, 0, arr2, 6, 3)
		 *결과는=>   0   0   0   0   0   0   11   12   13  0 */
//		System.arraycopy(originArr, 0, arr2, 1, 3);
//		System.arraycopy(originArr, 0, arr2, 0, 2);  //11  12   0   0   0   0   0   0   0   0
//		System.arraycopy(originArr, 0, arr2, 6, 3);  //0   0   0   0   0   0  11  12  13   0
		System.arraycopy(originArr, 1, arr2, 7, 2);  //0   0   0   0   0   0   0  12  13   0
		System.out.println("\n\n-arraycopy후의 arr2------------");
		for(int temp:arr2) {
			System.out.printf("%4d",temp);
		}
	}

}
