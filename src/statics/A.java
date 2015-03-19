package statics;

public class A {

	private static int objectCount;
	
	public static int getCount(){
		return objectCount;
	}

	int id;
	
	{

	id = objectCount++;

	}
}
