package com.gga.project1;

public class Divider {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int result = divide(100, 0);
		System.out.println("Result = " + result);

	}

	public static int divide(int i, int j) {
		if (j == 0) {
			System.out.println("Wrong Number");
			return Integer.MAX_VALUE;
		}

		return i / j;
	}

}
