package Command;

public class Stereo {

	private String location;

	public Stereo(String location) {
		this.location = location;
	}

	public void on() {
		System.out.print(location + " stereo is on\n");
	}

	public void off() {
		System.out.print(location + " stereo is off\n");
	}

	public void setCd() {
		System.out.print(location + " stereo set CD\n");
	}

	public void setDvd() {
		System.out.print(location + " stereo set DVD\n");
	}

	public void setRadio() {
		System.out.print(location + " stereo set radio\n");
	}

	public void setVolume(int v) {
		System.out.print(location + " stereo set volume = " + v + "\n");
	}

}
