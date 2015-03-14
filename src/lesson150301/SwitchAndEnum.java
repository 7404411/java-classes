package lesson150301;

public class SwitchAndEnum {

	enum RobotCommands {
		Left, Right, Forward, Back, Stop
	};

	public static void main(String[] args) {

		RobotCommands route[] = { RobotCommands.Left, RobotCommands.Right,
				RobotCommands.Forward, RobotCommands.Back, RobotCommands.Stop };

		for (RobotCommands robotCommands : route) {
			perform(robotCommands);
		}

	}

	private static void perform(RobotCommands robotCommands) {
		switch (robotCommands) {
		case Left:
			System.out.println("Move Left");
			break;
		case Right:
			System.out.println("Move Right");
			break;
		case Forward:
			System.out.println("Move Forward");
			break;
		case Back:
			System.out.println("Move Back");
			break;
		case Stop:
			System.out.println("Move Stop");
			break;
		default:
			break;
		}

	}

}
