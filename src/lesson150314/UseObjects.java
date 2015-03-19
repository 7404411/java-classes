package lesson150314;

public class UseObjects {

	public static void main(String[] args) {

		//B b = ;
		B b2 = new B("Second B");
		C c = new C(new B("First B"));
		C c2 = new C(b2);
		C c3 = new C();
		
		
	
		
//		c.b = b;
		c.doIt();
		c2.doIt();
//		c.doItAgainWith(b);
		c.doItAgainWith(b2);
		c3.doIt();
		
		String a = "hello";
		int b = 13;
		
		System.out.println(a);
		System.out.println(b);
	}

}
