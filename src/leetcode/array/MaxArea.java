package leetcode.array;

import org.junit.Test;

/**
 * 
* Copyright: Copyright (c) 2018 LanRu-Caifu
* 
* @Description: 盛最多水的容器
*
* @version: v1.0.0
* @author: 持剑的龙套
* @date: 2018年10月25日 上午7:28:58 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年10月25日     持剑的龙套           v1.0.0               修改原因
 */
public class MaxArea {

	@Test
	public void test() {
		int[] array = new int[] {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(array));
	}
	
	/**
	 * 
	* @Description: 输入: [1,8,6,2,5,4,8,3,7]
                                                       输出: 49
	*
	* @version: v1.0.0
	* @date: 2018年10月25日 上午7:29:17
	 */
    public int maxArea(int[] height) {
    	if (height.length == 0) {
    		return 0;
    	}
        int maxLength = height.length -1;
        int minLength = 0;
        int area = 0;
        while (minLength<maxLength) {
			int temp = Math.min(height[minLength], height[maxLength]) * (maxLength - minLength);
			if (temp > area) {
				area = temp;
			}
			if (height[minLength] < height[maxLength]) {
				minLength++;
			} else {
				maxLength --;
			}
		}
        return area;
    }
}
