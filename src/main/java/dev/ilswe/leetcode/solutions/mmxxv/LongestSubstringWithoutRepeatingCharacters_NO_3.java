package dev.ilswe.leetcode.solutions.mmxxv;

import java.util.HashSet;

/*
 * Example: input = ababcdebc
 * 
 * 1) aba -> cap 2, move pointer to position 2 (after duplicated character)
 * 2) bab -> 2 is not greater than 2, move pointer to 3
 * 3) abcdeb -> cap 5, move pointer to 5
 * 4) cdebc -> 4 < 5, move pointer to 6
 * 5) debc end of string reached, 4 < 5
 * return 5
 * 
 * 
 */
public class LongestSubstringWithoutRepeatingCharacters_NO_3 {

	/**
	 * nested iteration, On^2 Beats: 93.7% memory utilization (43.22mb) 21.87%
	 * performance (8ms) -> simple approach, sequential iteration with nested inner
	 * loop, optimized to reduce memory utilization (instead of clearing map, using
	 * iteration id for check as one character allowed only once per iteration)
	 * 
	 * Possible improvement: lets say there is array 12345678905123. Obvious, out of
	 * all strings, 1234567890 will be the longest if checked from positions
	 * 2,3,4,5. So it could be skipped, starting new check from 6.
	 * 
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring(String s) {

		char[] cache = new char[256];
		int maxSequence = 0;

		int j;

		for (int i = 0; i < s.length(); i++) {

			j = i;
			while (j < s.length()) {
				char ch = s.charAt(j);
				if (cache[ch] == i + 1) {
					j = j - i;
					maxSequence = maxSequence > j ? maxSequence : j;
					break;
				}

				cache[ch] = (char) (i + 1);
				j++;
			}

			j = j - i;
			maxSequence = maxSequence > j ? maxSequence : j;
		}

		return maxSequence;
	}

	/**
	 * nested iteration, On^2 Beats: 14.79% memory utilization (43.22mb) 10.4%
	 * performance (8ms) -> simple approach, sequential iteration with nested inner
	 * loop. Obviously, slow and heavy.
	 * 
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring_v1(String s) {

		HashSet<Character> checkSet = new HashSet<Character>();
		int maxSequence = 0;

		for (int i = 0; i < s.length(); i++) {

			checkSet.clear();

			int j = i;
			while (j < s.length()) {
				char ch = s.charAt(j);
				if (checkSet.contains(ch)) {
					maxSequence = maxSequence > checkSet.size() ? maxSequence : checkSet.size();
					break;
				}

				checkSet.add(ch);
				j++;
			}

			maxSequence = maxSequence > checkSet.size() ? maxSequence : checkSet.size();

		}

		return maxSequence;
	}
}
