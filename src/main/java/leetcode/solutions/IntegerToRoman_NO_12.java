package leetcode.solutions;

/**
 * this is not a great code... refactor later
 */
public class IntegerToRoman_NO_12 {
	private final char[] romanCharacters = new char[] { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };

	public String intToRoman(int num) {
		StringBuilder result = new StringBuilder();

		for (char ch : romanCharacters) {
			num = handle4And9(num, result);
			num = applyChar(ch, num, result);
		}

		return result.toString();
	}

	private int handle4And9(int num, StringBuilder result) {
		int fd = firstDigit(num);

		if (fd == 4 || fd == 9) {
			if (num - 900 >= 0) {
				result.append("CM");
				return num - 900;
			} else if (num - 400 >= 0) {
				result.append("CD");
				return num - 400;
			} else if (num - 90 >= 0) {
				result.append("XC");
				return num - 90;
			} else if (num - 40 >= 0) {
				result.append("XL");
				return num - 40;
			} else if (num - 9 >= 0) {
				result.append("IX");
				return num - 9;
			} else if (num - 4 >= 0) {
				result.append("IV");
				return num - 4;
			}
		}

		return num;
	}

	private int applyChar(char ch, int num, StringBuilder result) {

		int charValue = translate(ch);
		if (num - charValue >= 0) {
			num = num - charValue;
			result.append(ch);
			num = applyChar(ch, num, result);
		}

		return num;
	}

	private int translate(char ch) {
		return switch (ch) {
		case 'I' -> 1;
		case 'V' -> 5;
		case 'X' -> 10;
		case 'L' -> 50;
		case 'C' -> 100;
		case 'D' -> 500;
		case 'M' -> 1000;

		default -> 0;
		};
	}

	/*
	 * Found on stackoverflow; works well for 4000 .. 1 values
	 */
	public int firstDigit(int x) {
		if (x == 0) {
			return 0;
		}

		x = Math.abs(x);
		return (int) Math.floor(x / Math.pow(10, Math.floor(Math.log10(x))));
	}

}
