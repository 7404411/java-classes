package lesson150315.internal;

import lesson150315.A;
import lesson150315.B;
import lesson150315.Counter;


public class UseAB {
	
	public static void main(String[] args) {
		
		A a = new A(20);
		a.printState();
		B b = new B();
		
		Counter counter = new Counter();
		
		counter.inc();
		
//		counter.count++;
//		counter.count++;
//		
//		System.out.println(counter.count);
		
		counter.inc();
		counter.inc();
		counter.inc();
		counter.inc();
		System.out.println(counter.get());
		
	}

}
