package leetcode.array;

public class add1 {

	//private  int a = 0;
	
	public static void main(String[] args) {
		int[] array = {1,2,3,9};
		int[] plusOne = plusOne(array);
		
		for (int i : plusOne) {
			System.out.println(i);
		}
	}
	
	 /**
	  * 
	 * @Description: 将数组中的元素+1 返回新的数组
	 *
	 * @param:数组
	 * @return：数组
	 * @throws：无
	 *
	 * @version: v1.0.0
	 * @date: 2018年9月24日 下午5:22:42
	  */
	 public static int[] plusOne(int[] digits) {
		 int length = digits.length;
		 for (int i = length-1; i >=0 ; i--) {
			if (digits[i] < 9) {
				digits[i] ++;
				return digits;
			}
			digits[i] = 0;
			//digits[--i]++;
		}
		int[] result = new int[length+1];
		result[0] = 1;
		return result;
     }

}
