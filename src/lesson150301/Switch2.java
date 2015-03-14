package lesson150301;

public class Switch2 {

	static char route[] = {'L','R','F','B','T','S',',','1'};
	
	
	public static void main(String[] args) {

		for (int i = 0; i < route.length; i++) {
			moveRobot(route[i]);
		}
		
	}

	private static void moveRobot(char command) {
		switch(command){
		case 'L':
			System.out.println("Turn Left");
			break;
		case 'R':
			System.out.println("Turn Right");
			break;
		case 'F':
			System.out.println("Move Forward");
			break;
		case 'B':
			System.out.println("Step Back");
			break;
		case 'T':
			System.out.println("Turn Around");
			break;
		case 'S':
			System.out.println("Stop");
			break;
		default:
			System.out.println("halt_unknown_command");
		}
	}
	
	
}
