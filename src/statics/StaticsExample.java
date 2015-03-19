package statics;

import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Method;

public class StaticsExample {

	public static final int MAX_NUMBERS = 10;

	public static void main(String[] args) {

		int ints[] = new int[MAX_NUMBERS];

//		System.out.println("objects created: " + A.getCount());
//		A a = new A();
//		System.out.println(a.id);
//		A b = new A();
//		System.out.println(b.id);
//		a = new A();
//		System.out.println(a.id);
//		a = new A();
//		System.out.println(a.id);
//		System.out.println("objects created: " + A.getCount());
//		System.out.println();
//		Class c = A.class;
//		System.out.println(c.getName());
//		for (Method method : c.getMethods()) {
//			System.out.println(method.getName());
//		
//		
//			
//		}

			Singleton.getInstance().saySomething();
			Singleton.getInstance().saySomething();
			Singleton.getInstance().saySomething();
			Singleton.getInstance().saySomething();
			Singleton.getInstance().saySomething();
	}

}
