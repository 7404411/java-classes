package lesson150314;

public class C {
	
	B b;
	
	C (B b){
		this.b = b;
	}
	
	C(){
		b = new B("slave of the lamp");
	}
	
	void doIt(){
		b.doIt();
		
	}

	void doItAgainWith(B b){
		b.doIt();
	}		
}
