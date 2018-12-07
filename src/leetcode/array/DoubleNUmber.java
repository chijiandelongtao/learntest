package leetcode.array;

public class DoubleNUmber {

	
	public static void main(String[] args) {
		
		int[] array = {3, 6, 1, 0};
		//int[] array = {0,0,2,3};
		/*int[] array = {0,0,0,1};*/
		System.out.println(dominantIndex(array));
	}
	
	 public static int dominantIndex(int[] nums) {
		    int max = 0;
		    int index = 0;
	        for (int i = 0; i < nums.length; i++) {
				 if (nums[i] > max) {
					 max = nums[i];
					 index = i;
				 }
			}
	        boolean flag = true;
	        for (int i = 0; i < nums.length; i++) {
	        	if (nums[i] == max) {
	        		continue;
	        	}
				if (max < nums[i]*2) {
					flag = false;
				}
			}
	        if (flag) {
	        	return index;
	        } else {
	        	return -1;
	        }
    }
}
