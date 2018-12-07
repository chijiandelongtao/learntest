package leetcode.array;

/**
 * 
* Copyright: Copyright (c) 2018 LanRu-Caifu
* 
* @Description: 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
*
* @version: v1.0.0
* @author: 持剑的龙套
* @date: 2018年10月27日 上午8:35:42 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年10月27日     持剑的龙套           v1.0.0               修改原因
 */
public class Multiply {

	public static void main(String[] args) {
		System.out.println(testMultiply("202","30"));
	}
	
	public static String testMultiply(String num1,String num2)  {
		int m = num1.length(), n = num2.length();
	    int[] pos = new int[m + n];
	   
	    for(int i = m - 1; i >= 0; i--) {
	        for(int j = n - 1; j >= 0; j--) {
	            int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); 
	            int p1 = i + j, p2 = i + j + 1;
	            int sum = mul + pos[p2];

	            pos[p1] += sum / 10;
	            pos[p2] = (sum) % 10;
	        }
	    }  
	    
	    StringBuilder sb = new StringBuilder();
		for (int p : pos){
			if (!(sb.length() == 0 && p == 0)) {
				sb.append(p);
			}
		}
			
	    return sb.length() == 0 ? "0" : sb.toString();
	}
}
