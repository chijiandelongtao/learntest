package leetcode.array;

import org.junit.Test;

public class RemoveDuplicates {

	@Test
	public void test() {
		int[] a =  new int[]{1,2,3,3,3,34};
		System.out.println(removeDuplicates(a));
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	    public static int removeDuplicates(int[] nums) {
	        if(nums==null||nums.length==0){
	            return 0;
	        }
	       int cur=0;
	        for(int pre=0;pre<nums.length;pre++){
	            if(nums[cur]!=nums[pre]){
	                cur++;
	                nums[cur]=nums[pre];
	            }
	        }
	        return ++cur;
	    
	}

}
