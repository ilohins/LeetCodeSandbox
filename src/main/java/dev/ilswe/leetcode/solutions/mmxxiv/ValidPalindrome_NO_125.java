package dev.ilswe.leetcode.solutions.mmxxiv;

public class ValidPalindrome_NO_125 {
    public boolean isPalindrome(String s) {
        String reduced = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        
        for(int i = 0, j = reduced.length()-1; i < j; i++, j--) {
        	if(reduced.charAt(i) != reduced.charAt(j)) {
        		return false;
        	}
        }
        
        return true;
    }
    
    public static void main(String[] args) {
		ValidPalindrome_NO_125 s = new ValidPalindrome_NO_125();
		System.out.println(s.isPalindrome(""));
	}
}
