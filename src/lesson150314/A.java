package lesson150314;

public class A {

	int state;
	
	A(){
		this(10);
	}
	
	A (int initState){
		System.out.println("New instance of A created");
		state = initState;
	}
	void changeState(){
		state++;
	}
	
	
		
		
	}

