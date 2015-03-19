package statics;

public class Singleton {

	private static Singleton instance;
	
	
	static Singleton getInstance() {
		if (instance == null){
			instance = new Singleton();
		}
		return instance;
	}
			
//	static void setInstance(Singleton instance) {
//		Singleton.instance = instance;
//	}
	
	static int count;
	
	int id;
	
	{
	id = count++;
	System.out.println("Newly created object #" + id);
	
	}
	
	private Singleton(){
	
		
	}

	public void saySomething() {
		System.out.println("I'm object of instance # " + id);
		
	}

	
	
}
