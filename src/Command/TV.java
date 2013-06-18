package Command;

public class TV {

	private String location;

	public TV(String location) {
		this.location = location;
	}

	public void on() {
		System.out.print(location + " TV is on\n");
	}

	public void off() {
		System.out.print(location + " TV is off\n");
	}

	public void setInputChannel() {
		System.out.print(location + " TV set input channel\n");
	}

	public void setVolume(int volume) {
		System.out.print(location + " TV volume is " + volume + "\n");
	}

}
