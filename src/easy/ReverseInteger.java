package easy;

public class ReverseInteger {
	public static void main(String[] args) {
		Solution.reverse(1534236469);
	}

	static class Solution {
		public static int reverse(int x) {
			long reversedNum = 0;

			while (x != 0) {
				reversedNum = reversedNum * 10 + x % 10;
				x = x / 10;
			}

			if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
				return 0;
			}
			return (int)reversedNum;
		}
	}
}
