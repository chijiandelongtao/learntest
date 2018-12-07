package leetcode.array;

/**
 * 
* Copyright: Copyright (c) 2018 LanRu-Caifu
* 
* @Description: 数组中心索引
*               我们是这样定义数组中心索引的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。
* @version: v1.0.0
* @author: 持剑的龙套
* @date: 2018年9月21日 下午10:50:40 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年9月21日     持剑的龙套           v1.0.0               修改原因
 */
public class ArrayCentralIndex {

	public static void main(String[] args) {
		/*int[] nums = {1,2,3,4,6,7,3};*/
		/*int[] nums = {1, 7, 3, 6, 5, 6};*/
		int[] nums = {-1,-1,-1,0,1,1};
		System.out.println(pivotIndex(nums));
	}
	
	/**
	 * 
	* @Description: 先算出总数，然后从左往后加，到总数一半时停止
	*
	* @param:描述1描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @date: 2018年9月21日 下午10:59:17
	 */
    public  static int pivotIndex(int[] nums) {
        int sum = 0;
        int sumLeft = 0;
        int sumRight = 0;
        
        //求出数组总和;
        for (int i : nums) {
        	sum += i;
		}
        
        for (int i = 0; i < nums.length; i++) {
        	
        	if (i == 0) {
        		sumLeft = 0;
        	} else {
        		sumLeft  += nums[i-1];
        		
        	}
        	sumRight = sum - sumLeft - nums[i];
    		if (sumLeft == sumRight) {
    			return i;
    		}
        	/*if (i == nums.length-1) {
        		return -1;
        	}
        	if (i == 0) {
        		sumLeft = 0;
        	} else {
        		sumLeft += nums[i];
    			sumRight = sum - sumLeft - nums[i+1];
    			if (sumLeft  == sumRight) {
    				return i+1;
    			}
        	}*/
		
		}
    	
    	return -1;
    }
}
