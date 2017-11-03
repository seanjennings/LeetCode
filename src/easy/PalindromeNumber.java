package easy;

public class PalindromeNumber {

	public static void main(String[] args) {
		Solution.isPalindrome(-2147447412);
	}

	static class Solution {
		public static boolean isPalindrome(int x) {
			if (x >= 0) {
				long num = x;
				long reversedNum = 0;

				while (x != 0) {
					reversedNum = reversedNum * 10 + x % 10;
					x = x / 10;
				}

				if (num == reversedNum) {
					return true;
				}
				return false;
			}
			return false;
		}
	}
}
