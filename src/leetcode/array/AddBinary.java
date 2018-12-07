package leetcode.array;

import org.junit.Test;

public class AddBinary {


	/**
	 * 
	* @Description: 二进制相加
	*输入: a = "11", b = "1"
             输出: "100"
	* @version: v1.0.0
	* @date: 2018年9月30日 上午7:42:40
	 */
	@Test
	public void addBi() {
		String a = "1";
		String b = "111";
		//从末尾开始加
		
		StringBuilder sb = new StringBuilder();
		char[] aarray = a.toCharArray();
		char[] barray = b.toCharArray();
		int max = Math.max(aarray.length, barray.length);
		int carry = 0;
		for (int i = 0; i < max; i++) {
			//System.out.println(i);
			int addupa = aarray.length > i ? a.charAt(a.length()-1-i) -'0' : 0;
			int addupb = barray.length > i ? b.charAt(b.length()-1-i) -'0' : 0;
			sb.insert(0, (addupa+addupb+carry)%2);
			carry = addupa+addupb+carry > 1 ?  1 : 0;
		}
		if (carry==1) {
			sb.insert(0, 1);
		}
		System.out.println(sb.toString());
	}
	
	
   /* public static String addBinary(String a, String b) {
    	char[] charArray = a.toCharArray();
    	char[] charArray1 = b.toCharArray();
    	StringBuilder sb = new StringBuilder();
    	int max = Math.max(a.length(), b.length());
    	int catty = 0;
    	for (int i = 0; i < max; i++) {
    		int tempa =  a.length() > i ? a.charAt(a.length() - 1- i)-'0':0;
    		int tempb =  b.length() > i ? b.charAt(b.length()- 1 -i)-'0':0;
    		sb.insert(0, (tempa + tempb + catty) % 2);
    		catty = tempa + tempb + catty > 1 ? 1 : 0;
		}
    	if (catty == 1) {
    		sb.insert(0, 1);
    	}
        return sb.toString();
    }*/
}
