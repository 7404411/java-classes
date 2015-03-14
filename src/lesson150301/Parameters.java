package lesson150301;

public class Parameters {

	public static void main(String[] args) {
		
		int i = 10;
		
		process(i);
		System.out.println(i);
		
		
	}

	private static void process(int i) {
		
		i = i * 2;
		System.out.println(i);
		
	}
}
