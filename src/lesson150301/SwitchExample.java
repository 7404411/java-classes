package lesson150301;

public class SwitchExample {
	
	enum robotCommands {FOUR_FOUR_FIVE_COMMAND, ELEVEN_COMMAND, FOURTY_COMMAND, THIRTY_COMMAND, TWENTY_COMMAND, TEN_COMMAND };
//	private static final int  = 455;
//	private static final int  = 11;
//	private static final int  = 40;
//	private static final int THIRTY_COMMAND = 30;
//	private static final int TWENTY_COMMAND = 20;
//	private static final int TEN_COMMAND = 10;

	public static void main(String[] args) {
		
		robotCommands program[] = {robotCommands.TEN_COMMAND, robotCommands.TWENTY_COMMAND, robotCommands.THIRTY_COMMAND, robotCommands.FOURTY_COMMAND, robotCommands.ELEVEN_COMMAND, robotCommands.FOUR_FOUR_FIVE_COMMAND};
		
		for (robotCommands command : program) {
		perform(command);
		}
	}

	private static void perform(robotCommands command) {
		switch(command){
		case TEN_COMMAND:
		case ELEVEN_COMMAND:
			System.out.println("1ten");
			break;
		case TWENTY_COMMAND:
			System.out.println("2ten");
			break;
		case THIRTY_COMMAND:
			System.out.println("3ten");
			break;
		case FOURTY_COMMAND:
			System.out.println("4ten");
			break;
		default:
			System.out.println("unknown command " + command);
		}
	}
}

