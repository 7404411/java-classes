package com.gga.project1;

public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if (args.length == 0) {
			System.out.println("You need to provide a parameter.");
			System.exit(0);
		}
		
		if (args.length > 1) {
			System.out.println("Too many parameters");
			System.exit(0);
		}
		a(args[0]);

	}

	private static void a(String param) {
		System.out.println("param: " + param);

		if (param.equals("oдин")) {
			System.out.println("one");
		}

		if (param.equals("два")) {
			System.out.println("two");
		}

		if (param.length() == 3) {
			System.out.println("Length = 3");

		}
		if (param.length() <= 3) {
			System.out.println("Short");
		} else {
			System.out.println("Long");
			
		}

	}
}