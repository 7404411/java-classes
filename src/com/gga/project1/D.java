package com.gga.project1;

public class D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int data[] = new int[50];
		C.printArray(data);
		for (int i = 0; i < data.length; i++) {
			data[i] = i*2 +1;
		}
		C.printArray(data);
		
	}

}
