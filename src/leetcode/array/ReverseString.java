package leetcode.array;

import org.junit.Test;

/**
 * 
* Copyright: Copyright (c) 2018 LanRu-Caifu
* 
* @Description: 反转字符串
*
* @version: v1.0.0
* @author: 持剑的龙套
* @date: 2018年10月20日 下午2:31:24 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年10月20日     持剑的龙套           v1.0.0               修改原因
 */
public class ReverseString {

	@Test
	public void test() {
		System.out.println(reverseString("A man, a plan, a canal: Panama"));
	}
	
	/**
	 * 
	* @Description: 字符串换位
	*
	* @version: v1.0.0
	* @date: 2018年10月20日 下午2:45:24
	 */
	public String reverseString(String s) {
		char[] charArray = s.toCharArray();
		char[] newchar = new char[charArray.length];
		for (int i = 0; i <= charArray.length-1; i++) {
			System.out.println(i);
			newchar[newchar.length-i-1] = charArray[i];
		}
		s = String.valueOf(newchar);
		return s;
	}
}
