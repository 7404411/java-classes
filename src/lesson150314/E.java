package lesson150314;

public class E {
	
	public E() {
	
		System.out.println("Created " + this);
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destroyed " + this);
	}

}
