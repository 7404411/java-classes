package com.gga.project1;

public class B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.exit(0);
		}
		int number = Integer.parseInt(args[0]);
		System.out.println(number);

		if (number < 10) {
			System.out.println("toddler");
		} else if (number < 20) {
			System.out.println("teenager");
		} else if (number < 30) {
			System.out.println("young man");
		} else if (number <= 50) {
			System.out.println("man");
		} else if (number > 50) {
			System.out.println("older");

		}
	}

}