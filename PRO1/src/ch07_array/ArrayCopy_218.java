package ch07_array;

//배열의 복사p218 
/*깊은 복사(Deep Copy)    : 값복사
* => 예> System.arraycopy()
*얕은 복사(Shallow Copy) : 주소복사
*/

public class ArrayCopy_218 {

	public static void main(String[] args) {
		int[] originArr = new int[]{11,12,13};
		
		int[] arr2 = new int[10];
		System.out.println("-원본originArr------------");
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
		 *arraycopy(originArr,0, arr2, 0,2 )
		 *결과는=>  11   12   0   0   0   0   0   0   0   0 
		 *
		 *arraycopy(originArr,0 , arr2,1 ,3 )
		 *결과는=>   0   0   0   0   0   0   11   12   13  0 */
		System.arraycopy(originArr, 1, arr2, 7, 2);
		System.out.println("\n\n-arraycopy후의 arr2------------");
		for(int temp:arr2) {
			System.out.printf("%4d",temp);
		}
	}

}

