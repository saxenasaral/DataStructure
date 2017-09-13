package com.saral.training.consecutive.sum;

public class NoOfConsecutiveSum {

	static int consecutive(long num) {

		int count = 0;
		for (int i = 1; i <= (num / 2 + 1); i++) {
			int temp = 0;
			for (int j = i; j <= (num / 2 + 1); j++) {
				temp = temp + j;
				if (temp == num) {
					count++;
					break;
				} else if (temp > num) {
					break;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(consecutive(10));
	}

}
