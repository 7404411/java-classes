package lesson150315;

public class ComplexState {

	int state1;
	int state2;

	public void setState(int state) {

		state1 = state;
		state2 = state >> 1;
	}

	public boolean setState2(int state) {

		if (state > state1) {
			return false;
		} else {
			state2 = state;
			return true;
		}
	}

}
