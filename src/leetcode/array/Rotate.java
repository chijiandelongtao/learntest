package leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * 
* Copyright: Copyright (c) 2018 LanRu-Caifu
* 
* @Description: 反转数组
*
* @version: v1.0.0
* @author: 持剑的龙套
* @date: 2018年10月14日 上午11:33:22 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年10月14日     持剑的龙套           v1.0.0               修改原因
 */
public class Rotate {

	@Test
	public void test() {
		Assert.assertArrayEquals(new int[]{7, 1, 2, 3, 4, 5, 6}, rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 1));
	}
		
	/**
	 * 
	* @Description: 采取反转的方法，先反转前n-k个元素，再反转后k个元素，然后再将整个数组反转，就能得到该数组旋转k个元素的结果了
	*
	* @param:int数组
	* @return:int数组
	* @throws:
	*
	* @version: v1.0.0
	* @date: 2018年10月14日 上午11:31:16
	 */
	public int[] rotate(int[] nums, int k) {
	    reverse(nums, 0, nums.length - 1 - k);
	    reverse(nums, nums.length - k, nums.length - 1);
	    reverse(nums, 0, nums.length - 1);
	    return nums;
	}

	private void reverse(int[] nums, int start, int end) {
	    while (start < end) {
	        int tmp = nums[start];
	        nums[start++] = nums[end];
	        nums[end--] = tmp;
	    }
	}
	
}
