package leetcode.array;

import org.junit.Test;

import cn.hutool.core.lang.Console;

/**
 * 
* Copyright: Copyright (c) 2018 LanRu-Caifu
* 
* @Description: 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
*
* @version: v1.0.0
* @author: 持剑的龙套
* @date: 2018年10月20日 下午3:49:43 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年10月20日     持剑的龙套           v1.0.0               修改原因
 */
public class FirstUniqChar {
	@Test
	public void test() {
		//System.out.println("leetcode".contains(String.valueOf('l')));
		//Console.log(firstUniqChar("leetcode"));
		Console.log(firstUniqChar("loveleetcode"));
	}

	public int firstUniqChar(String x) {
		char[] charArray = x.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			int temp = 0;
			char charAt = charArray[i];
			for (int j = 0; j < charArray.length; j++) {
				if (charAt == charArray[j]) {
					temp+=1;
				}
			}
			if (temp==1) {
				return i;
			}
		}
		return -1;
	}
	
}
