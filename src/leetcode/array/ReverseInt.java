package leetcode.array;

import org.junit.Test;

/**
 * 
* Copyright: Copyright (c) 2018 LanRu-Caifu
* 
* @Description: 反转整数
*
* @version: v1.0.0
* @author: 持剑的龙套
* @date: 2018年10月20日 下午3:01:16 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年10月20日     持剑的龙套           v1.0.0               修改原因
 */
public class ReverseInt {

	@Test
	public void test() {
		//System.out.println(-2147483648);
		//2147483647
		System.out.println(reverse1(-1112));
	}

	public int reverse(int x) {
		String s = String.valueOf(x);
		String stemp = "";
		
		if (x<0) {
			for (int i = 1; i < s.length(); i++) {
				stemp += s.charAt(s.length() - i);
			}
			stemp = "-"+stemp;
			if (Long.parseLong(stemp)<(long)(Integer.MIN_VALUE)) {
				return 0;
			}
		} else if (x >0 ) {
			for (int i = 0; i < s.length(); i++) {
				stemp += s.charAt(s.length()-1 - i);
			}
			if (Long.parseLong(stemp)>(long)(Integer.MAX_VALUE)) {
				return 0;
			}
		} else {
			return 0;
		}
		return Integer.parseInt(stemp);
	}
	
	@Test
	public void testArray() {
		String[] s = new String[3];
		String a = "aa";
		System.out.println(s.length);
		System.out.println(a.length());
	}
	
	//更优秀的解法
	private int reverse1(int x) {
		int result = 0;
        while(x != 0){
            int pop = x%10;
            x = x/10;
            
            long temp = pop+result*10L;
            if(temp > Integer.MAX_VALUE) return 0;
            if(temp < Integer.MIN_VALUE) return 0;
            result = (int)temp;
        }
        return result;
	}
}
