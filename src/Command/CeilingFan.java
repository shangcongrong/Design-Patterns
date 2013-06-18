package Command;

public class CeilingFan {

	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;

	private String location;

	int speed;

	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}

	public void high() {
		speed = HIGH;
		System.out.print(location + " ceiling fan is on high\n");
	}

	public void medium() {
		speed = MEDIUM;
		System.out.print(location + " ceiling fan is on medium\n");
	}

	public void low() {
		speed = LOW;
		System.out.print(location + " ceiling fan is on low\n");
	}

	public void off() {
		speed = OFF;
		System.out.print(location + " ceiling fan is off\n");
	}

	public int getSpeed() {
		return speed;
	}

	// public void on() {
	// System.out.print(location + " ceiling fan is on high\n");
	// }
	//
	// public void off() {
	// System.out.print(location + " ceiling fan is off\n");
	// }

}
