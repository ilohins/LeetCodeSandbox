package dev.ilswe.leetcode.solutions.mmxxiv;

public class IntegerToRoman_NO_12 {
	private final char[] romanCharacters = new char[] { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };

	public String intToRoman(int num) {
		StringBuilder result = new StringBuilder();

		for (char ch : romanCharacters) {
			num = processRomanLetter(ch, num, result);
		}

		return result.toString();
	}

	private int processRomanLetter(char ch, int num, StringBuilder result) {
		int specialScenario = 0;
		int letterValue = 0;
		String romanLetters = "";

		switch (ch) {
			case 'M' -> {
				letterValue = 1000;
			}
			case 'D' -> {
				specialScenario = 900;
				letterValue = 500;
				romanLetters = "CM";
			}
			case 'C' -> {
				specialScenario = 400;
				letterValue = 100;
				romanLetters = "CD";
			}
			case 'L' -> {
				specialScenario = 90;
				letterValue = 50;
				romanLetters = "XC";
			}
			case 'X' -> {
				specialScenario = 40;
				letterValue = 10;
				romanLetters = "XL";
			}
			case 'V' -> {
				specialScenario = 9;
				letterValue = 5;
				romanLetters = "IX";
			}
			case 'I' -> {
				specialScenario = 4;
				letterValue = 1;
				romanLetters = "IV";
			}
		}

		//1. handle exception scenarios when number starts with 4 and 9
		
		//Found this formula on stackoverflow; works well for 1 - 4000 values range
		int fd = (num == 0) ? 0 : (int) Math.floor(num / Math.pow(10, Math.floor(Math.log10(num))));

		if ((fd == 4 || fd == 9) && (specialScenario != 0) && (num - specialScenario >= 0)) {
			num = num - specialScenario;
			result.append(romanLetters);
		}

		//2. division based translation logic
		num = applyChar(ch, num, result, letterValue);

		return num;
	}

	private int applyChar(char ch, int num, StringBuilder result, int letterValue) {

		if (num - letterValue >= 0) {
			num = num - letterValue;
			result.append(ch);
			
			//recursion could populate up to 3 letters (4th handled in the special scenario block)
			num = applyChar(ch, num, result, letterValue);
		}

		return num;
	}
}
