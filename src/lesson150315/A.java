package lesson150315;

public class A {

		
		int state;
		B b = new B();
		
		public A(int state) {
		this.state = state;
		}
		
		public void printState(){
			System.out.println(this.state + ", " + b.getState());
		}
		
		
	}
