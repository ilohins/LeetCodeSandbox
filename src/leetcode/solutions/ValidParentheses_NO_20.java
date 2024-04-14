package leetcode.solutions;

import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses_NO_20 {
    public boolean isValid(String s) {
    	
    	if(s == null || s.length() == 0 || s.length() % 2 != 0) {
    		return false;
    	}
    	
    	Stack<Character> possiblyNested = new Stack<Character>();
    	
    	char chars[] = s.toCharArray();
    	
    	int i = 0;
    	while(i < chars.length) {
    		
    		char pairChar;
    		boolean isClosing = false;
    		
    		switch (chars[i]) {
			case '{': {
				pairChar = '}';
				break;
			}
			case '[': {
				pairChar = ']';
				break;
			}
			case '(': {
				pairChar = ')';
				break;
			}
			case '}': {
				pairChar = '{';
				isClosing = true;
				break;
			}
			case ']': {
				pairChar = '[';
				isClosing = true;
				break;
			}
			case ')': {
				pairChar = '(';
				isClosing = true;
				break;
			}
			default:
				return false;
    		}
    		
    		if(isClosing) {
    			if(possiblyNested.size() == 0) {
    				return false;
    			}
    			char lastOpened = possiblyNested.pop();
    			if(lastOpened == pairChar) {
    				i = i + 1;
    			} else {
    				return false;
    			}
    		} else {
    			if(i + 1 == s.length()) {
    				return false;
    			} else if(pairChar != chars[i+1]) {
	    			possiblyNested.push(chars[i]);
	    			i = i + 1;
	    		} else {
	    			i = i + 2;
	    		}
    		}
    		
    	
    	}
    	
    	if(possiblyNested.size() > 0) {
    		System.out.println(Arrays.toString(possiblyNested.toArray()));
    		return false;
    	}
    	
    	return true;
        
    }
    
    public static void main(String[] args) {
		ValidParentheses_NO_20 s = new ValidParentheses_NO_20();
		
		System.out.println(s.isValid("{}"));
		System.out.println(s.isValid("{}[]"));
		System.out.println(s.isValid("{}()[]"));
		System.out.println(s.isValid("[{}()]"));
		System.out.println(s.isValid("[{}[()]()]"));
		System.out.println(s.isValid("{}{"));
		System.out.println(s.isValid("{}}"));
		System.out.println(s.isValid("{"));
		System.out.println(s.isValid("(]"));
		System.out.println(s.isValid(""));
		System.out.println(s.isValid(null));
		System.out.println(s.isValid("(("));
		System.out.println(s.isValid("}("));

	}
}