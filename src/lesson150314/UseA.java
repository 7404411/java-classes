package lesson150314;

public class UseA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		A a = new A();
		
		a.changeState();
		System.out.println(a.state);
		a.changeState();
		System.out.println(a.state);
		
		
		
		A a2 = new A(10);

		a2.changeState();
		System.out.println(a2.state);
		a2.changeState();
		System.out.println(a2.state);
	}

}
