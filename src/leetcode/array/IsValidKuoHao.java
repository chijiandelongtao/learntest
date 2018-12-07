package leetcode.array;

import java.util.Stack;

import org.junit.Test;

/**
 * 
* Copyright: Copyright (c) 2018 LanRu-Caifu
* 
* @Description: 有效的括号
*
* @version: v1.0.0
* @author: 持剑的龙套
* @date: 2018年10月21日 下午8:05:13 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* 2018年10月21日     持剑的龙套           v1.0.0               修改原因
 */
public class IsValidKuoHao {

	@Test
	public void test() {
		System.out.println(isValid("()[]{}"));
	}
	
    public boolean isValid(String s) {
    	if (s.isEmpty())
            return true;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
    public void isValid() {
    	Stack<String> stack = new Stack<String>();
    	stack.push("c");
    	stack.push("d");
    	System.out.println(stack.pop());
    	System.out.println(stack.pop());
    	System.out.println(stack);
    }
    public boolean test(String s) {
    	if (s.isEmpty())
            return true;
    	Stack<Character> stack = new Stack<Character>();
    	for(char c : s.toCharArray()) {
    		if (c=='(') {
    			stack.push(')');
    		} else if (c=='{') {
    			stack.push('}');
    		} else if (c=='['){
    			stack.push('}');
    		} else if (stack.isEmpty() || stack.pop()!=c) {
    			return false;
    		}
    		
    	}
    	return stack.isEmpty();
    }
    
}
