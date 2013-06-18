package Command;

public class GarageDoor {

	private String location;

	public GarageDoor(String location) {
		this.location = location;
	}

	public void up() {
		System.out.print(location + " garage door is open\n");
	}

	public void down() {
		System.out.print(location + " garage door is closed\n");
	}

	public void stop() {
		System.out.print(location + " garage door is stop\n");
	}

	public void lightOn() {
		System.out.print("GarageDoor lightOn\n");
	}

	public void lightOff() {
		System.out.print("GarageDoor lightOff\n");
	}

}
