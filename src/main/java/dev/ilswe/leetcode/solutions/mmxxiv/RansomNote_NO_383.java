package dev.ilswe.leetcode.solutions.mmxxiv;

public class RansomNote_NO_383 { 
	
	public boolean canConstruct_SLOW(String ransomNote, String magazine) {
		
		String magazineCopy = magazine;
			
		for(char character : ransomNote.toCharArray()) {
			int idx = magazineCopy.indexOf(character);
			if(idx >= 0) {
				magazineCopy = magazineCopy.replaceFirst(String.valueOf(character), "");
			} else {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean canConstruct_BetterButSlow(String ransomNote, String magazine) {
		
		if (ransomNote.length() > magazine.length()) {
			return false;
		}
		
		boolean[] usedChars = new boolean[magazine.length()];
			
		for(char character : ransomNote.toCharArray()) {
			int idx = 0;
			
			do {

				idx = magazine.indexOf(character, idx);
				
				if(idx >= 0) {
					if (usedChars[idx] == false) {
						usedChars[idx] = true;
						idx = Integer.MAX_VALUE;
					} else {
						idx +=1;
					}
				} else {
					return false;
				}
			} while (idx != Integer.MAX_VALUE);
			
		}
		
		return true;
	}
	
	public boolean canConstruct(String ransomNote, String magazine) {
		
		int[] charCounter = new int[26]; //-97

		for (char ch : magazine.toCharArray()) {
			charCounter[((int)ch) - 97] = charCounter[((int)ch) - 97] + 1;
		}
		
		for(char randsChar : ransomNote.toCharArray()) {
			if(charCounter[((int)randsChar) - 97] <= 0) {
				return false;
			}
			
			charCounter[((int)randsChar) - 97] = charCounter[((int)randsChar) - 97] - 1;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		RansomNote_NO_383 s = new RansomNote_NO_383();
		
		System.out.println(s.canConstruct("aa", "ab"));
		System.out.println(s.canConstruct("a", "a"));
		System.out.println(s.canConstruct("a", "b"));
		System.out.println(s.canConstruct("aaaaa", "abaa"));
		System.out.println(s.canConstruct("aaaaa", "aaabaa"));
		System.out.println(s.canConstruct("ba", "ab"));
		System.out.println(s.canConstruct("aa", "ab"));
		System.out.println(s.canConstruct("aa", "ab"));
		System.out.println(s.canConstruct("aa", "ab"));
		System.out.println(s.canConstruct("aa", "ab"));
	}
}
