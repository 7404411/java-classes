package lesson150301;

public class F {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a[] = { 10, 20, 20, 334, 52, 242, 20, 556, 20, 34, 52 };

		int index = find(a, 20, 3);
		
		if (index == -1) {

			System.out.println("Element not found");
		} else {
			System.out.println("Found at position " + index);
		}
	}

	private static int find(int[] a, int index, int count) {
		int found = -1;
		int foundCount = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == index) {
				foundCount++;
				if (foundCount != count) {
					continue;
				} else {
					found = i;
					break;
				}
			}
		}
		return found;
	}

}
