package com.gga.project1;

public class C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] data = { 12, 22, 45, 23, -45, 50, 60 };
		processArray(data);

		data = new int[] { 1, 2, 44, 54, 242, 22, 7572, 675, 6 };
		processArray(data);

		data = new int[0];
		processArray(data);
		processArray(null);

	}

	private static void processArray(int[] data) {
		int max = findMax(data);
		printArray(data);
		System.out.println(max);
	}

	static void printArray(int[] data) {
		if (data == null) {
			return;
		}
		for (int i : data) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

	private static int findMax(int[] data) {
		
		if (data == null) {
			System.out.println("Null array!");
			return 0;
		}

		if (data.length == 0) {
			System.out.println("Empty array!");
			return 0;
		}

		int max = data[0];

		for (int i = 1; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
		}
		return max;
	}

}
