package dev.ilswe.leetcode.solutions.mmxxiv;

import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings_NO_205 {
	
	private final String SEPARATOR = "_";

	public boolean isIsomorphic(String s, String t) {

		HashSet<String> charPatterns = new HashSet<String>();

		// Step 1: build a hash of all character positions for each character for String
		// s and add it to the CharPatterns hash set
		StringBuilder[] charHash = new StringBuilder[127];

		for (int i = 0; i < s.length(); i++) {
			int chIdx = ((int) s.charAt(i));
			if (charHash[chIdx] == null) {
				charHash[chIdx] = new StringBuilder();
			}
			charHash[chIdx].append(i).append(SEPARATOR);
		}

		for (StringBuilder sb : charHash) {
			if (sb != null) {
				charPatterns.add(sb.toString());
			}
		}

		// Step 2: build a hash of all character positions for each character for String
		// t and remove it from the CharPatterns hash set. If hash removed successfully,
		// then it found the same pattern in the first string. Otherwise, string
		// structures
		// are different and strings are not isomorphic
		for (int i = 0; i < charHash.length; i++) {
			charHash[i] = null;
		}
		
		for (int i = 0; i < t.length(); i++) {
			int chIdx = ((int) t.charAt(i));
			if (charHash[chIdx] == null) {
				charHash[chIdx] = new StringBuilder();
			}
			charHash[chIdx].append(i).append(SEPARATOR);
		}

		for (StringBuilder sb : charHash) {
			if (sb != null) {
				if (!charPatterns.remove(sb.toString())) {
					return false;
				}
			}
		}

		return true;
	}

	public boolean isIsomorphic_slow_alot_of_memory(String s, String t) {

		HashSet<String> charPatterns = new HashSet<String>();

		// Step 1: build a hash of all character positions for each character for String
		// s and add it to the CharPatterns hash set
		HashMap<Character, String> charHash = new HashMap<Character, String>();

		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			String hash = charHash.get(ch);

			if (hash == null) {
				hash = EMPTY_STRING;
			}

			hash = hash + i + SEPARATOR;

			charHash.put(ch, hash);
		}

		charHash.values().forEach(charHashString -> {
			charPatterns.add(charHashString);
		});

		// Step 2: build a hash of all character positions for each character for String
		// t and remove it from the CharPatterns hash set. If hash removed successfully,
		// then it found the same pattern in the first string. Otherwise, string
		// structures
		// are different and strings are not isomorphic
		charHash.clear();

		for (int i = 0; i < t.length(); i++) {
			Character ch = t.charAt(i);
			String hash = charHash.get(ch);

			if (hash == null) {
				hash = EMPTY_STRING;
			}

			hash = hash + i + SEPARATOR;

			charHash.put(ch, hash);
		}

		for (String charHashString : charHash.values()) {

			if (!charPatterns.remove(charHashString)) {
				return false;
			}

		}

		return true;
	}
	
	private final String EMPTY_STRING = "";
	

	public static void main(String[] args) {
		IsomorphicStrings_NO_205 solution = new IsomorphicStrings_NO_205();

		{
			String s = "egg", t = "add";
			System.out.println("S: " + s + "; T: " + t + " RESULT: " + solution.isIsomorphic(s, t));
		}
		{
			String s = "foo", t = "bar";
			System.out.println("S: " + s + "; T: " + t + " RESULT: " + solution.isIsomorphic(s, t));
		}
		{
			String s = "paper", t = "title";
			System.out.println("S: " + s + "; T: " + t + " RESULT: " + solution.isIsomorphic(s, t));
		}
		{
			String s = "aaa", t = "ccc";
			System.out.println("S: " + s + "; T: " + t + " RESULT: " + solution.isIsomorphic(s, t));
		}
		{
			String s = "14", t = "34";
			System.out.println("S: " + s + "; T: " + t + " RESULT: " + solution.isIsomorphic(s, t));
		}
	}

}
