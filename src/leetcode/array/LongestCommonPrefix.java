package leetcode.array;

/**
 * 
* Copyright: Copyright (c) 2018 LanRu-Caifu
* 
* @Description: 最长公前缀解答
*	输入: ["flower","flow","flight"]
          输出: "fl"
* @version: v1.0.0
* @author: 持剑的龙套
* @date: 2018年10月8日 上午9:43:30 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年10月8日     持剑的龙套           v1.0.0               修改原因
 */
public class LongestCommonPrefix {

	public static void main(String[] args) {
		//输入: ["flower","flow","flight"]
		//输出: "fl"
		String[] s = {"fower","flow","light"};
		String longestCommonPrefix = longestCommonPrefix(s);
		System.out.println(longestCommonPrefix);
	}
    
	public static  String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
            return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }

        return prefix;
    }
	
}
